package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetGroup extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the subnet group.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the subnet group
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subnet group
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of subnets associated with the subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object SubnetGroup {
  
  inline def apply(): SubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubnetGroup] (val x: Self) extends AnyVal {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
