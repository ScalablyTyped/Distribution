package typings.antvG2

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.dependentsMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait AnimateExtraCfg
    extends StObject
       with /**
    * @title 其他自定义的 option
    */
  /* name */ StringDictionary[Any] {
    
    /**
      * @title 当前坐标系
      */
    var coordinate: Coordinate
    
    /**
      * @title 图形最终样式
      */
    var toAttrs: js.Object
  }
  object AnimateExtraCfg {
    
    inline def apply(coordinate: Coordinate, toAttrs: js.Object): AnimateExtraCfg = {
      val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], toAttrs = toAttrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimateExtraCfg]
    }
    
    extension [Self <: AnimateExtraCfg](x: Self) {
      
      inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setToAttrs(value: js.Object): Self = StObject.set(x, "toAttrs", value.asInstanceOf[js.Any])
    }
  }
}
