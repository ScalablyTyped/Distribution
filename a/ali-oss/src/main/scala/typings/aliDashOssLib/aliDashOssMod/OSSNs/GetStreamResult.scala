package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamResult extends js.Object {
   // readable stream instance if response status is not 200, stream will be null.
  var res: NormalSuccessResponse
  var stream: js.UndefOr[js.Any] = js.undefined
}

