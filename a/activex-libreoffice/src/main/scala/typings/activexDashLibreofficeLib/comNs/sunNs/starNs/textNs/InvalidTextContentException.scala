package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown whenever a method gets a {@link TextContent} as an actual argument when the text content cannot be used for that operation. */
trait InvalidTextContentException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the interface of the text content that caused the exception. */
  var TextContent: XTextContent
}

