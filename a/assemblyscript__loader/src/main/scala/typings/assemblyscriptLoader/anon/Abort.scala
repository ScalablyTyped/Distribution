package typings.assemblyscriptLoader.anon

import typings.std.WebAssembly.Memory
import typings.std.WebAssembly.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abort extends js.Object {
  
  var abort: js.UndefOr[
    js.Function4[/* msg */ Double, /* file */ Double, /* line */ Double, /* column */ Double, Unit]
  ] = js.native
  
  var memory: js.UndefOr[Memory] = js.native
  
  var table: js.UndefOr[Table] = js.native
  
  var trace: js.UndefOr[
    js.Function3[/* msg */ Double, /* numArgs */ js.UndefOr[Double], /* repeated */ Double, Unit]
  ] = js.native
}
object Abort {
  
  @scala.inline
  def apply(): Abort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abort]
  }
  
  @scala.inline
  implicit class AbortOps[Self <: Abort] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: (/* msg */ Double, /* file */ Double, /* line */ Double, /* column */ Double) => Unit): Self = this.set("abort", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setMemory(value: Memory): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTrace(value: (/* msg */ Double, /* numArgs */ js.UndefOr[Double], /* repeated */ Double) => Unit): Self = this.set("trace", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
  }
}
