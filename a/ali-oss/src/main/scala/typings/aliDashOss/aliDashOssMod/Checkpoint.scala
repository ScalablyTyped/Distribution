package typings.aliDashOss.aliDashOssMod

import typings.aliDashOss.Anon_Etag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkpoint extends js.Object {
  var doneParts: js.Array[Anon_Etag]
  var file: js.Any
   //  object key
  var fileSize: Double
   // The file object selected by the user, if the browser is restarted, it needs the user to manually trigger the settings
  var name: String
  var partSize: Double
  var uploadId: String
}

object Checkpoint {
  @scala.inline
  def apply(
    doneParts: js.Array[Anon_Etag],
    file: js.Any,
    fileSize: Double,
    name: String,
    partSize: Double,
    uploadId: String
  ): Checkpoint = {
    val __obj = js.Dynamic.literal(doneParts = doneParts.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partSize = partSize.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Checkpoint]
  }
}

