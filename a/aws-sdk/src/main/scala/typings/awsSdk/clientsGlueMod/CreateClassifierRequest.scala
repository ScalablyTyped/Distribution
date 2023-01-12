package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClassifierRequest extends StObject {
  
  /**
    * A CsvClassifier object specifying the classifier to create.
    */
  var CsvClassifier: js.UndefOr[CreateCsvClassifierRequest] = js.undefined
  
  /**
    * A GrokClassifier object specifying the classifier to create.
    */
  var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.undefined
  
  /**
    * A JsonClassifier object specifying the classifier to create.
    */
  var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.undefined
  
  /**
    * An XMLClassifier object specifying the classifier to create.
    */
  var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.undefined
}
object CreateClassifierRequest {
  
  inline def apply(): CreateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClassifierRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClassifierRequest] (val x: Self) extends AnyVal {
    
    inline def setCsvClassifier(value: CreateCsvClassifierRequest): Self = StObject.set(x, "CsvClassifier", value.asInstanceOf[js.Any])
    
    inline def setCsvClassifierUndefined: Self = StObject.set(x, "CsvClassifier", js.undefined)
    
    inline def setGrokClassifier(value: CreateGrokClassifierRequest): Self = StObject.set(x, "GrokClassifier", value.asInstanceOf[js.Any])
    
    inline def setGrokClassifierUndefined: Self = StObject.set(x, "GrokClassifier", js.undefined)
    
    inline def setJsonClassifier(value: CreateJsonClassifierRequest): Self = StObject.set(x, "JsonClassifier", value.asInstanceOf[js.Any])
    
    inline def setJsonClassifierUndefined: Self = StObject.set(x, "JsonClassifier", js.undefined)
    
    inline def setXMLClassifier(value: CreateXMLClassifierRequest): Self = StObject.set(x, "XMLClassifier", value.asInstanceOf[js.Any])
    
    inline def setXMLClassifierUndefined: Self = StObject.set(x, "XMLClassifier", js.undefined)
  }
}
