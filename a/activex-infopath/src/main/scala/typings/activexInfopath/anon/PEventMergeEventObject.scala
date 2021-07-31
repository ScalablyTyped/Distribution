package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.MergeEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEventMergeEventObject extends StObject {
  
  val pEvent: MergeEventObject
}
object PEventMergeEventObject {
  
  @scala.inline
  def apply(pEvent: MergeEventObject): PEventMergeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventMergeEventObject]
  }
  
  @scala.inline
  implicit class PEventMergeEventObjectMutableBuilder[Self <: PEventMergeEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPEvent(value: MergeEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
