package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.SaveEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventSaveEventObject extends StObject {
  
  val pEvent: SaveEventObject = js.native
}
object PEventSaveEventObject {
  
  @scala.inline
  def apply(pEvent: SaveEventObject): PEventSaveEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventSaveEventObject]
  }
  
  @scala.inline
  implicit class PEventSaveEventObjectMutableBuilder[Self <: PEventSaveEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPEvent(value: SaveEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
