package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationConfigurationTemplatesRequest extends StObject {
  
  /**
    * Request to describe Replication Configuration template by max results.
    */
  var maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined
  
  /**
    * Request to describe Replication Configuration template by next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Request to describe Replication Configuration template by template IDs.
    */
  var replicationConfigurationTemplateIDs: js.UndefOr[ReplicationConfigurationTemplateIDs] = js.undefined
}
object DescribeReplicationConfigurationTemplatesRequest {
  
  inline def apply(): DescribeReplicationConfigurationTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationConfigurationTemplatesRequest]
  }
  
  extension [Self <: DescribeReplicationConfigurationTemplatesRequest](x: Self) {
    
    inline def setMaxResults(value: StrictlyPositiveInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReplicationConfigurationTemplateIDs(value: ReplicationConfigurationTemplateIDs): Self = StObject.set(x, "replicationConfigurationTemplateIDs", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigurationTemplateIDsUndefined: Self = StObject.set(x, "replicationConfigurationTemplateIDs", js.undefined)
    
    inline def setReplicationConfigurationTemplateIDsVarargs(value: ReplicationConfigurationTemplateID*): Self = StObject.set(x, "replicationConfigurationTemplateIDs", js.Array(value*))
  }
}
