package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultiplexResponse extends StObject {
  
  /**
    * The newly created multiplex.
    */
  var Multiplex: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Multiplex] = js.undefined
}
object CreateMultiplexResponse {
  
  inline def apply(): CreateMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMultiplexResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMultiplexResponse] (val x: Self) extends AnyVal {
    
    inline def setMultiplex(value: Multiplex): Self = StObject.set(x, "Multiplex", value.asInstanceOf[js.Any])
    
    inline def setMultiplexUndefined: Self = StObject.set(x, "Multiplex", js.undefined)
  }
}
