package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to determine the type of contents in a cell. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait CellContentType extends StObject
object CellContentType {
  
  /** cell is empty. */
  inline def EMPTY: `0` = 0.asInstanceOf[`0`]
  
  /** cell contains a formula. */
  inline def FORMULA: `3` = 3.asInstanceOf[`3`]
  
  /** cell contains text. */
  inline def TEXT: `2` = 2.asInstanceOf[`2`]
  
  /** cell contains a constant value. */
  inline def VALUE: `1` = 1.asInstanceOf[`1`]
}
