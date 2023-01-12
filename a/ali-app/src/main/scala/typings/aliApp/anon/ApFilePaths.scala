package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApFilePaths extends StObject {
  
  /**
    * 图片文件描述
    */
  var apFilePaths: js.Array[String]
}
object ApFilePaths {
  
  inline def apply(apFilePaths: js.Array[String]): ApFilePaths = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApFilePaths] (val x: Self) extends AnyVal {
    
    inline def setApFilePaths(value: js.Array[String]): Self = StObject.set(x, "apFilePaths", value.asInstanceOf[js.Any])
    
    inline def setApFilePathsVarargs(value: String*): Self = StObject.set(x, "apFilePaths", js.Array(value*))
  }
}
