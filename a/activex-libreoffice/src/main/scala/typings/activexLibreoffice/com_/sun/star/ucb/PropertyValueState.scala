package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the states of a property value in the process of obtaining the value (asynchronously).
  * @see PropertyValueInfo
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait PropertyValueState extends StObject
object PropertyValueState {
  
  /** The given property name/handle is invalid. */
  @scala.inline
  def INVALID_NAME: `2` = 2.asInstanceOf[`2`]
  
  /** The given property type is invalid. */
  @scala.inline
  def INVALID_TYPE: `3` = 3.asInstanceOf[`3`]
  
  /** The value was obtained. <p>The value is stored in PropertyValueInfo::Value. */
  @scala.inline
  def PROCESSED: `1` = 1.asInstanceOf[`1`]
  
  /** The property value was not obtained yet. */
  @scala.inline
  def UNPROCESSED: `0` = 0.asInstanceOf[`0`]
}
