package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trait extends StObject {
  
  /**
    *  Provides a name or contextual description about the trait. 
    */
  var Name: js.UndefOr[AttributeName] = js.undefined
  
  /**
    *  The level of confidence that Comprehend Medical; has in the accuracy of this trait.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object Trait {
  
  inline def apply(): Trait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trait]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Trait] (val x: Self) extends AnyVal {
    
    inline def setName(value: AttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
