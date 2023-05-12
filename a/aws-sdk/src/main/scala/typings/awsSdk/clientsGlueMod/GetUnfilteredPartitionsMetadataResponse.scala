package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUnfilteredPartitionsMetadataResponse extends StObject {
  
  /**
    * A continuation token, if the returned list of partitions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of requested partitions.
    */
  var UnfilteredPartitions: js.UndefOr[UnfilteredPartitionList] = js.undefined
}
object GetUnfilteredPartitionsMetadataResponse {
  
  inline def apply(): GetUnfilteredPartitionsMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUnfilteredPartitionsMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUnfilteredPartitionsMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUnfilteredPartitions(value: UnfilteredPartitionList): Self = StObject.set(x, "UnfilteredPartitions", value.asInstanceOf[js.Any])
    
    inline def setUnfilteredPartitionsUndefined: Self = StObject.set(x, "UnfilteredPartitions", js.undefined)
    
    inline def setUnfilteredPartitionsVarargs(value: UnfilteredPartition*): Self = StObject.set(x, "UnfilteredPartitions", js.Array(value*))
  }
}
