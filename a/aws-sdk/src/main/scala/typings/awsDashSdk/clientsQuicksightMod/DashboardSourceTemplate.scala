package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardSourceTemplate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsDashSdk.clientsQuicksightMod.Arn = js.native
  /**
    * Dataset references.
    */
  var DataSetReferences: DataSetReferenceList = js.native
}

object DashboardSourceTemplate {
  @scala.inline
  def apply(Arn: Arn, DataSetReferences: DataSetReferenceList): DashboardSourceTemplate = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], DataSetReferences = DataSetReferences.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DashboardSourceTemplate]
  }
}

