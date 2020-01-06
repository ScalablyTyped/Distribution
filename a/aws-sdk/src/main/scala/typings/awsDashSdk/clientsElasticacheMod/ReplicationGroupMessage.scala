package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupMessage extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of replication groups. Each item in the list contains detailed information about one replication group.
    */
  var ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.native
}

object ReplicationGroupMessage {
  @scala.inline
  def apply(Marker: String = null, ReplicationGroups: ReplicationGroupList = null): ReplicationGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReplicationGroups != null) __obj.updateDynamic("ReplicationGroups")(ReplicationGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationGroupMessage]
  }
}

