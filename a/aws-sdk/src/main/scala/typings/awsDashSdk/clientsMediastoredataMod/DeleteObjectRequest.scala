package typings.awsDashSdk.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectRequest extends js.Object {
  /**
    * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
    */
  var Path: PathNaming = js.native
}

object DeleteObjectRequest {
  @scala.inline
  def apply(Path: PathNaming): DeleteObjectRequest = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteObjectRequest]
  }
}

