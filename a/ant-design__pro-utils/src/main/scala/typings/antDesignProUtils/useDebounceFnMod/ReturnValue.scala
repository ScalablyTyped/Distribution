package typings.antDesignProUtils.useDebounceFnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValue[T /* <: js.Array[_] */] extends js.Object {
  
  def cancel(): Unit = js.native
  
  def run(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Unit = js.native
}
object ReturnValue {
  
  @scala.inline
  def apply[T /* <: js.Array[_] */](cancel: () => Unit, run: T => Unit): ReturnValue[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[ReturnValue[T]]
  }
  
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue[_], T /* <: js.Array[_] */] (val x: Self with ReturnValue[T]) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRun(value: T => Unit): Self = this.set("run", js.Any.fromFunction1(value))
  }
}
