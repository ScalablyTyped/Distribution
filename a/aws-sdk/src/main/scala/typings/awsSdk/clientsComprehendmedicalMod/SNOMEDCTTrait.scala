package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SNOMEDCTTrait extends StObject {
  
  /**
    *  The name or contextual description of a detected trait. 
    */
  var Name: js.UndefOr[SNOMEDCTTraitName] = js.undefined
  
  /**
    *  The level of confidence that Comprehend Medical has in the accuracy of a detected trait. 
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object SNOMEDCTTrait {
  
  inline def apply(): SNOMEDCTTrait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SNOMEDCTTrait]
  }
  
  extension [Self <: SNOMEDCTTrait](x: Self) {
    
    inline def setName(value: SNOMEDCTTraitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
