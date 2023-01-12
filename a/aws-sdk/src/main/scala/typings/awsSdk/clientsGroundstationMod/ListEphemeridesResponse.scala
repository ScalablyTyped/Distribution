package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEphemeridesResponse extends StObject {
  
  /**
    * List of ephemerides.
    */
  var ephemerides: js.UndefOr[EphemeridesList] = js.undefined
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListEphemeridesResponse {
  
  inline def apply(): ListEphemeridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEphemeridesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEphemeridesResponse] (val x: Self) extends AnyVal {
    
    inline def setEphemerides(value: EphemeridesList): Self = StObject.set(x, "ephemerides", value.asInstanceOf[js.Any])
    
    inline def setEphemeridesUndefined: Self = StObject.set(x, "ephemerides", js.undefined)
    
    inline def setEphemeridesVarargs(value: EphemerisItem*): Self = StObject.set(x, "ephemerides", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
