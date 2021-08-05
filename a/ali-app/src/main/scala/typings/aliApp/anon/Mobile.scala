package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mobile extends StObject {
  
  // 选中的联系人姓名
  var mobile: String
  
  var name: String
}
object Mobile {
  
  inline def apply(mobile: String, name: String): Mobile = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
  
  extension [Self <: Mobile](x: Self) {
    
    inline def setMobile(value: String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
