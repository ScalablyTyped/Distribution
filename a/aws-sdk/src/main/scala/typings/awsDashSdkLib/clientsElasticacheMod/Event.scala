package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * The date and time when the event occurred.
    */
  var Date: js.UndefOr[TStamp] = js.undefined
  /**
    * The text of the event.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the source of the event. For example, if the event occurred at the cluster level, the identifier would be the name of the cluster.
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies the origin of this event - a cluster, a parameter group, a security group, etc.
    */
  var SourceType: js.UndefOr[SourceType] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    Date: TStamp = null,
    Message: String = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

