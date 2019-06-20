package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of a menu item, as returned by {@link com.sun.star.awt.XMenu.getItemType()} . */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
*/
trait MenuItemType extends js.Object

object MenuItemType {
  /**
    * specifies a font with an unknown slant.
    *
    * specifies that the menu item type is unknown.
    */
  @scala.inline
  def DONTKNOW: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** specifies that the menu item has an image. */
  @scala.inline
  def IMAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** specifies that the menu item is a separator. */
  @scala.inline
  def SEPARATOR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** specifies that the menu item has a text. */
  @scala.inline
  def STRING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** specifies that the menu item has a text **and** an image. */
  @scala.inline
  def STRINGIMAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

