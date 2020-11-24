package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to specify how an arithmetic date series is calculated.
  * @see com.sun.star.sheet.FillMode
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait FillDateMode extends js.Object
object FillDateMode {
  
  /** for every new value a single day is added. */
  @scala.inline
  def FILL_DATE_DAY: `0` = 0.asInstanceOf[`0`]
  
  /** for every new value one month is added (day keeps unchanged). */
  @scala.inline
  def FILL_DATE_MONTH: `2` = 2.asInstanceOf[`2`]
  
  /** for every new value a single day is added, but Saturdays and Sundays are skipped. */
  @scala.inline
  def FILL_DATE_WEEKDAY: `1` = 1.asInstanceOf[`1`]
  
  /** for every new value one year is added (day and month keep unchanged). */
  @scala.inline
  def FILL_DATE_YEAR: `3` = 3.asInstanceOf[`3`]
}
