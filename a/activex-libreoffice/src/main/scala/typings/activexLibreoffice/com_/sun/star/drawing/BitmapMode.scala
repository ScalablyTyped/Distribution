package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The BitmapMode selects an algorithm for filling an area with a bitmap. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait BitmapMode extends StObject
object BitmapMode {
  
  /** the bitmap is painted in its original or selected size. */
  inline def NO_REPEAT: `2` = 2.asInstanceOf[`2`]
  
  /** the bitmap is repeated over the fill area. */
  inline def REPEAT: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the bitmap is stretched to fill the area.
    *
    * The text is stretched so that the longest line goes from the left to the right edge of the shape.
    */
  inline def STRETCH: `1` = 1.asInstanceOf[`1`]
}
