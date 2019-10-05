package typings.anydbDashSql.anydbDashSqlMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexCreationQuery extends Executable[Unit] {
  def fulltext(): IndexCreationQuery
  def on(columns: (Column[_] | OrderByValueNode)*): IndexCreationQuery
  def spatial(): IndexCreationQuery
  def unique(): IndexCreationQuery
  def using(name: String): IndexCreationQuery
  def withParser(parserName: String): IndexCreationQuery
}

object IndexCreationQuery {
  @scala.inline
  def apply(
    all: () => ^[js.Array[Unit]],
    allWithin: DatabaseConnection => ^[js.Array[Unit]],
    exec: () => ^[Unit],
    execWithin: DatabaseConnection => ^[Unit],
    fulltext: () => IndexCreationQuery,
    get: () => ^[Unit],
    getWithin: DatabaseConnection => ^[Unit],
    on: /* repeated */ Column[_] | OrderByValueNode => IndexCreationQuery,
    spatial: () => IndexCreationQuery,
    toQuery: () => QueryLike,
    unique: () => IndexCreationQuery,
    using: String => IndexCreationQuery,
    withParser: String => IndexCreationQuery
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), fulltext = js.Any.fromFunction0(fulltext), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), on = js.Any.fromFunction1(on), spatial = js.Any.fromFunction0(spatial), toQuery = js.Any.fromFunction0(toQuery), unique = js.Any.fromFunction0(unique), using = js.Any.fromFunction1(using), withParser = js.Any.fromFunction1(withParser))
  
    __obj.asInstanceOf[IndexCreationQuery]
  }
}

