package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtteranceData extends StObject {
  
  /**
    * The number of times that the utterance was processed.
    */
  var count: js.UndefOr[Count] = js.undefined
  
  /**
    * The total number of individuals that used the utterance.
    */
  var distinctUsers: js.UndefOr[Count] = js.undefined
  
  /**
    * The date that the utterance was first recorded.
    */
  var firstUtteredDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date that the utterance was last recorded.
    */
  var lastUtteredDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The text that was entered by the user or the text representation of an audio clip.
    */
  var utteranceString: js.UndefOr[UtteranceString] = js.undefined
}
object UtteranceData {
  
  inline def apply(): UtteranceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtteranceData]
  }
  
  extension [Self <: UtteranceData](x: Self) {
    
    inline def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDistinctUsers(value: Count): Self = StObject.set(x, "distinctUsers", value.asInstanceOf[js.Any])
    
    inline def setDistinctUsersUndefined: Self = StObject.set(x, "distinctUsers", js.undefined)
    
    inline def setFirstUtteredDate(value: js.Date): Self = StObject.set(x, "firstUtteredDate", value.asInstanceOf[js.Any])
    
    inline def setFirstUtteredDateUndefined: Self = StObject.set(x, "firstUtteredDate", js.undefined)
    
    inline def setLastUtteredDate(value: js.Date): Self = StObject.set(x, "lastUtteredDate", value.asInstanceOf[js.Any])
    
    inline def setLastUtteredDateUndefined: Self = StObject.set(x, "lastUtteredDate", js.undefined)
    
    inline def setUtteranceString(value: UtteranceString): Self = StObject.set(x, "utteranceString", value.asInstanceOf[js.Any])
    
    inline def setUtteranceStringUndefined: Self = StObject.set(x, "utteranceString", js.undefined)
  }
}
