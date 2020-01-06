package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueInfo extends js.Object {
  /**
    * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
    */
  var QueuedIngestion: java.lang.String = js.native
  /**
    * The ID of the queued ingestion.
    */
  var WaitingOnIngestion: java.lang.String = js.native
}

object QueueInfo {
  @scala.inline
  def apply(QueuedIngestion: java.lang.String, WaitingOnIngestion: java.lang.String): QueueInfo = {
    val __obj = js.Dynamic.literal(QueuedIngestion = QueuedIngestion.asInstanceOf[js.Any], WaitingOnIngestion = WaitingOnIngestion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueueInfo]
  }
}

