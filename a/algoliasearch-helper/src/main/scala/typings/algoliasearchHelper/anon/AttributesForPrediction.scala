package typings.algoliasearchHelper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesForPrediction extends StObject {
  
  var attributesForPrediction: js.Array[String]
  
  var nbHits: Double
  
  var queryLanguages: js.Array[String]
}
object AttributesForPrediction {
  
  inline def apply(attributesForPrediction: js.Array[String], nbHits: Double, queryLanguages: js.Array[String]): AttributesForPrediction = {
    val __obj = js.Dynamic.literal(attributesForPrediction = attributesForPrediction.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], queryLanguages = queryLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesForPrediction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesForPrediction] (val x: Self) extends AnyVal {
    
    inline def setAttributesForPrediction(value: js.Array[String]): Self = StObject.set(x, "attributesForPrediction", value.asInstanceOf[js.Any])
    
    inline def setAttributesForPredictionVarargs(value: String*): Self = StObject.set(x, "attributesForPrediction", js.Array(value*))
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setQueryLanguages(value: js.Array[String]): Self = StObject.set(x, "queryLanguages", value.asInstanceOf[js.Any])
    
    inline def setQueryLanguagesVarargs(value: String*): Self = StObject.set(x, "queryLanguages", js.Array(value*))
  }
}
