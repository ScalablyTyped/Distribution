package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacktrackDBClusterMessage extends js.Object {
  /**
    * The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more information about ISO 8601, see the ISO8601 Wikipedia page.   If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the nearest possible consistent time for the DB cluster.  Constraints:   Must contain a valid ISO 8601 timestamp.   Can't contain a timestamp set in the future.   Example: 2017-07-08T18:00Z 
    */
  var BacktrackTo: TStamp
  /**
    * The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
    */
  var DBClusterIdentifier: String
  /**
    * A value that indicates whether to force the DB cluster to backtrack when binary logging is enabled. Otherwise, an error occurs when binary logging is enabled.
    */
  var Force: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that indicates whether to backtrack the DB cluster to the earliest possible backtrack time when BacktrackTo is set to a timestamp earlier than the earliest backtrack time. When this parameter is disabled and BacktrackTo is set to a timestamp earlier than the earliest backtrack time, an error occurs.
    */
  var UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional] = js.undefined
}

object BacktrackDBClusterMessage {
  @scala.inline
  def apply(
    BacktrackTo: TStamp,
    DBClusterIdentifier: String,
    Force: js.UndefOr[scala.Boolean] = js.undefined,
    UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  ): BacktrackDBClusterMessage = {
    val __obj = js.Dynamic.literal(BacktrackTo = BacktrackTo, DBClusterIdentifier = DBClusterIdentifier)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    if (!js.isUndefined(UseEarliestTimeOnPointInTimeUnavailable)) __obj.updateDynamic("UseEarliestTimeOnPointInTimeUnavailable")(UseEarliestTimeOnPointInTimeUnavailable)
    __obj.asInstanceOf[BacktrackDBClusterMessage]
  }
}

