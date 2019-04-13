package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRelationalDatabaseRequest extends js.Object {
  /**
    * The name of the database snapshot created if skip final snapshot is false, which is the default value for that parameter.  Specifying this parameter and also specifying the skip final snapshot parameter to true results in an error.  Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name of the database that you are deleting.
    */
  var relationalDatabaseName: ResourceName
  /**
    * Determines whether a final database snapshot is created before your database is deleted. If true is specified, no database snapshot is created. If false is specified, a database snapshot is created before your database is deleted. You must specify the final relational database snapshot name parameter if the skip final snapshot parameter is false. Default: false 
    */
  var skipFinalSnapshot: js.UndefOr[scala.Boolean] = js.undefined
}

object DeleteRelationalDatabaseRequest {
  @scala.inline
  def apply(
    relationalDatabaseName: ResourceName,
    finalRelationalDatabaseSnapshotName: ResourceName = null,
    skipFinalSnapshot: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
    if (finalRelationalDatabaseSnapshotName != null) __obj.updateDynamic("finalRelationalDatabaseSnapshotName")(finalRelationalDatabaseSnapshotName)
    if (!js.isUndefined(skipFinalSnapshot)) __obj.updateDynamic("skipFinalSnapshot")(skipFinalSnapshot)
    __obj.asInstanceOf[DeleteRelationalDatabaseRequest]
  }
}

