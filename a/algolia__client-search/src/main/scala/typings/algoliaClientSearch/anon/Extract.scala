package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extract extends StObject {
  
  var extract: String
  
  var extractAttribute: String
  
  var score: Double
}
object Extract {
  
  inline def apply(extract: String, extractAttribute: String, score: Double): Extract = {
    val __obj = js.Dynamic.literal(extract = extract.asInstanceOf[js.Any], extractAttribute = extractAttribute.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extract]
  }
  
  extension [Self <: Extract](x: Self) {
    
    inline def setExtract(value: String): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractAttribute(value: String): Self = StObject.set(x, "extractAttribute", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
