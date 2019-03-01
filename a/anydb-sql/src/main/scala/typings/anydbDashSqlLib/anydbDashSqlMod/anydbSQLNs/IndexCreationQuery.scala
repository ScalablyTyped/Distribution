package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexCreationQuery
  extends Executable[scala.Unit] {
  def fulltext(): IndexCreationQuery
  def on(columns: (Column[_] | OrderByValueNode)*): IndexCreationQuery
  def spatial(): IndexCreationQuery
  def unique(): IndexCreationQuery
  def using(name: java.lang.String): IndexCreationQuery
  def withParser(parserName: java.lang.String): IndexCreationQuery
}

object IndexCreationQuery {
  @scala.inline
  def apply(
    all: js.Function0[bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]]],
    allWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]]],
    exec: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    execWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    fulltext: js.Function0[IndexCreationQuery],
    get: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    getWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    on: js.Function1[/* repeated */ Column[_] | OrderByValueNode, IndexCreationQuery],
    spatial: js.Function0[IndexCreationQuery],
    toQuery: js.Function0[QueryLike],
    unique: js.Function0[IndexCreationQuery],
    using: js.Function1[java.lang.String, IndexCreationQuery],
    withParser: js.Function1[java.lang.String, IndexCreationQuery]
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("allWithin")(allWithin)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("execWithin")(execWithin)
    __obj.updateDynamic("fulltext")(fulltext)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getWithin")(getWithin)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("spatial")(spatial)
    __obj.updateDynamic("toQuery")(toQuery)
    __obj.updateDynamic("unique")(unique)
    __obj.updateDynamic("using")(using)
    __obj.updateDynamic("withParser")(withParser)
    __obj.asInstanceOf[IndexCreationQuery]
  }
}

