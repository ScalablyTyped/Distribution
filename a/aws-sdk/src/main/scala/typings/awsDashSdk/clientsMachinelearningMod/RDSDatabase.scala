package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSDatabase extends js.Object {
  var DatabaseName: RDSDatabaseName = js.native
  /**
    * The ID of an RDS DB instance.
    */
  var InstanceIdentifier: RDSInstanceIdentifier = js.native
}

object RDSDatabase {
  @scala.inline
  def apply(DatabaseName: RDSDatabaseName, InstanceIdentifier: RDSInstanceIdentifier): RDSDatabase = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], InstanceIdentifier = InstanceIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RDSDatabase]
  }
}

