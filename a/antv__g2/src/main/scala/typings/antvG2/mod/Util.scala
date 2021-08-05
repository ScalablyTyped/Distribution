package typings.antvG2.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Util
  extends StObject
     with /* other */ StringDictionary[lodashFn] {
  
  var each: lodashFn
  
  var isFunction: lodashFn
  
  var isNumber: lodashFn
  
  var isObject: lodashFn
  
  var isString: lodashFn
  
  var map: lodashFn
}
object Util {
  
  @JSImport("@antv/g2", "Util")
  @js.native
  val ^ : Util = js.native
  
  extension [Self <: Util](x: Self) {
    
    inline def setEach(value: lodashFn): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
    
    inline def setIsFunction(value: lodashFn): Self = StObject.set(x, "isFunction", value.asInstanceOf[js.Any])
    
    inline def setIsNumber(value: lodashFn): Self = StObject.set(x, "isNumber", value.asInstanceOf[js.Any])
    
    inline def setIsObject(value: lodashFn): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
    
    inline def setIsString(value: lodashFn): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
    
    inline def setMap(value: lodashFn): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
