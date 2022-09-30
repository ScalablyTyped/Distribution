package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies how an area will be filled. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait FillStyle extends StObject
object FillStyle {
  
  /** use a bitmap to fill the area. */
  inline def BITMAP: `4` = 4.asInstanceOf[`4`]
  
  /** use a gradient color to fill the area. */
  inline def GRADIENT: `2` = 2.asInstanceOf[`2`]
  
  /** use a hatch to fill the area. */
  inline def HATCH: `3` = 3.asInstanceOf[`3`]
  
  /**
    * the area is not filled.
    *
    * the line has no special end.
    *
    * the joint between lines will not be connected
    *
    * the line is hidden.
    *
    * Don't animate this text.
    *
    * the text size is only defined by the font properties
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * use a solid color to fill the area.
    *
    * the line is solid.
    */
  inline def SOLID: `1` = 1.asInstanceOf[`1`]
}
