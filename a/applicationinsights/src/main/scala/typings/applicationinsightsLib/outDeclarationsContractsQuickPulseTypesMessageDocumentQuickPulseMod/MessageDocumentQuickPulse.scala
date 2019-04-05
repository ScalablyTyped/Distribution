package typings
package applicationinsightsLib.outDeclarationsContractsQuickPulseTypesMessageDocumentQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDocumentQuickPulse
  extends applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse {
  var Message: java.lang.String
  var SeverityLevel: java.lang.String
}

object MessageDocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: java.lang.String,
    Message: java.lang.String,
    OperationId: java.lang.String,
    Properties: js.Array[
      applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
    ],
    SeverityLevel: java.lang.String,
    Version: java.lang.String,
    __type: java.lang.String
  ): MessageDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType, Message = Message, OperationId = OperationId, Properties = Properties, SeverityLevel = SeverityLevel, Version = Version, __type = __type)
  
    __obj.asInstanceOf[MessageDocumentQuickPulse]
  }
}

