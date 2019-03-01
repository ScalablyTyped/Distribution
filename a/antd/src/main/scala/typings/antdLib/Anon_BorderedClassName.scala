package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderedClassName extends js.Object {
  var bordered: scala.Boolean
  var className: java.lang.String
  var dataSource: js.Array[scala.Nothing]
  var indentSize: scala.Double
  var loading: scala.Boolean
  var rowKey: java.lang.String
  var showHeader: scala.Boolean
  var size: antdLib.libTableInterfaceMod.TableSize
  var sortDirections: js.Array[java.lang.String]
  var useFixedHeader: scala.Boolean
}

object Anon_BorderedClassName {
  @scala.inline
  def apply(
    bordered: scala.Boolean,
    className: java.lang.String,
    dataSource: js.Array[scala.Nothing],
    indentSize: scala.Double,
    loading: scala.Boolean,
    rowKey: java.lang.String,
    showHeader: scala.Boolean,
    size: antdLib.libTableInterfaceMod.TableSize,
    sortDirections: js.Array[java.lang.String],
    useFixedHeader: scala.Boolean
  ): Anon_BorderedClassName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bordered")(bordered)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("dataSource")(dataSource)
    __obj.updateDynamic("indentSize")(indentSize)
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("rowKey")(rowKey)
    __obj.updateDynamic("showHeader")(showHeader)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("sortDirections")(sortDirections)
    __obj.updateDynamic("useFixedHeader")(useFixedHeader)
    __obj.asInstanceOf[Anon_BorderedClassName]
  }
}

