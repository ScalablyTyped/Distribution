package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Explains properties of a menu item */
trait MenuMultipleChange extends js.Object {
  /** unique ID of the group this menu item belongs to */
  var GroupID: scala.Double
  /** unique ID of this menu item */
  var ID: scala.Double
  /** sequence of bytes representing a possible image */
  var Image: activexDashInteropLib.SafeArray[scala.Double]
  /** true if active, so clickable */
  var IsActive: scala.Boolean
  /** true if checkable, so there can be a checkmark */
  var IsCheckable: scala.Boolean
  /** true if there is a checkmark */
  var IsChecked: scala.Boolean
  /** true if visible */
  var IsVisible: scala.Boolean
  /** text of the menu item */
  var ItemText: java.lang.String
  /** unique ID of the item directly above this menu item, used for fuzzy placement */
  var PreItemID: scala.Double
}

