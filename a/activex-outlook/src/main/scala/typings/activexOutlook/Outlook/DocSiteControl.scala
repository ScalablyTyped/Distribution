package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocSiteControl extends js.Object {
  @JSName("Outlook._DocSiteControl_typekey")
  var OutlookDot_DocSiteControl_typekey: DocSiteControl
  var ReadOnly: Double
  var SuppressAttachments: Double
}

object DocSiteControl {
  @scala.inline
  def apply(OutlookDot_DocSiteControl_typekey: DocSiteControl, ReadOnly: Double, SuppressAttachments: Double): DocSiteControl = {
    val __obj = js.Dynamic.literal(ReadOnly = ReadOnly.asInstanceOf[js.Any], SuppressAttachments = SuppressAttachments.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook._DocSiteControl_typekey")(OutlookDot_DocSiteControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocSiteControl]
  }
}

