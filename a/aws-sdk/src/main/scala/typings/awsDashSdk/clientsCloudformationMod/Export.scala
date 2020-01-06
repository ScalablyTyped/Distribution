package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Export extends js.Object {
  /**
    * The stack that contains the exported output name and value.
    */
  var ExportingStackId: js.UndefOr[StackId] = js.native
  /**
    * The name of exported output value. Use this name and the Fn::ImportValue function to import the associated value into other stacks. The name is defined in the Export field in the associated stack's Outputs section.
    */
  var Name: js.UndefOr[ExportName] = js.native
  /**
    * The value of the exported output, such as a resource physical ID. This value is defined in the Export field in the associated stack's Outputs section.
    */
  var Value: js.UndefOr[ExportValue] = js.native
}

object Export {
  @scala.inline
  def apply(ExportingStackId: StackId = null, Name: ExportName = null, Value: ExportValue = null): Export = {
    val __obj = js.Dynamic.literal()
    if (ExportingStackId != null) __obj.updateDynamic("ExportingStackId")(ExportingStackId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Export]
  }
}

