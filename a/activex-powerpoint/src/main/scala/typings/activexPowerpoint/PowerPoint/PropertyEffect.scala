package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyEffect extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var From: Any
  
  val Parent: Any
  
  val Points: AnimationPoints
  
  /* private */ @JSName("PowerPoint.PropertyEffect_typekey")
  var PowerPointDotPropertyEffect_typekey: PropertyEffect
  
  var Property: MsoAnimProperty
  
  var To: Any
}
object PropertyEffect {
  
  inline def apply(
    Application: Application,
    From: Any,
    Parent: Any,
    Points: AnimationPoints,
    PowerPointDotPropertyEffect_typekey: PropertyEffect,
    Property: MsoAnimProperty,
    To: Any
  ): PropertyEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PropertyEffect_typekey")(PowerPointDotPropertyEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyEffect]
  }
  
  extension [Self <: PropertyEffect](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Any): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: AnimationPoints): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPropertyEffect_typekey(value: PropertyEffect): Self = StObject.set(x, "PowerPoint.PropertyEffect_typekey", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: MsoAnimProperty): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Any): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
