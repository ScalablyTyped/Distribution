package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transferMod {
  type RenderResult = typings.react.mod.ReactElement | typings.antd.transferMod.RenderResultObject | java.lang.String | scala.Null
  type SelectAllLabel = typings.react.mod.ReactNode | (js.Function1[/* info */ typings.antd.anon.SelectedCount, typings.react.mod.ReactNode])
  type TransferRender = js.Function1[
    /* item */ typings.antd.transferMod.TransferItem, 
    typings.antd.transferMod.RenderResult
  ]
}
