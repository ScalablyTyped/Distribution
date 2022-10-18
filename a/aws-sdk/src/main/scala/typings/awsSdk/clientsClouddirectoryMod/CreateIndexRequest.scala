package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexRequest extends StObject {
  
  /**
    * The ARN of the directory where the index should be created.
    */
  var DirectoryArn: Arn
  
  /**
    * Indicates whether the attribute that is being indexed has unique values or not.
    */
  var IsUnique: Bool
  
  /**
    * The name of the link between the parent object and the index object.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.LinkName] = js.undefined
  
  /**
    * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
    */
  var OrderedIndexedAttributeList: AttributeKeyList
  
  /**
    * A reference to the parent object that contains the index object.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.undefined
}
object CreateIndexRequest {
  
  inline def apply(DirectoryArn: Arn, IsUnique: Bool, OrderedIndexedAttributeList: AttributeKeyList): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IsUnique = IsUnique.asInstanceOf[js.Any], OrderedIndexedAttributeList = OrderedIndexedAttributeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
  
  extension [Self <: CreateIndexRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setIsUnique(value: Bool): Self = StObject.set(x, "IsUnique", value.asInstanceOf[js.Any])
    
    inline def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
    
    inline def setOrderedIndexedAttributeList(value: AttributeKeyList): Self = StObject.set(x, "OrderedIndexedAttributeList", value.asInstanceOf[js.Any])
    
    inline def setOrderedIndexedAttributeListVarargs(value: AttributeKey*): Self = StObject.set(x, "OrderedIndexedAttributeList", js.Array(value*))
    
    inline def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
    
    inline def setParentReferenceUndefined: Self = StObject.set(x, "ParentReference", js.undefined)
  }
}
