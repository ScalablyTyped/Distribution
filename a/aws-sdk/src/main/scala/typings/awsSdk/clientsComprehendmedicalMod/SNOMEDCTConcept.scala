package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SNOMEDCTConcept extends StObject {
  
  /**
    *  The numeric ID for the SNOMED-CT concept. 
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    *  The description of the SNOMED-CT concept. 
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    *  The level of confidence Comprehend Medical has that the entity should be linked to the identified SNOMED-CT concept. 
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object SNOMEDCTConcept {
  
  inline def apply(): SNOMEDCTConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SNOMEDCTConcept]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SNOMEDCTConcept] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
