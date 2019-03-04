package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFilterItem extends js.Object {
  var children: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias antd.antd/lib/table/interface.ColumnFilterItem */ js.Object
    ]
  ] = js.undefined
  var text: reactLib.reactMod.ReactNs.ReactNode
  var value: java.lang.String
}

object ColumnFilterItem {
  @scala.inline
  def apply(
    text: reactLib.reactMod.ReactNs.ReactNode,
    value: java.lang.String,
    children: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias antd.antd/lib/table/interface.ColumnFilterItem */ js.Object
    ] = null
  ): ColumnFilterItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ColumnFilterItem]
  }
}

