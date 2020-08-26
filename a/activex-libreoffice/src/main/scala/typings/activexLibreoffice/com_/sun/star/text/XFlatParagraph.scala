package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to ...
  * @since OOo 3.0
  */
@js.native
trait XFlatParagraph extends XTextMarkup {
  /**
    * get a list of indexes that separate each two different languages
    * @returns a list of indices.
    */
  val LanguagePortions: SafeArray[Double] = js.native
  /**
    * get the content of the paragraph
    * @returns the content of the paragraph.
    */
  val Text: String = js.native
  /**
    * replace the attributes of the specific text with the given set of attributes.
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @param aAttributes the given set of attributes e.g. Language.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def changeAttributes(nPos: Double, nLen: Double, aAttributes: SeqEquiv[PropertyValue]): Unit = js.native
  /**
    * replace the specific text with new text.
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @param NewText new text.
    * @param aAttributes the given set of attributes e.g. Language
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def changeText(nPos: Double, nLen: Double, NewText: String, aAttributes: SeqEquiv[PropertyValue]): Unit = js.native
  /**
    * get the language of the specific text
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @returns the locale for the language identified. If no language could be identified, the locale will be empty.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def getLanguageOfText(nPos: Double, nLen: Double): Locale = js.native
  /**
    * get a list of indexes that separate each two different languages
    * @returns a list of indices.
    */
  def getLanguagePortions(): SafeArray[Double] = js.native
  /**
    * get the single most probable language of the specific text, especially after getLanguageOfText fails
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @returns the locale for the language identified.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def getPrimaryLanguageOfText(nPos: Double, nLen: Double): Locale = js.native
  /**
    * get the content of the paragraph
    * @returns the content of the paragraph.
    */
  def getText(): String = js.native
  /**
    * returns whether the respective text node has already been processed
    * @param nType type, see {@link TextMarkupType} .
    * @returns `TRUE` if the respective text node has been checked `FALSE` otherwise.
    */
  def isChecked(nType: Double): Boolean = js.native
  /**
    * check whether the content has been modified
    * @returns `TRUE` if the content has been modified, `FALSE` otherwise.
    */
  def isModified(): Boolean = js.native
  /**
    * change the "checked" flag of the respective text node, i.e., mark the text node as "processed"
    * @param nType type, see {@link TextMarkupType} .
    * @param bVal `TRUE` the respective text node has been processed `FALSE` the respective text node needs to be processed again later
    */
  def setChecked(nType: Double, bVal: Boolean): Unit = js.native
}

object XFlatParagraph {
  @scala.inline
  def apply(
    LanguagePortions: SafeArray[Double],
    MarkupInfoContainer: XStringKeyMap,
    Text: String,
    changeAttributes: (Double, Double, SeqEquiv[PropertyValue]) => Unit,
    changeText: (Double, Double, String, SeqEquiv[PropertyValue]) => Unit,
    commitStringMarkup: (Double, String, Double, Double, XStringKeyMap) => Unit,
    commitTextRangeMarkup: (Double, String, XTextRange, XStringKeyMap) => Unit,
    getLanguageOfText: (Double, Double) => Locale,
    getLanguagePortions: () => SafeArray[Double],
    getMarkupInfoContainer: () => XStringKeyMap,
    getPrimaryLanguageOfText: (Double, Double) => Locale,
    getText: () => String,
    isChecked: Double => Boolean,
    isModified: () => Boolean,
    setChecked: (Double, Boolean) => Unit
  ): XFlatParagraph = {
    val __obj = js.Dynamic.literal(LanguagePortions = LanguagePortions.asInstanceOf[js.Any], MarkupInfoContainer = MarkupInfoContainer.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], changeAttributes = js.Any.fromFunction3(changeAttributes), changeText = js.Any.fromFunction4(changeText), commitStringMarkup = js.Any.fromFunction5(commitStringMarkup), commitTextRangeMarkup = js.Any.fromFunction4(commitTextRangeMarkup), getLanguageOfText = js.Any.fromFunction2(getLanguageOfText), getLanguagePortions = js.Any.fromFunction0(getLanguagePortions), getMarkupInfoContainer = js.Any.fromFunction0(getMarkupInfoContainer), getPrimaryLanguageOfText = js.Any.fromFunction2(getPrimaryLanguageOfText), getText = js.Any.fromFunction0(getText), isChecked = js.Any.fromFunction1(isChecked), isModified = js.Any.fromFunction0(isModified), setChecked = js.Any.fromFunction2(setChecked))
    __obj.asInstanceOf[XFlatParagraph]
  }
  @scala.inline
  implicit class XFlatParagraphOps[Self <: XFlatParagraph] (val x: Self) extends AnyVal {
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
    def setLanguagePortions(value: SafeArray[Double]): Self = this.set("LanguagePortions", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeAttributes(value: (Double, Double, SeqEquiv[PropertyValue]) => Unit): Self = this.set("changeAttributes", js.Any.fromFunction3(value))
    @scala.inline
    def setChangeText(value: (Double, Double, String, SeqEquiv[PropertyValue]) => Unit): Self = this.set("changeText", js.Any.fromFunction4(value))
    @scala.inline
    def setGetLanguageOfText(value: (Double, Double) => Locale): Self = this.set("getLanguageOfText", js.Any.fromFunction2(value))
    @scala.inline
    def setGetLanguagePortions(value: () => SafeArray[Double]): Self = this.set("getLanguagePortions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPrimaryLanguageOfText(value: (Double, Double) => Locale): Self = this.set("getPrimaryLanguageOfText", js.Any.fromFunction2(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setIsChecked(value: Double => Boolean): Self = this.set("isChecked", js.Any.fromFunction1(value))
    @scala.inline
    def setIsModified(value: () => Boolean): Self = this.set("isModified", js.Any.fromFunction0(value))
    @scala.inline
    def setSetChecked(value: (Double, Boolean) => Unit): Self = this.set("setChecked", js.Any.fromFunction2(value))
  }
  
}

