package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration specifies the type of a drawing layer. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait LayerType extends js.Object
object LayerType {
  
  /** This is the layer for the controls. */
  @scala.inline
  def CONTROLSA: `1` = 1.asInstanceOf[`1`]
  
  /** This is the layer for all measure shapes. */
  @scala.inline
  def DIMENSIONIANG_LINES: `2` = 2.asInstanceOf[`2`]
  
  /** This is the layer for all standard shapes. */
  @scala.inline
  def LAYOUT: `0` = 0.asInstanceOf[`0`]
  
  /** There can be zero or more layers of this type. */
  @scala.inline
  def USER_DEFINED: `3` = 3.asInstanceOf[`3`]
}
