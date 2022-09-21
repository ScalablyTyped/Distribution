package typings.awsLambda.anon

import typings.awsLambda.lexV2Mod.LexV2IntentState
import typings.awsLambda.lexV2Mod.LexV2Slots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slots extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var slots: js.UndefOr[LexV2Slots] = js.undefined
  
  var state: LexV2IntentState
}
object Slots {
  
  inline def apply(state: LexV2IntentState): Slots = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slots]
  }
  
  extension [Self <: Slots](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSlots(value: LexV2Slots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setState(value: LexV2IntentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
