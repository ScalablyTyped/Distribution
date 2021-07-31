package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies how information is sent to a program invoked by submitting a form. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait FormSubmitMethod extends StObject
object FormSubmitMethod {
  
  /** specifies to append the input information of a form to the target URL as parameters. */
  @scala.inline
  def GET: `0` = 0.asInstanceOf[`0`]
  
  /** specifies to send the input information in a data body. */
  @scala.inline
  def POST: `1` = 1.asInstanceOf[`1`]
}
