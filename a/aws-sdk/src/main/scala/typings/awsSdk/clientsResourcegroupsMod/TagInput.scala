package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagInput extends StObject {
  
  /**
    * The ARN of the resource group to which to add tags.
    */
  var Arn: GroupArn
  
  /**
    * The tags to add to the specified resource group. A tag is a string-to-string map of key-value pairs.
    */
  var Tags: typings.awsSdk.clientsResourcegroupsMod.Tags
}
object TagInput {
  
  inline def apply(Arn: GroupArn, Tags: Tags): TagInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagInput]
  }
  
  extension [Self <: TagInput](x: Self) {
    
    inline def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
