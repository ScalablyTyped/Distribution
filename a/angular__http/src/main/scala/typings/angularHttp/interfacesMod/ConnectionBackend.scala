package typings.angularHttp.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/interfaces", "ConnectionBackend")
@js.native
abstract class ConnectionBackend () extends js.Object {
  
  def createConnection(request: js.Any): Connection = js.native
}
