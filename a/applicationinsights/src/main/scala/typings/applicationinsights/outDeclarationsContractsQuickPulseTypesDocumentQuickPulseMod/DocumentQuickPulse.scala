package typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentQuickPulse extends js.Object {
  var DocumentType: String
  var OperationId: String
  var Properties: js.Array[IDocumentProperty]
  var Version: String
  var __type: String
}

object DocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: String,
    OperationId: String,
    Properties: js.Array[IDocumentProperty],
    Version: String,
    __type: String
  ): DocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType.asInstanceOf[js.Any], OperationId = OperationId.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], __type = __type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentQuickPulse]
  }
}

