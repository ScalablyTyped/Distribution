package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQualificationTypeRequest extends StObject {
  
  /**
    * The ID of the QualificationType to dispose.
    */
  var QualificationTypeId: EntityId
}
object DeleteQualificationTypeRequest {
  
  inline def apply(QualificationTypeId: EntityId): DeleteQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQualificationTypeRequest]
  }
  
  extension [Self <: DeleteQualificationTypeRequest](x: Self) {
    
    inline def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
  }
}
