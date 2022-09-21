package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileList extends StObject {
  
  var fileList: js.Array[ApFilePath]
}
object FileList {
  
  inline def apply(fileList: js.Array[ApFilePath]): FileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileList]
  }
  
  extension [Self <: FileList](x: Self) {
    
    inline def setFileList(value: js.Array[ApFilePath]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: ApFilePath*): Self = StObject.set(x, "fileList", js.Array(value*))
  }
}
