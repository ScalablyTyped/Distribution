package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "DeprecatedCurrencyPipe")
@js.native
class DeprecatedCurrencyPipe protected ()
  extends atAngularCoreLib.atAngularCoreMod.PipeTransform {
  def this(_locale: java.lang.String) = this()
  var _locale: js.Any = js.native
  def transform(value: js.Any): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: js.Any, currencyCode: java.lang.String): java.lang.String | scala.Null = js.native
  def transform(value: js.Any, currencyCode: java.lang.String, symbolDisplay: scala.Boolean): java.lang.String | scala.Null = js.native
  def transform(
    value: js.Any,
    currencyCode: java.lang.String,
    symbolDisplay: scala.Boolean,
    digits: java.lang.String
  ): java.lang.String | scala.Null = js.native
}

