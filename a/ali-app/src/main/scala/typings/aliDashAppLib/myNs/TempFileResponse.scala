package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFileResponse extends js.Object {
  /** 文件的临时路径 */
  var apFilePath: java.lang.String
}

object TempFileResponse {
  @scala.inline
  def apply(apFilePath: java.lang.String): TempFileResponse = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath)
  
    __obj.asInstanceOf[TempFileResponse]
  }
}

