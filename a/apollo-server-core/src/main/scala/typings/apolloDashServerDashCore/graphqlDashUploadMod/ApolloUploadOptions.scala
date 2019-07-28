package typings.apolloDashServerDashCore.graphqlDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloUploadOptions extends js.Object {
  /**
    * Max allowed non-file multipart form field size in bytes; enough for your queries (default: 1 MB)
    */
  var maxFieldSize: js.UndefOr[Double] = js.undefined
  /**
    * Max allowed file size in bytes (default: Infinity)
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  /**
    * Max allowed number of files (default: Infinity)
    */
  var maxFiles: js.UndefOr[Double] = js.undefined
}

object ApolloUploadOptions {
  @scala.inline
  def apply(maxFieldSize: Int | Double = null, maxFileSize: Int | Double = null, maxFiles: Int | Double = null): ApolloUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (maxFieldSize != null) __obj.updateDynamic("maxFieldSize")(maxFieldSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloUploadOptions]
  }
}

