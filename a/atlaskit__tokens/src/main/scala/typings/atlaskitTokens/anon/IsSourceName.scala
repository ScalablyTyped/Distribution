package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSourceName extends StObject {
  
  var attributes: Introduced
  
  var cleanName: String
  
  var filePath: String
  
  var isSource: Boolean
  
  var name: String
  
  var original: AttributesIntroduced
  
  var path: js.Array[String]
  
  var value: String
}
object IsSourceName {
  
  inline def apply(
    attributes: Introduced,
    cleanName: String,
    filePath: String,
    isSource: Boolean,
    name: String,
    original: AttributesIntroduced,
    path: js.Array[String],
    value: String
  ): IsSourceName = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], cleanName = cleanName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSourceName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsSourceName] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Introduced): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCleanName(value: String): Self = StObject.set(x, "cleanName", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: AttributesIntroduced): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
