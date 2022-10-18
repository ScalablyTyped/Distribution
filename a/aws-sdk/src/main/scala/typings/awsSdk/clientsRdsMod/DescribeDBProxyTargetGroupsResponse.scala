package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBProxyTargetGroupsResponse extends StObject {
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * An arbitrary number of DBProxyTargetGroup objects, containing details of the corresponding target groups.
    */
  var TargetGroups: js.UndefOr[TargetGroupList] = js.undefined
}
object DescribeDBProxyTargetGroupsResponse {
  
  inline def apply(): DescribeDBProxyTargetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBProxyTargetGroupsResponse]
  }
  
  extension [Self <: DescribeDBProxyTargetGroupsResponse](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTargetGroups(value: TargetGroupList): Self = StObject.set(x, "TargetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsUndefined: Self = StObject.set(x, "TargetGroups", js.undefined)
    
    inline def setTargetGroupsVarargs(value: DBProxyTargetGroup*): Self = StObject.set(x, "TargetGroups", js.Array(value*))
  }
}
