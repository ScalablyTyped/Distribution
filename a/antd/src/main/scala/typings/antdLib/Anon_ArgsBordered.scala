package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsBordered extends js.Object {
  var bordered: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var className: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var columns: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  var dataSource: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  var dropdownPrefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var loading: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean | js.Object]
  var locale: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var onChange: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var rowSelection: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var size: propDashTypesLib.propDashTypesMod.Requireable[antdLib.libTableInterfaceMod.TableSize]
  var sortDirections: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  var useFixedHeader: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
}

object Anon_ArgsBordered {
  @scala.inline
  def apply(
    bordered: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    className: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    columns: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]],
    dataSource: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]],
    dropdownPrefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    loading: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean | js.Object],
    locale: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    onChange: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    rowSelection: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    size: propDashTypesLib.propDashTypesMod.Requireable[antdLib.libTableInterfaceMod.TableSize],
    sortDirections: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]],
    useFixedHeader: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  ): Anon_ArgsBordered = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bordered")(bordered)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("dataSource")(dataSource)
    __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls)
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.updateDynamic("rowSelection")(rowSelection)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("sortDirections")(sortDirections)
    __obj.updateDynamic("useFixedHeader")(useFixedHeader)
    __obj.asInstanceOf[Anon_ArgsBordered]
  }
}

