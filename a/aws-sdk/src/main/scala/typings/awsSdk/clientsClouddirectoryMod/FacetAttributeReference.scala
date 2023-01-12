package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetAttributeReference extends StObject {
  
  /**
    * The target attribute name that is associated with the facet reference. See Attribute References for more information.
    */
  var TargetAttributeName: AttributeName
  
  /**
    * The target facet name that is associated with the facet reference. See Attribute References for more information.
    */
  var TargetFacetName: FacetName
}
object FacetAttributeReference {
  
  inline def apply(TargetAttributeName: AttributeName, TargetFacetName: FacetName): FacetAttributeReference = {
    val __obj = js.Dynamic.literal(TargetAttributeName = TargetAttributeName.asInstanceOf[js.Any], TargetFacetName = TargetFacetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttributeReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FacetAttributeReference] (val x: Self) extends AnyVal {
    
    inline def setTargetAttributeName(value: AttributeName): Self = StObject.set(x, "TargetAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTargetFacetName(value: FacetName): Self = StObject.set(x, "TargetFacetName", value.asInstanceOf[js.Any])
  }
}
