package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetBuildBatchesOutput extends StObject {
  
  /**
    * An array of BuildBatch objects that represent the retrieved batch builds.
    */
  var buildBatches: js.UndefOr[BuildBatches] = js.undefined
  
  /**
    * An array that contains the identifiers of any batch builds that are not found.
    */
  var buildBatchesNotFound: js.UndefOr[BuildBatchIds] = js.undefined
}
object BatchGetBuildBatchesOutput {
  
  inline def apply(): BatchGetBuildBatchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetBuildBatchesOutput]
  }
  
  extension [Self <: BatchGetBuildBatchesOutput](x: Self) {
    
    inline def setBuildBatches(value: BuildBatches): Self = StObject.set(x, "buildBatches", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchesNotFound(value: BuildBatchIds): Self = StObject.set(x, "buildBatchesNotFound", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchesNotFoundUndefined: Self = StObject.set(x, "buildBatchesNotFound", js.undefined)
    
    inline def setBuildBatchesNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "buildBatchesNotFound", js.Array(value*))
    
    inline def setBuildBatchesUndefined: Self = StObject.set(x, "buildBatches", js.undefined)
    
    inline def setBuildBatchesVarargs(value: BuildBatch*): Self = StObject.set(x, "buildBatches", js.Array(value*))
  }
}
