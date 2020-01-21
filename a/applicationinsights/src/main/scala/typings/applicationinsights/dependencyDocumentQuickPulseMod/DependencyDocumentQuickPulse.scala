package typings.applicationinsights.dependencyDocumentQuickPulseMod

import typings.applicationinsights.documentQuickPulseMod.DocumentQuickPulse
import typings.applicationinsights.documentQuickPulseMod.IDocumentProperty
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
    val __obj = js.Dynamic.literal(CommandName = CommandName.asInstanceOf[js.Any], DependencyTypeName = DependencyTypeName.asInstanceOf[js.Any], DocumentType = DocumentType.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OperationId = OperationId.asInstanceOf[js.Any], OperationName = OperationName.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], __type = __type.asInstanceOf[js.Any])
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyDocumentQuickPulse]
  }
}

