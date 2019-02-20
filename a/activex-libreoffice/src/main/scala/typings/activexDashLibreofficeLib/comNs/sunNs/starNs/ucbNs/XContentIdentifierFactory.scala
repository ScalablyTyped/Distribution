package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for content identifiers.
  * @author Kai Sommerfeld
  * @see XContentIdentifier
  * @version 1.0
  */
trait XContentIdentifierFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates an identifier.
    * @param ContentId the content identifier string.
    * @returns the identifier.
    */
  def createContentIdentifier(ContentId: java.lang.String): XContentIdentifier
}

