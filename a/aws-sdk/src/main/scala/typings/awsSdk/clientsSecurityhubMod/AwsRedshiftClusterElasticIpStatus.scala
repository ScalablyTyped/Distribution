package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterElasticIpStatus extends StObject {
  
  /**
    * The elastic IP address for the cluster.
    */
  var ElasticIp: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the elastic IP address.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterElasticIpStatus {
  
  inline def apply(): AwsRedshiftClusterElasticIpStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterElasticIpStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRedshiftClusterElasticIpStatus] (val x: Self) extends AnyVal {
    
    inline def setElasticIp(value: NonEmptyString): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    inline def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
