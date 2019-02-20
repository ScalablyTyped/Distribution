package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XDictionary1
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  val Count: scala.Double
  val DictionaryType: DictionaryType
  val Entries: activexDashInteropLib.SafeArray[XDictionaryEntry]
  var Language: scala.Double
  def add(aWord: java.lang.String, bIsNegative: scala.Boolean, aRplcText: java.lang.String): scala.Boolean
  def addDictionaryEventListener(xListener: XDictionaryEventListener): scala.Boolean
  def addEntry(xDicEntry: XDictionaryEntry): scala.Boolean
  def clear(): scala.Unit
  def getCount(): scala.Double
  def getDictionaryType(): DictionaryType
  def getEntries(): activexDashInteropLib.SafeArray[XDictionaryEntry]
  def getEntry(aWord: java.lang.String): XDictionaryEntry
  def getLanguage(): scala.Double
  def isActive(): scala.Boolean
  def isFull(): scala.Boolean
  def remove(aWord: java.lang.String): scala.Boolean
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): scala.Boolean
  def setActive(bActivate: scala.Boolean): scala.Unit
  def setLanguage(nLang: scala.Double): scala.Unit
}

