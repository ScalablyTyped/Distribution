package typings.aureliaBinding.mod

import typings.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "ValueConverterResource")
@js.native
class ValueConverterResource protected () extends js.Object {
  def this(name: String) = this()
  
  def initialize(container: Container, target: js.Any): Unit = js.native
  
  def register(registry: js.Any, name: String): Unit = js.native
}
/* static members */
@JSImport("aurelia-binding", "ValueConverterResource")
@js.native
object ValueConverterResource extends js.Object {
  
  def convention(name: String): ValueConverterResource = js.native
}
