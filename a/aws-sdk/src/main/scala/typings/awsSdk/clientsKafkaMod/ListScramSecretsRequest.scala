package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScramSecretsRequest extends StObject {
  
  /**
    * 
    The arn of the cluster.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The maxResults of the query.
    
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsKafkaMod.MaxResults] = js.undefined
  
  /**
    * 
    The nextToken of the query.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListScramSecretsRequest {
  
  inline def apply(ClusterArn: string): ListScramSecretsRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListScramSecretsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListScramSecretsRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
