package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRotationOverridesResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of rotation overrides in the specified time range.
    */
  var RotationOverrides: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.RotationOverrides] = js.undefined
}
object ListRotationOverridesResult {
  
  inline def apply(): ListRotationOverridesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRotationOverridesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRotationOverridesResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRotationOverrides(value: RotationOverrides): Self = StObject.set(x, "RotationOverrides", value.asInstanceOf[js.Any])
    
    inline def setRotationOverridesUndefined: Self = StObject.set(x, "RotationOverrides", js.undefined)
    
    inline def setRotationOverridesVarargs(value: RotationOverride*): Self = StObject.set(x, "RotationOverrides", js.Array(value*))
  }
}
