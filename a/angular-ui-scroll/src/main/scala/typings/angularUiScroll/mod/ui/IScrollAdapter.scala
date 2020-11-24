package typings.angularUiScroll.mod.ui

import typings.angular.JQLite
import typings.angular.JQuery
import typings.angular.mod.IAugmentedJQueryStatic
import typings.angular.mod.IRepeatScope
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollAdapter extends js.Object {
  
  /**
    * Adds new items after the last item in the buffer
    *
    * @param newItems provides an array of items to be appended.
    */
  def append(newItems: js.Array[_]): Unit = js.native
  
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
  def applyUpdates(index: Double, newItems: js.Array[_]): Unit = js.native
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
  def applyUpdates(updater: js.Function2[/* item */ js.Any, /* scope */ IRepeatScope, _]): Unit = js.native
  
  /**
    * a boolean value indicating whether there are any pending load requests.
    */
  var isLoading: Boolean = js.native
  
  /**
    * Adds new items before the first item in the buffer
    *
    * @param newItems provides an array of items to be prepended.
    */
  def prepend(newItems: js.Array[_]): Unit = js.native
  
  /**
    * calling this method reinitializes and reloads the scroller content.
    * @param startIndex is an integer indicating what item index the scroller will use to start the load process.
    */
  def reload(): Unit = js.native
  def reload(startIndex: Double): Unit = js.native
  
  /**
    * a reference to the item currently in the topmost visible position.
    */
  var topVisible: js.Any = js.native
  
  /**
    * a reference to the DOM element currently in the topmost visible position.
    */
  def topVisibleElement(element: String): JQLite = js.native
  def topVisibleElement(element: js.Function0[Unit]): JQLite = js.native
  def topVisibleElement(element: JQuery): JQLite = js.native
  def topVisibleElement(element: ArrayLike[Element]): JQLite = js.native
  def topVisibleElement(element: Document): JQLite = js.native
  def topVisibleElement(element: Element): JQLite = js.native
  def topVisibleElement(element: Window): JQLite = js.native
  /**
    * a reference to the DOM element currently in the topmost visible position.
    */
  @JSName("topVisibleElement")
  var topVisibleElement_Original: IAugmentedJQueryStatic = js.native
  
  /**
    * a reference to the scope created for the item currently in the topmost visible position.
    */
  var topVisibleScope: IRepeatScope = js.native
}
