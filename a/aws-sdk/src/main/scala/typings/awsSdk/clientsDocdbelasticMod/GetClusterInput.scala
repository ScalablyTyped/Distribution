package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterInput extends StObject {
  
  /**
    * The arn of the Elastic DocumentDB cluster.
    */
  var clusterArn: String
}
object GetClusterInput {
  
  inline def apply(clusterArn: String): GetClusterInput = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterInput] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
  }
}
