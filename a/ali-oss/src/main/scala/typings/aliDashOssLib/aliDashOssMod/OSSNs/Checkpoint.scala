package typings
package aliDashOssLib.aliDashOssMod.OSSNs

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

object Checkpoint {
  @scala.inline
  def apply(
    doneParts: js.Array[aliDashOssLib.Anon_Etag],
    file: js.Any,
    fileSize: scala.Double,
    name: java.lang.String,
    partSize: scala.Double,
    uploadId: java.lang.String
  ): Checkpoint = {
    val __obj = js.Dynamic.literal(doneParts = doneParts, file = file, fileSize = fileSize, name = name, partSize = partSize, uploadId = uploadId)
  
    __obj.asInstanceOf[Checkpoint]
  }
}

