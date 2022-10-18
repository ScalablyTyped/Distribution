package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidrBlockSummary extends StObject {
  
  /**
    * Value for the CIDR block.
    */
  var CidrBlock: js.UndefOr[Cidr] = js.undefined
  
  /**
    * The location name of the CIDR block.
    */
  var LocationName: js.UndefOr[CidrLocationNameDefaultNotAllowed] = js.undefined
}
object CidrBlockSummary {
  
  inline def apply(): CidrBlockSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CidrBlockSummary]
  }
  
  extension [Self <: CidrBlockSummary](x: Self) {
    
    inline def setCidrBlock(value: Cidr): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setLocationName(value: CidrLocationNameDefaultNotAllowed): Self = StObject.set(x, "LocationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "LocationName", js.undefined)
  }
}
