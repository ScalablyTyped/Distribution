package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These values are used to specify the binary pixel-operation applied when pixels are written to the device. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait RasterOperation extends StObject
object RasterOperation {
  
  /** All bits which are affected by this operation are set to 1. */
  inline def ALLBITS: `3` = 3.asInstanceOf[`3`]
  
  /** All bits which are affected by this operation are inverted. */
  inline def INVERT: `4` = 4.asInstanceOf[`4`]
  
  /** sets all pixel as written in the output operation. */
  inline def OVERPAINT: `0` = 0.asInstanceOf[`0`]
  
  /** uses the pixel written as one and the current pixel as the other operator of an exclusive or-operation. */
  inline def XOR: `1` = 1.asInstanceOf[`1`]
  
  /** All bits which are affected by this operation are set to 0. */
  inline def ZEROBITS: `2` = 2.asInstanceOf[`2`]
}
