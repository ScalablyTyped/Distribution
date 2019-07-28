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
    val __obj = js.Dynamic.literal(DocumentType = DocumentType, Message = Message, OperationId = OperationId, Properties = Properties, SeverityLevel = SeverityLevel, Version = Version, __type = __type)
  
    __obj.asInstanceOf[MessageDocumentQuickPulse]
  }
}

