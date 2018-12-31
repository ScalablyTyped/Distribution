package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectOptions extends js.Object {
   // image process params, will send with x-oss-process e.g.: {process: 'image/resize,w_200'}
  var headers: js.UndefOr[js.Object] = js.undefined
  var process: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

