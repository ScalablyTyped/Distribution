package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulerLevel extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var FirstMargin: Double
  
  var LeftMargin: Double
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.RulerLevel_typekey")
  var PowerPointDotRulerLevel_typekey: RulerLevel
}
object RulerLevel {
  
  inline def apply(
    Application: Application,
    FirstMargin: Double,
    LeftMargin: Double,
    Parent: Any,
    PowerPointDotRulerLevel_typekey: RulerLevel
  ): RulerLevel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FirstMargin = FirstMargin.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RulerLevel_typekey")(PowerPointDotRulerLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevel]
  }
  
  extension [Self <: RulerLevel](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setFirstMargin(value: Double): Self = StObject.set(x, "FirstMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotRulerLevel_typekey(value: RulerLevel): Self = StObject.set(x, "PowerPoint.RulerLevel_typekey", value.asInstanceOf[js.Any])
  }
}
