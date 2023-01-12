package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BYNArray extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var PHP: js.Array[js.UndefOr[String]]
}
object BYNArray {
  
  inline def apply(BYN: js.Array[js.UndefOr[String]], PHP: js.Array[js.UndefOr[String]]): BYNArray = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BYNArray] (val x: Self) extends AnyVal {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
  }
}
