package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ConnectorType specifies the appearance of a connector. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait ConnectorType extends StObject
object ConnectorType {
  
  /** the {@link ConnectorShape} is drawn as a curve */
  @scala.inline
  def CURVE: `1` = 1.asInstanceOf[`1`]
  
  /**
    * the {@link ConnectorShape} is drawn as a straight line
    *
    * This is the PolygonKind for a {@link LineShape} .
    */
  @scala.inline
  def LINE: `2` = 2.asInstanceOf[`2`]
  
  /** the connector is drawn with three lines */
  @scala.inline
  def LINES: `3` = 3.asInstanceOf[`3`]
  
  /**
    * the graphic is rendered in the default color style of the output device,
    *
    * the connector is drawn with three lines, with the middle line perpendicular to the other two
    *
    * use the length measurement.
    */
  @scala.inline
  def STANDARD: `0` = 0.asInstanceOf[`0`]
}
