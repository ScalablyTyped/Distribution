package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAddFacetToObject extends StObject {
  
  /**
    * The attributes to set on the object.
    */
  var ObjectAttributeList: AttributeKeyAndValueList
  
  /**
    * A reference to the object being mutated.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
  
  /**
    * Represents the facet being added to the object.
    */
  var SchemaFacet: typings.awsSdk.clientsClouddirectoryMod.SchemaFacet
}
object BatchAddFacetToObject {
  
  inline def apply(
    ObjectAttributeList: AttributeKeyAndValueList,
    ObjectReference: ObjectReference,
    SchemaFacet: SchemaFacet
  ): BatchAddFacetToObject = {
    val __obj = js.Dynamic.literal(ObjectAttributeList = ObjectAttributeList.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAddFacetToObject]
  }
  
  extension [Self <: BatchAddFacetToObject](x: Self) {
    
    inline def setObjectAttributeList(value: AttributeKeyAndValueList): Self = StObject.set(x, "ObjectAttributeList", value.asInstanceOf[js.Any])
    
    inline def setObjectAttributeListVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "ObjectAttributeList", js.Array(value*))
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    inline def setSchemaFacet(value: SchemaFacet): Self = StObject.set(x, "SchemaFacet", value.asInstanceOf[js.Any])
  }
}
