package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AppendObjectOptions extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
   // custom mime, will send with Content-Type entity header
  var meta: js.UndefOr[UserMeta] = js.undefined
   // the operation timeout
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
   // specify the position which is the content length of the latest object
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

