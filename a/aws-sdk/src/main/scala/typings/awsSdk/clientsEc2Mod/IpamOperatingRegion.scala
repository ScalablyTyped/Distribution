package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamOperatingRegion extends StObject {
  
  /**
    * The name of the operating Region.
    */
  var RegionName: js.UndefOr[String] = js.undefined
}
object IpamOperatingRegion {
  
  inline def apply(): IpamOperatingRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamOperatingRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamOperatingRegion] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
