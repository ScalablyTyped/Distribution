package typings.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object agendaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type Callback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  type JobAttributesData = StringDictionary[js.Any]
  type ResultCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[T], Unit]
}
