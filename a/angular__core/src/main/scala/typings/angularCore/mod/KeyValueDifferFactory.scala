package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueDifferFactory extends StObject {
  
  /**
    * Create a `KeyValueDiffer`.
    */
  def create[K, V](): KeyValueDiffer[K, V] = js.native
  
  /**
    * Test to see if the differ knows how to diff this kind of object.
    */
  def supports(objects: js.Any): Boolean = js.native
}
object KeyValueDifferFactory {
  
  @scala.inline
  def apply(create: () => KeyValueDiffer[js.Any, js.Any], supports: js.Any => Boolean): KeyValueDifferFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), supports = js.Any.fromFunction1(supports))
    __obj.asInstanceOf[KeyValueDifferFactory]
  }
  
  @scala.inline
  implicit class KeyValueDifferFactoryMutableBuilder[Self <: KeyValueDifferFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => KeyValueDiffer[js.Any, js.Any]): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupports(value: js.Any => Boolean): Self = StObject.set(x, "supports", js.Any.fromFunction1(value))
  }
}
