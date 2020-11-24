package typings.activexInfopath

import typings.activexInfopath.InfoPath.Application
import typings.activexInfopath.InfoPath.ExternalApplication
import typings.activexInfopath.InfoPath.InfoPathEditorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends js.Object {
  
  @JSName("InfoPath.Application")
  var InfoPathDotApplication: Application = js.native
  
  @JSName("InfoPath.Editor")
  var InfoPathDotEditor: InfoPathEditorObject = js.native
  
  @JSName("InfoPath.ExternalApplication")
  var InfoPathDotExternalApplication: ExternalApplication = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(
    InfoPathDotApplication: Application,
    InfoPathDotEditor: InfoPathEditorObject,
    InfoPathDotExternalApplication: ExternalApplication
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Application")(InfoPathDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.Editor")(InfoPathDotEditor.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ExternalApplication")(InfoPathDotExternalApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotApplication(value: Application): Self = this.set("InfoPath.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotEditor(value: InfoPathEditorObject): Self = this.set("InfoPath.Editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotExternalApplication(value: ExternalApplication): Self = this.set("InfoPath.ExternalApplication", value.asInstanceOf[js.Any])
  }
}
