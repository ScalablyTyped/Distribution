package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsOutput extends StObject {
  
  /**
    * A list of tags associated with the SageMaker resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object AddTagsOutput {
  
  inline def apply(): AddTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsOutput]
  }
  
  extension [Self <: AddTagsOutput](x: Self) {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
