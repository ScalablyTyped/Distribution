package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueDifferFactory extends StObject {
  
  /**
    * Create a `KeyValueDiffer`.
    */
  def create[K, V](): KeyValueDiffer[K, V]
  
  /**
    * Test to see if the differ knows how to diff this kind of object.
    */
  def supports(objects: Any): Boolean
}
object KeyValueDifferFactory {
  
  inline def apply(create: () => KeyValueDiffer[Any, Any], supports: Any => Boolean): KeyValueDifferFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), supports = js.Any.fromFunction1(supports))
    __obj.asInstanceOf[KeyValueDifferFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyValueDifferFactory] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: () => KeyValueDiffer[Any, Any]): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setSupports(value: Any => Boolean): Self = StObject.set(x, "supports", js.Any.fromFunction1(value))
  }
}
