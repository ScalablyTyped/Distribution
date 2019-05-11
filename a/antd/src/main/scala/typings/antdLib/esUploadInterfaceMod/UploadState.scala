package typings
package antdLib.esUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadState extends js.Object {
  var dragState: java.lang.String
  var fileList: js.Array[UploadFile]
}

object UploadState {
  @scala.inline
  def apply(dragState: java.lang.String, fileList: js.Array[UploadFile]): UploadState = {
    val __obj = js.Dynamic.literal(dragState = dragState, fileList = fileList)
  
    __obj.asInstanceOf[UploadState]
  }
}

