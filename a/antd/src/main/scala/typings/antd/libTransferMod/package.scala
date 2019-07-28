package typings.antd

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransferMod {
  type RenderResult = ReactElement | RenderResultObject | String | Null
  type TransferRender = js.Function1[/* item */ TransferItem, RenderResult]
}
