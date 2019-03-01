package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Global
trait TransactionCollections extends js.Object {
  var allowImplicit: js.UndefOr[scala.Boolean] = js.undefined
  var read: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var write: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object TransactionCollections {
  @scala.inline
  def apply(
    allowImplicit: js.UndefOr[scala.Boolean] = js.undefined,
    read: java.lang.String | js.Array[java.lang.String] = null,
    write: java.lang.String | js.Array[java.lang.String] = null
  ): TransactionCollections = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowImplicit)) __obj.updateDynamic("allowImplicit")(allowImplicit)
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionCollections]
  }
}

