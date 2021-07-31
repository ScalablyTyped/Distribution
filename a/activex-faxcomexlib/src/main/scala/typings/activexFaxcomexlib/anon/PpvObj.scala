package typings.activexFaxcomexlib.anon

import typings.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PpvObj extends StObject {
  
  var ppvObj: Unit
  
  val riid: GUID
}
object PpvObj {
  
  @scala.inline
  def apply(ppvObj: Unit, riid: GUID): PpvObj = {
    val __obj = js.Dynamic.literal(ppvObj = ppvObj.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpvObj]
  }
  
  @scala.inline
  implicit class PpvObjMutableBuilder[Self <: PpvObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPpvObj(value: Unit): Self = StObject.set(x, "ppvObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
  }
}
