package typings.aureliaBinding.mod

import typings.aureliaDependencyInjection.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "ValueConverterResource")
@js.native
open class ValueConverterResource protected () extends StObject {
  def this(name: String) = this()
  
  def initialize(container: Container, target: Any): Unit = js.native
  
  def register(registry: Any, name: String): Unit = js.native
}
/* static members */
object ValueConverterResource {
  
  @JSImport("aurelia-binding", "ValueConverterResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convention(name: String): ValueConverterResource = ^.asInstanceOf[js.Dynamic].applyDynamic("convention")(name.asInstanceOf[js.Any]).asInstanceOf[ValueConverterResource]
}
