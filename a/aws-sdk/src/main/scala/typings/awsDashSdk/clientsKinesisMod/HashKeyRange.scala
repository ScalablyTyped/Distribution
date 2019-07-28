package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashKeyRange extends js.Object {
  /**
    * The ending hash key of the hash key range.
    */
  var EndingHashKey: HashKey
  /**
    * The starting hash key of the hash key range.
    */
  var StartingHashKey: HashKey
}

object HashKeyRange {
  @scala.inline
  def apply(EndingHashKey: HashKey, StartingHashKey: HashKey): HashKeyRange = {
    val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey, StartingHashKey = StartingHashKey)
  
    __obj.asInstanceOf[HashKeyRange]
  }
}

