package typings.antd

import typings.antd.antdStrings.default
import typings.antd.antdStrings.middle
import typings.antd.antdStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderedChildrenColumnName extends js.Object {
  var bordered: Boolean
  var childrenColumnName: String
  var className: String
  var dataSource: js.Array[scala.Nothing]
  var indentSize: Double
  var loading: Boolean
  var rowKey: String
  var showHeader: Boolean
  var size: small | default | middle
  var sortDirections: js.Array[String]
  var useFixedHeader: Boolean
}

object Anon_BorderedChildrenColumnName {
  @scala.inline
  def apply(
    bordered: Boolean,
    childrenColumnName: String,
    className: String,
    dataSource: js.Array[scala.Nothing],
    indentSize: Double,
    loading: Boolean,
    rowKey: String,
    showHeader: Boolean,
    size: small | default | middle,
    sortDirections: js.Array[String],
    useFixedHeader: Boolean
  ): Anon_BorderedChildrenColumnName = {
    val __obj = js.Dynamic.literal(bordered = bordered, childrenColumnName = childrenColumnName, className = className, dataSource = dataSource, indentSize = indentSize, loading = loading, rowKey = rowKey, showHeader = showHeader, size = size.asInstanceOf[js.Any], sortDirections = sortDirections, useFixedHeader = useFixedHeader)
  
    __obj.asInstanceOf[Anon_BorderedChildrenColumnName]
  }
}

