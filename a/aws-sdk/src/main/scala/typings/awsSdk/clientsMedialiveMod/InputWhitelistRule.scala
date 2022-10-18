package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputWhitelistRule extends StObject {
  
  /**
    * The IPv4 CIDR that's whitelisted.
    */
  var Cidr: js.UndefOr[string] = js.undefined
}
object InputWhitelistRule {
  
  inline def apply(): InputWhitelistRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputWhitelistRule]
  }
  
  extension [Self <: InputWhitelistRule](x: Self) {
    
    inline def setCidr(value: string): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
  }
}
