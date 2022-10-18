package typings.antd

import typings.antd.libUploadInterfaceMod.InternalUploadFile
import typings.antd.libUploadInterfaceMod.RcFile
import typings.antd.libUploadInterfaceMod.UploadFile
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUploadUtilsMod {
  
  @JSImport("antd/lib/upload/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def file2Obj(file: RcFile): InternalUploadFile[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("file2Obj")(file.asInstanceOf[js.Any]).asInstanceOf[InternalUploadFile[Any]]
  
  inline def getFileItem(file: RcFile, fileList: js.Array[UploadFile[Any]]): UploadFile[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileItem")(file.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[UploadFile[Any]]
  
  inline def isImageUrl(file: UploadFile[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageUrl")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def previewImage(file: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def previewImage(file: File): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def removeFileItem(file: UploadFile[Any], fileList: js.Array[UploadFile[Any]]): js.Array[UploadFile[Any]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFileItem")(file.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Array[UploadFile[Any]] | Null]
  
  inline def updateFileList(file: UploadFile[Any], fileList: js.Array[UploadFile[Any]]): js.Array[UploadFile[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFileList")(file.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Array[UploadFile[Any]]]
}
