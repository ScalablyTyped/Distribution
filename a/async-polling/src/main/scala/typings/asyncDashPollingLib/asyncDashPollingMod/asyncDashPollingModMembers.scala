package typings
package asyncDashPollingLib.asyncDashPollingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-polling", JSImport.Namespace)
@js.native
object asyncDashPollingModMembers extends js.Object {
  def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.UndefOr[Result], _], 
      _
    ],
    delay: scala.Double
  ): asyncDashPollingLib.Anon_Stop = js.native
}

