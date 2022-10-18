package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the field.
    */
  var fieldArn: FieldArn
  
  /**
    * The unique identifier of a field.
    */
  var fieldId: FieldId
  
  /**
    * Name of the field.
    */
  var name: FieldName
  
  /**
    * The namespace of a field.
    */
  var namespace: FieldNamespace
  
  /**
    * The type of a field.
    */
  var `type`: FieldType
}
object FieldSummary {
  
  inline def apply(
    fieldArn: FieldArn,
    fieldId: FieldId,
    name: FieldName,
    namespace: FieldNamespace,
    `type`: FieldType
  ): FieldSummary = {
    val __obj = js.Dynamic.literal(fieldArn = fieldArn.asInstanceOf[js.Any], fieldId = fieldId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSummary]
  }
  
  extension [Self <: FieldSummary](x: Self) {
    
    inline def setFieldArn(value: FieldArn): Self = StObject.set(x, "fieldArn", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setName(value: FieldName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: FieldNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
