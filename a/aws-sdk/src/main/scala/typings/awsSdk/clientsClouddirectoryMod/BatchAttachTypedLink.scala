package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAttachTypedLink extends StObject {
  
  /**
    * A set of attributes that are associated with the typed link.
    */
  var Attributes: AttributeNameAndValueList
  
  /**
    * Identifies the source object that the typed link will attach to.
    */
  var SourceObjectReference: ObjectReference
  
  /**
    * Identifies the target object that the typed link will attach to.
    */
  var TargetObjectReference: ObjectReference
  
  /**
    * Identifies the typed link facet that is associated with the typed link.
    */
  var TypedLinkFacet: TypedLinkSchemaAndFacetName
}
object BatchAttachTypedLink {
  
  inline def apply(
    Attributes: AttributeNameAndValueList,
    SourceObjectReference: ObjectReference,
    TargetObjectReference: ObjectReference,
    TypedLinkFacet: TypedLinkSchemaAndFacetName
  ): BatchAttachTypedLink = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], SourceObjectReference = SourceObjectReference.asInstanceOf[js.Any], TargetObjectReference = TargetObjectReference.asInstanceOf[js.Any], TypedLinkFacet = TypedLinkFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachTypedLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchAttachTypedLink] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: AttributeNameAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: AttributeNameAndValue*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setSourceObjectReference(value: ObjectReference): Self = StObject.set(x, "SourceObjectReference", value.asInstanceOf[js.Any])
    
    inline def setTargetObjectReference(value: ObjectReference): Self = StObject.set(x, "TargetObjectReference", value.asInstanceOf[js.Any])
    
    inline def setTypedLinkFacet(value: TypedLinkSchemaAndFacetName): Self = StObject.set(x, "TypedLinkFacet", value.asInstanceOf[js.Any])
  }
}
