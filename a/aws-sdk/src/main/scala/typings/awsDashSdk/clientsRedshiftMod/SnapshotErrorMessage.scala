package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotErrorMessage extends js.Object {
  /**
    * The failure code for the error.
    */
  var FailureCode: js.UndefOr[String] = js.undefined
  /**
    * The text message describing the error.
    */
  var FailureReason: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the cluster.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the snapshot returning the error.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.undefined
}

object SnapshotErrorMessage {
  @scala.inline
  def apply(
    FailureCode: String = null,
    FailureReason: String = null,
    SnapshotClusterIdentifier: String = null,
    SnapshotIdentifier: String = null
  ): SnapshotErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (FailureCode != null) __obj.updateDynamic("FailureCode")(FailureCode)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (SnapshotClusterIdentifier != null) __obj.updateDynamic("SnapshotClusterIdentifier")(SnapshotClusterIdentifier)
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier)
    __obj.asInstanceOf[SnapshotErrorMessage]
  }
}

