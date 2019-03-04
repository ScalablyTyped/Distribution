package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Number format code information returned by various {@link XNumberFormatCode} methods. */
trait NumberFormatCode extends js.Object {
  var Code: java.lang.String
  var Default: scala.Boolean
  var DefaultName: java.lang.String
  var Index: scala.Double
  var NameID: java.lang.String
  var Type: scala.Double
  var Usage: scala.Double
}

object NumberFormatCode {
  @scala.inline
  def apply(
    Code: java.lang.String,
    Default: scala.Boolean,
    DefaultName: java.lang.String,
    Index: scala.Double,
    NameID: java.lang.String,
    Type: scala.Double,
    Usage: scala.Double
  ): NumberFormatCode = {
    val __obj = js.Dynamic.literal(Code = Code, Default = Default, DefaultName = DefaultName, Index = Index, NameID = NameID, Type = Type, Usage = Usage)
  
    __obj.asInstanceOf[NumberFormatCode]
  }
}

