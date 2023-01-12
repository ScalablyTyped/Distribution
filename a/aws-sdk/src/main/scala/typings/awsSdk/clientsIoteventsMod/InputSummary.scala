package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSummary extends StObject {
  
  /**
    * The time the input was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the input.
    */
  var inputArn: js.UndefOr[InputArn] = js.undefined
  
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.undefined
  
  /**
    * The name of the input.
    */
  var inputName: js.UndefOr[InputName] = js.undefined
  
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the input.
    */
  var status: js.UndefOr[InputStatus] = js.undefined
}
object InputSummary {
  
  inline def apply(): InputSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setInputArn(value: InputArn): Self = StObject.set(x, "inputArn", value.asInstanceOf[js.Any])
    
    inline def setInputArnUndefined: Self = StObject.set(x, "inputArn", js.undefined)
    
    inline def setInputDescription(value: InputDescription): Self = StObject.set(x, "inputDescription", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptionUndefined: Self = StObject.set(x, "inputDescription", js.undefined)
    
    inline def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
