package typings.asyncDashPolling

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-polling", JSImport.Namespace)
@js.native
object asyncDashPollingMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.asyncDashPolling.asyncDashPollingStrings.run
    - typings.asyncDashPolling.asyncDashPollingStrings.start
    - typings.asyncDashPolling.asyncDashPollingStrings.error
    - typings.asyncDashPolling.asyncDashPollingStrings.result
    - typings.asyncDashPolling.asyncDashPollingStrings.end
    - typings.asyncDashPolling.asyncDashPollingStrings.schedule
    - typings.asyncDashPolling.asyncDashPollingStrings.stop
  */
  trait EventName extends js.Object
  
  def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[Result], _], 
      _
    ],
    delay: Double
  ): Anon_EventName = js.native
}

