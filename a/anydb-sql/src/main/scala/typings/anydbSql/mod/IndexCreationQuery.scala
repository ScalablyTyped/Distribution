package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexCreationQuery extends Executable[Unit] {
  
  def fulltext(): IndexCreationQuery = js.native
  
  def on(columns: (Column[_] | OrderByValueNode)*): IndexCreationQuery = js.native
  
  def spatial(): IndexCreationQuery = js.native
  
  def unique(): IndexCreationQuery = js.native
  
  def using(name: String): IndexCreationQuery = js.native
  
  def withParser(parserName: String): IndexCreationQuery = js.native
}
object IndexCreationQuery {
  
  @scala.inline
  def apply(
    all: () => typings.bluebird.mod.^[js.Array[Unit]],
    allWithin: DatabaseConnection => typings.bluebird.mod.^[js.Array[Unit]],
    exec: () => typings.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
    fulltext: () => IndexCreationQuery,
    get: () => typings.bluebird.mod.^[Unit],
    getWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
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
  
  @scala.inline
  implicit class IndexCreationQueryMutableBuilder[Self <: IndexCreationQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFulltext(value: () => IndexCreationQuery): Self = StObject.set(x, "fulltext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: /* repeated */ Column[_] | OrderByValueNode => IndexCreationQuery): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpatial(value: () => IndexCreationQuery): Self = StObject.set(x, "spatial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnique(value: () => IndexCreationQuery): Self = StObject.set(x, "unique", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsing(value: String => IndexCreationQuery): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithParser(value: String => IndexCreationQuery): Self = StObject.set(x, "withParser", js.Any.fromFunction1(value))
  }
}
