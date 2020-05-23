package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewField extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ColumnFormat: typings.activexOutlook.Outlook.ColumnFormat
  @JSName("Outlook.ViewField_typekey")
  var OutlookDotViewField_typekey: ViewField
  val Parent: js.Any
  val Session: NameSpace
  val ViewXMLSchemaName: String
}

object ViewField {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ColumnFormat: ColumnFormat,
    OutlookDotViewField_typekey: ViewField,
    Parent: js.Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): ViewField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ColumnFormat = ColumnFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewField_typekey")(OutlookDotViewField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewField]
  }
}

