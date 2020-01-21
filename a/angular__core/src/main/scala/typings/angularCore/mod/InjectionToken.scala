package typings.angularCore.mod

import typings.angularCore.AnonFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "InjectionToken")
@js.native
class InjectionToken[T] protected () extends js.Object {
  def this(_desc: String) = this()
  def this(_desc: String, options: AnonFactory[T]) = this()
  var _desc: String = js.native
  val ngInjectableDef: js.UndefOr[scala.Nothing] = js.native
}

