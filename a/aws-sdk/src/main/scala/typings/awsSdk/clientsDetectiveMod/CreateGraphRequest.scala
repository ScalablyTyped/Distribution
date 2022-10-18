package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGraphRequest extends StObject {
  
  /**
    * The tags to assign to the new behavior graph. You can add up to 50 tags. For each tag, you provide the tag key and the tag value. Each tag key can contain up to 128 characters. Each tag value can contain up to 256 characters.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateGraphRequest {
  
  inline def apply(): CreateGraphRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphRequest]
  }
  
  extension [Self <: CreateGraphRequest](x: Self) {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
