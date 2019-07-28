package typings.antd

import typings.antd.esUploadInterfaceMod.RcFile
import typings.antd.esUploadInterfaceMod.UploadFile
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/upload/utils", JSImport.Namespace)
@js.native
object esUploadUtilsMod extends js.Object {
  def T(): Boolean = js.native
  def fileToObject(file: RcFile): UploadFile = js.native
  def genPercentAdd(): js.Function1[/* s */ Double, Double] = js.native
  def getFileItem(file: UploadFile, fileList: js.Array[UploadFile]): UploadFile = js.native
  def isImageUrl(file: UploadFile): Boolean = js.native
  def previewImage(file: Blob): js.Promise[String] = js.native
  def previewImage(file: File): js.Promise[String] = js.native
  def removeFileItem(file: UploadFile, fileList: js.Array[UploadFile]): js.Array[UploadFile] | Null = js.native
}

