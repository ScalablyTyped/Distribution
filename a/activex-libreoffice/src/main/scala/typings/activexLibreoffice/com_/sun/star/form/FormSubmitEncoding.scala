package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specify the MIME encoding to be used when form data is submitted. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait FormSubmitEncoding extends js.Object
object FormSubmitEncoding {
  
  /**
    * Specifies to use "multipart/form-data" as submit encoding.
    *
    * Usually used when the form contains a file upload element.
    */
  @scala.inline
  def MULTIPART: `1` = 1.asInstanceOf[`1`]
  
  /**
    * specifies to use "text/plain"
    *
    * Usually used if the FormSubmitMethod attribute has the value POST and the content should be reviewed as full text.
    */
  @scala.inline
  def TEXT: `2` = 2.asInstanceOf[`2`]
  
  /**
    * When the button is clicked, an URL set for the button is opened.
    * @see com.sun.star.form.component.CommandButton.TargetURL
    * @see com.sun.star.form.component.CommandButton.TargetFrame Specifies to use "application/x-www-form-urlencoded" as submit encoding.  Usually used if t
    */
  @scala.inline
  def URL: `0` = 0.asInstanceOf[`0`]
}
