package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RDSDatabase extends js.Object {
  var DatabaseName: RDSDatabaseName
  /**
    * The ID of an RDS DB instance.
    */
  var InstanceIdentifier: RDSInstanceIdentifier
}

object RDSDatabase {
  @scala.inline
  def apply(DatabaseName: RDSDatabaseName, InstanceIdentifier: RDSInstanceIdentifier): RDSDatabase = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, InstanceIdentifier = InstanceIdentifier)
  
    __obj.asInstanceOf[RDSDatabase]
  }
}

