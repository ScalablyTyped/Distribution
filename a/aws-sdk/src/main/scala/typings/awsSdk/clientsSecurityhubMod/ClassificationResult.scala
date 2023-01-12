package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationResult extends StObject {
  
  /**
    * Indicates whether there are additional occurrences of sensitive data that are not included in the finding. This occurs when the number of occurrences exceeds the maximum that can be included.
    */
  var AdditionalOccurrences: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides details about sensitive data that was identified based on customer-defined configuration.
    */
  var CustomDataIdentifiers: js.UndefOr[CustomDataIdentifiersResult] = js.undefined
  
  /**
    * The type of content that the finding applies to.
    */
  var MimeType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides details about sensitive data that was identified based on built-in configuration.
    */
  var SensitiveData: js.UndefOr[SensitiveDataResultList] = js.undefined
  
  /**
    * The total size in bytes of the affected data.
    */
  var SizeClassified: js.UndefOr[Long] = js.undefined
  
  /**
    * The current status of the sensitive data detection.
    */
  var Status: js.UndefOr[ClassificationStatus] = js.undefined
}
object ClassificationResult {
  
  inline def apply(): ClassificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassificationResult] (val x: Self) extends AnyVal {
    
    inline def setAdditionalOccurrences(value: Boolean): Self = StObject.set(x, "AdditionalOccurrences", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOccurrencesUndefined: Self = StObject.set(x, "AdditionalOccurrences", js.undefined)
    
    inline def setCustomDataIdentifiers(value: CustomDataIdentifiersResult): Self = StObject.set(x, "CustomDataIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setCustomDataIdentifiersUndefined: Self = StObject.set(x, "CustomDataIdentifiers", js.undefined)
    
    inline def setMimeType(value: NonEmptyString): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "MimeType", js.undefined)
    
    inline def setSensitiveData(value: SensitiveDataResultList): Self = StObject.set(x, "SensitiveData", value.asInstanceOf[js.Any])
    
    inline def setSensitiveDataUndefined: Self = StObject.set(x, "SensitiveData", js.undefined)
    
    inline def setSensitiveDataVarargs(value: SensitiveDataResult*): Self = StObject.set(x, "SensitiveData", js.Array(value*))
    
    inline def setSizeClassified(value: Long): Self = StObject.set(x, "SizeClassified", value.asInstanceOf[js.Any])
    
    inline def setSizeClassifiedUndefined: Self = StObject.set(x, "SizeClassified", js.undefined)
    
    inline def setStatus(value: ClassificationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
