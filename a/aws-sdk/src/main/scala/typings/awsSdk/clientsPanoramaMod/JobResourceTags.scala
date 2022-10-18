package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobResourceTags extends StObject {
  
  /**
    * The job's type.
    */
  var ResourceType: JobResourceType
  
  /**
    * The job's tags.
    */
  var Tags: TagMap
}
object JobResourceTags {
  
  inline def apply(ResourceType: JobResourceType, Tags: TagMap): JobResourceTags = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobResourceTags]
  }
  
  extension [Self <: JobResourceTags](x: Self) {
    
    inline def setResourceType(value: JobResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
