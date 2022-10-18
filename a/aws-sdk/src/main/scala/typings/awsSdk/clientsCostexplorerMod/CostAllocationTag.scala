package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostAllocationTag extends StObject {
  
  /**
    * The status of a cost allocation tag. 
    */
  var Status: CostAllocationTagStatus
  
  /**
    * The key for the cost allocation tag. 
    */
  var TagKey: typings.awsSdk.clientsCostexplorerMod.TagKey
  
  /**
    * The type of cost allocation tag. You can use AWSGenerated or UserDefined type tags. AWSGenerated type tags are tags that Amazon Web Services defines and applies to support Amazon Web Services resources for cost allocation purposes. UserDefined type tags are tags that you define, create, and apply to resources. 
    */
  var Type: CostAllocationTagType
}
object CostAllocationTag {
  
  inline def apply(Status: CostAllocationTagStatus, TagKey: TagKey, Type: CostAllocationTagType): CostAllocationTag = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], TagKey = TagKey.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostAllocationTag]
  }
  
  extension [Self <: CostAllocationTag](x: Self) {
    
    inline def setStatus(value: CostAllocationTagStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTagKey(value: TagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: CostAllocationTagType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
