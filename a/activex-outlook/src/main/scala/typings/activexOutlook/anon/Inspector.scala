package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inspector extends StObject {
  
  val Inspector: typings.activexOutlook.Outlook.Inspector
}
object Inspector {
  
  @scala.inline
  def apply(Inspector: typings.activexOutlook.Outlook.Inspector): Inspector = {
    val __obj = js.Dynamic.literal(Inspector = Inspector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inspector]
  }
  
  @scala.inline
  implicit class InspectorMutableBuilder[Self <: Inspector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInspector(value: typings.activexOutlook.Outlook.Inspector): Self = StObject.set(x, "Inspector", value.asInstanceOf[js.Any])
  }
}
