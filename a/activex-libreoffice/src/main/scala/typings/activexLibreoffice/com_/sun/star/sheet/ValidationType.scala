package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import typings.activexLibreoffice.activexLibreofficeInts.`5`
import typings.activexLibreoffice.activexLibreofficeInts.`6`
import typings.activexLibreoffice.activexLibreofficeInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify which cell contents are treated as valid. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`7`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`6`
  - typings.activexLibreoffice.activexLibreofficeInts.`5`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait ValidationType extends StObject
object ValidationType {
  
  /** any cell content is valid; no conditions are used. */
  inline def ANY: `0` = 0.asInstanceOf[`0`]
  
  /** The specified formula determines which contents are valid. */
  inline def CUSTOM: `7` = 7.asInstanceOf[`7`]
  
  /**
    * specifies an arithmetic series for date values. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by a specified number of days</p>
    * @see com::sun::star::sheet::FillDateMode  any date value matching the specified condition is valid.
    */
  inline def DATE: `3` = 3.asInstanceOf[`3`]
  
  /** any number matching the specified condition is valid. */
  inline def DECIMAL: `2` = 2.asInstanceOf[`2`]
  
  /** Only strings from a specified list are valid. */
  inline def LIST: `6` = 6.asInstanceOf[`6`]
  
  /** string is valid if its length matches the specified condition. */
  inline def TEXT_LEN: `5` = 5.asInstanceOf[`5`]
  
  /** any time value matching the specified condition is valid. */
  inline def TIME: `4` = 4.asInstanceOf[`4`]
  
  /** any whole number matching the specified condition is valid. */
  inline def WHOLE: `1` = 1.asInstanceOf[`1`]
}
