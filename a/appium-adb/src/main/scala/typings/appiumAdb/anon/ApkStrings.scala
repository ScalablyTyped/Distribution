package typings.appiumAdb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApkStrings extends StObject {
  
  var apkStrings: StringDictionary[String]
  
  var localPath: String
}
object ApkStrings {
  
  inline def apply(apkStrings: StringDictionary[String], localPath: String): ApkStrings = {
    val __obj = js.Dynamic.literal(apkStrings = apkStrings.asInstanceOf[js.Any], localPath = localPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApkStrings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApkStrings] (val x: Self) extends AnyVal {
    
    inline def setApkStrings(value: StringDictionary[String]): Self = StObject.set(x, "apkStrings", value.asInstanceOf[js.Any])
    
    inline def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
  }
}
