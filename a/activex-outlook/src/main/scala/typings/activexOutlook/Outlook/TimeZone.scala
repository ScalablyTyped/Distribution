package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZone extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Bias: Double = js.native
  val Class: OlObjectClass = js.native
  val DaylightBias: Double = js.native
  val DaylightDate: VarDate = js.native
  val DaylightDesignation: String = js.native
  val ID: String = js.native
  val Name: String = js.native
  @JSName("Outlook.TimeZone_typekey")
  var OutlookDotTimeZone_typekey: TimeZone = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val StandardBias: Double = js.native
  val StandardDate: VarDate = js.native
  val StandardDesignation: String = js.native
}

object TimeZone {
  @scala.inline
  def apply(
    Application: Application,
    Bias: Double,
    Class: OlObjectClass,
    DaylightBias: Double,
    DaylightDate: VarDate,
    DaylightDesignation: String,
    ID: String,
    Name: String,
    OutlookDotTimeZone_typekey: TimeZone,
    Parent: js.Any,
    Session: NameSpace,
    StandardBias: Double,
    StandardDate: VarDate,
    StandardDesignation: String
  ): TimeZone = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bias = Bias.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DaylightBias = DaylightBias.asInstanceOf[js.Any], DaylightDate = DaylightDate.asInstanceOf[js.Any], DaylightDesignation = DaylightDesignation.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], StandardBias = StandardBias.asInstanceOf[js.Any], StandardDate = StandardDate.asInstanceOf[js.Any], StandardDesignation = StandardDesignation.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimeZone_typekey")(OutlookDotTimeZone_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
  @scala.inline
  implicit class TimeZoneOps[Self <: TimeZone] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBias(value: Double): Self = this.set("Bias", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaylightBias(value: Double): Self = this.set("DaylightBias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaylightDate(value: VarDate): Self = this.set("DaylightDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaylightDesignation(value: String): Self = this.set("DaylightDesignation", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotTimeZone_typekey(value: TimeZone): Self = this.set("Outlook.TimeZone_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandardBias(value: Double): Self = this.set("StandardBias", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandardDate(value: VarDate): Self = this.set("StandardDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandardDesignation(value: String): Self = this.set("StandardDesignation", value.asInstanceOf[js.Any])
  }
  
}

