package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailEnvelopeObject extends js.Object {
  var BCC: String
  var CC: String
  @JSName("InfoPath.MailEnvelopeObject_typekey")
  var InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject
  var Subject: String
  var To: String
  var Visible: Boolean
}

object MailEnvelopeObject {
  @scala.inline
  def apply(
    BCC: String,
    CC: String,
    InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject,
    Subject: String,
    To: String,
    Visible: Boolean
  ): MailEnvelopeObject = {
    val __obj = js.Dynamic.literal(BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.MailEnvelopeObject_typekey")(InfoPathDotMailEnvelopeObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailEnvelopeObject]
  }
}

