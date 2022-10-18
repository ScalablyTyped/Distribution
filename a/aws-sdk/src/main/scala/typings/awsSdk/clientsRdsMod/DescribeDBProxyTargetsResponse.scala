package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBProxyTargetsResponse extends StObject {
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * An arbitrary number of DBProxyTarget objects, containing details of the corresponding targets.
    */
  var Targets: js.UndefOr[TargetList] = js.undefined
}
object DescribeDBProxyTargetsResponse {
  
  inline def apply(): DescribeDBProxyTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBProxyTargetsResponse]
  }
  
  extension [Self <: DescribeDBProxyTargetsResponse](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTargets(value: TargetList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: DBProxyTarget*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
