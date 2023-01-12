package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classifier extends StObject {
  
  /**
    * A classifier for comma-separated values (CSV).
    */
  var CsvClassifier: js.UndefOr[typings.awsSdk.clientsGlueMod.CsvClassifier] = js.undefined
  
  /**
    * A classifier that uses grok.
    */
  var GrokClassifier: js.UndefOr[typings.awsSdk.clientsGlueMod.GrokClassifier] = js.undefined
  
  /**
    * A classifier for JSON content.
    */
  var JsonClassifier: js.UndefOr[typings.awsSdk.clientsGlueMod.JsonClassifier] = js.undefined
  
  /**
    * A classifier for XML content.
    */
  var XMLClassifier: js.UndefOr[typings.awsSdk.clientsGlueMod.XMLClassifier] = js.undefined
}
object Classifier {
  
  inline def apply(): Classifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classifier] (val x: Self) extends AnyVal {
    
    inline def setCsvClassifier(value: CsvClassifier): Self = StObject.set(x, "CsvClassifier", value.asInstanceOf[js.Any])
    
    inline def setCsvClassifierUndefined: Self = StObject.set(x, "CsvClassifier", js.undefined)
    
    inline def setGrokClassifier(value: GrokClassifier): Self = StObject.set(x, "GrokClassifier", value.asInstanceOf[js.Any])
    
    inline def setGrokClassifierUndefined: Self = StObject.set(x, "GrokClassifier", js.undefined)
    
    inline def setJsonClassifier(value: JsonClassifier): Self = StObject.set(x, "JsonClassifier", value.asInstanceOf[js.Any])
    
    inline def setJsonClassifierUndefined: Self = StObject.set(x, "JsonClassifier", js.undefined)
    
    inline def setXMLClassifier(value: XMLClassifier): Self = StObject.set(x, "XMLClassifier", value.asInstanceOf[js.Any])
    
    inline def setXMLClassifierUndefined: Self = StObject.set(x, "XMLClassifier", js.undefined)
  }
}
