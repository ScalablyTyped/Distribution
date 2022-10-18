package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersResponse extends StObject {
  
  /**
    * An array of the clusters in an account.
    */
  var Clusters: js.UndefOr[listOfCluster] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[stringMin1Max8096PatternS] = js.undefined
}
object ListClustersResponse {
  
  inline def apply(): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResponse]
  }
  
  extension [Self <: ListClustersResponse](x: Self) {
    
    inline def setClusters(value: listOfCluster): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    inline def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "Clusters", js.Array(value*))
    
    inline def setNextToken(value: stringMin1Max8096PatternS): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
