package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCacheSubnetGroupMessage extends StObject {
  
  /**
    * A description for the cache subnet group.
    */
  var CacheSubnetGroupDescription: String
  
  /**
    * A name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
    */
  var CacheSubnetGroupName: String
  
  /**
    * A list of VPC subnet IDs for the cache subnet group.
    */
  var SubnetIds: SubnetIdentifierList
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateCacheSubnetGroupMessage {
  
  inline def apply(CacheSubnetGroupDescription: String, CacheSubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupDescription = CacheSubnetGroupDescription.asInstanceOf[js.Any], CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheSubnetGroupMessage]
  }
  
  extension [Self <: CreateCacheSubnetGroupMessage](x: Self) {
    
    inline def setCacheSubnetGroupDescription(value: String): Self = StObject.set(x, "CacheSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupName(value: String): Self = StObject.set(x, "CacheSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
