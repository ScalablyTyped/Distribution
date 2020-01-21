package typings.activestorage.mod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectUploadDelegate extends js.Object {
  var directUploadWillCreateBlobWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.undefined
  var directUploadWillStoreFileWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.undefined
}

object DirectUploadDelegate {
  @scala.inline
  def apply(
    directUploadWillCreateBlobWithXHR: /* xhr */ XMLHttpRequest => Unit = null,
    directUploadWillStoreFileWithXHR: /* xhr */ XMLHttpRequest => Unit = null
  ): DirectUploadDelegate = {
    val __obj = js.Dynamic.literal()
    if (directUploadWillCreateBlobWithXHR != null) __obj.updateDynamic("directUploadWillCreateBlobWithXHR")(js.Any.fromFunction1(directUploadWillCreateBlobWithXHR))
    if (directUploadWillStoreFileWithXHR != null) __obj.updateDynamic("directUploadWillStoreFileWithXHR")(js.Any.fromFunction1(directUploadWillStoreFileWithXHR))
    __obj.asInstanceOf[DirectUploadDelegate]
  }
}

