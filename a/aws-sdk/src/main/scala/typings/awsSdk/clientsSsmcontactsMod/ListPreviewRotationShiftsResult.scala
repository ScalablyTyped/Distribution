package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPreviewRotationShiftsResult extends StObject {
  
  /**
    * The token for the next set of items to return. This token is used to get the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Details about a rotation shift, including times, types, and contacts.
    */
  var RotationShifts: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.RotationShifts] = js.undefined
}
object ListPreviewRotationShiftsResult {
  
  inline def apply(): ListPreviewRotationShiftsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPreviewRotationShiftsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPreviewRotationShiftsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRotationShifts(value: RotationShifts): Self = StObject.set(x, "RotationShifts", value.asInstanceOf[js.Any])
    
    inline def setRotationShiftsUndefined: Self = StObject.set(x, "RotationShifts", js.undefined)
    
    inline def setRotationShiftsVarargs(value: RotationShift*): Self = StObject.set(x, "RotationShifts", js.Array(value*))
  }
}
