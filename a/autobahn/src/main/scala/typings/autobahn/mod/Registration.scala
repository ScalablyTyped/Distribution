package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Registration")
@js.native
open class Registration[TResult, TArgs, TKWArgs, TName] ()
  extends StObject
     with IRegistration[TResult, TArgs, TKWArgs, TName] {
  def this(procedure: TName) = this()
  def this(procedure: TName, endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs]) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs]) = this()
  def this(procedure: TName, endpoint: Unit, options: IRegisterOptions) = this()
  def this(procedure: TName, endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs], options: IRegisterOptions) = this()
  def this(procedure: Unit, endpoint: Unit, options: IRegisterOptions) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs], options: IRegisterOptions) = this()
  def this(procedure: TName, endpoint: Unit, options: Unit, session: Session) = this()
  def this(procedure: TName, endpoint: Unit, options: IRegisterOptions, session: Session) = this()
  def this(
    procedure: TName,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: Unit,
    session: Session
  ) = this()
  def this(
    procedure: TName,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: IRegisterOptions,
    session: Session
  ) = this()
  def this(procedure: Unit, endpoint: Unit, options: Unit, session: Session) = this()
  def this(procedure: Unit, endpoint: Unit, options: IRegisterOptions, session: Session) = this()
  def this(
    procedure: Unit,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: Unit,
    session: Session
  ) = this()
  def this(
    procedure: Unit,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: IRegisterOptions,
    session: Session
  ) = this()
  def this(procedure: TName, endpoint: Unit, options: Unit, session: Unit, id: Double) = this()
  def this(procedure: TName, endpoint: Unit, options: Unit, session: Session, id: Double) = this()
  def this(procedure: TName, endpoint: Unit, options: IRegisterOptions, session: Unit, id: Double) = this()
  def this(procedure: TName, endpoint: Unit, options: IRegisterOptions, session: Session, id: Double) = this()
  def this(
    procedure: TName,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: Unit,
    session: Unit,
    id: Double
  ) = this()
  def this(
    procedure: TName,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: Unit,
    session: Session,
    id: Double
  ) = this()
  def this(
    procedure: TName,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: IRegisterOptions,
    session: Unit,
    id: Double
  ) = this()
  def this(
    procedure: TName,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: IRegisterOptions,
    session: Session,
    id: Double
  ) = this()
  def this(procedure: Unit, endpoint: Unit, options: Unit, session: Unit, id: Double) = this()
  def this(procedure: Unit, endpoint: Unit, options: Unit, session: Session, id: Double) = this()
  def this(procedure: Unit, endpoint: Unit, options: IRegisterOptions, session: Unit, id: Double) = this()
  def this(procedure: Unit, endpoint: Unit, options: IRegisterOptions, session: Session, id: Double) = this()
  def this(
    procedure: Unit,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: Unit,
    session: Unit,
    id: Double
  ) = this()
  def this(
    procedure: Unit,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: Unit,
    session: Session,
    id: Double
  ) = this()
  def this(
    procedure: Unit,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: IRegisterOptions,
    session: Unit,
    id: Double
  ) = this()
  def this(
    procedure: Unit,
    endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs],
    options: IRegisterOptions,
    session: Session,
    id: Double
  ) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  override def endpoint(): TResult = js.native
  /* CompleteClass */
  override def endpoint(args: TArgs): TResult = js.native
  /* CompleteClass */
  override def endpoint(args: TArgs, kwargs: TKWArgs): TResult = js.native
  /* CompleteClass */
  override def endpoint(args: TArgs, kwargs: TKWArgs, details: IInvocation): TResult = js.native
  /* CompleteClass */
  override def endpoint(args: TArgs, kwargs: Unit, details: IInvocation): TResult = js.native
  /* CompleteClass */
  override def endpoint(args: Unit, kwargs: TKWArgs): TResult = js.native
  /* CompleteClass */
  override def endpoint(args: Unit, kwargs: TKWArgs, details: IInvocation): TResult = js.native
  /* CompleteClass */
  override def endpoint(args: Unit, kwargs: Unit, details: IInvocation): TResult = js.native
  /* CompleteClass */
  @JSName("endpoint")
  var endpoint_Original: RegisterEndpoint[TResult, TArgs, TKWArgs] = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var options: IRegisterOptions = js.native
  
  /* CompleteClass */
  var procedure: TName = js.native
  
  /* CompleteClass */
  var session: Session = js.native
  
  /* CompleteClass */
  override def unregister(): Promise[Any] = js.native
}
