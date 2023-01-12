package typings.antvGLite

import typings.antvGLite.distCssCssomTypesMod.UnitType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssomCssnumericsumvalueMod {
  
  type CSSNumericSumValue = js.Array[Term]
  
  trait Term extends StObject {
    
    var units: UnitMap
    
    var value: Double
  }
  object Term {
    
    inline def apply(units: UnitMap, value: Double): Term = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Term]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Term] (val x: Self) extends AnyVal {
      
      inline def setUnits(value: UnitMap): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type UnitMap = Record[UnitType, Double]
}
