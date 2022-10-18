package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterVersionsMessage extends StObject {
  
  /**
    * The name of a specific cluster parameter group family to return details for. Constraints:   Must be 1 to 255 alphanumeric characters   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
    */
  var ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The specific cluster version to return. Example: 1.0 
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterVersions request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeClusterVersionsMessage {
  
  inline def apply(): DescribeClusterVersionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterVersionsMessage]
  }
  
  extension [Self <: DescribeClusterVersionsMessage](x: Self) {
    
    inline def setClusterParameterGroupFamily(value: String): Self = StObject.set(x, "ClusterParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setClusterParameterGroupFamilyUndefined: Self = StObject.set(x, "ClusterParameterGroupFamily", js.undefined)
    
    inline def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
