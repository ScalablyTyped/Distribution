package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mac extends StObject {
  
  var mac: js.UndefOr[String] = js.native
  
  var win: js.UndefOr[String] = js.native
}
object Mac {
  
  @scala.inline
  def apply(): Mac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mac]
  }
  
  @scala.inline
  implicit class MacMutableBuilder[Self <: Mac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    @scala.inline
    def setWin(value: String): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinUndefined: Self = StObject.set(x, "win", js.undefined)
  }
}
