package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/utils", JSImport.Namespace)
@js.native
object libUploadUtilsMod extends js.Object {
  def T(): scala.Boolean = js.native
  def fileToObject(file: antdLib.libUploadInterfaceMod.RcFile): antdLib.libUploadInterfaceMod.UploadFile = js.native
  def genPercentAdd(): js.Function1[/* s */ scala.Double, scala.Double] = js.native
  def getFileItem(
    file: antdLib.libUploadInterfaceMod.UploadFile,
    fileList: js.Array[antdLib.libUploadInterfaceMod.UploadFile]
  ): antdLib.libUploadInterfaceMod.UploadFile = js.native
  def removeFileItem(
    file: antdLib.libUploadInterfaceMod.UploadFile,
    fileList: js.Array[antdLib.libUploadInterfaceMod.UploadFile]
  ): js.Array[antdLib.libUploadInterfaceMod.UploadFile] | scala.Null = js.native
}

