package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a result of a DataPilot member.
  * @see com.sun.star.sheet.XDataPilotMemberResults
  */
trait MemberResult extends js.Object {
  /** the visible name of the field. */
  var Caption: java.lang.String
  /**
    * contains flags describing the result.
    * @see com.sun.star.sheet.MemberResultFlags
    */
  var Flags: scala.Double
  /** the internal name of the field. */
  var Name: java.lang.String
  /**
    * the underlying numeric value of the field **if** Flags indicate so by having {@link com.sun.star.sheet.MemberResultFlags.NUMERIC} set.
    *
    * May be NaN if value is not available or unknown.
    * @since LibreOffice 5.3
    */
  var Value: scala.Double
}

