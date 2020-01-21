package typings.angularCommon.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "formatDate")
@js.native
object formatDate extends js.Object {
  def apply(value: String, format: String, locale: String): String = js.native
  def apply(value: String, format: String, locale: String, timezone: String): String = js.native
  def apply(value: Double, format: String, locale: String): String = js.native
  def apply(value: Double, format: String, locale: String, timezone: String): String = js.native
  def apply(value: Date, format: String, locale: String): String = js.native
  def apply(value: Date, format: String, locale: String, timezone: String): String = js.native
}

