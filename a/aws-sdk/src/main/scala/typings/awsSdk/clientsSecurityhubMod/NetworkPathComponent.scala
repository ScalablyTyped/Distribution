package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkPathComponent extends StObject {
  
  /**
    * The identifier of a component in the network path.
    */
  var ComponentId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of component.
    */
  var ComponentType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the component that comes after the current component in the network path.
    */
  var Egress: js.UndefOr[NetworkHeader] = js.undefined
  
  /**
    * Information about the component that comes before the current node in the network path.
    */
  var Ingress: js.UndefOr[NetworkHeader] = js.undefined
}
object NetworkPathComponent {
  
  inline def apply(): NetworkPathComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPathComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkPathComponent] (val x: Self) extends AnyVal {
    
    inline def setComponentId(value: NonEmptyString): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    inline def setComponentType(value: NonEmptyString): Self = StObject.set(x, "ComponentType", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeUndefined: Self = StObject.set(x, "ComponentType", js.undefined)
    
    inline def setEgress(value: NetworkHeader): Self = StObject.set(x, "Egress", value.asInstanceOf[js.Any])
    
    inline def setEgressUndefined: Self = StObject.set(x, "Egress", js.undefined)
    
    inline def setIngress(value: NetworkHeader): Self = StObject.set(x, "Ingress", value.asInstanceOf[js.Any])
    
    inline def setIngressUndefined: Self = StObject.set(x, "Ingress", js.undefined)
  }
}
