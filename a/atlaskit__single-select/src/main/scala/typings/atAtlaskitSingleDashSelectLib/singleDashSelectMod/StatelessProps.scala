package typings
package atAtlaskitSingleDashSelectLib.singleDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatelessProps extends Props {
  /** Value to be used when filtering the items. Compared against 'content'. */
  var filterValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets whether the field is loading data. The same property is used
    * for either initial fetch (when no options are available) as well for
    * subsequent loading of more options. The component reacts accordingly
    * based on the `items` provided.
    */
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets whether the Select dropdown is open. */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Message to be displayed when the component is set to its loading state.
    * The message might be displayed differently depending on whether or not
    * there are items already being rendered.
    */
  var loadingMessage: js.UndefOr[java.lang.String] = js.undefined
  /** The selected item data */
  var selectedItem: js.UndefOr[ItemType] = js.undefined
}

