package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.container.XStringKeyMap
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
  val MarkupInfoContainer: XStringKeyMap
  /**
    * submits a new markup range.
    * @param nType Type of text markup see {@link TextMarkupType} .
    * @param aIdentifier A string used to identify the caller.
    * @param nStart Start of the markup range.
    * @param nLength Length of the markup range.
    * @param xMarkupInfoContainer contains additional information about the markup.
    */
  def commitStringMarkup(
    nType: Double,
    aIdentifier: String,
    nStart: Double,
    nLength: Double,
    xMarkupInfoContainer: XStringKeyMap
  ): Unit
  def commitTextRangeMarkup(nType: Double, aIdentifier: String, xRange: XTextRange, xMarkupInfoContainer: XStringKeyMap): Unit
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  def getMarkupInfoContainer(): XStringKeyMap
}

object XTextMarkup {
  @scala.inline
  def apply(
    MarkupInfoContainer: XStringKeyMap,
    commitStringMarkup: (Double, String, Double, Double, XStringKeyMap) => Unit,
    commitTextRangeMarkup: (Double, String, XTextRange, XStringKeyMap) => Unit,
    getMarkupInfoContainer: () => XStringKeyMap
  ): XTextMarkup = {
    val __obj = js.Dynamic.literal(MarkupInfoContainer = MarkupInfoContainer.asInstanceOf[js.Any], commitStringMarkup = js.Any.fromFunction5(commitStringMarkup), commitTextRangeMarkup = js.Any.fromFunction4(commitTextRangeMarkup), getMarkupInfoContainer = js.Any.fromFunction0(getMarkupInfoContainer))
    __obj.asInstanceOf[XTextMarkup]
  }
}

