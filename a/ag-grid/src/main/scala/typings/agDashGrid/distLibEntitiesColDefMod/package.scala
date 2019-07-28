package typings.agDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibEntitiesColDefMod {
  type ColSpanParams = BaseColDefParams
  type IAggFunc = js.Function1[/* input */ js.Array[js.Any], js.Any]
  type IsColumnFunc = js.Function1[/* params */ IsColumnFuncParams, Boolean]
  type RowSpanParams = BaseColDefParams
  type ValueFormatterParams = BaseWithValueColDefParams
  type ValueParserParams = NewValueParams
  type ValueSetterParams = NewValueParams
}
