package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueDifferFactory extends js.Object {
  
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
  implicit class KeyValueDifferFactoryOps[Self <: KeyValueDifferFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: () => KeyValueDiffer[js.Any, js.Any]): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSupports(value: js.Any => Boolean): Self = this.set("supports", js.Any.fromFunction1(value))
  }
}
