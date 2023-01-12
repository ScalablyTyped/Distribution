package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainStats extends StObject {
  
  /**
    * The number of profiles that you are currently paying for in the domain. If you have more than 100 objects associated with a single profile, that profile counts as two profiles. If you have more than 200 objects, that profile counts as three, and so on.
    */
  var MeteringProfileCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects in domain.
    */
  var ObjectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of profiles currently in the domain.
    */
  var ProfileCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total size, in bytes, of all objects in the domain.
    */
  var TotalSize: js.UndefOr[long] = js.undefined
}
object DomainStats {
  
  inline def apply(): DomainStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainStats] (val x: Self) extends AnyVal {
    
    inline def setMeteringProfileCount(value: long): Self = StObject.set(x, "MeteringProfileCount", value.asInstanceOf[js.Any])
    
    inline def setMeteringProfileCountUndefined: Self = StObject.set(x, "MeteringProfileCount", js.undefined)
    
    inline def setObjectCount(value: long): Self = StObject.set(x, "ObjectCount", value.asInstanceOf[js.Any])
    
    inline def setObjectCountUndefined: Self = StObject.set(x, "ObjectCount", js.undefined)
    
    inline def setProfileCount(value: long): Self = StObject.set(x, "ProfileCount", value.asInstanceOf[js.Any])
    
    inline def setProfileCountUndefined: Self = StObject.set(x, "ProfileCount", js.undefined)
    
    inline def setTotalSize(value: long): Self = StObject.set(x, "TotalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "TotalSize", js.undefined)
  }
}
