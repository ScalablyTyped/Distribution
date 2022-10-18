package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsOutput extends StObject {
  
  /**
    * The ARN of the tagged resource group.
    */
  var Arn: js.UndefOr[GroupArn] = js.undefined
  
  /**
    * The tags associated with the specified resource group.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Tags] = js.undefined
}
object GetTagsOutput {
  
  inline def apply(): GetTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagsOutput]
  }
  
  extension [Self <: GetTagsOutput](x: Self) {
    
    inline def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
