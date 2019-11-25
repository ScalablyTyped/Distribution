package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TQueries represent a collection of individual TQuery objects tracked in a given view. Most of the
  * methods on this interface are simple proxy methods to the corresponding functionality on TQuery.
  */
trait TQueries extends js.Object {
  /**
    * Returns the number of queries tracked in a given view.
    */
  var length: Double
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `elementEnd` on each and every TQuery.
    * @param tNode
    */
  def elementEnd(tNode: TNode): Unit
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `elementStart` on each and every TQuery.
    * @param tView
    * @param tNode
    */
  def elementStart(tView: TView, tNode: TNode): Unit
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `embeddedTView` on each and every TQuery.
    * @param tNode
    */
  def embeddedTView(tNode: TNode): TQueries | Null
  /**
    * Returns a TQuery instance for at the given index  in the queries array.
    * @param index
    */
  def getByIndex(index: Double): TQuery
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `template` on each and every TQuery.
    * @param tView
    * @param tNode
    */
  def template(tView: TView, tNode: TNode): Unit
  /**
    * Adds a new TQuery to a collection of queries tracked in a given view.
    * @param tQuery
    */
  def track(tQuery: TQuery): Unit
}

object TQueries {
  @scala.inline
  def apply(
    elementEnd: TNode => Unit,
    elementStart: (TView, TNode) => Unit,
    embeddedTView: TNode => TQueries | Null,
    getByIndex: Double => TQuery,
    length: Double,
    template: (TView, TNode) => Unit,
    track: TQuery => Unit
  ): TQueries = {
    val __obj = js.Dynamic.literal(elementEnd = js.Any.fromFunction1(elementEnd), elementStart = js.Any.fromFunction2(elementStart), embeddedTView = js.Any.fromFunction1(embeddedTView), getByIndex = js.Any.fromFunction1(getByIndex), length = length.asInstanceOf[js.Any], template = js.Any.fromFunction2(template), track = js.Any.fromFunction1(track))
  
    __obj.asInstanceOf[TQueries]
  }
}

