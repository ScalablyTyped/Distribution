package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderStyle extends StObject {
  
  /**
    * The option to enable display of borders for visuals.
    */
  var Show: js.UndefOr[scala.Boolean] = js.undefined
}
object BorderStyle {
  
  inline def apply(): BorderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyle]
  }
  
  extension [Self <: BorderStyle](x: Self) {
    
    inline def setShow(value: scala.Boolean): Self = StObject.set(x, "Show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "Show", js.undefined)
  }
}
