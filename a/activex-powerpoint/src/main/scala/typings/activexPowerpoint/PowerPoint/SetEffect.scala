package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetEffect extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Parent: js.Any
  
  @JSName("PowerPoint.SetEffect_typekey")
  var PowerPointDotSetEffect_typekey: SetEffect
  
  var Property: MsoAnimProperty
  
  var To: js.Any
}
object SetEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    Parent: js.Any,
    PowerPointDotSetEffect_typekey: SetEffect,
    Property: MsoAnimProperty,
    To: js.Any
  ): SetEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SetEffect_typekey")(PowerPointDotSetEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEffect]
  }
  
  @scala.inline
  implicit class SetEffectMutableBuilder[Self <: SetEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotSetEffect_typekey(value: SetEffect): Self = StObject.set(x, "PowerPoint.SetEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: MsoAnimProperty): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Any): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
