package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to markup text.
  * @since OOo 2.3
  */
trait XTextMarkup extends js.Object {
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  val MarkupInfoContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap
  /**
    * submits a new markup range.
    * @param nType Type of text markup see {@link TextMarkupType} .
    * @param aIdentifier A string used to identify the caller.
    * @param nStart Start of the markup range.
    * @param nLength Length of the markup range.
    * @param xMarkupInfoContainer contains additional information about the markup.
    */
  def commitStringMarkup(
    nType: scala.Double,
    aIdentifier: java.lang.String,
    nStart: scala.Double,
    nLength: scala.Double,
    xMarkupInfoContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap
  ): scala.Unit
  def commitTextRangeMarkup(
    nType: scala.Double,
    aIdentifier: java.lang.String,
    xRange: XTextRange,
    xMarkupInfoContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap
  ): scala.Unit
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  def getMarkupInfoContainer(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap
}

object XTextMarkup {
  @scala.inline
  def apply(
    MarkupInfoContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap,
    commitStringMarkup: (scala.Double, java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap) => scala.Unit,
    commitTextRangeMarkup: (scala.Double, java.lang.String, XTextRange, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap) => scala.Unit,
    getMarkupInfoContainer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap
  ): XTextMarkup = {
    val __obj = js.Dynamic.literal(MarkupInfoContainer = MarkupInfoContainer, commitStringMarkup = js.Any.fromFunction5(commitStringMarkup), commitTextRangeMarkup = js.Any.fromFunction4(commitTextRangeMarkup), getMarkupInfoContainer = js.Any.fromFunction0(getMarkupInfoContainer))
  
    __obj.asInstanceOf[XTextMarkup]
  }
}

