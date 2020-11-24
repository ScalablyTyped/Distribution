package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ColorMode defines the output style of colors for a graphic. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait ColorMode extends js.Object
object ColorMode {
  
  /** the graphic is rendered in grayscale on the output device, */
  @scala.inline
  def GREYS: `1` = 1.asInstanceOf[`1`]
  
  /** the graphic is rendered in black and white only, */
  @scala.inline
  def MONO: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the graphic is rendered in the default color style of the output device,
    *
    * the connector is drawn with three lines, with the middle line perpendicular to the other two
    *
    * use the length measurement.
    */
  @scala.inline
  def STANDARD: `0` = 0.asInstanceOf[`0`]
  
  /** the graphic is rendered in a watermark like style, */
  @scala.inline
  def WATERMARK: `3` = 3.asInstanceOf[`3`]
}
