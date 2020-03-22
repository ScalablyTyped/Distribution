package typings.asyncPolling.mod

import typings.asyncPolling.AnonOn
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-polling", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[Result], _], 
      _
    ],
    delay: Double
  ): AnonOn = js.native
}

