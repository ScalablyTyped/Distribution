package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDRArray extends StObject {
  
  var IDR: js.Array[String]
}
object IDRArray {
  
  inline def apply(IDR: js.Array[String]): IDRArray = {
    val __obj = js.Dynamic.literal(IDR = IDR.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDRArray]
  }
  
  extension [Self <: IDRArray](x: Self) {
    
    inline def setIDR(value: js.Array[String]): Self = StObject.set(x, "IDR", value.asInstanceOf[js.Any])
    
    inline def setIDRVarargs(value: String*): Self = StObject.set(x, "IDR", js.Array(value*))
  }
}
