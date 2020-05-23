package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderField extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var IsDescending: Boolean
  @JSName("Outlook.OrderField_typekey")
  var OutlookDotOrderField_typekey: OrderField
  val Parent: js.Any
  val Session: NameSpace
  val ViewXMLSchemaName: String
}

object OrderField {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    IsDescending: Boolean,
    OutlookDotOrderField_typekey: OrderField,
    Parent: js.Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): OrderField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], IsDescending = IsDescending.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OrderField_typekey")(OutlookDotOrderField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderField]
  }
}

