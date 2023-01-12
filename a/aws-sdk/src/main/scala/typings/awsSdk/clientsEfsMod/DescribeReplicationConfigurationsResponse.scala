package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationConfigurationsResponse extends StObject {
  
  /**
    * You can use the NextToken from the previous response in a subsequent request to fetch the additional descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The collection of replication configurations that is returned.
    */
  var Replications: js.UndefOr[ReplicationConfigurationDescriptions] = js.undefined
}
object DescribeReplicationConfigurationsResponse {
  
  inline def apply(): DescribeReplicationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReplicationConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReplications(value: ReplicationConfigurationDescriptions): Self = StObject.set(x, "Replications", value.asInstanceOf[js.Any])
    
    inline def setReplicationsUndefined: Self = StObject.set(x, "Replications", js.undefined)
    
    inline def setReplicationsVarargs(value: ReplicationConfigurationDescription*): Self = StObject.set(x, "Replications", js.Array(value*))
  }
}
