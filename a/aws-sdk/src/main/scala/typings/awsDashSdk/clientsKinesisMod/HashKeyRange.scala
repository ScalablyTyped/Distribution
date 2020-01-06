package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashKeyRange extends js.Object {
  /**
    * The ending hash key of the hash key range.
    */
  var EndingHashKey: HashKey = js.native
  /**
    * The starting hash key of the hash key range.
    */
  var StartingHashKey: HashKey = js.native
}

object HashKeyRange {
  @scala.inline
  def apply(EndingHashKey: HashKey, StartingHashKey: HashKey): HashKeyRange = {
    val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey.asInstanceOf[js.Any], StartingHashKey = StartingHashKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HashKeyRange]
  }
}

