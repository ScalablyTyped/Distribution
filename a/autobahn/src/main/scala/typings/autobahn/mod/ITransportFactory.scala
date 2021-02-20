package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransportFactory extends StObject {
  
  def create(): ITransport = js.native
  
  var `type`: TransportType = js.native
}
object ITransportFactory {
  
  @scala.inline
  def apply(create: () => ITransport, `type`: TransportType): ITransportFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportFactory]
  }
  
  @scala.inline
  implicit class ITransportFactoryMutableBuilder[Self <: ITransportFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => ITransport): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: TransportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
