package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify which operations are carried out when pasting cell values into a cell range. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait PasteOperation extends StObject
object PasteOperation {
  
  /** old and new values are added. */
  inline def ADD: `1` = 1.asInstanceOf[`1`]
  
  /** new values are divided by the new values. */
  inline def DIVIDE: `4` = 4.asInstanceOf[`4`]
  
  /** old and new values are multiplied. */
  inline def MULTIPLY: `3` = 3.asInstanceOf[`3`]
  
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** new values are subtracted from the old values. */
  inline def SUBTRACT: `2` = 2.asInstanceOf[`2`]
}
