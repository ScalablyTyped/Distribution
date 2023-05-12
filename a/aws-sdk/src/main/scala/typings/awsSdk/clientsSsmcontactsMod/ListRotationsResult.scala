package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRotationsResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about rotations that meet the filter criteria.
    */
  var Rotations: typings.awsSdk.clientsSsmcontactsMod.Rotations
}
object ListRotationsResult {
  
  inline def apply(Rotations: Rotations): ListRotationsResult = {
    val __obj = js.Dynamic.literal(Rotations = Rotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRotationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRotationsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRotations(value: Rotations): Self = StObject.set(x, "Rotations", value.asInstanceOf[js.Any])
    
    inline def setRotationsVarargs(value: Rotation*): Self = StObject.set(x, "Rotations", js.Array(value*))
  }
}
