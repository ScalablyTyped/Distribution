package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Registration")
@js.native
class Registration ()
  extends StObject
     with IRegistration {
  def this(procedure: String) = this()
  def this(procedure: String, endpoint: RegisterEndpoint) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint) = this()
  def this(procedure: String, endpoint: Unit, options: IRegisterOptions) = this()
  def this(procedure: String, endpoint: RegisterEndpoint, options: IRegisterOptions) = this()
  def this(procedure: Unit, endpoint: Unit, options: IRegisterOptions) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint, options: IRegisterOptions) = this()
  def this(procedure: String, endpoint: Unit, options: Unit, session: Session) = this()
  def this(procedure: String, endpoint: Unit, options: IRegisterOptions, session: Session) = this()
  def this(procedure: String, endpoint: RegisterEndpoint, options: Unit, session: Session) = this()
  def this(procedure: String, endpoint: RegisterEndpoint, options: IRegisterOptions, session: Session) = this()
  def this(procedure: Unit, endpoint: Unit, options: Unit, session: Session) = this()
  def this(procedure: Unit, endpoint: Unit, options: IRegisterOptions, session: Session) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint, options: Unit, session: Session) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint, options: IRegisterOptions, session: Session) = this()
  def this(procedure: String, endpoint: Unit, options: Unit, session: Unit, id: Double) = this()
  def this(procedure: String, endpoint: Unit, options: Unit, session: Session, id: Double) = this()
  def this(procedure: String, endpoint: Unit, options: IRegisterOptions, session: Unit, id: Double) = this()
  def this(procedure: String, endpoint: Unit, options: IRegisterOptions, session: Session, id: Double) = this()
  def this(procedure: String, endpoint: RegisterEndpoint, options: Unit, session: Unit, id: Double) = this()
  def this(procedure: String, endpoint: RegisterEndpoint, options: Unit, session: Session, id: Double) = this()
  def this(
    procedure: String,
    endpoint: RegisterEndpoint,
    options: IRegisterOptions,
    session: Unit,
    id: Double
  ) = this()
  def this(
    procedure: String,
    endpoint: RegisterEndpoint,
    options: IRegisterOptions,
    session: Session,
    id: Double
  ) = this()
  def this(procedure: Unit, endpoint: Unit, options: Unit, session: Unit, id: Double) = this()
  def this(procedure: Unit, endpoint: Unit, options: Unit, session: Session, id: Double) = this()
  def this(procedure: Unit, endpoint: Unit, options: IRegisterOptions, session: Unit, id: Double) = this()
  def this(procedure: Unit, endpoint: Unit, options: IRegisterOptions, session: Session, id: Double) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint, options: Unit, session: Unit, id: Double) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint, options: Unit, session: Session, id: Double) = this()
  def this(procedure: Unit, endpoint: RegisterEndpoint, options: IRegisterOptions, session: Unit, id: Double) = this()
  def this(
    procedure: Unit,
    endpoint: RegisterEndpoint,
    options: IRegisterOptions,
    session: Session,
    id: Double
  ) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  override def endpoint(): Unit = js.native
  /* CompleteClass */
  override def endpoint(args: js.Array[js.Any]): Unit = js.native
  /* CompleteClass */
  override def endpoint(args: js.Array[js.Any], kwargs: js.Any): Unit = js.native
  /* CompleteClass */
  override def endpoint(args: js.Array[js.Any], kwargs: js.Any, details: IInvocation): Unit = js.native
  /* CompleteClass */
  override def endpoint(args: js.Array[js.Any], kwargs: Unit, details: IInvocation): Unit = js.native
  /* CompleteClass */
  override def endpoint(args: Unit, kwargs: js.Any): Unit = js.native
  /* CompleteClass */
  override def endpoint(args: Unit, kwargs: js.Any, details: IInvocation): Unit = js.native
  /* CompleteClass */
  override def endpoint(args: Unit, kwargs: Unit, details: IInvocation): Unit = js.native
  /* CompleteClass */
  @JSName("endpoint")
  var endpoint_Original: RegisterEndpoint = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var options: IRegisterOptions = js.native
  
  /* CompleteClass */
  var procedure: String = js.native
  
  /* CompleteClass */
  var session: Session = js.native
  
  /* CompleteClass */
  override def unregister(): Promise[js.Any] = js.native
}
