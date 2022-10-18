package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRemoveFacetFromObject extends StObject {
  
  /**
    * A reference to the object whose facet will be removed.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
  
  /**
    * The facet to remove from the object.
    */
  var SchemaFacet: typings.awsSdk.clientsClouddirectoryMod.SchemaFacet
}
object BatchRemoveFacetFromObject {
  
  inline def apply(ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): BatchRemoveFacetFromObject = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRemoveFacetFromObject]
  }
  
  extension [Self <: BatchRemoveFacetFromObject](x: Self) {
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    inline def setSchemaFacet(value: SchemaFacet): Self = StObject.set(x, "SchemaFacet", value.asInstanceOf[js.Any])
  }
}
