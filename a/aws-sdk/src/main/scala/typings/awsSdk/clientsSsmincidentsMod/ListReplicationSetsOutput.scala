package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReplicationSetsOutput extends StObject {
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the list replication set.
    */
  var replicationSetArns: ReplicationSetArnList
}
object ListReplicationSetsOutput {
  
  inline def apply(replicationSetArns: ReplicationSetArnList): ListReplicationSetsOutput = {
    val __obj = js.Dynamic.literal(replicationSetArns = replicationSetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReplicationSetsOutput]
  }
  
  extension [Self <: ListReplicationSetsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReplicationSetArns(value: ReplicationSetArnList): Self = StObject.set(x, "replicationSetArns", value.asInstanceOf[js.Any])
    
    inline def setReplicationSetArnsVarargs(value: Arn*): Self = StObject.set(x, "replicationSetArns", js.Array(value*))
  }
}
