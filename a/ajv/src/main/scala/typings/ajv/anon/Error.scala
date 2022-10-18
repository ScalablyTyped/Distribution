package typings.ajv.anon

import typings.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error[E /* <: DiscrError */] extends StObject {
  
  var error: E
  
  var tag: String
  
  var tagValue: Any
}
object Error {
  
  inline def apply[E /* <: DiscrError */](error: E, tag: String, tagValue: Any): Error[E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagValue = tagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error[E]]
  }
  
  extension [Self <: Error[?], E /* <: DiscrError */](x: Self & Error[E]) {
    
    inline def setError(value: E): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagValue(value: Any): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
  }
}
