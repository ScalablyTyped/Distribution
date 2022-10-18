package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityLabel extends StObject {
  
  /**
    * The name of the label.
    */
  var Name: js.UndefOr[PiiEntityType] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object EntityLabel {
  
  inline def apply(): EntityLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityLabel]
  }
  
  extension [Self <: EntityLabel](x: Self) {
    
    inline def setName(value: PiiEntityType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
