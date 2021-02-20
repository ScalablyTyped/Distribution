package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The parameter mode denotes the transfer between caller and callee of a method. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ParamMode extends StObject
object ParamMode {
  
  /** parameter serves as pure input for a called method */
  @scala.inline
  def IN: `0` = 0.asInstanceOf[`0`]
  
  /** parameter serves as input as well as output; data can transferred in both directions */
  @scala.inline
  def INOUT: `2` = 2.asInstanceOf[`2`]
  
  /** parameter serves as pure output for the callee (in addition to the return value) */
  @scala.inline
  def OUT: `1` = 1.asInstanceOf[`1`]
}
