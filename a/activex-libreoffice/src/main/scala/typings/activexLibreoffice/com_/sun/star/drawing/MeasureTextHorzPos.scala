package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration defines the relative horizontal placement of the text inside a measure shape. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait MeasureTextHorzPos extends StObject
object MeasureTextHorzPos {
  
  /**
    * the connection point is chosen automatically,
    *
    * Set this to have the application select the best horizontal position for the text.
    */
  inline def AUTO: `0` = 0.asInstanceOf[`0`]
  
  inline def INSIDE: `2` = 2.asInstanceOf[`2`]
  
  inline def LEFTOUTSIDE: `1` = 1.asInstanceOf[`1`]
  
  inline def RIGHTOUTSIDE: `3` = 3.asInstanceOf[`3`]
}
