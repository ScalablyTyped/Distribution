package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSourceNameOriginal extends StObject {
  
  var attributes: Replacement
  
  var filePath: String
  
  var isSource: Boolean
  
  var name: String
  
  var original: AttributesReplacement
  
  var path: js.Array[String]
  
  var value: String
}
object IsSourceNameOriginal {
  
  inline def apply(
    attributes: Replacement,
    filePath: String,
    isSource: Boolean,
    name: String,
    original: AttributesReplacement,
    path: js.Array[String],
    value: String
  ): IsSourceNameOriginal = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSourceNameOriginal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsSourceNameOriginal] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Replacement): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: AttributesReplacement): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
