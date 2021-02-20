package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MethodMode denotes the mode in which method calls are run, i.e. either oneway or twoway. Mode oneway denotes that a call may be run asynchronously
  * (thus having no out parameters or return value)
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait MethodMode extends StObject
object MethodMode {
  
  /** method may be run asynchronously */
  @scala.inline
  def ONEWAY: `0` = 0.asInstanceOf[`0`]
  
  /** method is run The */
  @scala.inline
  def TWOWAY: `1` = 1.asInstanceOf[`1`]
}
