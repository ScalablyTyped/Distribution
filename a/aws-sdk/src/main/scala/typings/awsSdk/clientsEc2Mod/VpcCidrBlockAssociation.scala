package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcCidrBlockAssociation extends StObject {
  
  /**
    * The association ID for the IPv4 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the state of the CIDR block.
    */
  var CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.undefined
}
object VpcCidrBlockAssociation {
  
  inline def apply(): VpcCidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcCidrBlockAssociation]
  }
  
  extension [Self <: VpcCidrBlockAssociation](x: Self) {
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockState(value: VpcCidrBlockState): Self = StObject.set(x, "CidrBlockState", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockStateUndefined: Self = StObject.set(x, "CidrBlockState", js.undefined)
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
  }
}
