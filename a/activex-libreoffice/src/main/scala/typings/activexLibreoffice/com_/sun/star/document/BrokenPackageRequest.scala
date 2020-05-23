package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], aName = aName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokenPackageRequest]
  }
}

