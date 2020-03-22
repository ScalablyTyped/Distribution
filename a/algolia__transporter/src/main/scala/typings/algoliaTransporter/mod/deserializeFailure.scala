package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.Response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/transporter", "deserializeFailure")
@js.native
object deserializeFailure extends js.Object {
  def apply(hasContentStatus: Response, stackFrame: js.Array[StackFrame]): Error = js.native
}

