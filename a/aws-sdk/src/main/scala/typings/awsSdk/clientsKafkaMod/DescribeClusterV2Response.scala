package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterV2Response extends StObject {
  
  /**
    * 
    The cluster information.
    
    */
  var ClusterInfo: js.UndefOr[Cluster] = js.undefined
}
object DescribeClusterV2Response {
  
  inline def apply(): DescribeClusterV2Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterV2Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClusterV2Response] (val x: Self) extends AnyVal {
    
    inline def setClusterInfo(value: Cluster): Self = StObject.set(x, "ClusterInfo", value.asInstanceOf[js.Any])
    
    inline def setClusterInfoUndefined: Self = StObject.set(x, "ClusterInfo", js.undefined)
  }
}
