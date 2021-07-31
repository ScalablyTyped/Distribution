package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveTo extends StObject {
  
  var Cancel: Boolean
  
  val MoveTo: typings.activexOutlook.Outlook.Folder
}
object MoveTo {
  
  @scala.inline
  def apply(Cancel: Boolean, MoveTo: typings.activexOutlook.Outlook.Folder): MoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveTo]
  }
  
  @scala.inline
  implicit class MoveToMutableBuilder[Self <: MoveTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveTo(value: typings.activexOutlook.Outlook.Folder): Self = StObject.set(x, "MoveTo", value.asInstanceOf[js.Any])
  }
}
