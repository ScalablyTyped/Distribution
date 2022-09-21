package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForCertificateResponse extends StObject {
  
  /**
    * The key-value pairs that define the applied tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListTagsForCertificateResponse {
  
  inline def apply(): ListTagsForCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForCertificateResponse]
  }
  
  extension [Self <: ListTagsForCertificateResponse](x: Self) {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
