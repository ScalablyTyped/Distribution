package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ViewEngineHooksResource")
@js.native
open class ViewEngineHooksResource ()
  extends StObject
     with _ViewResourceType {
  
  def initialize(container: Any, target: Any): Unit = js.native
  
  def load(container: Any, target: Any): Unit = js.native
  
  def register(registry: Any, name: Any): Unit = js.native
}
/* static members */
object ViewEngineHooksResource {
  
  @JSImport("aurelia-templating", "ViewEngineHooksResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convention(name: Any): ViewEngineHooksResource = ^.asInstanceOf[js.Dynamic].applyDynamic("convention")(name.asInstanceOf[js.Any]).asInstanceOf[ViewEngineHooksResource]
}
