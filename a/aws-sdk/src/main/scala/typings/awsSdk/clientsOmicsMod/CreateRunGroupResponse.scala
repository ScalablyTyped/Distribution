package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRunGroupResponse extends StObject {
  
  /**
    * The group's ARN.
    */
  var arn: js.UndefOr[RunGroupArn] = js.undefined
  
  /**
    * The group's ID.
    */
  var id: js.UndefOr[RunGroupId] = js.undefined
  
  /**
    * Tags for the run group.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRunGroupResponse {
  
  inline def apply(): CreateRunGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRunGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRunGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RunGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: RunGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
