package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ViewEngineHooksResource")
@js.native
class ViewEngineHooksResource () extends StObject {
  
  def initialize(): js.Any = js.native
  def initialize(container: js.Any): js.Any = js.native
  def initialize(container: js.Any, target: js.Any): js.Any = js.native
  def initialize(container: Unit, target: js.Any): js.Any = js.native
  
  def load(): js.Any = js.native
  def load(container: js.Any): js.Any = js.native
  def load(container: js.Any, target: js.Any): js.Any = js.native
  def load(container: Unit, target: js.Any): js.Any = js.native
  
  def register(): js.Any = js.native
  def register(registry: js.Any): js.Any = js.native
  def register(registry: js.Any, name: js.Any): js.Any = js.native
  def register(registry: Unit, name: js.Any): js.Any = js.native
}
/* static members */
object ViewEngineHooksResource {
  
  @JSImport("aurelia-templating", "ViewEngineHooksResource")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convention(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convention")().asInstanceOf[js.Any]
  @scala.inline
  def convention(name: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convention")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
