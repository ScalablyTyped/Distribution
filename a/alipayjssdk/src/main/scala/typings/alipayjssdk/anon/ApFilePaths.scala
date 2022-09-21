package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApFilePaths extends StObject {
  
  /** 图片文件路径 */
  var apFilePaths: js.Array[String]
  
  var apFilePathsV2: js.Array[String]
  
  var tempFiles: js.Array[CreationDate]
}
object ApFilePaths {
  
  inline def apply(apFilePaths: js.Array[String], apFilePathsV2: js.Array[String], tempFiles: js.Array[CreationDate]): ApFilePaths = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any], apFilePathsV2 = apFilePathsV2.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePaths]
  }
  
  extension [Self <: ApFilePaths](x: Self) {
    
    inline def setApFilePaths(value: js.Array[String]): Self = StObject.set(x, "apFilePaths", value.asInstanceOf[js.Any])
    
    inline def setApFilePathsV2(value: js.Array[String]): Self = StObject.set(x, "apFilePathsV2", value.asInstanceOf[js.Any])
    
    inline def setApFilePathsV2Varargs(value: String*): Self = StObject.set(x, "apFilePathsV2", js.Array(value*))
    
    inline def setApFilePathsVarargs(value: String*): Self = StObject.set(x, "apFilePaths", js.Array(value*))
    
    inline def setTempFiles(value: js.Array[CreationDate]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    inline def setTempFilesVarargs(value: CreationDate*): Self = StObject.set(x, "tempFiles", js.Array(value*))
  }
}
