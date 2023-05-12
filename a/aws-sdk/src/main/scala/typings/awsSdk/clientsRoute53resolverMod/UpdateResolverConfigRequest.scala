package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverConfigRequest extends StObject {
  
  /**
    * Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. This is enabled by default. Disabling this option will also affect EC2-Classic instances using ClassicLink. For more information, see ClassicLink in the Amazon EC2 guide.  We are retiring EC2-Classic on August 15, 2022. We recommend that you migrate from EC2-Classic to a VPC. For more information, see Migrate from EC2-Classic to a VPC in the Amazon EC2 guide and the blog EC2-Classic Networking is Retiring – Here’s How to Prepare.   It can take some time for the status change to be completed.  
    */
  var AutodefinedReverseFlag: typings.awsSdk.clientsRoute53resolverMod.AutodefinedReverseFlag
  
  /**
    * Resource ID of the Amazon VPC that you want to update the Resolver configuration for.
    */
  var ResourceId: typings.awsSdk.clientsRoute53resolverMod.ResourceId
}
object UpdateResolverConfigRequest {
  
  inline def apply(AutodefinedReverseFlag: AutodefinedReverseFlag, ResourceId: ResourceId): UpdateResolverConfigRequest = {
    val __obj = js.Dynamic.literal(AutodefinedReverseFlag = AutodefinedReverseFlag.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResolverConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setAutodefinedReverseFlag(value: AutodefinedReverseFlag): Self = StObject.set(x, "AutodefinedReverseFlag", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
