package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSecurityGroupMessage extends StObject {
  
  /**
    * The name for the security group. Amazon Redshift stores the value as a lowercase string. Constraints:   Must contain no more than 255 alphanumeric characters or hyphens.   Must not be "Default".   Must be unique for all security groups that are created by your Amazon Web Services account.   Example: examplesecuritygroup 
    */
  var ClusterSecurityGroupName: String
  
  /**
    * A description for the security group.
    */
  var Description: String
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateClusterSecurityGroupMessage {
  
  inline def apply(ClusterSecurityGroupName: String, Description: String): CreateClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSecurityGroupMessage]
  }
  
  extension [Self <: CreateClusterSecurityGroupMessage](x: Self) {
    
    inline def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
