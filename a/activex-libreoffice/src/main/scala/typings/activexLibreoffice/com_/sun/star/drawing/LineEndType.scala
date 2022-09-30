package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The LineEndType specifies the appearance of the bullet at the end of a line.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait LineEndType extends StObject
object LineEndType {
  
  /** the line uses an arrow for the line end. */
  inline def ARROW: `1` = 1.asInstanceOf[`1`]
  
  /** the line uses a circle for the line end. */
  inline def CIRCLE: `2` = 2.asInstanceOf[`2`]
  
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
    * not implemented, yet.
    *
    * deprecated
    */
  inline def SPECIAL: `4` = 4.asInstanceOf[`4`]
  
  /**
    * the line will get a half square as additional cap
    *
    * the line uses a square for the line end.
    */
  inline def SQUARE: `3` = 3.asInstanceOf[`3`]
}
