package typings.aureliaBinding.mod

import typings.aureliaDependencyInjection.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "BindingBehaviorResource")
@js.native
class BindingBehaviorResource protected () extends StObject {
  def this(name: String) = this()
  
  def initialize(container: Container, target: js.Any): Unit = js.native
  
  def register(registry: js.Any, name: String): Unit = js.native
}
/* static members */
object BindingBehaviorResource {
  
  @JSImport("aurelia-binding", "BindingBehaviorResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convention(name: String): BindingBehaviorResource = ^.asInstanceOf[js.Dynamic].applyDynamic("convention")(name.asInstanceOf[js.Any]).asInstanceOf[BindingBehaviorResource]
}
