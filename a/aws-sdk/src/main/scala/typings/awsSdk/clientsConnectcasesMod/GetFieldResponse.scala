package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldResponse extends StObject {
  
  /**
    * Description of the field.
    */
  var description: js.UndefOr[FieldDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the field.
    */
  var fieldArn: FieldArn
  
  /**
    * Unique identifier of the field.
    */
  var fieldId: FieldId
  
  /**
    * Name of the field.
    */
  var name: FieldName
  
  /**
    * Namespace of the field.
    */
  var namespace: FieldNamespace
  
  /**
    * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * Type of the field.
    */
  var `type`: FieldType
}
object GetFieldResponse {
  
  inline def apply(
    fieldArn: FieldArn,
    fieldId: FieldId,
    name: FieldName,
    namespace: FieldNamespace,
    `type`: FieldType
  ): GetFieldResponse = {
    val __obj = js.Dynamic.literal(fieldArn = fieldArn.asInstanceOf[js.Any], fieldId = fieldId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFieldResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: FieldDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFieldArn(value: FieldArn): Self = StObject.set(x, "fieldArn", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setName(value: FieldName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: FieldNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
