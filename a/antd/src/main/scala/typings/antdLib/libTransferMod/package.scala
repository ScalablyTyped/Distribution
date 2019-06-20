package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransferMod {
  type RenderResult = reactLib.reactMod.ReactElement | RenderResultObject | java.lang.String | scala.Null
  type TransferRender = js.Function1[/* item */ TransferItem, RenderResult]
}
