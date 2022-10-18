package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttributesRequest extends StObject {
  
  /**
    * The attributes to delete from your resource. You can specify up to 10 attributes for each request. For custom attributes, specify the attribute name and target ID, but don't specify the value. If you specify the target ID using the short form, you must also specify the target type.
    */
  var attributes: Attributes
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to delete attributes. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
}
object DeleteAttributesRequest {
  
  inline def apply(attributes: Attributes): DeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttributesRequest]
  }
  
  extension [Self <: DeleteAttributesRequest](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
