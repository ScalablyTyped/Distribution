package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArcFlag extends StObject {
    
    var arcFlag: Any
    
    var cx: Double
    
    var cy: Double
    
    var endAngle: Double
    
    var rx: Any
    
    var ry: Any
    
    var startAngle: Double
    
    var sweepFlag: Any
    
    var xRotation: Double
  }
  object ArcFlag {
    
    inline def apply(
      arcFlag: Any,
      cx: Double,
      cy: Double,
      endAngle: Double,
      rx: Any,
      ry: Any,
      startAngle: Double,
      sweepFlag: Any,
      xRotation: Double
    ): ArcFlag = {
      val __obj = js.Dynamic.literal(arcFlag = arcFlag.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], xRotation = xRotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcFlag]
    }
    
    extension [Self <: ArcFlag](x: Self) {
      
      inline def setArcFlag(value: Any): Self = StObject.set(x, "arcFlag", value.asInstanceOf[js.Any])
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setRx(value: Any): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRy(value: Any): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setSweepFlag(value: Any): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
      
      inline def setXRotation(value: Double): Self = StObject.set(x, "xRotation", value.asInstanceOf[js.Any])
    }
  }
}
