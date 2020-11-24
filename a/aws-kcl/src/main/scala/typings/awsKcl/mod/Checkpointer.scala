package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkpointer extends js.Object {
  
  /**
    * Checkpoints at the checkpoint will be at the end of the most
    * recently-delivered list of records.
    * @param callback              Function that is invoked after the checkpoint
    *                              operation completes.
    */
  def checkpoint(callback: CheckpointCallback): Unit = js.native
  /**
    * Checkpoints at a given sequence number.
    * @param sequenceNumber        Sequence number of the record to checkpoint;
    * @param callback              Function that is invoked after the checkpoint operation completes.
    */
  def checkpoint(sequenceNumber: String, callback: CheckpointCallback): Unit = js.native
}
