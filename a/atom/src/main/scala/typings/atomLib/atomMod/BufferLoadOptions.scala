package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BufferLoadOptions extends js.Object {
  /** The file's encoding. */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  A function that returns a boolean indicating whether the buffer should
       *  be destroyed if its file is deleted.
       */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

