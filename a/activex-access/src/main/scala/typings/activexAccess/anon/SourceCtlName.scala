package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceCtlName extends js.Object {
  
  val SourceCtlName: String = js.native
  
  val SourceFieldList: Double = js.native
  
  val SourceRow: Double = js.native
  
  val X: Double = js.native
  
  val Y: Double = js.native
}
object SourceCtlName {
  
  @scala.inline
  def apply(SourceCtlName: String, SourceFieldList: Double, SourceRow: Double, X: Double, Y: Double): SourceCtlName = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCtlName]
  }
  
  @scala.inline
  implicit class SourceCtlNameOps[Self <: SourceCtlName] (val x: Self) extends AnyVal {
    
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
    def setSourceCtlName(value: String): Self = this.set("SourceCtlName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFieldList(value: Double): Self = this.set("SourceFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRow(value: Double): Self = this.set("SourceRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
}
