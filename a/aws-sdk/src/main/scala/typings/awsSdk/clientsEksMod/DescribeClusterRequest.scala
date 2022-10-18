package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterRequest extends StObject {
  
  /**
    * The name of the cluster to describe.
    */
  var name: String
}
object DescribeClusterRequest {
  
  inline def apply(name: String): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterRequest]
  }
  
  extension [Self <: DescribeClusterRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
