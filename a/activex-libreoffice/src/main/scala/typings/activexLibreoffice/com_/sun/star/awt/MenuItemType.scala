package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the type of a menu item, as returned by {@link com.sun.star.awt.XMenu.getItemType()} . */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait MenuItemType extends StObject
object MenuItemType {
  
  /**
    * specifies a font with an unknown slant.
    *
    * specifies that the menu item type is unknown.
    */
  @scala.inline
  def DONTKNOW: `0` = 0.asInstanceOf[`0`]
  
  /** specifies that the menu item has an image. */
  @scala.inline
  def IMAGE: `2` = 2.asInstanceOf[`2`]
  
  /** specifies that the menu item is a separator. */
  @scala.inline
  def SEPARATOR: `4` = 4.asInstanceOf[`4`]
  
  /** specifies that the menu item has a text. */
  @scala.inline
  def STRING: `1` = 1.asInstanceOf[`1`]
  
  /** specifies that the menu item has a text **and** an image. */
  @scala.inline
  def STRINGIMAGE: `3` = 3.asInstanceOf[`3`]
}
