package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`10`
import typings.activexLibreoffice.activexLibreofficeNumbers.`11`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import typings.activexLibreoffice.activexLibreofficeNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These enumeration values are used to specify the location of a graphic object within its surroundings. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`10`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`9`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`11`
*/
trait GraphicLocation extends StObject
object GraphicLocation {
  
  /** The graphic is scaled to fill the whole surrounding area. */
  @scala.inline
  def AREA: `10` = 10.asInstanceOf[`10`]
  
  /** The graphic is located in the bottom left corner. */
  @scala.inline
  def LEFT_BOTTOM: `7` = 7.asInstanceOf[`7`]
  
  /** The graphic is located in the middle of the left edge. */
  @scala.inline
  def LEFT_MIDDLE: `4` = 4.asInstanceOf[`4`]
  
  /** The graphic is located in the top left corner. */
  @scala.inline
  def LEFT_TOP: `1` = 1.asInstanceOf[`1`]
  
  /** The graphic is located in the middle of the bottom edge. */
  @scala.inline
  def MIDDLE_BOTTOM: `8` = 8.asInstanceOf[`8`]
  
  /** The graphic is located at the center of the surrounding object. */
  @scala.inline
  def MIDDLE_MIDDLE: `5` = 5.asInstanceOf[`5`]
  
  /** The graphic is located in the middle of the top edge. */
  @scala.inline
  def MIDDLE_TOP: `2` = 2.asInstanceOf[`2`]
  
  /**
    * No column or page break is applied.
    *
    * This value specifies that a location is not yet assigned.
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** The graphic is located in the bottom right corner. */
  @scala.inline
  def RIGHT_BOTTOM: `9` = 9.asInstanceOf[`9`]
  
  /** The graphic is located in the middle of the right edge. */
  @scala.inline
  def RIGHT_MIDDLE: `6` = 6.asInstanceOf[`6`]
  
  /** The graphic is located in the top right corner. */
  @scala.inline
  def RIGHT_TOP: `3` = 3.asInstanceOf[`3`]
  
  /** The graphic is repeatedly spread over the surrounding object like tiles. */
  @scala.inline
  def TILED: `11` = 11.asInstanceOf[`11`]
}
