package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/upload/utils", JSImport.Namespace)
@js.native
object esUploadUtilsMod extends js.Object {
  def T(): scala.Boolean = js.native
  def fileToObject(file: antdLib.esUploadInterfaceMod.RcFile): antdLib.esUploadInterfaceMod.UploadFile = js.native
  def genPercentAdd(): js.Function1[/* s */ scala.Double, scala.Double] = js.native
  def getFileItem(
    file: antdLib.esUploadInterfaceMod.UploadFile,
    fileList: js.Array[antdLib.esUploadInterfaceMod.UploadFile]
  ): antdLib.esUploadInterfaceMod.UploadFile = js.native
  def isImageUrl(file: antdLib.esUploadInterfaceMod.UploadFile): scala.Boolean = js.native
  def previewImage(file: stdLib.Blob): js.Promise[java.lang.String] = js.native
  def previewImage(file: stdLib.File): js.Promise[java.lang.String] = js.native
  def removeFileItem(
    file: antdLib.esUploadInterfaceMod.UploadFile,
    fileList: js.Array[antdLib.esUploadInterfaceMod.UploadFile]
  ): js.Array[antdLib.esUploadInterfaceMod.UploadFile] | scala.Null = js.native
}

