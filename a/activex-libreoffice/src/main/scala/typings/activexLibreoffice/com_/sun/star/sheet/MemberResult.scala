package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a result of a DataPilot member.
  * @see com.sun.star.sheet.XDataPilotMemberResults
  */
@js.native
trait MemberResult extends js.Object {
  /** the visible name of the field. */
  var Caption: String = js.native
  /**
    * contains flags describing the result.
    * @see com.sun.star.sheet.MemberResultFlags
    */
  var Flags: Double = js.native
  /** the internal name of the field. */
  var Name: String = js.native
  /**
    * the underlying numeric value of the field **if** Flags indicate so by having {@link com.sun.star.sheet.MemberResultFlags.NUMERIC} set.
    *
    * May be NaN if value is not available or unknown.
    * @since LibreOffice 5.3
    */
  var Value: Double = js.native
}

object MemberResult {
  @scala.inline
  def apply(Caption: String, Flags: Double, Name: String, Value: Double): MemberResult = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberResult]
  }
  @scala.inline
  implicit class MemberResultOps[Self <: MemberResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("Flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

