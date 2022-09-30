package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration specifies the type of a drawing layer. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait LayerType extends StObject
object LayerType {
  
  /** This is the layer for the controls. */
  inline def CONTROLSA: `1` = 1.asInstanceOf[`1`]
  
  /** This is the layer for all measure shapes. */
  inline def DIMENSIONIANG_LINES: `2` = 2.asInstanceOf[`2`]
  
  /** This is the layer for all standard shapes. */
  inline def LAYOUT: `0` = 0.asInstanceOf[`0`]
  
  /** There can be zero or more layers of this type. */
  inline def USER_DEFINED: `3` = 3.asInstanceOf[`3`]
}
