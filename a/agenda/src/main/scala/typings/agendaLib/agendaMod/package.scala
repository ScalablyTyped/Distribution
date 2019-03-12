package typings
package agendaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object agendaMod {
  type Callback = js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  type ResultCallback[T] = js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.UndefOr[T], scala.Unit]
}
