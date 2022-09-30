package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Mode used for a pie chart template to determine the initial state of exploded pies. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait PieChartOffsetMode extends StObject
object PieChartOffsetMode {
  
  /** All pies are exploded by a certain percentage. The default is 10 percent. */
  inline def ALL_EXPLODED: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
}
