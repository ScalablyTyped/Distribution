package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify where a field in a data pilot table is laid out. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait DataPilotFieldOrientation extends StObject
object DataPilotFieldOrientation {
  
  /**
    * the field is used as a column field.
    *
    * is applied to the columns. <p>In this mode, the column contains values and the row
    *
    * contains formulas.</p>
    */
  inline def COLUMN: `1` = 1.asInstanceOf[`1`]
  
  /** the field is used as a data field. */
  inline def DATA: `4` = 4.asInstanceOf[`4`]
  
  /** the field is not used in the table. */
  inline def HIDDEN: `0` = 0.asInstanceOf[`0`]
  
  /** the field is used as a page field. */
  inline def PAGE: `3` = 3.asInstanceOf[`3`]
  
  /**
    * the field is used as a row field.
    *
    * is applied to the rows. <p>In this mode, the row contains values and the column
    *
    * contains formulas.</p>
    */
  inline def ROW: `2` = 2.asInstanceOf[`2`]
}
