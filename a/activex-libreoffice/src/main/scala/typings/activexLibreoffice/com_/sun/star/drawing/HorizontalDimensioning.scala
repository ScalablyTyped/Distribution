package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The HorizontalDimensioning specifies the horizontal position of the text of a dimensioning shape. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait HorizontalDimensioning extends StObject
object HorizontalDimensioning {
  
  /**
    * the connection point is chosen automatically,
    *
    * Set this to have the application select the best horizontal position for the text.
    */
  inline def AUTO: `0` = 0.asInstanceOf[`0`]
  
  /**
    * The text is positioned at the center.
    *
    * The text is positioned over the main line.
    */
  inline def CENTERED: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  inline def LEFT: `1` = 1.asInstanceOf[`1`]
  
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  inline def RIGHT: `3` = 3.asInstanceOf[`3`]
}
