package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a content provider which creates and manages XContents.
  * @author Kai Sommerfeld
  * @see XContent
  * @see XContentIdentifier
  * @version 1.0
  */
trait XContentProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * compares two XContentIdentifiers.
    * @param Id1 first content identifier.
    * @param Id2 second content identifier.
    * @returns `0` is returned, if the identifiers are equal. A value less than `0` indicates, that the Id1 is less than Id2. A value greater than `0` is return
    */
  def compareContentIds(Id1: XContentIdentifier, Id2: XContentIdentifier): scala.Double
  /**
    * creates a new {@link XContent} instance, if the given {@link XContentIdentifier} matches a content provided by the implementation of this interface.
    * @param Identifier an identifier for the content to query.
    * @returns the content.
    * @throws IllegalIdentifierException if the given identifier does not match a content provided by the implementation of this interface
    */
  def queryContent(Identifier: XContentIdentifier): XContent
}

object XContentProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    compareContentIds: js.Function2[XContentIdentifier, XContentIdentifier, scala.Double],
    queryContent: js.Function1[XContentIdentifier, XContent],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContentProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("compareContentIds")(compareContentIds)
    __obj.updateDynamic("queryContent")(queryContent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XContentProvider]
  }
}

