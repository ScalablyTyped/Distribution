package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request specifies the mode in which the password for Microsoft Office file format encryption should be asked
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @since OOo 3.2
  */
trait DocumentMSPasswordRequest extends PasswordRequest {
  /** the name of the document (more properly, the URL of the document) */
  var Name: java.lang.String
}

