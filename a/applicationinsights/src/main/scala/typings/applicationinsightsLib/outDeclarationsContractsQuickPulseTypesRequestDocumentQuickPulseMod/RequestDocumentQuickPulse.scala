package typings
package applicationinsightsLib.outDeclarationsContractsQuickPulseTypesRequestDocumentQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDocumentQuickPulse
  extends applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse {
  var Duration: java.lang.String
  var Name: java.lang.String
  var OperationName: java.lang.String
  var ResponseCode: java.lang.String
  var Success: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestDocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: java.lang.String,
    Duration: java.lang.String,
    Name: java.lang.String,
    OperationId: java.lang.String,
    OperationName: java.lang.String,
    Properties: js.Array[
      applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
    ],
    ResponseCode: java.lang.String,
    Version: java.lang.String,
    __type: java.lang.String,
    Success: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType, Duration = Duration, Name = Name, OperationId = OperationId, OperationName = OperationName, Properties = Properties, ResponseCode = ResponseCode, Version = Version, __type = __type)
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success)
    __obj.asInstanceOf[RequestDocumentQuickPulse]
  }
}

