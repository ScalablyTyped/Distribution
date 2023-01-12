package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegistration[TResult, TArgs, TKWArgs, TName] extends StObject {
  
  var active: Boolean
  
  def endpoint(): TResult
  def endpoint(args: TArgs): TResult
  def endpoint(args: TArgs, kwargs: TKWArgs): TResult
  def endpoint(args: TArgs, kwargs: TKWArgs, details: IInvocation): TResult
  def endpoint(args: TArgs, kwargs: Unit, details: IInvocation): TResult
  def endpoint(args: Unit, kwargs: TKWArgs): TResult
  def endpoint(args: Unit, kwargs: TKWArgs, details: IInvocation): TResult
  def endpoint(args: Unit, kwargs: Unit, details: IInvocation): TResult
  @JSName("endpoint")
  var endpoint_Original: RegisterEndpoint[TResult, TArgs, TKWArgs]
  
  var id: Double
  
  var options: IRegisterOptions
  
  var procedure: TName
  
  var session: Session
  
  def unregister(): Promise[Any]
}
object IRegistration {
  
  inline def apply[TResult, TArgs, TKWArgs, TName](
    active: Boolean,
    endpoint: (/* args */ js.UndefOr[TArgs], /* kwargs */ js.UndefOr[TKWArgs], /* details */ js.UndefOr[IInvocation]) => TResult,
    id: Double,
    options: IRegisterOptions,
    procedure: TName,
    session: Session,
    unregister: () => Promise[Any]
  ): IRegistration[TResult, TArgs, TKWArgs, TName] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], endpoint = js.Any.fromFunction3(endpoint), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], unregister = js.Any.fromFunction0(unregister))
    __obj.asInstanceOf[IRegistration[TResult, TArgs, TKWArgs, TName]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRegistration[?, ?, ?, ?], TResult, TArgs, TKWArgs, TName] (val x: Self & (IRegistration[TResult, TArgs, TKWArgs, TName])) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(
      value: (/* args */ js.UndefOr[TArgs], /* kwargs */ js.UndefOr[TKWArgs], /* details */ js.UndefOr[IInvocation]) => TResult
    ): Self = StObject.set(x, "endpoint", js.Any.fromFunction3(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IRegisterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProcedure(value: TName): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setUnregister(value: () => Promise[Any]): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
  }
}
