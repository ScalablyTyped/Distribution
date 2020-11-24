package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FDone extends js.Object {
  
  val fDone: js.Any = js.native
  
  val nPage: js.Any = js.native
  
  val pDisp: js.Any = js.native
}
object FDone {
  
  @scala.inline
  def apply(fDone: js.Any, nPage: js.Any, pDisp: js.Any): FDone = {
    val __obj = js.Dynamic.literal(fDone = fDone.asInstanceOf[js.Any], nPage = nPage.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FDone]
  }
  
  @scala.inline
  implicit class FDoneOps[Self <: FDone] (val x: Self) extends AnyVal {
    
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
    def setFDone(value: js.Any): Self = this.set("fDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNPage(value: js.Any): Self = this.set("nPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDisp(value: js.Any): Self = this.set("pDisp", value.asInstanceOf[js.Any])
  }
}
