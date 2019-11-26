package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Global
trait TransactionCollections extends js.Object {
  var allowImplicit: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[String | js.Array[String]] = js.undefined
  var write: js.UndefOr[String | js.Array[String]] = js.undefined
}

object TransactionCollections {
  @scala.inline
  def apply(
    allowImplicit: js.UndefOr[Boolean] = js.undefined,
    read: String | js.Array[String] = null,
    write: String | js.Array[String] = null
  ): TransactionCollections = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowImplicit)) __obj.updateDynamic("allowImplicit")(allowImplicit.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionCollections]
  }
}

