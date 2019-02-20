package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

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
  val LanguagePortions: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * get the content of the paragraph
    * @returns the content of the paragraph.
    */
  val Text: java.lang.String
  /**
    * replace the attributes of the specific text with the given set of attributes.
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @param aAttributes the given set of attributes e.g. Language.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def changeAttributes(
    nPos: scala.Double,
    nLen: scala.Double,
    aAttributes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * replace the specific text with new text.
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @param NewText new text.
    * @param aAttributes the given set of attributes e.g. Language
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def changeText(
    nPos: scala.Double,
    nLen: scala.Double,
    NewText: java.lang.String,
    aAttributes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * get the language of the specific text
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @returns the locale for the language identified. If no language could be identified, the locale will be empty.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def getLanguageOfText(nPos: scala.Double, nLen: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * get a list of indexes that separate each two different languages
    * @returns a list of indices.
    */
  def getLanguagePortions(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * get the single most probable language of the specific text, especially after getLanguageOfText fails
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @returns the locale for the language identified.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def getPrimaryLanguageOfText(nPos: scala.Double, nLen: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * get the content of the paragraph
    * @returns the content of the paragraph.
    */
  def getText(): java.lang.String
  /**
    * returns whether the respective text node has already been processed
    * @param nType type, see {@link TextMarkupType} .
    * @returns `TRUE` if the respective text node has been checked `FALSE` otherwise.
    */
  def isChecked(nType: scala.Double): scala.Boolean
  /**
    * check whether the content has been modified
    * @returns `TRUE` if the content has been modified, `FALSE` otherwise.
    */
  def isModified(): scala.Boolean
  /**
    * change the "checked" flag of the respective text node, i.e., mark the text node as "processed"
    * @param nType type, see {@link TextMarkupType} .
    * @param bVal `TRUE` the respective text node has been processed `FALSE` the respective text node needs to be processed again later
    */
  def setChecked(nType: scala.Double, bVal: scala.Boolean): scala.Unit
}

