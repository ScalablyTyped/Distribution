package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvocation extends js.Object {
  
  var caller: js.UndefOr[Double] = js.native
  
  var procedure: String = js.native
  
  var progress: js.UndefOr[js.Function2[/* args */ js.Array[_], /* kwargs */ js.Any, Unit]] = js.native
}
object IInvocation {
  
  @scala.inline
  def apply(procedure: String): IInvocation = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvocation]
  }
  
  @scala.inline
  implicit class IInvocationOps[Self <: IInvocation] (val x: Self) extends AnyVal {
    
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
    def setProcedure(value: String): Self = this.set("procedure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaller(value: Double): Self = this.set("caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    
    @scala.inline
    def setProgress(value: (/* args */ js.Array[_], /* kwargs */ js.Any) => Unit): Self = this.set("progress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
}
