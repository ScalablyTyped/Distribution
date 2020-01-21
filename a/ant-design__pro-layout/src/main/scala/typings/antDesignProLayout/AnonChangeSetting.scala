package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChangeSetting extends js.Object {
  var settings: PartialSettings = js.native
  def changeSetting(key: String, value: js.Any): Unit = js.native
  def changeSetting(key: String, value: js.Any, hideLoading: Boolean): Unit = js.native
}

