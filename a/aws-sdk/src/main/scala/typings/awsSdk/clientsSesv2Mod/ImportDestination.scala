package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDestination extends StObject {
  
  /**
    * An object that contains the action of the import job towards a contact list.
    */
  var ContactListDestination: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ContactListDestination] = js.undefined
  
  /**
    * An object that contains the action of the import job towards suppression list.
    */
  var SuppressionListDestination: js.UndefOr[typings.awsSdk.clientsSesv2Mod.SuppressionListDestination] = js.undefined
}
object ImportDestination {
  
  inline def apply(): ImportDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportDestination]
  }
  
  extension [Self <: ImportDestination](x: Self) {
    
    inline def setContactListDestination(value: ContactListDestination): Self = StObject.set(x, "ContactListDestination", value.asInstanceOf[js.Any])
    
    inline def setContactListDestinationUndefined: Self = StObject.set(x, "ContactListDestination", js.undefined)
    
    inline def setSuppressionListDestination(value: SuppressionListDestination): Self = StObject.set(x, "SuppressionListDestination", value.asInstanceOf[js.Any])
    
    inline def setSuppressionListDestinationUndefined: Self = StObject.set(x, "SuppressionListDestination", js.undefined)
  }
}
