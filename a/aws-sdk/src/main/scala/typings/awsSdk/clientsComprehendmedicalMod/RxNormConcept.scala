package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RxNormConcept extends StObject {
  
  /**
    * RxNorm concept ID, also known as the RxCUI.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the RxNorm concept.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the reported RxNorm concept.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object RxNormConcept {
  
  inline def apply(): RxNormConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormConcept]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RxNormConcept] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
