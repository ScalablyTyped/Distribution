package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcrContainerImageMetadata extends StObject {
  
  /**
    * Tags associated with the Amazon ECR image metadata.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object EcrContainerImageMetadata {
  
  inline def apply(): EcrContainerImageMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcrContainerImageMetadata]
  }
  
  extension [Self <: EcrContainerImageMetadata](x: Self) {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
