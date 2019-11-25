package typings.applicationinsights.outDeclarationsContractsQuickPulseTypesMessageDocumentQuickPulseMod

import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDocumentQuickPulse extends DocumentQuickPulse {
  var Message: String
  var SeverityLevel: String
}

object MessageDocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: String,
    Message: String,
    OperationId: String,
    Properties: js.Array[IDocumentProperty],
    SeverityLevel: String,
    Version: String,
    __type: String
  ): MessageDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], OperationId = OperationId.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SeverityLevel = SeverityLevel.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], __type = __type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageDocumentQuickPulse]
  }
}

