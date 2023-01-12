package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitiveDataResult extends StObject {
  
  /**
    * The category of sensitive data that was detected. For example, the category can indicate that the sensitive data involved credentials, financial information, or personal information.
    */
  var Category: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of detected instances of sensitive data.
    */
  var Detections: js.UndefOr[SensitiveDataDetectionsList] = js.undefined
  
  /**
    * The total number of occurrences of sensitive data.
    */
  var TotalCount: js.UndefOr[Long] = js.undefined
}
object SensitiveDataResult {
  
  inline def apply(): SensitiveDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveDataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensitiveDataResult] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: NonEmptyString): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setDetections(value: SensitiveDataDetectionsList): Self = StObject.set(x, "Detections", value.asInstanceOf[js.Any])
    
    inline def setDetectionsUndefined: Self = StObject.set(x, "Detections", js.undefined)
    
    inline def setDetectionsVarargs(value: SensitiveDataDetections*): Self = StObject.set(x, "Detections", js.Array(value*))
    
    inline def setTotalCount(value: Long): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
