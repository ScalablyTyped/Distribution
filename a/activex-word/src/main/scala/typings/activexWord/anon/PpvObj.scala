package typings.activexWord.anon

import typings.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PpvObj extends StObject {
  
  var ppvObj: Unit
  
  val riid: GUID
}
object PpvObj {
  
  inline def apply(ppvObj: Unit, riid: GUID): PpvObj = {
    val __obj = js.Dynamic.literal(ppvObj = ppvObj.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpvObj]
  }
  
  extension [Self <: PpvObj](x: Self) {
    
    inline def setPpvObj(value: Unit): Self = StObject.set(x, "ppvObj", value.asInstanceOf[js.Any])
    
    inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
  }
}
