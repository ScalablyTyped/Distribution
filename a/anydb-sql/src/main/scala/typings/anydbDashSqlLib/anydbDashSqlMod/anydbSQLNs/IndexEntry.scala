package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexEntry extends js.Object {
  var Cardinality: scala.Double
  var Collation: java.lang.String
  var Column_name: java.lang.String
  var Comment: java.lang.String
  var Index_comment: java.lang.String
  var Index_type: java.lang.String
  var Key_name: java.lang.String
  var Non_unique: scala.Boolean
  var Packed: scala.Boolean
  var Seq_in_index: scala.Double
  var Sub_part: java.lang.String
  var Table: java.lang.String
}

object IndexEntry {
  @scala.inline
  def apply(
    Cardinality: scala.Double,
    Collation: java.lang.String,
    Column_name: java.lang.String,
    Comment: java.lang.String,
    Index_comment: java.lang.String,
    Index_type: java.lang.String,
    Key_name: java.lang.String,
    Non_unique: scala.Boolean,
    Packed: scala.Boolean,
    Seq_in_index: scala.Double,
    Sub_part: java.lang.String,
    Table: java.lang.String
  ): IndexEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cardinality")(Cardinality)
    __obj.updateDynamic("Collation")(Collation)
    __obj.updateDynamic("Column_name")(Column_name)
    __obj.updateDynamic("Comment")(Comment)
    __obj.updateDynamic("Index_comment")(Index_comment)
    __obj.updateDynamic("Index_type")(Index_type)
    __obj.updateDynamic("Key_name")(Key_name)
    __obj.updateDynamic("Non_unique")(Non_unique)
    __obj.updateDynamic("Packed")(Packed)
    __obj.updateDynamic("Seq_in_index")(Seq_in_index)
    __obj.updateDynamic("Sub_part")(Sub_part)
    __obj.updateDynamic("Table")(Table)
    __obj.asInstanceOf[IndexEntry]
  }
}

