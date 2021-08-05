package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegistration extends StObject {
  
  var active: Boolean
  
  def endpoint(): Unit
  def endpoint(args: js.Array[js.Any]): Unit
  def endpoint(args: js.Array[js.Any], kwargs: js.Any): Unit
  def endpoint(args: js.Array[js.Any], kwargs: js.Any, details: IInvocation): Unit
  def endpoint(args: js.Array[js.Any], kwargs: Unit, details: IInvocation): Unit
  def endpoint(args: Unit, kwargs: js.Any): Unit
  def endpoint(args: Unit, kwargs: js.Any, details: IInvocation): Unit
  def endpoint(args: Unit, kwargs: Unit, details: IInvocation): Unit
  @JSName("endpoint")
  var endpoint_Original: RegisterEndpoint
  
  var id: Double
  
  var options: IRegisterOptions
  
  var procedure: String
  
  var session: Session
  
  def unregister(): Promise[js.Any]
}
object IRegistration {
  
  inline def apply(
    active: Boolean,
    endpoint: (/* args */ js.UndefOr[js.Array[js.Any]], /* kwargs */ js.UndefOr[js.Any], /* details */ js.UndefOr[IInvocation]) => Unit,
    id: Double,
    options: IRegisterOptions,
    procedure: String,
    session: Session,
    unregister: () => Promise[js.Any]
  ): IRegistration = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], endpoint = js.Any.fromFunction3(endpoint), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], unregister = js.Any.fromFunction0(unregister))
    __obj.asInstanceOf[IRegistration]
  }
  
  extension [Self <: IRegistration](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(
      value: (/* args */ js.UndefOr[js.Array[js.Any]], /* kwargs */ js.UndefOr[js.Any], /* details */ js.UndefOr[IInvocation]) => Unit
    ): Self = StObject.set(x, "endpoint", js.Any.fromFunction3(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IRegisterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setUnregister(value: () => Promise[js.Any]): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
  }
}
