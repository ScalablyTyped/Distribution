package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitiveDataDetections extends StObject {
  
  /**
    * The total number of occurrences of sensitive data that were detected.
    */
  var Count: js.UndefOr[Long] = js.undefined
  
  /**
    * Details about the sensitive data that was detected.
    */
  var Occurrences: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Occurrences] = js.undefined
  
  /**
    * The type of sensitive data that was detected. For example, the type might indicate that the data is an email address.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object SensitiveDataDetections {
  
  inline def apply(): SensitiveDataDetections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveDataDetections]
  }
  
  extension [Self <: SensitiveDataDetections](x: Self) {
    
    inline def setCount(value: Long): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setOccurrences(value: Occurrences): Self = StObject.set(x, "Occurrences", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesUndefined: Self = StObject.set(x, "Occurrences", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
