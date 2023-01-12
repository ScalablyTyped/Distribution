package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalClustersMessage extends StObject {
  
  /**
    * The user-supplied DB cluster identifier. If this parameter is specified, only information about the specified DB cluster is returned. This parameter is not case-sensitive. Constraints: If supplied, must match an existing DB cluster identifier.
    */
  var GlobalClusterIdentifier: js.UndefOr[typings.awsSdk.clientsNeptuneMod.GlobalClusterIdentifier] = js.undefined
  
  /**
    * (Optional) A pagination token returned by a previous call to DescribeGlobalClusters. If this parameter is specified, the response will only include records beyond the marker, up to the number specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination marker token is included in the response that you can use to retrieve the remaining results. Default: 100  Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeGlobalClustersMessage {
  
  inline def apply(): DescribeGlobalClustersMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalClustersMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGlobalClustersMessage] (val x: Self) extends AnyVal {
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
