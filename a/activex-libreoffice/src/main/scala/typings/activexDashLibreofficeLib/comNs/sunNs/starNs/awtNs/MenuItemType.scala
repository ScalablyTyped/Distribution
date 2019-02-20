package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MenuItemType extends js.Object

/** specifies the type of a menu item, as returned by {@link com.sun.star.awt.XMenu.getItemType()} . */
@JSGlobal("com.sun.star.awt.MenuItemType")
@js.native
object MenuItemType extends js.Object {
  /**
    * specifies a font with an unknown slant.
    *
    * specifies that the menu item type is unknown.
    */
  @js.native
  sealed trait DONTKNOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MenuItemType
  
  /** specifies that the menu item has an image. */
  @js.native
  sealed trait IMAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MenuItemType
  
  /** specifies that the menu item is a separator. */
  @js.native
  sealed trait SEPARATOR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MenuItemType
  
  /** specifies that the menu item has a text. */
  @js.native
  sealed trait STRING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MenuItemType
  
  /** specifies that the menu item has a text **and** an image. */
  @js.native
  sealed trait STRINGIMAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MenuItemType
  
  /* 0 */ val DONTKNOW: DONTKNOW with scala.Double = js.native
  /* 2 */ val IMAGE: IMAGE with scala.Double = js.native
  /* 4 */ val SEPARATOR: SEPARATOR with scala.Double = js.native
  /* 1 */ val STRING: STRING with scala.Double = js.native
  /* 3 */ val STRINGIMAGE: STRINGIMAGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MenuItemType with scala.Double
  ] = js.native
}

