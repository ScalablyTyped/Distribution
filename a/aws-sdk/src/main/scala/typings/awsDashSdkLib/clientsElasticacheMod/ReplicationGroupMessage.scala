package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationGroupMessage extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of replication groups. Each item in the list contains detailed information about one replication group.
    */
  var ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.undefined
}

object ReplicationGroupMessage {
  @scala.inline
  def apply(Marker: String = null, ReplicationGroups: ReplicationGroupList = null): ReplicationGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReplicationGroups != null) __obj.updateDynamic("ReplicationGroups")(ReplicationGroups)
    __obj.asInstanceOf[ReplicationGroupMessage]
  }
}

