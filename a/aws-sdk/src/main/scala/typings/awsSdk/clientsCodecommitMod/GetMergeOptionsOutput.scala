package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMergeOptionsOutput extends StObject {
  
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: ObjectId
  
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId
  
  /**
    * The merge option or strategy used to merge the code.
    */
  var mergeOptions: MergeOptions
  
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId
}
object GetMergeOptionsOutput {
  
  inline def apply(
    baseCommitId: ObjectId,
    destinationCommitId: ObjectId,
    mergeOptions: MergeOptions,
    sourceCommitId: ObjectId
  ): GetMergeOptionsOutput = {
    val __obj = js.Dynamic.literal(baseCommitId = baseCommitId.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeOptionsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMergeOptionsOutput] (val x: Self) extends AnyVal {
    
    inline def setBaseCommitId(value: ObjectId): Self = StObject.set(x, "baseCommitId", value.asInstanceOf[js.Any])
    
    inline def setDestinationCommitId(value: ObjectId): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
    
    inline def setMergeOptions(value: MergeOptions): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
    
    inline def setMergeOptionsVarargs(value: MergeOptionTypeEnum*): Self = StObject.set(x, "mergeOptions", js.Array(value*))
    
    inline def setSourceCommitId(value: ObjectId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
  }
}
