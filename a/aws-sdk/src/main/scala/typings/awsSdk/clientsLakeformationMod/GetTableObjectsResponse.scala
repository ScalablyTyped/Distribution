package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableObjectsResponse extends StObject {
  
  /**
    * A continuation token indicating whether additional data is available.
    */
  var NextToken: js.UndefOr[TokenString] = js.undefined
  
  /**
    * A list of objects organized by partition keys.
    */
  var Objects: js.UndefOr[PartitionedTableObjectsList] = js.undefined
}
object GetTableObjectsResponse {
  
  inline def apply(): GetTableObjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableObjectsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTableObjectsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: TokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjects(value: PartitionedTableObjectsList): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "Objects", js.undefined)
    
    inline def setObjectsVarargs(value: PartitionObjects*): Self = StObject.set(x, "Objects", js.Array(value*))
  }
}
