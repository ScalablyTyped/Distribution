package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetAttribute extends StObject {
  
  /**
    * A facet attribute consists of either a definition or a reference. This structure contains the attribute definition. See Attribute References for more information.
    */
  var AttributeDefinition: js.UndefOr[FacetAttributeDefinition] = js.undefined
  
  /**
    * An attribute reference that is associated with the attribute. See Attribute References for more information.
    */
  var AttributeReference: js.UndefOr[FacetAttributeReference] = js.undefined
  
  /**
    * The name of the facet attribute.
    */
  var Name: AttributeName
  
  /**
    * The required behavior of the FacetAttribute.
    */
  var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.undefined
}
object FacetAttribute {
  
  inline def apply(Name: AttributeName): FacetAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttribute]
  }
  
  extension [Self <: FacetAttribute](x: Self) {
    
    inline def setAttributeDefinition(value: FacetAttributeDefinition): Self = StObject.set(x, "AttributeDefinition", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionUndefined: Self = StObject.set(x, "AttributeDefinition", js.undefined)
    
    inline def setAttributeReference(value: FacetAttributeReference): Self = StObject.set(x, "AttributeReference", value.asInstanceOf[js.Any])
    
    inline def setAttributeReferenceUndefined: Self = StObject.set(x, "AttributeReference", js.undefined)
    
    inline def setName(value: AttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRequiredBehavior(value: RequiredAttributeBehavior): Self = StObject.set(x, "RequiredBehavior", value.asInstanceOf[js.Any])
    
    inline def setRequiredBehaviorUndefined: Self = StObject.set(x, "RequiredBehavior", js.undefined)
  }
}
