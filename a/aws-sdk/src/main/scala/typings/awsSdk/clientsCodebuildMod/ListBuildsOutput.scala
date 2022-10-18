package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuildsOutput extends StObject {
  
  /**
    * A list of build IDs, with each build ID representing a single build.
    */
  var ids: js.UndefOr[BuildIds] = js.undefined
  
  /**
    * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a nextToken. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListBuildsOutput {
  
  inline def apply(): ListBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsOutput]
  }
  
  extension [Self <: ListBuildsOutput](x: Self) {
    
    inline def setIds(value: BuildIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
