package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeTrialInfo extends StObject {
  
  /**
    * The date and time that the Amazon Inspector free trail ends for a given account.
    */
  var end: js.Date
  
  /**
    * The date and time that the Amazon Inspector free trail started for a given account.
    */
  var start: js.Date
  
  /**
    * The order to sort results by.
    */
  var status: FreeTrialStatus
  
  /**
    * The type of scan covered by the Amazon Inspector free trail.
    */
  var `type`: FreeTrialType
}
object FreeTrialInfo {
  
  inline def apply(end: js.Date, start: js.Date, status: FreeTrialStatus, `type`: FreeTrialType): FreeTrialInfo = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeTrialInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeTrialInfo] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: FreeTrialStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: FreeTrialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
