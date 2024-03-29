package typings.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GrowthFactor extends StObject {
    
    var growthFactor: Double
    
    var size: Double
  }
  object GrowthFactor {
    
    inline def apply(growthFactor: Double, size: Double): GrowthFactor = {
      val __obj = js.Dynamic.literal(growthFactor = growthFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrowthFactor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrowthFactor] (val x: Self) extends AnyVal {
      
      inline def setGrowthFactor(value: Double): Self = StObject.set(x, "growthFactor", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
