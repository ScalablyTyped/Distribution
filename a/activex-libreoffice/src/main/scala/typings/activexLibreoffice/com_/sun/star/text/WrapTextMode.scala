package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import typings.activexLibreoffice.activexLibreofficeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enumeration values specify the text wrap around objects in a text. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`5`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait WrapTextMode extends StObject
object WrapTextMode {
  
  /** text flow depends on the situation. The text formatting decides the best way. */
  inline def DYNAMIC: `3` = 3.asInstanceOf[`3`]
  
  /**
    * the object is left adjusted.
    *
    * adjusted to the left.
    *
    * text flows to the left side of the object.
    */
  inline def LEFT: `4` = 4.asInstanceOf[`4`]
  
  /** text does not flow around the object. */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** text flows to the left and right of the object. */
  inline def PARALLEL: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the object is right adjusted.
    *
    * adjusted to the right.
    *
    * text flows to the right side of the object.
    */
  inline def RIGHT: `5` = 5.asInstanceOf[`5`]
  
  /** text flow ignores the object. */
  inline def THROUGHT: `1` = 1.asInstanceOf[`1`]
}
