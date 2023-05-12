package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCreateCaseOptionsResponse extends StObject {
  
  /**
    *  A JSON-formatted array that contains the available communication type options, along with the available support timeframes for the given inputs. 
    */
  var communicationTypes: js.UndefOr[CommunicationTypeOptionsList] = js.undefined
  
  /**
    * Language availability can be any of the following:    available     best_effort     unavailable   
    */
  var languageAvailability: js.UndefOr[ValidatedLanguageAvailability] = js.undefined
}
object DescribeCreateCaseOptionsResponse {
  
  inline def apply(): DescribeCreateCaseOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCreateCaseOptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCreateCaseOptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCommunicationTypes(value: CommunicationTypeOptionsList): Self = StObject.set(x, "communicationTypes", value.asInstanceOf[js.Any])
    
    inline def setCommunicationTypesUndefined: Self = StObject.set(x, "communicationTypes", js.undefined)
    
    inline def setCommunicationTypesVarargs(value: CommunicationTypeOptions*): Self = StObject.set(x, "communicationTypes", js.Array(value*))
    
    inline def setLanguageAvailability(value: ValidatedLanguageAvailability): Self = StObject.set(x, "languageAvailability", value.asInstanceOf[js.Any])
    
    inline def setLanguageAvailabilityUndefined: Self = StObject.set(x, "languageAvailability", js.undefined)
  }
}
