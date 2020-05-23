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
trait XFlatParagraph extends XTextMarkup {
  /**
    * get a list of indexes that separate each two different languages
    * @returns a list of indices.
    */
  val LanguagePortions: SafeArray[Double]
  /**
    * get the content of the paragraph
    * @returns the content of the paragraph.
    */
  val Text: String
  /**
    * replace the attributes of the specific text with the given set of attributes.
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @param aAttributes the given set of attributes e.g. Language.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def changeAttributes(nPos: Double, nLen: Double, aAttributes: SeqEquiv[PropertyValue]): Unit
  /**
    * replace the specific text with new text.
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @param NewText new text.
    * @param aAttributes the given set of attributes e.g. Language
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def changeText(nPos: Double, nLen: Double, NewText: String, aAttributes: SeqEquiv[PropertyValue]): Unit
  /**
    * get the language of the specific text
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @returns the locale for the language identified. If no language could be identified, the locale will be empty.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def getLanguageOfText(nPos: Double, nLen: Double): Locale
  /**
    * get a list of indexes that separate each two different languages
    * @returns a list of indices.
    */
  def getLanguagePortions(): SafeArray[Double]
  /**
    * get the single most probable language of the specific text, especially after getLanguageOfText fails
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @returns the locale for the language identified.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def getPrimaryLanguageOfText(nPos: Double, nLen: Double): Locale
  /**
    * get the content of the paragraph
    * @returns the content of the paragraph.
    */
  def getText(): String
  /**
    * returns whether the respective text node has already been processed
    * @param nType type, see {@link TextMarkupType} .
    * @returns `TRUE` if the respective text node has been checked `FALSE` otherwise.
    */
  def isChecked(nType: Double): Boolean
  /**
    * check whether the content has been modified
    * @returns `TRUE` if the content has been modified, `FALSE` otherwise.
    */
  def isModified(): Boolean
  /**
    * change the "checked" flag of the respective text node, i.e., mark the text node as "processed"
    * @param nType type, see {@link TextMarkupType} .
    * @param bVal `TRUE` the respective text node has been processed `FALSE` the respective text node needs to be processed again later
    */
  def setChecked(nType: Double, bVal: Boolean): Unit
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
}

