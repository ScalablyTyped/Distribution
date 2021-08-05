package typings.activexDiskquota

import typings.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Microsoft.DiskQuota")
  var MicrosoftDotDiskQuota: DiskQuotaControl
}
object ActiveXObjectNameMap {
  
  inline def apply(MicrosoftDotDiskQuota: DiskQuotaControl): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Microsoft.DiskQuota")(MicrosoftDotDiskQuota.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setMicrosoftDotDiskQuota(value: DiskQuotaControl): Self = StObject.set(x, "Microsoft.DiskQuota", value.asInstanceOf[js.Any])
  }
}
