package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinHeightNumber extends StObject {
  
  var minHeight: Double
}
object MinHeightNumber {
  
  inline def apply(minHeight: Double): MinHeightNumber = {
    val __obj = js.Dynamic.literal(minHeight = minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeightNumber]
  }
  
  extension [Self <: MinHeightNumber](x: Self) {
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
  }
}
