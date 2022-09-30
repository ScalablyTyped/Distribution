package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These enumeration values describe the adjustment of ruby text. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait RubyAdjust extends StObject
object RubyAdjust {
  
  /** adjusted to both borders / stretched */
  inline def BLOCK: `3` = 3.asInstanceOf[`3`]
  
  /**
    * the object is adjusted to the center.
    *
    * centric adjusted.
    */
  inline def CENTER: `1` = 1.asInstanceOf[`1`]
  
  /** adjusted to both borders except for a small indent on both sides */
  inline def INDENT_BLOCK: `4` = 4.asInstanceOf[`4`]
  
  /**
    * the object is left adjusted.
    *
    * adjusted to the left.
    *
    * text flows to the left side of the object.
    */
  inline def LEFT: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the object is right adjusted.
    *
    * adjusted to the right.
    *
    * text flows to the right side of the object.
    */
  inline def RIGHT: `2` = 2.asInstanceOf[`2`]
}
