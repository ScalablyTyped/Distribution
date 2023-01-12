package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputLocationRef extends StObject {
  
  var DestinationRefId: js.UndefOr[string] = js.undefined
}
object OutputLocationRef {
  
  inline def apply(): OutputLocationRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocationRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputLocationRef] (val x: Self) extends AnyVal {
    
    inline def setDestinationRefId(value: string): Self = StObject.set(x, "DestinationRefId", value.asInstanceOf[js.Any])
    
    inline def setDestinationRefIdUndefined: Self = StObject.set(x, "DestinationRefId", js.undefined)
  }
}
