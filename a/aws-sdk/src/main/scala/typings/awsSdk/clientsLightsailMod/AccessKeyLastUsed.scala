package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKeyLastUsed extends StObject {
  
  /**
    * The date and time when the access key was most recently used. This value is null if the access key has not been used.
    */
  var lastUsedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services Region where this access key was most recently used. This value is N/A if the access key has not been used.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon Web Services service with which this access key was most recently used. This value is N/A if the access key has not been used.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object AccessKeyLastUsed {
  
  inline def apply(): AccessKeyLastUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessKeyLastUsed]
  }
  
  extension [Self <: AccessKeyLastUsed](x: Self) {
    
    inline def setLastUsedDate(value: js.Date): Self = StObject.set(x, "lastUsedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUsedDateUndefined: Self = StObject.set(x, "lastUsedDate", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
