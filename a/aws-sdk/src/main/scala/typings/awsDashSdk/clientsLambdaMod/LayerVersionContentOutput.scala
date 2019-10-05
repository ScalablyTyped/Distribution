package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerVersionContentOutput extends js.Object {
  /**
    * The SHA-256 hash of the layer archive.
    */
  var CodeSha256: js.UndefOr[String] = js.undefined
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.undefined
  /**
    * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
    */
  var Location: js.UndefOr[String] = js.undefined
}

object LayerVersionContentOutput {
  @scala.inline
  def apply(CodeSha256: String = null, CodeSize: Int | Double = null, Location: String = null): LayerVersionContentOutput = {
    val __obj = js.Dynamic.literal()
    if (CodeSha256 != null) __obj.updateDynamic("CodeSha256")(CodeSha256)
    if (CodeSize != null) __obj.updateDynamic("CodeSize")(CodeSize.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[LayerVersionContentOutput]
  }
}

