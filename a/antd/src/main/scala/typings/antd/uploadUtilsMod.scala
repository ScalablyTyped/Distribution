package typings.antd

import typings.antd.uploadInterfaceMod.RcFile
import typings.antd.uploadInterfaceMod.UploadFile
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/utils", JSImport.Namespace)
@js.native
object uploadUtilsMod extends js.Object {
  def T(): Boolean = js.native
  def fileToObject(file: RcFile): UploadFile[_] = js.native
  def genPercentAdd(): js.Function1[/* s */ Double, Double] = js.native
  def getFileItem(file: UploadFile[_], fileList: js.Array[UploadFile[_]]): UploadFile[_] = js.native
  def isImageUrl(file: UploadFile[_]): Boolean = js.native
  def previewImage(file: Blob): js.Promise[String] = js.native
  def previewImage(file: File): js.Promise[String] = js.native
  def removeFileItem(file: UploadFile[_], fileList: js.Array[UploadFile[_]]): js.Array[UploadFile[_]] | Null = js.native
}

