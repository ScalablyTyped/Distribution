package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocReturnEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventDocReturnEventObject extends StObject {
  
  val pEvent: DocReturnEventObject = js.native
}
object PEventDocReturnEventObject {
  
  @scala.inline
  def apply(pEvent: DocReturnEventObject): PEventDocReturnEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocReturnEventObject]
  }
  
  @scala.inline
  implicit class PEventDocReturnEventObjectMutableBuilder[Self <: PEventDocReturnEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPEvent(value: DocReturnEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
