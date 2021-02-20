package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The BitmapMode selects an algorithm for filling an area with a bitmap. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait BitmapMode extends StObject
object BitmapMode {
  
  /** the bitmap is painted in its original or selected size. */
  @scala.inline
  def NO_REPEAT: `2` = 2.asInstanceOf[`2`]
  
  /** the bitmap is repeated over the fill area. */
  @scala.inline
  def REPEAT: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the bitmap is stretched to fill the area.
    *
    * The text is stretched so that the longest line goes from the left to the right edge of the shape.
    */
  @scala.inline
  def STRETCH: `1` = 1.asInstanceOf[`1`]
}
