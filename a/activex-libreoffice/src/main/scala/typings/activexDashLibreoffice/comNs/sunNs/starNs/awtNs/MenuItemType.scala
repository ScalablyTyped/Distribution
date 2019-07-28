package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of a menu item, as returned by {@link com.sun.star.awt.XMenu.getItemType()} . */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
*/
trait MenuItemType extends js.Object

object MenuItemType {
  /**
    * specifies a font with an unknown slant.
    *
    * specifies that the menu item type is unknown.
    */
  @scala.inline
  def DONTKNOW: `0` = this.cast(0)
  /** specifies that the menu item has an image. */
  @scala.inline
  def IMAGE: `2` = this.cast(2)
  /** specifies that the menu item is a separator. */
  @scala.inline
  def SEPARATOR: `4` = this.cast(4)
  /** specifies that the menu item has a text. */
  @scala.inline
  def STRING: `1` = this.cast(1)
  /** specifies that the menu item has a text **and** an image. */
  @scala.inline
  def STRINGIMAGE: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

