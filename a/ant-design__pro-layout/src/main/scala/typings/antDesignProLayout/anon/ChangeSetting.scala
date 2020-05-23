package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeSetting extends js.Object {
  var settings: PartialSettings = js.native
  def changeSetting(key: String, value: js.Any): Unit = js.native
  def changeSetting(key: String, value: js.Any, hideLoading: Boolean): Unit = js.native
}

