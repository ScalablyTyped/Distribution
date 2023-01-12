package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValidationMetrics extends StObject {
  
  /**
    * The field-specific model training validation messages.
    */
  var fieldLevelMessages: js.UndefOr[fieldValidationMessageList] = js.undefined
  
  /**
    * The file-specific model training data validation messages.
    */
  var fileLevelMessages: js.UndefOr[fileValidationMessageList] = js.undefined
}
object DataValidationMetrics {
  
  inline def apply(): DataValidationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataValidationMetrics] (val x: Self) extends AnyVal {
    
    inline def setFieldLevelMessages(value: fieldValidationMessageList): Self = StObject.set(x, "fieldLevelMessages", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelMessagesUndefined: Self = StObject.set(x, "fieldLevelMessages", js.undefined)
    
    inline def setFieldLevelMessagesVarargs(value: FieldValidationMessage*): Self = StObject.set(x, "fieldLevelMessages", js.Array(value*))
    
    inline def setFileLevelMessages(value: fileValidationMessageList): Self = StObject.set(x, "fileLevelMessages", value.asInstanceOf[js.Any])
    
    inline def setFileLevelMessagesUndefined: Self = StObject.set(x, "fileLevelMessages", js.undefined)
    
    inline def setFileLevelMessagesVarargs(value: FileValidationMessage*): Self = StObject.set(x, "fileLevelMessages", js.Array(value*))
  }
}
