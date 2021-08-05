package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlSyncState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  val Description: String
  
  val Max: Double
  
  val State: OlSyncState
  
  val Value: Double
}
object Description {
  
  inline def apply(Description: String, Max: Double, State: OlSyncState, Value: Double): Description = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setState(value: OlSyncState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
