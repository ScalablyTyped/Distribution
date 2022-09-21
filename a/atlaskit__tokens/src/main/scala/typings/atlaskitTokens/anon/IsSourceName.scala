package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSourceName extends StObject {
  
  var attributes: Deprecated
  
  var filePath: String
  
  var isSource: Boolean
  
  var name: String
  
  var original: AttributesDeprecatedValueArray
  
  var path: js.Array[String]
  
  var value: js.Array[Offset]
}
object IsSourceName {
  
  inline def apply(
    attributes: Deprecated,
    filePath: String,
    isSource: Boolean,
    name: String,
    original: AttributesDeprecatedValueArray,
    path: js.Array[String],
    value: js.Array[Offset]
  ): IsSourceName = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSourceName]
  }
  
  extension [Self <: IsSourceName](x: Self) {
    
    inline def setAttributes(value: Deprecated): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: AttributesDeprecatedValueArray): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: js.Array[Offset]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Offset*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
