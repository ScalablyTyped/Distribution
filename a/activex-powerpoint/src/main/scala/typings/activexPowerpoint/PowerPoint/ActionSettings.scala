package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSettings extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: PpMouseActivation): ActionSetting
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.ActionSettings_typekey")
  var PowerPointDotActionSettings_typekey: ActionSettings
}
object ActionSettings {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: PpMouseActivation => ActionSetting,
    Parent: Any,
    PowerPointDotActionSettings_typekey: ActionSettings
  ): ActionSettings = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ActionSettings_typekey")(PowerPointDotActionSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSettings] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: PpMouseActivation => ActionSetting): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotActionSettings_typekey(value: ActionSettings): Self = StObject.set(x, "PowerPoint.ActionSettings_typekey", value.asInstanceOf[js.Any])
  }
}
