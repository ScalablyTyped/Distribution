package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Registration")
@js.native
class Registration () extends IRegistration {
  def this(procedure: String) = this()
  def this(procedure: String, endpoint: RegisterEndpoint) = this()
  def this(procedure: String, endpoint: RegisterEndpoint, options: IRegisterOptions) = this()
  def this(procedure: String, endpoint: RegisterEndpoint, options: IRegisterOptions, session: Session) = this()
  def this(
    procedure: String,
    endpoint: RegisterEndpoint,
    options: IRegisterOptions,
    session: Session,
    id: Double
  ) = this()
}

