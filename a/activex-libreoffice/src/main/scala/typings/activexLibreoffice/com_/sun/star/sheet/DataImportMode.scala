package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify which database contents are imported. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait DataImportMode extends StObject
object DataImportMode {
  
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
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** the name of a database query is supplied. */
  @scala.inline
  def QUERY: `3` = 3.asInstanceOf[`3`]
  
  /** a SQL query string is supplied. */
  @scala.inline
  def SQL: `1` = 1.asInstanceOf[`1`]
  
  /** the name of a database table is supplied. */
  @scala.inline
  def TABLE: `2` = 2.asInstanceOf[`2`]
}
