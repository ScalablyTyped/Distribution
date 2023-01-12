package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcInfoCidrBlockSetDetails extends StObject {
  
  /**
    * The IPv4 CIDR block for the VPC. 
    */
  var CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
}
object VpcInfoCidrBlockSetDetails {
  
  inline def apply(): VpcInfoCidrBlockSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcInfoCidrBlockSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcInfoCidrBlockSetDetails] (val x: Self) extends AnyVal {
    
    inline def setCidrBlock(value: NonEmptyString): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
  }
}
