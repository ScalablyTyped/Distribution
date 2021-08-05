package typings.antd

import typings.antd.uploadInterfaceMod.RcFile
import typings.antd.uploadInterfaceMod.UploadFile
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadUtilsMod {
  
  @JSImport("antd/lib/upload/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def T(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("T")().asInstanceOf[Boolean]
  
  inline def fileToObject(file: RcFile): UploadFile[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileToObject")(file.asInstanceOf[js.Any]).asInstanceOf[UploadFile[js.Any]]
  
  inline def getFileItem(file: UploadFile[js.Any], fileList: js.Array[UploadFile[js.Any]]): UploadFile[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileItem")(file.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[UploadFile[js.Any]]
  
  inline def isImageUrl(file: UploadFile[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageUrl")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def previewImage(file: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def previewImage(file: File): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def removeFileItem(file: UploadFile[js.Any], fileList: js.Array[UploadFile[js.Any]]): js.Array[UploadFile[js.Any]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFileItem")(file.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Array[UploadFile[js.Any]] | Null]
}
