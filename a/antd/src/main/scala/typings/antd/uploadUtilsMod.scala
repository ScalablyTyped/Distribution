package typings.antd

import typings.antd.uploadInterfaceMod.RcFile
import typings.antd.uploadInterfaceMod.UploadFile
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadUtilsMod {
  
  @JSImport("antd/lib/upload/utils", "T")
  @js.native
  def T(): Boolean = js.native
  
  @JSImport("antd/lib/upload/utils", "fileToObject")
  @js.native
  def fileToObject(file: RcFile): UploadFile[_] = js.native
  
  @JSImport("antd/lib/upload/utils", "getFileItem")
  @js.native
  def getFileItem(file: UploadFile[_], fileList: js.Array[UploadFile[_]]): UploadFile[_] = js.native
  
  @JSImport("antd/lib/upload/utils", "isImageUrl")
  @js.native
  def isImageUrl(file: UploadFile[_]): Boolean = js.native
  
  @JSImport("antd/lib/upload/utils", "previewImage")
  @js.native
  def previewImage(file: Blob): js.Promise[String] = js.native
  @JSImport("antd/lib/upload/utils", "previewImage")
  @js.native
  def previewImage(file: File): js.Promise[String] = js.native
  
  @JSImport("antd/lib/upload/utils", "removeFileItem")
  @js.native
  def removeFileItem(file: UploadFile[_], fileList: js.Array[UploadFile[_]]): js.Array[UploadFile[_]] | Null = js.native
}
