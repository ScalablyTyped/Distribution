package typings
package applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDependencyDocumentQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyDocumentQuickPulse
  extends applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse {
  var CommandName: java.lang.String
  var DependencyTypeName: java.lang.String
  var Duration: java.lang.String
  var Name: java.lang.String
  var OperationName: java.lang.String
  var ResultCode: java.lang.String
  var Success: js.UndefOr[scala.Boolean] = js.undefined
  var Target: java.lang.String
}

object DependencyDocumentQuickPulse {
  @scala.inline
  def apply(
    CommandName: java.lang.String,
    DependencyTypeName: java.lang.String,
    DocumentType: java.lang.String,
    Duration: java.lang.String,
    Name: java.lang.String,
    OperationId: java.lang.String,
    OperationName: java.lang.String,
    Properties: js.Array[
      applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
    ],
    ResultCode: java.lang.String,
    Target: java.lang.String,
    Version: java.lang.String,
    __type: java.lang.String,
    Success: js.UndefOr[scala.Boolean] = js.undefined
  ): DependencyDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(CommandName = CommandName, DependencyTypeName = DependencyTypeName, DocumentType = DocumentType, Duration = Duration, Name = Name, OperationId = OperationId, OperationName = OperationName, Properties = Properties, ResultCode = ResultCode, Target = Target, Version = Version, __type = __type)
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success)
    __obj.asInstanceOf[DependencyDocumentQuickPulse]
  }
}

