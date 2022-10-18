package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUsageLimitsMessage extends StObject {
  
  /**
    * The identifier of the cluster for which you want to describe usage limits.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The feature type for which you want to describe usage limits.
    */
  var FeatureType: js.UndefOr[UsageLimitFeatureType] = js.undefined
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeUsageLimits request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A tag key or keys for which you want to return all matching usage limit objects that are associated with the specified key or keys. For example, suppose that you have parameter groups that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the usage limit objects have either or both of these tag keys associated with them.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.undefined
  
  /**
    * A tag value or values for which you want to return all matching usage limit objects that are associated with the specified tag value or values. For example, suppose that you have parameter groups that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the usage limit objects that have either or both of these tag values associated with them.
    */
  var TagValues: js.UndefOr[TagValueList] = js.undefined
  
  /**
    * The identifier of the usage limit to describe.
    */
  var UsageLimitId: js.UndefOr[String] = js.undefined
}
object DescribeUsageLimitsMessage {
  
  inline def apply(): DescribeUsageLimitsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsageLimitsMessage]
  }
  
  extension [Self <: DescribeUsageLimitsMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setFeatureType(value: UsageLimitFeatureType): Self = StObject.set(x, "FeatureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "FeatureType", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value*))
    
    inline def setTagValues(value: TagValueList): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "TagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: String*): Self = StObject.set(x, "TagValues", js.Array(value*))
    
    inline def setUsageLimitId(value: String): Self = StObject.set(x, "UsageLimitId", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitIdUndefined: Self = StObject.set(x, "UsageLimitId", js.undefined)
  }
}
