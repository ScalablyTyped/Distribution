package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainChangeProgressRequest extends StObject {
  
  /**
    * The specific change ID for which you want to get progress information. If omitted, the request returns information about the most recent configuration change.
    */
  var ChangeId: js.UndefOr[GUID] = js.undefined
  
  /**
    * The name of the domain to get progress information for.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
}
object DescribeDomainChangeProgressRequest {
  
  inline def apply(DomainName: DomainName): DescribeDomainChangeProgressRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainChangeProgressRequest]
  }
  
  extension [Self <: DescribeDomainChangeProgressRequest](x: Self) {
    
    inline def setChangeId(value: GUID): Self = StObject.set(x, "ChangeId", value.asInstanceOf[js.Any])
    
    inline def setChangeIdUndefined: Self = StObject.set(x, "ChangeId", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
