package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolCidrBlock extends StObject {
  
  /**
    * The CIDR block.
    */
  var Cidr: js.UndefOr[String] = js.undefined
}
object PoolCidrBlock {
  
  inline def apply(): PoolCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolCidrBlock]
  }
  
  extension [Self <: PoolCidrBlock](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
  }
}
