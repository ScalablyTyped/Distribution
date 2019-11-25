package typings.applicationinsights.outDeclarationsContractsQuickPulseTypesRequestDocumentQuickPulseMod

import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDocumentQuickPulse extends DocumentQuickPulse {
  var Duration: String
  var Name: String
  var OperationName: String
  var ResponseCode: String
  var Success: js.UndefOr[Boolean] = js.undefined
}

object RequestDocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: String,
    Duration: String,
    Name: String,
    OperationId: String,
    OperationName: String,
    Properties: js.Array[IDocumentProperty],
    ResponseCode: String,
    Version: String,
    __type: String,
    Success: js.UndefOr[Boolean] = js.undefined
  ): RequestDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OperationId = OperationId.asInstanceOf[js.Any], OperationName = OperationName.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], ResponseCode = ResponseCode.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], __type = __type.asInstanceOf[js.Any])
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDocumentQuickPulse]
  }
}

