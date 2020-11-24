package typings.agGrid.textAndNumberFilterParametersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAndNumberFilterParameters extends js.Object {
  
  /** What to do when new rows are loaded. The default is to reset the filter, to keep it in line with 'set' filters. If you want to keep the selection, then set this value to 'keep'. */
  var newRowsAction: js.UndefOr[String] = js.native
}
object TextAndNumberFilterParameters {
  
  @scala.inline
  def apply(): TextAndNumberFilterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAndNumberFilterParameters]
  }
  
  @scala.inline
  implicit class TextAndNumberFilterParametersOps[Self <: TextAndNumberFilterParameters] (val x: Self) extends AnyVal {
    
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
    def setNewRowsAction(value: String): Self = this.set("newRowsAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewRowsAction: Self = this.set("newRowsAction", js.undefined)
  }
}
