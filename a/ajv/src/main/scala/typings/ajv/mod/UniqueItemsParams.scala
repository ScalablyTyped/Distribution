package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueItemsParams
  extends StObject
     with ErrorParameters {
  
  var i: Double
  
  var j: Double
}
object UniqueItemsParams {
  
  inline def apply(i: Double, j: Double): UniqueItemsParams = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueItemsParams]
  }
  
  extension [Self <: UniqueItemsParams](x: Self) {
    
    inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
  }
}
