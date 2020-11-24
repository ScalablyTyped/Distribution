package typings.astTypes.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field[T] extends js.Object {
  
  val defaultFn: js.UndefOr[js.Function] = js.native
  
  def getValue(obj: StringDictionary[js.Any]): js.Any = js.native
  
  val hidden: Boolean = js.native
  
  val name: String = js.native
  
  val `type`: Type[T] = js.native
}
object Field {
  
  @scala.inline
  def apply[T](getValue: StringDictionary[js.Any] => js.Any, hidden: Boolean, name: String, `type`: Type[T]): Field[T] = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), hidden = hidden.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field[T]]
  }
  
  @scala.inline
  implicit class FieldOps[Self <: Field[_], T] (val x: Self with Field[T]) extends AnyVal {
    
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
    def setGetValue(value: StringDictionary[js.Any] => js.Any): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type[T]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFn(value: js.Function): Self = this.set("defaultFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFn: Self = this.set("defaultFn", js.undefined)
  }
}
