package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopDataAttributes extends StObject {
  
  /**
    * Sets whether the input image is free of personally identifiable information.
    */
  var ContentClassifiers: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ContentClassifiers] = js.undefined
}
object HumanLoopDataAttributes {
  
  inline def apply(): HumanLoopDataAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopDataAttributes]
  }
  
  extension [Self <: HumanLoopDataAttributes](x: Self) {
    
    inline def setContentClassifiers(value: ContentClassifiers): Self = StObject.set(x, "ContentClassifiers", value.asInstanceOf[js.Any])
    
    inline def setContentClassifiersUndefined: Self = StObject.set(x, "ContentClassifiers", js.undefined)
    
    inline def setContentClassifiersVarargs(value: ContentClassifier*): Self = StObject.set(x, "ContentClassifiers", js.Array(value*))
  }
}
