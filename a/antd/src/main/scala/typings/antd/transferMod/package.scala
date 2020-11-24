package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object transferMod {
  
  type KeyWise[T] = T with typings.antd.anon.Key
  
  type RenderResult = typings.react.mod.ReactElement | typings.antd.transferMod.RenderResultObject | java.lang.String | scala.Null
  
  type SelectAllLabel = typings.react.mod.ReactNode | (js.Function1[/* info */ typings.antd.anon.SelectedCount, typings.react.mod.ReactNode])
  
  type TransferRender[RecordType] = js.Function1[/* item */ RecordType, typings.antd.transferMod.RenderResult]
}
