package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to manage and maintain a list of conversion dictionaries.
  *
  * The dictionaries added to the list may or may not support the {@link com.sun.star.util.XFlushable} interface. If they do those dictionaries have to be
  * flushed upon termination of the dictionary list.
  * @since OOo 1.1.2
  */
@js.native
trait XConversionDictionaryList extends XInterface {
  
  /** @returns the name container interface to the dictionaries in the list.  The interface can be used to add, remove or retrieve dictionaries from the list by */
  val DictionaryContainer: XNameContainer = js.native
  
  /**
    * creates a new dictionary and adds it to the dictionary list.
    *
    * The dictionary will be empty and active.
    * @param aName is the name of the dictionary (should be unique).
    * @param aLocale defines the language of the dictionary.
    * @param nConversionDictionaryType One of {@link com.sun.star.linguistic2.ConversionDictionaryType} values.
    * @returns an empty dictionary with the given name, locale and conversion type. `NULL` on failure.
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation.
    * @throws ElementExistException when a dictionary with the specified name already exists.
    */
  def addNewDictionary(aName: String, aLocale: Locale, nConversionDictionaryType: Double): XConversionDictionary = js.native
  
  /** @returns the name container interface to the dictionaries in the list.  The interface can be used to add, remove or retrieve dictionaries from the list by */
  def getDictionaryContainer(): XNameContainer = js.native
  
  /**
    * searches for entries that match the given text.
    *
    * All active dictionaries with matching locales and conversion type will be searched for entries matching the given text.
    *
    * The exact string to be looked for is the substring from the aText parameter that starts at position nStartPos and has the length nLength.
    * @param aText the text where the substring to be looked for will be taken from.
    * @param nStartPos the starting pos of the substring to be looked for.
    * @param nLength the length of the substring to be looked for.
    * @param aLocale Locale the conversion is referred to.
    * @param nConversionDictionaryType specifies the type of conversion the dictionary can be used for. It is one of {@link com.sun.star.linguistic2.Conversio
    * @param eDirection specifies the direction of the conversion to look for. It is one of {@link com.sun.star.linguistic2.ConversionDirection} .
    * @param nTextConversionOptions Combination of {@link com.sun.star.i18n.TextConversionOption} values.
    * @returns the list of entries found. If no entry was found, it is empty.
    * @throws com::sun::star::lang::IllegalArgumentException if the nTextConversionOptions parameter is invalid for the given locale.
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported (i.e. there are no
    */
  def queryConversions(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    aLocale: Locale,
    nConversionDictionaryType: Double,
    eDirection: ConversionDirection,
    nTextConversionOptions: Double
  ): SafeArray[String] = js.native
  
  /**
    * returns the maximum number of characters used as left or right text in entries.
    *
    * All active dictionaries of the specified locale and type will be looked up to get the result.
    *
    * The parameter eDirection specifies if only the left text or the right text from entries should be considered.
    * @param aLocale Locale the conversion is referred to.
    * @param nConversionDictionaryType specifies the type of conversion dictionaries to be looked up. It is one of {@link com.sun.star.linguistic2.ConversionD
    * @param eDirection specifies if the left text or the right text of entries will be used.
    * @see com.sun.star.linguistic2.ConversionDirection
    */
  def queryMaxCharCount(aLocale: Locale, nConversionDictionaryType: Double, eDirection: ConversionDirection): Double = js.native
}
object XConversionDictionaryList {
  
  @scala.inline
  def apply(
    DictionaryContainer: XNameContainer,
    acquire: () => Unit,
    addNewDictionary: (String, Locale, Double) => XConversionDictionary,
    getDictionaryContainer: () => XNameContainer,
    queryConversions: (String, Double, Double, Locale, Double, ConversionDirection, Double) => SafeArray[String],
    queryInterface: `type` => js.Any,
    queryMaxCharCount: (Locale, Double, ConversionDirection) => Double,
    release: () => Unit
  ): XConversionDictionaryList = {
    val __obj = js.Dynamic.literal(DictionaryContainer = DictionaryContainer.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNewDictionary = js.Any.fromFunction3(addNewDictionary), getDictionaryContainer = js.Any.fromFunction0(getDictionaryContainer), queryConversions = js.Any.fromFunction7(queryConversions), queryInterface = js.Any.fromFunction1(queryInterface), queryMaxCharCount = js.Any.fromFunction3(queryMaxCharCount), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConversionDictionaryList]
  }
  
  @scala.inline
  implicit class XConversionDictionaryListMutableBuilder[Self <: XConversionDictionaryList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNewDictionary(value: (String, Locale, Double) => XConversionDictionary): Self = StObject.set(x, "addNewDictionary", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDictionaryContainer(value: XNameContainer): Self = StObject.set(x, "DictionaryContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDictionaryContainer(value: () => XNameContainer): Self = StObject.set(x, "getDictionaryContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryConversions(value: (String, Double, Double, Locale, Double, ConversionDirection, Double) => SafeArray[String]): Self = StObject.set(x, "queryConversions", js.Any.fromFunction7(value))
    
    @scala.inline
    def setQueryMaxCharCount(value: (Locale, Double, ConversionDirection) => Double): Self = StObject.set(x, "queryMaxCharCount", js.Any.fromFunction3(value))
  }
}
