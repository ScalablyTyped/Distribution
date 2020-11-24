package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends js.Object {
  
  val Progress: Double = js.native
  
  val ProgressMax: Double = js.native
}
object Progress {
  
  @scala.inline
  def apply(Progress: Double, ProgressMax: Double): Progress = {
    val __obj = js.Dynamic.literal(Progress = Progress.asInstanceOf[js.Any], ProgressMax = ProgressMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    
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
    def setProgress(value: Double): Self = this.set("Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressMax(value: Double): Self = this.set("ProgressMax", value.asInstanceOf[js.Any])
  }
}
