package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingTypesResponse extends StObject {
  
  /**
    * The token for the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The thing types.
    */
  var thingTypes: js.UndefOr[ThingTypeList] = js.undefined
}
object ListThingTypesResponse {
  
  inline def apply(): ListThingTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingTypesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListThingTypesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThingTypes(value: ThingTypeList): Self = StObject.set(x, "thingTypes", value.asInstanceOf[js.Any])
    
    inline def setThingTypesUndefined: Self = StObject.set(x, "thingTypes", js.undefined)
    
    inline def setThingTypesVarargs(value: ThingTypeDefinition*): Self = StObject.set(x, "thingTypes", js.Array(value*))
  }
}
