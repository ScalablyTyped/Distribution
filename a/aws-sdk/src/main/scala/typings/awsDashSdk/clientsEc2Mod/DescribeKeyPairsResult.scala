package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeKeyPairsResult extends js.Object {
  /**
    * Information about the key pairs.
    */
  var KeyPairs: js.UndefOr[KeyPairList] = js.undefined
}

object DescribeKeyPairsResult {
  @scala.inline
  def apply(KeyPairs: KeyPairList = null): DescribeKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    if (KeyPairs != null) __obj.updateDynamic("KeyPairs")(KeyPairs)
    __obj.asInstanceOf[DescribeKeyPairsResult]
  }
}

