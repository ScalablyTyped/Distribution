package typings.activexLibreoffice.com_.sun.star.scanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a scanner context is an identifier for a specific scanner device */
trait ScannerContext extends js.Object {
  /** InternalData contains service private data and must not be changed */
  var InternalData: Double
  /** ScannerName contains a user readable identification */
  var ScannerName: String
}

object ScannerContext {
  @scala.inline
  def apply(InternalData: Double, ScannerName: String): ScannerContext = {
    val __obj = js.Dynamic.literal(InternalData = InternalData.asInstanceOf[js.Any], ScannerName = ScannerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannerContext]
  }
}

