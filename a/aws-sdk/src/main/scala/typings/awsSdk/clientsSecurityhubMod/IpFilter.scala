package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpFilter extends StObject {
  
  /**
    * A finding's CIDR value.
    */
  var Cidr: js.UndefOr[NonEmptyString] = js.undefined
}
object IpFilter {
  
  inline def apply(): IpFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpFilter]
  }
  
  extension [Self <: IpFilter](x: Self) {
    
    inline def setCidr(value: NonEmptyString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
  }
}
