package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPreviewsResponse extends StObject {
  
  /**
    * A list of access previews retrieved for the analyzer.
    */
  var accessPreviews: AccessPreviewsList
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAccessPreviewsResponse {
  
  inline def apply(accessPreviews: AccessPreviewsList): ListAccessPreviewsResponse = {
    val __obj = js.Dynamic.literal(accessPreviews = accessPreviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPreviewsResponse]
  }
  
  extension [Self <: ListAccessPreviewsResponse](x: Self) {
    
    inline def setAccessPreviews(value: AccessPreviewsList): Self = StObject.set(x, "accessPreviews", value.asInstanceOf[js.Any])
    
    inline def setAccessPreviewsVarargs(value: AccessPreviewSummary*): Self = StObject.set(x, "accessPreviews", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
