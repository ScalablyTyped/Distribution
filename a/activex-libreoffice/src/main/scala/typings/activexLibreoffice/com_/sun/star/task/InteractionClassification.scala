package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A classification of interaction requests.
  * @see com.sun.star.task.ClassifiedInteractionRequest This is the base of classified interaction requests.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait InteractionClassification extends js.Object
object InteractionClassification {
  
  /** An error. */
  @scala.inline
  def ERROR: `0` = 0.asInstanceOf[`0`]
  
  /** Some information for the client/user (which will typically lead to the selection of an {@link com.sun.star.task.XInteractionApprove} continuation). */
  @scala.inline
  def INFO: `2` = 2.asInstanceOf[`2`]
  
  /**
    * A query for the client/user (which will typically lead to the selection of an {@link com.sun.star.task.XInteractionApprove} or {@link
    * com.sun.star.task.XInteractionDisapprove} continuation).
    */
  @scala.inline
  def QUERY: `3` = 3.asInstanceOf[`3`]
  
  /** A warning, less severe than an error. */
  @scala.inline
  def WARNING: `1` = 1.asInstanceOf[`1`]
}
