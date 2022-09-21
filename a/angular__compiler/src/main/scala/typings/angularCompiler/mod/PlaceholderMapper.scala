package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `PlaceholderMapper` converts placeholder names from internal to serialized representation and
  * back.
  *
  * It should be used for serialization format that put constraints on the placeholder names.
  */
trait PlaceholderMapper extends StObject {
  
  def toInternalName(publicName: String): String | Null
  
  def toPublicName(internalName: String): String | Null
}
object PlaceholderMapper {
  
  inline def apply(toInternalName: String => String | Null, toPublicName: String => String | Null): PlaceholderMapper = {
    val __obj = js.Dynamic.literal(toInternalName = js.Any.fromFunction1(toInternalName), toPublicName = js.Any.fromFunction1(toPublicName))
    __obj.asInstanceOf[PlaceholderMapper]
  }
  
  extension [Self <: PlaceholderMapper](x: Self) {
    
    inline def setToInternalName(value: String => String | Null): Self = StObject.set(x, "toInternalName", js.Any.fromFunction1(value))
    
    inline def setToPublicName(value: String => String | Null): Self = StObject.set(x, "toPublicName", js.Any.fromFunction1(value))
  }
}
