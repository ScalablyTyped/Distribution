package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "List")
@js.native
class List () extends js.Object {
  /**
       * Constructor for List. Accepts optional List to clone, string title, or
       * list of items to copy.
       *
       * @param list Either a list to clone, a title
       *     to set for a new List, or an array of OptionItem to initialize a new
       *     list.
       */
  def this(list: List) = this()
  /**
       * Constructor for List. Accepts optional List to clone, string title, or
       * list of items to copy.
       *
       * @param list Either a list to clone, a title
       *     to set for a new List, or an array of OptionItem to initialize a new
       *     list.
       */
  def this(list: java.lang.String) = this()
  /**
       * Constructor for List. Accepts optional List to clone, string title, or
       * list of items to copy.
       *
       * @param list Either a list to clone, a title
       *     to set for a new List, or an array of OptionItem to initialize a new
       *     list.
       */
  def this(list: js.Array[OptionItem]) = this()
  /**
       * List of 2-20 items to show in this list. Required.
       */
  var items: js.Array[OptionItem] = js.native
  /**
       * Title of the list. Optional.
       */
  var title: js.UndefOr[java.lang.String] = js.native
  /**
       * Adds a single item or list of items to the list.
       *
       * @param optionItems OptionItems to add.
       * @return Returns current constructed List.
       */
  def addItems(optionItems: OptionItem): List = js.native
  /**
       * Adds a single item or list of items to the list.
       *
       * @param optionItems OptionItems to add.
       * @return Returns current constructed List.
       */
  def addItems(optionItems: js.Array[OptionItem]): List = js.native
  /**
       * Sets the title for this List.
       *
       * @param title Title to show on list.
       * @return Returns current constructed List.
       */
  def setTitle(title: java.lang.String): List = js.native
}

