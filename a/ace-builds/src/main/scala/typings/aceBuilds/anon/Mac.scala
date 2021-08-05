package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mac extends StObject {
  
  var mac: js.UndefOr[String] = js.undefined
  
  var win: js.UndefOr[String] = js.undefined
}
object Mac {
  
  inline def apply(): Mac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mac]
  }
  
  extension [Self <: Mac](x: Self) {
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setWin(value: String): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    
    inline def setWinUndefined: Self = StObject.set(x, "win", js.undefined)
  }
}
