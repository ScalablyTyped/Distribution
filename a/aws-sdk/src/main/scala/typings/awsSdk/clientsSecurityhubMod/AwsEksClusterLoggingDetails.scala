package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEksClusterLoggingDetails extends StObject {
  
  /**
    * Cluster logging configurations.
    */
  var ClusterLogging: js.UndefOr[AwsEksClusterLoggingClusterLoggingList] = js.undefined
}
object AwsEksClusterLoggingDetails {
  
  inline def apply(): AwsEksClusterLoggingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEksClusterLoggingDetails]
  }
  
  extension [Self <: AwsEksClusterLoggingDetails](x: Self) {
    
    inline def setClusterLogging(value: AwsEksClusterLoggingClusterLoggingList): Self = StObject.set(x, "ClusterLogging", value.asInstanceOf[js.Any])
    
    inline def setClusterLoggingUndefined: Self = StObject.set(x, "ClusterLogging", js.undefined)
    
    inline def setClusterLoggingVarargs(value: AwsEksClusterLoggingClusterLoggingDetails*): Self = StObject.set(x, "ClusterLogging", js.Array(value*))
  }
}
