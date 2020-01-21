package typings.aureliaBinding.mod

import typings.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "BindingBehaviorResource")
@js.native
class BindingBehaviorResource protected () extends js.Object {
  def this(name: String) = this()
  def initialize(container: Container, target: js.Any): Unit = js.native
  def register(registry: js.Any, name: String): Unit = js.native
}

/* static members */
@JSImport("aurelia-binding", "BindingBehaviorResource")
@js.native
object BindingBehaviorResource extends js.Object {
  def convention(name: String): BindingBehaviorResource = js.native
}

