package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceProfileDetectionsResponse extends StObject {
  
  /**
    * An array of objects, one for each type of sensitive data that Amazon Macie found in the bucket. Each object reports the number of occurrences of the specified type and provides information about the custom data identifier or managed data identifier that detected the data.
    */
  var detections: js.UndefOr[listOfDetection] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListResourceProfileDetectionsResponse {
  
  inline def apply(): ListResourceProfileDetectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceProfileDetectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceProfileDetectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setDetections(value: listOfDetection): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
    
    inline def setDetectionsUndefined: Self = StObject.set(x, "detections", js.undefined)
    
    inline def setDetectionsVarargs(value: Detection*): Self = StObject.set(x, "detections", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
