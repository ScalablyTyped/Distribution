package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to markup text.
  * @since OOo 2.3
  */
@js.native
trait XTextMarkup extends js.Object {
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  val MarkupInfoContainer: XStringKeyMap = js.native
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
  ): Unit = js.native
  def commitTextRangeMarkup(nType: Double, aIdentifier: String, xRange: XTextRange, xMarkupInfoContainer: XStringKeyMap): Unit = js.native
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  def getMarkupInfoContainer(): XStringKeyMap = js.native
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
  @scala.inline
  implicit class XTextMarkupOps[Self <: XTextMarkup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMarkupInfoContainer(value: XStringKeyMap): Self = this.set("MarkupInfoContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitStringMarkup(value: (Double, String, Double, Double, XStringKeyMap) => Unit): Self = this.set("commitStringMarkup", js.Any.fromFunction5(value))
    @scala.inline
    def setCommitTextRangeMarkup(value: (Double, String, XTextRange, XStringKeyMap) => Unit): Self = this.set("commitTextRangeMarkup", js.Any.fromFunction4(value))
    @scala.inline
    def setGetMarkupInfoContainer(value: () => XStringKeyMap): Self = this.set("getMarkupInfoContainer", js.Any.fromFunction0(value))
  }
  
}

