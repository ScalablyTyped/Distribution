package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExtendedSourceServerRequest extends StObject {
  
  /**
    * This defines the ARN of the source server in staging Account based on which you want to create an extended source server.
    */
  var sourceServerArn: SourceServerARN
  
  /**
    * A list of tags associated with the extended source server.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateExtendedSourceServerRequest {
  
  inline def apply(sourceServerArn: SourceServerARN): CreateExtendedSourceServerRequest = {
    val __obj = js.Dynamic.literal(sourceServerArn = sourceServerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExtendedSourceServerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExtendedSourceServerRequest] (val x: Self) extends AnyVal {
    
    inline def setSourceServerArn(value: SourceServerARN): Self = StObject.set(x, "sourceServerArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
