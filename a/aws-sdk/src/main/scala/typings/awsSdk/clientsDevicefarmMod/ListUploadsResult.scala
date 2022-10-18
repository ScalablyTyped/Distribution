package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUploadsResult extends StObject {
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the uploads.
    */
  var uploads: js.UndefOr[Uploads] = js.undefined
}
object ListUploadsResult {
  
  inline def apply(): ListUploadsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUploadsResult]
  }
  
  extension [Self <: ListUploadsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUploads(value: Uploads): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
    
    inline def setUploadsVarargs(value: Upload*): Self = StObject.set(x, "uploads", js.Array(value*))
  }
}
