package typings.applicationinsightsDashJs.Microsoft

import typings.applicationinsightsDashJs.Microsoft.Telemetry.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Telemetry")
@js.native
object Telemetry extends js.Object {
  @js.native
  class Base () extends js.Object {
    var baseType: String = js.native
  }
  
  @js.native
  class Data[TDomain] () extends Base {
    var baseData: TDomain = js.native
  }
  
  @js.native
  class Domain () extends js.Object
  
}

