package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateObject extends StObject {
  
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.BatchReferenceName] = js.undefined
  
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.LinkName] = js.undefined
  
  /**
    * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
    */
  var ObjectAttributeList: AttributeKeyAndValueList
  
  /**
    * If specified, the parent reference to which this object will be attached.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.undefined
  
  /**
    * A list of FacetArns that will be associated with the object. For more information, see arns.
    */
  var SchemaFacet: SchemaFacetList
}
object BatchCreateObject {
  
  inline def apply(ObjectAttributeList: AttributeKeyAndValueList, SchemaFacet: SchemaFacetList): BatchCreateObject = {
    val __obj = js.Dynamic.literal(ObjectAttributeList = ObjectAttributeList.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateObject] (val x: Self) extends AnyVal {
    
    inline def setBatchReferenceName(value: BatchReferenceName): Self = StObject.set(x, "BatchReferenceName", value.asInstanceOf[js.Any])
    
    inline def setBatchReferenceNameUndefined: Self = StObject.set(x, "BatchReferenceName", js.undefined)
    
    inline def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
    
    inline def setObjectAttributeList(value: AttributeKeyAndValueList): Self = StObject.set(x, "ObjectAttributeList", value.asInstanceOf[js.Any])
    
    inline def setObjectAttributeListVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "ObjectAttributeList", js.Array(value*))
    
    inline def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
    
    inline def setParentReferenceUndefined: Self = StObject.set(x, "ParentReference", js.undefined)
    
    inline def setSchemaFacet(value: SchemaFacetList): Self = StObject.set(x, "SchemaFacet", value.asInstanceOf[js.Any])
    
    inline def setSchemaFacetVarargs(value: SchemaFacet*): Self = StObject.set(x, "SchemaFacet", js.Array(value*))
  }
}
