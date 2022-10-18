package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterResult extends StObject {
  
  /**
    * Information about a specific cluster, including shipping information, cluster status, and other important metadata.
    */
  var ClusterMetadata: js.UndefOr[typings.awsSdk.clientsSnowballMod.ClusterMetadata] = js.undefined
}
object DescribeClusterResult {
  
  inline def apply(): DescribeClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResult]
  }
  
  extension [Self <: DescribeClusterResult](x: Self) {
    
    inline def setClusterMetadata(value: ClusterMetadata): Self = StObject.set(x, "ClusterMetadata", value.asInstanceOf[js.Any])
    
    inline def setClusterMetadataUndefined: Self = StObject.set(x, "ClusterMetadata", js.undefined)
  }
}
