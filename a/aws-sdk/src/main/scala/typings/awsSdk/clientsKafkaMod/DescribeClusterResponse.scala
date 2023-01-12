package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterResponse extends StObject {
  
  /**
    * 
    The cluster information.
    
    */
  var ClusterInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.ClusterInfo] = js.undefined
}
object DescribeClusterResponse {
  
  inline def apply(): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClusterResponse] (val x: Self) extends AnyVal {
    
    inline def setClusterInfo(value: ClusterInfo): Self = StObject.set(x, "ClusterInfo", value.asInstanceOf[js.Any])
    
    inline def setClusterInfoUndefined: Self = StObject.set(x, "ClusterInfo", js.undefined)
  }
}
