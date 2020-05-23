package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFormat extends js.Object {
  var Align: OlAlign
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var FieldFormat: Double
  val FieldType: OlUserPropertyType
  var Label: String
  @JSName("Outlook.ColumnFormat_typekey")
  var OutlookDotColumnFormat_typekey: ColumnFormat
  val Parent: js.Any
  val Session: NameSpace
  var Width: Double
}

object ColumnFormat {
  @scala.inline
  def apply(
    Align: OlAlign,
    Application: Application,
    Class: OlObjectClass,
    FieldFormat: Double,
    FieldType: OlUserPropertyType,
    Label: String,
    OutlookDotColumnFormat_typekey: ColumnFormat,
    Parent: js.Any,
    Session: NameSpace,
    Width: Double
  ): ColumnFormat = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], FieldFormat = FieldFormat.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ColumnFormat_typekey")(OutlookDotColumnFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFormat]
  }
}

