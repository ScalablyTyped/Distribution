package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedgerSummary extends StObject {
  
  /**
    * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the ledger.
    */
  var Name: js.UndefOr[LedgerName] = js.undefined
  
  /**
    * The current status of the ledger.
    */
  var State: js.UndefOr[LedgerState] = js.undefined
}
object LedgerSummary {
  
  inline def apply(): LedgerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LedgerSummary]
  }
  
  extension [Self <: LedgerSummary](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: LedgerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
