package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClassifierResponse extends StObject {
  
  /**
    * The requested classifier.
    */
  var Classifier: js.UndefOr[typings.awsSdk.clientsGlueMod.Classifier] = js.undefined
}
object GetClassifierResponse {
  
  inline def apply(): GetClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifierResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClassifierResponse] (val x: Self) extends AnyVal {
    
    inline def setClassifier(value: Classifier): Self = StObject.set(x, "Classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "Classifier", js.undefined)
  }
}
