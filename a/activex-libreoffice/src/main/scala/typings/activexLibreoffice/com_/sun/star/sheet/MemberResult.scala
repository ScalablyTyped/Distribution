package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a result of a DataPilot member.
  * @see com.sun.star.sheet.XDataPilotMemberResults
  */
trait MemberResult extends js.Object {
  /** the visible name of the field. */
  var Caption: String
  /**
    * contains flags describing the result.
    * @see com.sun.star.sheet.MemberResultFlags
    */
  var Flags: Double
  /** the internal name of the field. */
  var Name: String
  /**
    * the underlying numeric value of the field **if** Flags indicate so by having {@link com.sun.star.sheet.MemberResultFlags.NUMERIC} set.
    *
    * May be NaN if value is not available or unknown.
    * @since LibreOffice 5.3
    */
  var Value: Double
}

object MemberResult {
  @scala.inline
  def apply(Caption: String, Flags: Double, Name: String, Value: Double): MemberResult = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberResult]
  }
}

