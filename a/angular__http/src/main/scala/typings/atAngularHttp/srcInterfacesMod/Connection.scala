package typings.atAngularHttp.srcInterfacesMod

import typings.atAngularHttp.srcEnumsMod.ReadyState
import typings.atAngularHttp.srcStaticUnderscoreRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/interfaces", "Connection")
@js.native
abstract class Connection () extends js.Object {
  var readyState: ReadyState = js.native
  var request: Request = js.native
  var response: js.Any = js.native
}

