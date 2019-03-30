package typings
package activestorageLib.activestorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("activestorage", "DirectUpload")
@js.native
class DirectUpload protected () extends js.Object {
  def this(file: stdLib.File, url: java.lang.String) = this()
  def this(file: stdLib.File, url: java.lang.String, delegate: DirectUploadDelegate) = this()
  var file: stdLib.File = js.native
  var id: scala.Double = js.native
  var url: java.lang.String = js.native
  def create(callback: js.Function2[/* error */ stdLib.Error, /* blob */ Blob, scala.Unit]): scala.Unit = js.native
}

