package typings.activexInfopath

import typings.activexInfopath.InfoPath.Application
import typings.activexInfopath.InfoPath.ExternalApplication
import typings.activexInfopath.InfoPath.InfoPathEditorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("InfoPath.Application")
  var InfoPathDotApplication: Application
  
  @JSName("InfoPath.Editor")
  var InfoPathDotEditor: InfoPathEditorObject
  
  @JSName("InfoPath.ExternalApplication")
  var InfoPathDotExternalApplication: ExternalApplication
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
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotApplication(value: Application): Self = StObject.set(x, "InfoPath.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotEditor(value: InfoPathEditorObject): Self = StObject.set(x, "InfoPath.Editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotExternalApplication(value: ExternalApplication): Self = StObject.set(x, "InfoPath.ExternalApplication", value.asInstanceOf[js.Any])
  }
}
