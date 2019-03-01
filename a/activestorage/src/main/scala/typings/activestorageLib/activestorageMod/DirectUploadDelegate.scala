package typings
package activestorageLib.activestorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectUploadDelegate extends js.Object {
  var directUploadWillCreateBlobWithXHR: js.UndefOr[js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
  var directUploadWillStoreFileWithXHR: js.UndefOr[js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
}

object DirectUploadDelegate {
  @scala.inline
  def apply(
    directUploadWillCreateBlobWithXHR: js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit] = null,
    directUploadWillStoreFileWithXHR: js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit] = null
  ): DirectUploadDelegate = {
    val __obj = js.Dynamic.literal()
    if (directUploadWillCreateBlobWithXHR != null) __obj.updateDynamic("directUploadWillCreateBlobWithXHR")(directUploadWillCreateBlobWithXHR)
    if (directUploadWillStoreFileWithXHR != null) __obj.updateDynamic("directUploadWillStoreFileWithXHR")(directUploadWillStoreFileWithXHR)
    __obj.asInstanceOf[DirectUploadDelegate]
  }
}

