package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * lQueries represent a collection of individual LQuery objects tracked in a given view.
  */
@js.native
trait LQueries extends StObject {
  
  /**
    * A method called when a new embedded view is created. As a result a set of LQueries applicable
    * for a new embedded view is instantiated (cloned) from the declaration view.
    * @param tView
    */
  def createEmbeddedView(tView: TView): LQueries | Null = js.native
  
  /**
    * A method called when an embedded view is detached from a container. As a result all impacted
    * `LQuery` objects (and associated `QueryList`) are marked as dirty.
    * @param tView
    */
  def detachView(tView: TView): Unit = js.native
  
  /**
    * A method called when an embedded view is inserted into a container. As a result all impacted
    * `LQuery` objects (and associated `QueryList`) are marked as dirty.
    * @param tView
    */
  def insertView(tView: TView): Unit = js.native
  
  /**
    * A collection of queries tracked in a given view.
    */
  var queries: js.Array[LQuery[_]] = js.native
}
object LQueries {
  
  @scala.inline
  def apply(
    createEmbeddedView: TView => LQueries | Null,
    detachView: TView => Unit,
    insertView: TView => Unit,
    queries: js.Array[LQuery[_]]
  ): LQueries = {
    val __obj = js.Dynamic.literal(createEmbeddedView = js.Any.fromFunction1(createEmbeddedView), detachView = js.Any.fromFunction1(detachView), insertView = js.Any.fromFunction1(insertView), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[LQueries]
  }
  
  @scala.inline
  implicit class LQueriesMutableBuilder[Self <: LQueries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateEmbeddedView(value: TView => LQueries | Null): Self = StObject.set(x, "createEmbeddedView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetachView(value: TView => Unit): Self = StObject.set(x, "detachView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertView(value: TView => Unit): Self = StObject.set(x, "insertView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueries(value: js.Array[LQuery[_]]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesVarargs(value: LQuery[js.Any]*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
