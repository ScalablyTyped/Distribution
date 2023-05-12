package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  /**
    * The Region code of a given Region (for example, us-east-1).
    */
  var RegionName: js.UndefOr[typings.awsSdk.clientsAccountMod.RegionName] = js.undefined
  
  /**
    * One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling, Enabled_By_Default).
    */
  var RegionOptStatus: js.UndefOr[typings.awsSdk.clientsAccountMod.RegionOptStatus] = js.undefined
}
object Region {
  
  inline def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setRegionOptStatus(value: RegionOptStatus): Self = StObject.set(x, "RegionOptStatus", value.asInstanceOf[js.Any])
    
    inline def setRegionOptStatusUndefined: Self = StObject.set(x, "RegionOptStatus", js.undefined)
  }
}
