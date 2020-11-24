package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides locale-sensitive collation algorithms for string comparison. */
@js.native
trait XCollator extends XInterface {
  
  /**
    * Compare 2 strings in specific locale and algorithm.
    * @param aStr1 First string.
    * @param aStr2 Second string.
    * @returns 1 if the first string is greater than the second string ;  0 if the first string is equal to the second string ;  -1 if the first string is less
    */
  def compareString(aStr1: String, aStr2: String): Double = js.native
  
  /**
    * Compare 2 substrings in specific locale and algorithm.
    * @param aStr1 First string.
    * @param nOff1 Offset (from 0) of the first string.
    * @param nLen1 Length (from offset) of the first substring.
    * @param aStr2 Second string
    * @param nOff2 Offset (from 0) of the second string.
    * @param nLen2 Length (from offset) of the second substring.
    * @returns 1 if the first string is greater than the second string ;  0 if the first string is equal to the second string ;  -1 if the first string is less
    */
  def compareSubstring(aStr1: String, nOff1: Double, nLen1: Double, aStr2: String, nOff2: Double, nLen2: Double): Double = js.native
  
  /**
    * List all collator algorithms for a given locale.
    * @param aLocale The locale for which to list algorithms.
    * @returns A sequence of algorithm names.
    */
  def listCollatorAlgorithms(aLocale: Locale): SafeArray[String] = js.native
  
  /**
    * List all end user collator options for a given algorithm.
    * @param aAlgorithmName The algorithm name for this collator.
    * @returns An array of end user options available for the algorithm.
    */
  def listCollatorOptions(aAlgorithmName: String): SafeArray[Double] = js.native
  
  /**
    * Load a particular collator algorithm for the locale.
    * @param aAlgorithmName The algorithm to load.
    * @param aLocale The locale for this collator.
    * @param nCollatorOptions A mask of {@link CollatorOptions} .
    * @returns Returns 0 when loading was successful, otherwise throws runtime exception.
    */
  def loadCollatorAlgorithm(aAlgorithmName: String, aLocale: Locale, nCollatorOptions: Double): Double = js.native
  
  /**
    * Load a collator algorithm with options chosen by end user.
    * @param aAlgorithmName The algorithm name to load.
    * @param aLocale The locale for this collator.
    * @param aCollatorOptions A sequence of end user collator options like those returned by {@link XCollator.listCollatorOptions()} .
    */
  def loadCollatorAlgorithmWithEndUserOption(aAlgorithmName: String, aLocale: Locale, aCollatorOptions: SeqEquiv[Double]): Unit = js.native
  
  /**
    * Load the collator with default algorithm defined in locale data.
    * @param aLocale The locale for this collator.
    * @param nCollatorOptions A mask of {@link CollatorOptions} .
    * @returns Returns 0 when loading was successful, otherwise throws runtime exception. In fact the return value should be ignored and the exception be caught
    */
  def loadDefaultCollator(aLocale: Locale, nCollatorOptions: Double): Double = js.native
}
object XCollator {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    compareString: (String, String) => Double,
    compareSubstring: (String, Double, Double, String, Double, Double) => Double,
    listCollatorAlgorithms: Locale => SafeArray[String],
    listCollatorOptions: String => SafeArray[Double],
    loadCollatorAlgorithm: (String, Locale, Double) => Double,
    loadCollatorAlgorithmWithEndUserOption: (String, Locale, SeqEquiv[Double]) => Unit,
    loadDefaultCollator: (Locale, Double) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCollator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareString = js.Any.fromFunction2(compareString), compareSubstring = js.Any.fromFunction6(compareSubstring), listCollatorAlgorithms = js.Any.fromFunction1(listCollatorAlgorithms), listCollatorOptions = js.Any.fromFunction1(listCollatorOptions), loadCollatorAlgorithm = js.Any.fromFunction3(loadCollatorAlgorithm), loadCollatorAlgorithmWithEndUserOption = js.Any.fromFunction3(loadCollatorAlgorithmWithEndUserOption), loadDefaultCollator = js.Any.fromFunction2(loadDefaultCollator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCollator]
  }
  
  @scala.inline
  implicit class XCollatorOps[Self <: XCollator] (val x: Self) extends AnyVal {
    
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
    def setCompareString(value: (String, String) => Double): Self = this.set("compareString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompareSubstring(value: (String, Double, Double, String, Double, Double) => Double): Self = this.set("compareSubstring", js.Any.fromFunction6(value))
    
    @scala.inline
    def setListCollatorAlgorithms(value: Locale => SafeArray[String]): Self = this.set("listCollatorAlgorithms", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListCollatorOptions(value: String => SafeArray[Double]): Self = this.set("listCollatorOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadCollatorAlgorithm(value: (String, Locale, Double) => Double): Self = this.set("loadCollatorAlgorithm", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLoadCollatorAlgorithmWithEndUserOption(value: (String, Locale, SeqEquiv[Double]) => Unit): Self = this.set("loadCollatorAlgorithmWithEndUserOption", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLoadDefaultCollator(value: (Locale, Double) => Double): Self = this.set("loadDefaultCollator", js.Any.fromFunction2(value))
  }
}
