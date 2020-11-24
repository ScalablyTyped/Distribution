package typings.astTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyArray extends js.Object {
  
  def emptyArray(): js.Array[scala.Nothing] = js.native
  
  def `false`(): Boolean = js.native
  
  def `null`(): Null = js.native
  
  def `true`(): Boolean = js.native
  
  def undefined(): Unit = js.native
  
  def `use strict`(): String = js.native
}
object EmptyArray {
  
  @scala.inline
  def apply(
    emptyArray: () => js.Array[scala.Nothing],
    `false`: () => Boolean,
    `null`: () => Null,
    `true`: () => Boolean,
    undefined: () => Unit,
    `use strict`: () => String
  ): EmptyArray = {
    val __obj = js.Dynamic.literal(emptyArray = js.Any.fromFunction0(emptyArray), undefined = js.Any.fromFunction0(undefined))
    __obj.updateDynamic("false")(js.Any.fromFunction0(`false`))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.updateDynamic("true")(js.Any.fromFunction0(`true`))
    __obj.updateDynamic("use strict")(js.Any.fromFunction0(`use strict`))
    __obj.asInstanceOf[EmptyArray]
  }
  
  @scala.inline
  implicit class EmptyArrayOps[Self <: EmptyArray] (val x: Self) extends AnyVal {
    
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
    def setEmptyArray(value: () => js.Array[scala.Nothing]): Self = this.set("emptyArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFalse(value: () => Boolean): Self = this.set("false", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNull(value: () => Null): Self = this.set("null", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrue(value: () => Boolean): Self = this.set("true", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndefined(value: () => Unit): Self = this.set("undefined", js.Any.fromFunction0(value))
    
    @scala.inline
    def `setUse strict`(value: () => String): Self = this.set("use strict", js.Any.fromFunction0(value))
  }
}
