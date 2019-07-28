package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle in case package is broken.
  * @since OOo 1.1.2
  */
trait BrokenPackageRequest extends Exception {
  /** The name of the document that is broken */
  var aName: String
}

object BrokenPackageRequest {
  @scala.inline
  def apply(Context: XInterface, Message: String, aName: String): BrokenPackageRequest = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, aName = aName)
  
    __obj.asInstanceOf[BrokenPackageRequest]
  }
}

