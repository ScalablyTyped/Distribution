package typings.aureliaBinding.mod

import typings.aureliaDependencyInjection.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "ValueConverterResource")
@js.native
class ValueConverterResource protected () extends StObject {
  def this(name: String) = this()
  
  def initialize(container: Container, target: js.Any): Unit = js.native
  
  def register(registry: js.Any, name: String): Unit = js.native
}
/* static members */
object ValueConverterResource {
  
  @JSImport("aurelia-binding", "ValueConverterResource")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convention(name: String): ValueConverterResource = ^.asInstanceOf[js.Dynamic].applyDynamic("convention")(name.asInstanceOf[js.Any]).asInstanceOf[ValueConverterResource]
}
