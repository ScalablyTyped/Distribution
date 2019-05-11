package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderedClassNameDataSource extends js.Object {
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

object Anon_BorderedClassNameDataSource {
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
  ): Anon_BorderedClassNameDataSource = {
    val __obj = js.Dynamic.literal(bordered = bordered, className = className, dataSource = dataSource, indentSize = indentSize, loading = loading, rowKey = rowKey, showHeader = showHeader, size = size, sortDirections = sortDirections, useFixedHeader = useFixedHeader)
  
    __obj.asInstanceOf[Anon_BorderedClassNameDataSource]
  }
}

