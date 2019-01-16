package typings
package activestorageLib.activestorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectUploadDelegate extends js.Object {
  var directUploadWillCreateBlobWithXHR: js.UndefOr[js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
  var directUploadWillStoreFileWithXHR: js.UndefOr[js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
}

