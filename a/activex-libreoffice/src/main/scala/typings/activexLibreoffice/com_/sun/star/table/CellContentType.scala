package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to determine the type of contents in a cell. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait CellContentType extends js.Object
object CellContentType {
  
  /** cell is empty. */
  @scala.inline
  def EMPTY: `0` = 0.asInstanceOf[`0`]
  
  /** cell contains a formula. */
  @scala.inline
  def FORMULA: `3` = 3.asInstanceOf[`3`]
  
  /** cell contains text. */
  @scala.inline
  def TEXT: `2` = 2.asInstanceOf[`2`]
  
  /** cell contains a constant value. */
  @scala.inline
  def VALUE: `1` = 1.asInstanceOf[`1`]
}
