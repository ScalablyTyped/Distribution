package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterDbRevision extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A string representing the current cluster version.
    */
  var CurrentDatabaseRevision: js.UndefOr[String] = js.undefined
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined
  /**
    * A list of RevisionTarget objects, where each object describes the database revision that a cluster can be updated to.
    */
  var RevisionTargets: js.UndefOr[RevisionTargetsList] = js.undefined
}

object ClusterDbRevision {
  @scala.inline
  def apply(
    ClusterIdentifier: String = null,
    CurrentDatabaseRevision: String = null,
    DatabaseRevisionReleaseDate: TStamp = null,
    RevisionTargets: RevisionTargetsList = null
  ): ClusterDbRevision = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (CurrentDatabaseRevision != null) __obj.updateDynamic("CurrentDatabaseRevision")(CurrentDatabaseRevision)
    if (DatabaseRevisionReleaseDate != null) __obj.updateDynamic("DatabaseRevisionReleaseDate")(DatabaseRevisionReleaseDate)
    if (RevisionTargets != null) __obj.updateDynamic("RevisionTargets")(RevisionTargets)
    __obj.asInstanceOf[ClusterDbRevision]
  }
}

