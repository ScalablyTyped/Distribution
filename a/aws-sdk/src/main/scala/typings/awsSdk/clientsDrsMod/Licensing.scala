package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Licensing extends StObject {
  
  /**
    * Whether to enable "Bring your own license" or not.
    */
  var osByol: js.UndefOr[Boolean] = js.undefined
}
object Licensing {
  
  inline def apply(): Licensing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Licensing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Licensing] (val x: Self) extends AnyVal {
    
    inline def setOsByol(value: Boolean): Self = StObject.set(x, "osByol", value.asInstanceOf[js.Any])
    
    inline def setOsByolUndefined: Self = StObject.set(x, "osByol", js.undefined)
  }
}
