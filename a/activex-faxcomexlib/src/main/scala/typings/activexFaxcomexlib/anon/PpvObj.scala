package typings.activexFaxcomexlib.anon

import typings.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PpvObj extends StObject {
  
  var ppvObj: js.UndefOr[scala.Nothing] = js.native
  
  val riid: GUID = js.native
}
object PpvObj {
  
  @scala.inline
  def apply(riid: GUID): PpvObj = {
    val __obj = js.Dynamic.literal(riid = riid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpvObj]
  }
  
  @scala.inline
  implicit class PpvObjMutableBuilder[Self <: PpvObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
  }
}
