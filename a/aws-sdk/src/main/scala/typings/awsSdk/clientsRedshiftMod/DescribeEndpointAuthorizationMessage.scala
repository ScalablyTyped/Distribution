package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointAuthorizationMessage extends StObject {
  
  /**
    * The AAmazon Web Services account ID of either the cluster owner (grantor) or grantee. If Grantee parameter is true, then the Account value is of the grantor.
    */
  var Account: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster identifier of the cluster to access.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon Redshift returns endpoint authorizations that you've been granted. If false (default), checks authorization from a grantor point of view.
    */
  var Grantee: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeEndpointAuthorization request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a Marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeEndpointAuthorizationMessage {
  
  inline def apply(): DescribeEndpointAuthorizationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointAuthorizationMessage]
  }
  
  extension [Self <: DescribeEndpointAuthorizationMessage](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setGrantee(value: BooleanOptional): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
