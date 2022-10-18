package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentVpc extends StObject {
  
  /**
    * The Amazon Web Services account ID of the virtual private cloud (VPC) owner. 
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.AccountId] = js.undefined
  
  /**
    * The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks. 
    */
  var CidrBlocks: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.CidrBlocks] = js.undefined
  
  /**
    * A timestamp that indicates when the VPC is first added to the environment. 
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier of the environment. 
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.EnvironmentId] = js.undefined
  
  /**
    * A timestamp that indicates when the VPC was last updated by the environment. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the VPC. 
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.VpcId] = js.undefined
  
  /**
    * The name of the VPC at the time it is added to the environment. 
    */
  var VpcName: js.UndefOr[Ec2TagValue] = js.undefined
}
object EnvironmentVpc {
  
  inline def apply(): EnvironmentVpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentVpc]
  }
  
  extension [Self <: EnvironmentVpc](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCidrBlocks(value: CidrBlocks): Self = StObject.set(x, "CidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setCidrBlocksUndefined: Self = StObject.set(x, "CidrBlocks", js.undefined)
    
    inline def setCidrBlocksVarargs(value: CidrBlock*): Self = StObject.set(x, "CidrBlocks", js.Array(value*))
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpcName(value: Ec2TagValue): Self = StObject.set(x, "VpcName", value.asInstanceOf[js.Any])
    
    inline def setVpcNameUndefined: Self = StObject.set(x, "VpcName", js.undefined)
  }
}
