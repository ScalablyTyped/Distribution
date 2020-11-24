package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the position of the axis on the scale of the crossing axis. When the property is set at a x-axis it indicates a position on the scale of the
  * primary y-axis. When the property is set at a y-axis it indicates a position on the scale of the primary x-axis.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait ChartAxisPosition extends js.Object
object ChartAxisPosition {
  
  /** Cross the other axes at their maximum scale value. */
  @scala.inline
  def END: `2` = 2.asInstanceOf[`2`]
  
  /** Cross the other axes at their minimum scale value. */
  @scala.inline
  def START: `1` = 1.asInstanceOf[`1`]
  
  /** Cross the other axes at the value specified in the property CrossoverValue. */
  @scala.inline
  def VALUE: `3` = 3.asInstanceOf[`3`]
  
  /** Cross the other axes at zero. If zero is not contained in the current scale the value is used which is nearest to zero. */
  @scala.inline
  def ZERO: `0` = 0.asInstanceOf[`0`]
}
