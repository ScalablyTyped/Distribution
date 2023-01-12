package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetBuildBatchesInput extends StObject {
  
  /**
    * An array that contains the batch build identifiers to retrieve.
    */
  var ids: BuildBatchIds
}
object BatchGetBuildBatchesInput {
  
  inline def apply(ids: BuildBatchIds): BatchGetBuildBatchesInput = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetBuildBatchesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetBuildBatchesInput] (val x: Self) extends AnyVal {
    
    inline def setIds(value: BuildBatchIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
