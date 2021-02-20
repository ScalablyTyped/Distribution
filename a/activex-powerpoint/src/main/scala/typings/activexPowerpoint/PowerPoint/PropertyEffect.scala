package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyEffect extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var From: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  val Points: AnimationPoints = js.native
  
  @JSName("PowerPoint.PropertyEffect_typekey")
  var PowerPointDotPropertyEffect_typekey: PropertyEffect = js.native
  
  var Property: MsoAnimProperty = js.native
  
  var To: js.Any = js.native
}
object PropertyEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    From: js.Any,
    Parent: js.Any,
    Points: AnimationPoints,
    PowerPointDotPropertyEffect_typekey: PropertyEffect,
    Property: MsoAnimProperty,
    To: js.Any
  ): PropertyEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PropertyEffect_typekey")(PowerPointDotPropertyEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyEffect]
  }
  
  @scala.inline
  implicit class PropertyEffectMutableBuilder[Self <: PropertyEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: js.Any): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: AnimationPoints): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPropertyEffect_typekey(value: PropertyEffect): Self = StObject.set(x, "PowerPoint.PropertyEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: MsoAnimProperty): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Any): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
