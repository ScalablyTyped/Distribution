package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to ...
  * @since OOo 3.0
  */
@js.native
trait XFlatParagraphIterator extends XInterface {
  /**
    * get the first flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  val FirstPara: XFlatParagraph = js.native
  /**
    * get the last flat paragraph
    * @returns the paragraph.
    */
  val LastPara: XFlatParagraph = js.native
  /**
    * get the next flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  val NextPara: XFlatParagraph = js.native
  /**
    * get the first flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  def getFirstPara(): XFlatParagraph = js.native
  /**
    * get the last flat paragraph
    * @returns the paragraph.
    */
  def getLastPara(): XFlatParagraph = js.native
  /**
    * get the next flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  def getNextPara(): XFlatParagraph = js.native
  /**
    * get the flat paragraph just following this one
    * @param xPara the current flat paragraph
    * @returns the flat paragraph.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getParaAfter(xPara: XFlatParagraph): XFlatParagraph = js.native
  /**
    * get the flat paragraph before this one
    * @param xPara the current flat paragraph
    * @returns the flat paragraph.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getParaBefore(xPara: XFlatParagraph): XFlatParagraph = js.native
}

object XFlatParagraphIterator {
  @scala.inline
  def apply(
    FirstPara: XFlatParagraph,
    LastPara: XFlatParagraph,
    NextPara: XFlatParagraph,
    acquire: () => Unit,
    getFirstPara: () => XFlatParagraph,
    getLastPara: () => XFlatParagraph,
    getNextPara: () => XFlatParagraph,
    getParaAfter: XFlatParagraph => XFlatParagraph,
    getParaBefore: XFlatParagraph => XFlatParagraph,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlatParagraphIterator = {
    val __obj = js.Dynamic.literal(FirstPara = FirstPara.asInstanceOf[js.Any], LastPara = LastPara.asInstanceOf[js.Any], NextPara = NextPara.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFirstPara = js.Any.fromFunction0(getFirstPara), getLastPara = js.Any.fromFunction0(getLastPara), getNextPara = js.Any.fromFunction0(getNextPara), getParaAfter = js.Any.fromFunction1(getParaAfter), getParaBefore = js.Any.fromFunction1(getParaBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFlatParagraphIterator]
  }
  @scala.inline
  implicit class XFlatParagraphIteratorOps[Self <: XFlatParagraphIterator] (val x: Self) extends AnyVal {
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
    def setFirstPara(value: XFlatParagraph): Self = this.set("FirstPara", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPara(value: XFlatParagraph): Self = this.set("LastPara", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPara(value: XFlatParagraph): Self = this.set("NextPara", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFirstPara(value: () => XFlatParagraph): Self = this.set("getFirstPara", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastPara(value: () => XFlatParagraph): Self = this.set("getLastPara", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNextPara(value: () => XFlatParagraph): Self = this.set("getNextPara", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParaAfter(value: XFlatParagraph => XFlatParagraph): Self = this.set("getParaAfter", js.Any.fromFunction1(value))
    @scala.inline
    def setGetParaBefore(value: XFlatParagraph => XFlatParagraph): Self = this.set("getParaBefore", js.Any.fromFunction1(value))
  }
  
}

