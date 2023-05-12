package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePathIsSource extends StObject {
  
  var attributes: Description
  
  var cleanName: String
  
  var filePath: String
  
  var isSource: Boolean
  
  var name: String
  
  var original: AttributesDescriptionValueArray
  
  var path: js.Array[String]
  
  var value: js.Array[Offset]
}
object FilePathIsSource {
  
  inline def apply(
    attributes: Description,
    cleanName: String,
    filePath: String,
    isSource: Boolean,
    name: String,
    original: AttributesDescriptionValueArray,
    path: js.Array[String],
    value: js.Array[Offset]
  ): FilePathIsSource = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], cleanName = cleanName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathIsSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePathIsSource] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Description): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCleanName(value: String): Self = StObject.set(x, "cleanName", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: AttributesDescriptionValueArray): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: js.Array[Offset]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Offset*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
