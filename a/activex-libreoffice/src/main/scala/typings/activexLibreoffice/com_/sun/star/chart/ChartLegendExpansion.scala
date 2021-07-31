package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies sizing aspects of the legend */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait ChartLegendExpansion extends StObject
object ChartLegendExpansion {
  
  /** The legend entries are arranged in a way that the aspect ratio of the resulting legend is as near to 1 as possible. */
  @scala.inline
  def BALANCED: `2` = 2.asInstanceOf[`2`]
  
  /** The size of the legend is given explicitly */
  @scala.inline
  def CUSTOM: `3` = 3.asInstanceOf[`3`]
  
  /**
    * The legend entries are stacked in a single column if possible. If not enough space is available further columns are added. <p>This is usually used for
    * legends that are displayed on the
    *
    * left or right hand side of the page.</p>
    */
  @scala.inline
  def HIGH: `1` = 1.asInstanceOf[`1`]
  
  /**
    * The legend entries are arranged in a single row if possible. If not enough space is available further rows are added. <p>This is usually used for
    * legends that are displayed at the
    *
    * top or bottom of the page.</p>
    */
  @scala.inline
  def WIDE: `0` = 0.asInstanceOf[`0`]
}
