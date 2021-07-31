package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocContextChangeEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEventDocContextChangeEventObject extends StObject {
  
  val pEvent: DocContextChangeEventObject
}
object PEventDocContextChangeEventObject {
  
  @scala.inline
  def apply(pEvent: DocContextChangeEventObject): PEventDocContextChangeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocContextChangeEventObject]
  }
  
  @scala.inline
  implicit class PEventDocContextChangeEventObjectMutableBuilder[Self <: PEventDocContextChangeEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPEvent(value: DocContextChangeEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
