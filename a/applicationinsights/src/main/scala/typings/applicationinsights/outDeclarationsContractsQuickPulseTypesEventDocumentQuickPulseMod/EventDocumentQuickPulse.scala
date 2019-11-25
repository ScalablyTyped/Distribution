package typings.applicationinsights.outDeclarationsContractsQuickPulseTypesEventDocumentQuickPulseMod

import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDocumentQuickPulse extends DocumentQuickPulse {
  var Name: String
}

object EventDocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: String,
    Name: String,
    OperationId: String,
    Properties: js.Array[IDocumentProperty],
    Version: String,
    __type: String
  ): EventDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OperationId = OperationId.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], __type = __type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventDocumentQuickPulse]
  }
}

