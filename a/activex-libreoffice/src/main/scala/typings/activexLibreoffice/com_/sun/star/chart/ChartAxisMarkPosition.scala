package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the position of the axis interval marks. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait ChartAxisMarkPosition extends StObject
object ChartAxisMarkPosition {
  
  /**
    * The interval marks are drawn at the axis line. This makes a difference to "AT_LABELS" only when the labels are not placed near the axis (
    * @see ChartAxisLabelPosition).
    */
  inline def AT_AXIS: `1` = 1.asInstanceOf[`1`]
  
  /** The interval marks are drawn besides the axis labels. */
  inline def AT_LABELS: `0` = 0.asInstanceOf[`0`]
  
  /**
    * Interval marks are drawn at the axis line and also besides the axis labels. This makes a difference to "AT_LABELS" only when the labels are not placed
    * near the axis (
    * @see ChartAxisLabelPosition).
    */
  inline def AT_LABELS_AND_AXIS: `2` = 2.asInstanceOf[`2`]
}
