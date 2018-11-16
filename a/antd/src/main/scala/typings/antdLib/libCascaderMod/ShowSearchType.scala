package typings
package antdLib.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShowSearchType extends js.Object {
  var filter: js.UndefOr[
    js.Function3[
      /* inputValue */ java.lang.String, 
      /* path */ js.Array[CascaderOptionType], 
      /* names */ FilledFieldNamesType, 
      scala.Boolean
    ]
  ] = js.undefined
  var matchInputWidth: js.UndefOr[scala.Boolean] = js.undefined
  var render: js.UndefOr[
    js.Function4[
      /* inputValue */ java.lang.String, 
      /* path */ js.Array[CascaderOptionType], 
      /* prefixCls */ js.UndefOr[java.lang.String], 
      /* names */ FilledFieldNamesType, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var sort: js.UndefOr[
    js.Function4[
      /* a */ js.Array[CascaderOptionType], 
      /* b */ js.Array[CascaderOptionType], 
      /* inputValue */ java.lang.String, 
      /* names */ FilledFieldNamesType, 
      scala.Double
    ]
  ] = js.undefined
}

