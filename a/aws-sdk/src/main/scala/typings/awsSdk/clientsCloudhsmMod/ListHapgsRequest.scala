package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHapgsRequest extends StObject {
  
  /**
    * The NextToken value from a previous call to ListHapgs. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListHapgsRequest {
  
  inline def apply(): ListHapgsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHapgsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHapgsRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
