package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CisaData extends StObject {
  
  /**
    * The remediation action recommended by CISA for this vulnerability.
    */
  var action: js.UndefOr[CisaAction] = js.undefined
  
  /**
    * The date and time CISA added this vulnerability to their catalogue.
    */
  var dateAdded: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time CISA expects a fix to have been provided vulnerability.
    */
  var dateDue: js.UndefOr[js.Date] = js.undefined
}
object CisaData {
  
  inline def apply(): CisaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CisaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CisaData] (val x: Self) extends AnyVal {
    
    inline def setAction(value: CisaAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDateAdded(value: js.Date): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
    
    inline def setDateAddedUndefined: Self = StObject.set(x, "dateAdded", js.undefined)
    
    inline def setDateDue(value: js.Date): Self = StObject.set(x, "dateDue", value.asInstanceOf[js.Any])
    
    inline def setDateDueUndefined: Self = StObject.set(x, "dateDue", js.undefined)
  }
}
