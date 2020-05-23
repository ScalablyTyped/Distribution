package typings.applicationinsightsJs.global.Microsoft

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Telemetry")
@js.native
object Telemetry extends js.Object {
  @js.native
  class Base ()
    extends typings.applicationinsightsJs.Microsoft.Telemetry.Base {
    /* CompleteClass */
    override var baseType: String = js.native
  }
  
  @js.native
  class Data[TDomain] ()
    extends typings.applicationinsightsJs.Microsoft.Telemetry.Data[TDomain] {
    /* CompleteClass */
    override var baseData: TDomain = js.native
    /* CompleteClass */
    override var baseType: String = js.native
  }
  
  @js.native
  class Domain ()
    extends typings.applicationinsightsJs.Microsoft.Telemetry.Domain
  
}

