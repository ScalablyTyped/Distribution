package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is used to indicate that there are properties missing.
  *
  * For example, to create a new resource, usually one ore more property values must be set prior to executing the command "insert", which makes the new
  * resource persistent.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
trait MissingPropertiesException extends Exception {
  /** contains the names of the missing properties. */
  var Properties: SafeArray[String]
}

object MissingPropertiesException {
  @scala.inline
  def apply(Context: XInterface, Message: String, Properties: SafeArray[String]): MissingPropertiesException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, Properties = Properties)
  
    __obj.asInstanceOf[MissingPropertiesException]
  }
}

