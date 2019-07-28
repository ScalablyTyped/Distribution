package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

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
    val __obj = js.Dynamic.literal(Code = Code, Default = Default, DefaultName = DefaultName, Index = Index, NameID = NameID, Type = Type, Usage = Usage)
  
    __obj.asInstanceOf[NumberFormatCode]
  }
}

