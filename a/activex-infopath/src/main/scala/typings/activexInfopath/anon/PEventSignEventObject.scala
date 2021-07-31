package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.SignEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEventSignEventObject extends StObject {
  
  val pEvent: SignEventObject
}
object PEventSignEventObject {
  
  @scala.inline
  def apply(pEvent: SignEventObject): PEventSignEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventSignEventObject]
  }
  
  @scala.inline
  implicit class PEventSignEventObjectMutableBuilder[Self <: PEventSignEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPEvent(value: SignEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
