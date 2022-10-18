package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedResource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) with which the tag is associated, for example: arn:aws:redshift:us-east-2:123456789:cluster:t1.
    */
  var ResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of resource with which the tag is associated. Valid resource types are:    Cluster   CIDR/IP   EC2 security group   Snapshot   Cluster security group   Subnet group   HSM connection   HSM certificate   Parameter group   For more information about Amazon Redshift resource types and constructing ARNs, go to Constructing an Amazon Redshift Amazon Resource Name (ARN) in the Amazon Redshift Cluster Management Guide. 
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The tag for the resource.
    */
  var Tag: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Tag] = js.undefined
}
object TaggedResource {
  
  inline def apply(): TaggedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedResource]
  }
  
  extension [Self <: TaggedResource](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
