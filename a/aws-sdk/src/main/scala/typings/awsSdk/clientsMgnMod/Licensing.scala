package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Licensing extends StObject {
  
  /**
    * Configure BYOL OS licensing.
    */
  var osByol: js.UndefOr[Boolean] = js.undefined
}
object Licensing {
  
  inline def apply(): Licensing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Licensing]
  }
  
  extension [Self <: Licensing](x: Self) {
    
    inline def setOsByol(value: Boolean): Self = StObject.set(x, "osByol", value.asInstanceOf[js.Any])
    
    inline def setOsByolUndefined: Self = StObject.set(x, "osByol", js.undefined)
  }
}
