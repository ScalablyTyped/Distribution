package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainInformation extends StObject {
  
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
  
  var OwnerId: js.UndefOr[typings.awsSdk.clientsEsMod.OwnerId] = js.undefined
  
  var Region: js.UndefOr[typings.awsSdk.clientsEsMod.Region] = js.undefined
}
object DomainInformation {
  
  inline def apply(DomainName: DomainName): DomainInformation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInformation]
  }
  
  extension [Self <: DomainInformation](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: OwnerId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
