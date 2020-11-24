package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object colDefMod {
  
  type ColSpanParams = typings.agGrid.colDefMod.BaseColDefParams
  
  type IAggFunc = js.Function1[/* input */ js.Array[js.Any], js.Any]
  
  type IsColumnFunc = js.Function1[/* params */ typings.agGrid.colDefMod.IsColumnFuncParams, scala.Boolean]
  
  type RowSpanParams = typings.agGrid.colDefMod.BaseColDefParams
  
  type ValueFormatterParams = typings.agGrid.colDefMod.BaseWithValueColDefParams
  
  type ValueParserParams = typings.agGrid.colDefMod.NewValueParams
  
  type ValueSetterParams = typings.agGrid.colDefMod.NewValueParams
}
