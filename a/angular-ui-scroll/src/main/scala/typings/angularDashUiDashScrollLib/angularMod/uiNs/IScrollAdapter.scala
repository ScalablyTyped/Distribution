package typings
package angularDashUiDashScrollLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollAdapter extends js.Object {
  /**
    * a boolean value indicating whether there are any pending load requests.
    */
  var isLoading: scala.Boolean = js.native
  /**
    * a reference to the item currently in the topmost visible position.
    */
  var topVisible: js.Any = js.native
  /**
    * a reference to the DOM element currently in the topmost visible position.
    */
  @JSName("topVisibleElement")
  var topVisibleElement_Original: angularLib.angularMod.angularNs.IAugmentedJQueryStatic = js.native
  /**
    * a reference to the scope created for the item currently in the topmost visible position.
    */
  var topVisibleScope: angularLib.angularMod.angularNs.IRepeatScope = js.native
  /**
    * Adds new items after the last item in the buffer
    *
    * @param newItems provides an array of items to be appended.
    */
  def append(newItems: js.Array[_]): scala.Unit = js.native
  /**
    * Replaces the item in the buffer at the given index with the new items.
    *
    * @param index provides position of the item to be affected in the dataset (not in the buffer). If the item with
    * the given index currently is not in the buffer no updates will be applied. $index property of the item $scope
    * can be used to access the index value for a given item
    *
    * @param newItems is an array of items to replace the affected item. If the array is empty ([]) the item will
    * be deleted, otherwise the items in the array replace the item. If the newItem array contains the old item,
    * the old item stays in place.
    */
  def applyUpdates(index: scala.Double, newItems: js.Array[_]): scala.Unit = js.native
  /**
    * Replaces the item in the buffer at the given index with the new items.
    *
    * @param updater is a function to be applied to every item currently in the buffer. The function will receive
    * 3 parameters: item, scope, and element. Here item is the item to be affected, scope is the item $scope, and
    * element is the html element for the item. The return value of the function should be an array of items.
    * Similarly to the newItem parameter (see above), if the array is empty([]), the item is deleted, otherwise
    * the item is replaced by the items in the array. If the return value is not an array, the item remains
    * unaffected, unless some updates were made to the item in the updater function. This can be thought of as
    * in place update.
    */
  def applyUpdates(
    updater: js.Function2[/* item */ js.Any, /* scope */ angularLib.angularMod.angularNs.IRepeatScope, _]
  ): scala.Unit = js.native
  /**
    * Adds new items before the first item in the buffer
    *
    * @param newItems provides an array of items to be prepended.
    */
  def prepend(newItems: js.Array[_]): scala.Unit = js.native
  /**
    * calling this method reinitializes and reloads the scroller content.
    * @param startIndex is an integer indicating what item index the scroller will use to start the load process.
    */
  def reload(): scala.Unit = js.native
  def reload(startIndex: scala.Double): scala.Unit = js.native
  def topVisibleElement(element: angularLib.JQuery): angularLib.JQLite = js.native
  /**
    * a reference to the DOM element currently in the topmost visible position.
    */
  def topVisibleElement(element: java.lang.String): angularLib.JQLite = js.native
  def topVisibleElement(element: js.Function0[scala.Unit]): angularLib.JQLite = js.native
  def topVisibleElement(element: stdLib.ArrayLike[stdLib.Element]): angularLib.JQLite = js.native
  def topVisibleElement(element: stdLib.Document): angularLib.JQLite = js.native
  def topVisibleElement(element: stdLib.Element): angularLib.JQLite = js.native
}

