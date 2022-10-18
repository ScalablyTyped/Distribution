package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterParametersMessage extends StObject {
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterParameters request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of a cluster parameter group for which to return details.
    */
  var ParameterGroupName: String
  
  /**
    * The parameter types to return. Specify user to show parameters that are different form the default. Similarly, specify engine-default to show parameters that are the same as the default parameter group.  Default: All parameter types returned. Valid Values: user | engine-default 
    */
  var Source: js.UndefOr[String] = js.undefined
}
object DescribeClusterParametersMessage {
  
  inline def apply(ParameterGroupName: String): DescribeClusterParametersMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterParametersMessage]
  }
  
  extension [Self <: DescribeClusterParametersMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
