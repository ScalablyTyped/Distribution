package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuildBatchesForProjectOutput extends StObject {
  
  /**
    * An array of strings that contains the batch build identifiers.
    */
  var ids: js.UndefOr[BuildBatchIds] = js.undefined
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to ListBuildBatchesForProject to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListBuildBatchesForProjectOutput {
  
  inline def apply(): ListBuildBatchesForProjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildBatchesForProjectOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBuildBatchesForProjectOutput] (val x: Self) extends AnyVal {
    
    inline def setIds(value: BuildBatchIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
