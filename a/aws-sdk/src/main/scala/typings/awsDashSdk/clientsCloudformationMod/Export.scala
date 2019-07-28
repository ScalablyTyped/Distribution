package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Export extends js.Object {
  /**
    * The stack that contains the exported output name and value.
    */
  var ExportingStackId: js.UndefOr[StackId] = js.undefined
  /**
    * The name of exported output value. Use this name and the Fn::ImportValue function to import the associated value into other stacks. The name is defined in the Export field in the associated stack's Outputs section.
    */
  var Name: js.UndefOr[ExportName] = js.undefined
  /**
    * The value of the exported output, such as a resource physical ID. This value is defined in the Export field in the associated stack's Outputs section.
    */
  var Value: js.UndefOr[ExportValue] = js.undefined
}

object Export {
  @scala.inline
  def apply(ExportingStackId: StackId = null, Name: ExportName = null, Value: ExportValue = null): Export = {
    val __obj = js.Dynamic.literal()
    if (ExportingStackId != null) __obj.updateDynamic("ExportingStackId")(ExportingStackId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Export]
  }
}

