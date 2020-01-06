package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionTarget extends js.Object {
  /**
    * A unique string that identifies the version to update the cluster to. You can use this value in ModifyClusterDbRevision.
    */
  var DatabaseRevision: js.UndefOr[String] = js.native
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.native
  /**
    * A string that describes the changes and features that will be applied to the cluster when it is updated to the corresponding ClusterDbRevision.
    */
  var Description: js.UndefOr[String] = js.native
}

object RevisionTarget {
  @scala.inline
  def apply(
    DatabaseRevision: String = null,
    DatabaseRevisionReleaseDate: TStamp = null,
    Description: String = null
  ): RevisionTarget = {
    val __obj = js.Dynamic.literal()
    if (DatabaseRevision != null) __obj.updateDynamic("DatabaseRevision")(DatabaseRevision.asInstanceOf[js.Any])
    if (DatabaseRevisionReleaseDate != null) __obj.updateDynamic("DatabaseRevisionReleaseDate")(DatabaseRevisionReleaseDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionTarget]
  }
}

