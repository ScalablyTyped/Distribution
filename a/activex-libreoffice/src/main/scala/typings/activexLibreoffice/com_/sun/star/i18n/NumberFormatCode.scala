package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Number format code information returned by various {@link XNumberFormatCode} methods. */
trait NumberFormatCode extends js.Object {
  var Code: String
  var Default: Boolean
  var DefaultName: String
  var Index: Double
  var NameID: String
  var Type: Double
  var Usage: Double
}

object NumberFormatCode {
  @scala.inline
  def apply(
    Code: String,
    Default: Boolean,
    DefaultName: String,
    Index: Double,
    NameID: String,
    Type: Double,
    Usage: Double
  ): NumberFormatCode = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], DefaultName = DefaultName.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], NameID = NameID.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Usage = Usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatCode]
  }
}

