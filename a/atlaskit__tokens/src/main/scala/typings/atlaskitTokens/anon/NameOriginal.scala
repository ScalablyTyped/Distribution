package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameOriginal extends StObject {
  
  var attributes: State
  
  var cleanName: String
  
  var filePath: String
  
  var isSource: Boolean
  
  var name: String
  
  var original: AttributesState
  
  var path: js.Array[String]
  
  var value: String
}
object NameOriginal {
  
  inline def apply(
    attributes: State,
    cleanName: String,
    filePath: String,
    isSource: Boolean,
    name: String,
    original: AttributesState,
    path: js.Array[String],
    value: String
  ): NameOriginal = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], cleanName = cleanName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOriginal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameOriginal] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: State): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCleanName(value: String): Self = StObject.set(x, "cleanName", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: AttributesState): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
