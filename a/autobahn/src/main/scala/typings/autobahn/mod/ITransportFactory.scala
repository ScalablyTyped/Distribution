package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransportFactory extends StObject {
  
  def create(): ITransport
  
  var `type`: TransportType
}
object ITransportFactory {
  
  inline def apply(create: () => ITransport, `type`: TransportType): ITransportFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITransportFactory] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: () => ITransport): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setType(value: TransportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
