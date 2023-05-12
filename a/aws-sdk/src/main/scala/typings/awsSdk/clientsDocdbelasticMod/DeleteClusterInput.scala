package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterInput extends StObject {
  
  /**
    * The arn of the Elastic DocumentDB cluster that is to be deleted.
    */
  var clusterArn: String
}
object DeleteClusterInput {
  
  inline def apply(clusterArn: String): DeleteClusterInput = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteClusterInput] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
  }
}
