package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEventDocEventObject extends StObject {
  
  val pEvent: DocEventObject
}
object PEventDocEventObject {
  
  inline def apply(pEvent: DocEventObject): PEventDocEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocEventObject]
  }
  
  extension [Self <: PEventDocEventObject](x: Self) {
    
    inline def setPEvent(value: DocEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
