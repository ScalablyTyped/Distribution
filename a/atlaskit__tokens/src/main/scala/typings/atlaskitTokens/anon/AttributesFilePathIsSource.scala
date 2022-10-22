package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesFilePathIsSource extends StObject {
  
  var attributes: Description
  
  var filePath: String
  
  var isSource: Boolean
  
  var name: String
  
  var original: AttributesDescription
  
  var path: js.Array[String]
  
  var value: String
}
object AttributesFilePathIsSource {
  
  inline def apply(
    attributes: Description,
    filePath: String,
    isSource: Boolean,
    name: String,
    original: AttributesDescription,
    path: js.Array[String],
    value: String
  ): AttributesFilePathIsSource = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesFilePathIsSource]
  }
  
  extension [Self <: AttributesFilePathIsSource](x: Self) {
    
    inline def setAttributes(value: Description): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: AttributesDescription): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
