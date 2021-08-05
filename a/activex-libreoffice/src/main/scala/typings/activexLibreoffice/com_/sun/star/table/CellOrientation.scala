package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the orientation of a cell. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait CellOrientation extends StObject
object CellOrientation {
  
  /** contents are printed from bottom to top. */
  inline def BOTTOMTOP: `2` = 2.asInstanceOf[`2`]
  
  /** contents are printed from top to bottom with individual characters in normal (horizontal) orientation. */
  inline def STACKED: `3` = 3.asInstanceOf[`3`]
  
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  inline def STANDARD: `0` = 0.asInstanceOf[`0`]
  
  /** contents are printed from top to bottom. */
  inline def TOPBOTTOM: `1` = 1.asInstanceOf[`1`]
}
