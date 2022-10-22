package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesFilePath extends StObject {
  
  var attributes: Deprecated
  
  var filePath: String
  
  var isSource: Boolean
  
  var name: String
  
  var original: AttributesDeprecated
  
  var path: js.Array[String]
  
  var value: String
}
object AttributesFilePath {
  
  inline def apply(
    attributes: Deprecated,
    filePath: String,
    isSource: Boolean,
    name: String,
    original: AttributesDeprecated,
    path: js.Array[String],
    value: String
  ): AttributesFilePath = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesFilePath]
  }
  
  extension [Self <: AttributesFilePath](x: Self) {
    
    inline def setAttributes(value: Deprecated): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: AttributesDeprecated): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
