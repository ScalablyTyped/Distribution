package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleLastUsed extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format that the role was last used. This field is null if the role has not been used within the IAM tracking period. For more information about the tracking period, see Regions where data is tracked in the IAM User Guide. 
    */
  var LastUsedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Amazon Web Services Region in which the role was last used.
    */
  var Region: js.UndefOr[stringType] = js.undefined
}
object RoleLastUsed {
  
  inline def apply(): RoleLastUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleLastUsed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoleLastUsed] (val x: Self) extends AnyVal {
    
    inline def setLastUsedDate(value: js.Date): Self = StObject.set(x, "LastUsedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUsedDateUndefined: Self = StObject.set(x, "LastUsedDate", js.undefined)
    
    inline def setRegion(value: stringType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
