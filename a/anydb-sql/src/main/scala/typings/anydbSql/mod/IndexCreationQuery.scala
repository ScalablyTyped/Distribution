package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexCreationQuery
  extends StObject
     with Executable[Unit] {
  
  def fulltext(): IndexCreationQuery
  
  def on(columns: (Column[Any] | OrderByValueNode)*): IndexCreationQuery
  
  def spatial(): IndexCreationQuery
  
  def unique(): IndexCreationQuery
  
  def `using`(name: String): IndexCreationQuery
  
  def withParser(parserName: String): IndexCreationQuery
}
object IndexCreationQuery {
  
  inline def apply(
    all: () => typings.bluebird.mod.^[js.Array[Unit]],
    allWithin: DatabaseConnection => typings.bluebird.mod.^[js.Array[Unit]],
    exec: () => typings.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
    fulltext: () => IndexCreationQuery,
    get: () => typings.bluebird.mod.^[Unit],
    getWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
    on: /* repeated */ Column[Any] | OrderByValueNode => IndexCreationQuery,
    spatial: () => IndexCreationQuery,
    toQuery: () => QueryLike,
    unique: () => IndexCreationQuery,
    `using`: String => IndexCreationQuery,
    withParser: String => IndexCreationQuery
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), fulltext = js.Any.fromFunction0(fulltext), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), on = js.Any.fromFunction1(on), spatial = js.Any.fromFunction0(spatial), toQuery = js.Any.fromFunction0(toQuery), unique = js.Any.fromFunction0(unique), withParser = js.Any.fromFunction1(withParser))
    __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
    __obj.asInstanceOf[IndexCreationQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexCreationQuery] (val x: Self) extends AnyVal {
    
    inline def setFulltext(value: () => IndexCreationQuery): Self = StObject.set(x, "fulltext", js.Any.fromFunction0(value))
    
    inline def setOn(value: /* repeated */ Column[Any] | OrderByValueNode => IndexCreationQuery): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setSpatial(value: () => IndexCreationQuery): Self = StObject.set(x, "spatial", js.Any.fromFunction0(value))
    
    inline def setUnique(value: () => IndexCreationQuery): Self = StObject.set(x, "unique", js.Any.fromFunction0(value))
    
    inline def setUsing(value: String => IndexCreationQuery): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
    
    inline def setWithParser(value: String => IndexCreationQuery): Self = StObject.set(x, "withParser", js.Any.fromFunction1(value))
  }
}
