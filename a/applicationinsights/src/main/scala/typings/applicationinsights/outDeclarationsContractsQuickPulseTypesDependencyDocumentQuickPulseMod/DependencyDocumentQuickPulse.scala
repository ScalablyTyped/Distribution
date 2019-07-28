package typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDependencyDocumentQuickPulseMod

import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyDocumentQuickPulse extends DocumentQuickPulse {
  var CommandName: String
  var DependencyTypeName: String
  var Duration: String
  var Name: String
  var OperationName: String
  var ResultCode: String
  var Success: js.UndefOr[Boolean] = js.undefined
  var Target: String
}

object DependencyDocumentQuickPulse {
  @scala.inline
  def apply(
    CommandName: String,
    DependencyTypeName: String,
    DocumentType: String,
    Duration: String,
    Name: String,
    OperationId: String,
    OperationName: String,
    Properties: js.Array[IDocumentProperty],
    ResultCode: String,
    Target: String,
    Version: String,
    __type: String,
    Success: js.UndefOr[Boolean] = js.undefined
  ): DependencyDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(CommandName = CommandName, DependencyTypeName = DependencyTypeName, DocumentType = DocumentType, Duration = Duration, Name = Name, OperationId = OperationId, OperationName = OperationName, Properties = Properties, ResultCode = ResultCode, Target = Target, Version = Version, __type = __type)
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success)
    __obj.asInstanceOf[DependencyDocumentQuickPulse]
  }
}

