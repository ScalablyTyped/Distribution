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
  var text: java.lang.String
  var value: java.lang.String
}

object ColumnFilterItem {
  @scala.inline
  def apply(
    text: java.lang.String,
    value: java.lang.String,
    children: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias antd.antd/lib/table/interface.ColumnFilterItem */ js.Object
    ] = null
  ): ColumnFilterItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("value")(value)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ColumnFilterItem]
  }
}

