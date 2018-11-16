package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PutStreamOptions extends js.Object {
  var callback: ObjectCallback
  var contentLength: js.UndefOr[scala.Double] = js.undefined
   // custom mime, will send with Content-Type entity header
  var meta: UserMeta
   // the operation timeout
  var mime: java.lang.String
   // the stream length, chunked encoding will be used if absent
  var timeout: scala.Double
}

