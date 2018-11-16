package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Checkpoint extends js.Object {
  var doneParts: js.Array[aliDashOssLib.Anon_Etag]
  var file: js.Any
   //  object key
  var fileSize: scala.Double
   // The file object selected by the user, if the browser is restarted, it needs the user to manually trigger the settings
  var name: java.lang.String
  var partSize: scala.Double
  var uploadId: java.lang.String
}

