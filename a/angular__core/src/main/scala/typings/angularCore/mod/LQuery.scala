package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface that represents query-related information specific to a view instance. Most notably
  * it contains:
  * - materialized query matches;
  * - a pointer to a QueryList where materialized query results should be reported.
  */
@js.native
trait LQuery[T] extends StObject {
  
  /**
    * Materialized query matches for a given view only (!). Results are initialized lazily so the
    * array of matches is set to `null` initially.
    */
  var matches: (js.Array[T | Null]) | Null = js.native
  
  /**
    * A QueryList where materialized query results should be reported.
    */
  var queryList: QueryList[T] = js.native
  
  /**
    * Called when an embedded view, impacting results of this query, is inserted or removed.
    */
  def setDirty(): Unit = js.native
}
object LQuery {
  
  @scala.inline
  def apply[T](queryList: QueryList[T], setDirty: () => Unit): LQuery[T] = {
    val __obj = js.Dynamic.literal(queryList = queryList.asInstanceOf[js.Any], setDirty = js.Any.fromFunction0(setDirty))
    __obj.asInstanceOf[LQuery[T]]
  }
  
  @scala.inline
  implicit class LQueryMutableBuilder[Self <: LQuery[_], T] (val x: Self with LQuery[T]) extends AnyVal {
    
    @scala.inline
    def setMatches(value: js.Array[T | Null]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesNull: Self = StObject.set(x, "matches", null)
    
    @scala.inline
    def setMatchesVarargs(value: (T | Null)*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    @scala.inline
    def setQueryList(value: QueryList[T]): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDirty(value: () => Unit): Self = StObject.set(x, "setDirty", js.Any.fromFunction0(value))
  }
}
