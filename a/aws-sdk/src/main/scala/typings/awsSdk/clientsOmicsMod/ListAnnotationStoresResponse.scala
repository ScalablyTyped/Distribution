package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnnotationStoresResponse extends StObject {
  
  /**
    * A list of stores.
    */
  var annotationStores: js.UndefOr[AnnotationStoreItems] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListAnnotationStoresResponse {
  
  inline def apply(): ListAnnotationStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnotationStoresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAnnotationStoresResponse] (val x: Self) extends AnyVal {
    
    inline def setAnnotationStores(value: AnnotationStoreItems): Self = StObject.set(x, "annotationStores", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStoresUndefined: Self = StObject.set(x, "annotationStores", js.undefined)
    
    inline def setAnnotationStoresVarargs(value: AnnotationStoreItem*): Self = StObject.set(x, "annotationStores", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
