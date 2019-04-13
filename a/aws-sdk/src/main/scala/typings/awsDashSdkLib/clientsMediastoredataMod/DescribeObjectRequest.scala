package typings
package awsDashSdkLib.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeObjectRequest extends js.Object {
  /**
    * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
    */
  var Path: PathNaming
}

object DescribeObjectRequest {
  @scala.inline
  def apply(Path: PathNaming): DescribeObjectRequest = {
    val __obj = js.Dynamic.literal(Path = Path)
  
    __obj.asInstanceOf[DescribeObjectRequest]
  }
}

