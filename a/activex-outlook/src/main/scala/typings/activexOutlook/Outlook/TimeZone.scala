package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZone extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Bias: Double
  val Class: OlObjectClass
  val DaylightBias: Double
  val DaylightDate: VarDate
  val DaylightDesignation: String
  val ID: String
  val Name: String
  @JSName("Outlook.TimeZone_typekey")
  var OutlookDotTimeZone_typekey: TimeZone
  val Parent: js.Any
  val Session: NameSpace
  val StandardBias: Double
  val StandardDate: VarDate
  val StandardDesignation: String
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
}

