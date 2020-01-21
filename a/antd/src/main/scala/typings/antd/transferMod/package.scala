package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transferMod {
  type RenderResult = typings.react.mod.ReactElement | typings.antd.transferMod.RenderResultObject | java.lang.String | scala.Null
  type TransferRender = js.Function1[
    /* item */ typings.antd.transferMod.TransferItem, 
    typings.antd.transferMod.RenderResult
  ]
}
