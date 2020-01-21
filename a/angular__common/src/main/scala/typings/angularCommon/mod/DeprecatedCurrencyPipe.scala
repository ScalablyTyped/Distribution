package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "DeprecatedCurrencyPipe")
@js.native
class DeprecatedCurrencyPipe protected () extends PipeTransform {
  def this(_locale: String) = this()
  var _locale: js.Any = js.native
  def transform(value: js.Any): String | Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: js.Any, currencyCode: String): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, symbolDisplay: Boolean): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, symbolDisplay: Boolean, digits: String): String | Null = js.native
}

