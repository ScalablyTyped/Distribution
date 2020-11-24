package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BstrWorkerLabel extends js.Object {
  
  val bstrWorkerLabel: String = js.native
  
  val dwUniqueID: Double = js.native
}
object BstrWorkerLabel {
  
  @scala.inline
  def apply(bstrWorkerLabel: String, dwUniqueID: Double): BstrWorkerLabel = {
    val __obj = js.Dynamic.literal(bstrWorkerLabel = bstrWorkerLabel.asInstanceOf[js.Any], dwUniqueID = dwUniqueID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrWorkerLabel]
  }
  
  @scala.inline
  implicit class BstrWorkerLabelOps[Self <: BstrWorkerLabel] (val x: Self) extends AnyVal {
    
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
    def setBstrWorkerLabel(value: String): Self = this.set("bstrWorkerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDwUniqueID(value: Double): Self = this.set("dwUniqueID", value.asInstanceOf[js.Any])
  }
}
