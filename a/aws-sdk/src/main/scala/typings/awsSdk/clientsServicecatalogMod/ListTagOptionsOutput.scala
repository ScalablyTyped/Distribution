package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagOptionsOutput extends StObject {
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PageToken] = js.undefined
  
  /**
    * Information about the TagOptions.
    */
  var TagOptionDetails: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.TagOptionDetails] = js.undefined
}
object ListTagOptionsOutput {
  
  inline def apply(): ListTagOptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagOptionsOutput]
  }
  
  extension [Self <: ListTagOptionsOutput](x: Self) {
    
    inline def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    inline def setTagOptionDetails(value: TagOptionDetails): Self = StObject.set(x, "TagOptionDetails", value.asInstanceOf[js.Any])
    
    inline def setTagOptionDetailsUndefined: Self = StObject.set(x, "TagOptionDetails", js.undefined)
    
    inline def setTagOptionDetailsVarargs(value: TagOptionDetail*): Self = StObject.set(x, "TagOptionDetails", js.Array(value*))
  }
}
