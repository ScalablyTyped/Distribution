package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  /**
    * Degrees, limited on [0, 360)
    */
  var degrees: js.UndefOr[OrientationDegreesDouble] = js.undefined
}
object Orientation {
  
  inline def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Orientation] (val x: Self) extends AnyVal {
    
    inline def setDegrees(value: OrientationDegreesDouble): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
    
    inline def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
  }
}
