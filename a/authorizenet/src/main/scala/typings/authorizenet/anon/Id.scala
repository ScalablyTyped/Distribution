package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var payNum: String
}
object Id {
  
  inline def apply(id: String, payNum: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payNum = payNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPayNum(value: String): Self = StObject.set(x, "payNum", value.asInstanceOf[js.Any])
  }
}
