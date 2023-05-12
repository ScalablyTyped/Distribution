package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceProfileArtifactsResponse extends StObject {
  
  /**
    * An array of objects, one for each of 1-100 S3 objects that Amazon Macie selected for analysis. If Macie has analyzed more than 100 objects in the bucket, Macie populates the array based on the value for the ResourceProfileArtifact.sensitive field for an object: true (sensitive), followed by false (not sensitive). Macie then populates any remaining items in the array with information about objects where the value for the ResourceProfileArtifact.classificationResultStatus field is SKIPPED.
    */
  var artifacts: js.UndefOr[listOfResourceProfileArtifact] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListResourceProfileArtifactsResponse {
  
  inline def apply(): ListResourceProfileArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceProfileArtifactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceProfileArtifactsResponse] (val x: Self) extends AnyVal {
    
    inline def setArtifacts(value: listOfResourceProfileArtifact): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setArtifactsVarargs(value: ResourceProfileArtifact*): Self = StObject.set(x, "artifacts", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
