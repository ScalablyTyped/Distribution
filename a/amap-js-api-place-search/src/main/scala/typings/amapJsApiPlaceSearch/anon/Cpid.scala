package typings.amapJsApiPlaceSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cpid extends StObject {
  
  var cpid: String
  
  var floor: String
  
  var truefloor: String
}
object Cpid {
  
  inline def apply(cpid: String, floor: String, truefloor: String): Cpid = {
    val __obj = js.Dynamic.literal(cpid = cpid.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], truefloor = truefloor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cpid] (val x: Self) extends AnyVal {
    
    inline def setCpid(value: String): Self = StObject.set(x, "cpid", value.asInstanceOf[js.Any])
    
    inline def setFloor(value: String): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    inline def setTruefloor(value: String): Self = StObject.set(x, "truefloor", value.asInstanceOf[js.Any])
  }
}
