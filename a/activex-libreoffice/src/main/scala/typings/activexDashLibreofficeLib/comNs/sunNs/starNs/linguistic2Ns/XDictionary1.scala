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

object XDictionary1 {
  @scala.inline
  def apply(
    Count: scala.Double,
    DictionaryType: DictionaryType,
    Entries: activexDashInteropLib.SafeArray[XDictionaryEntry],
    Language: scala.Double,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    add: js.Function3[java.lang.String, scala.Boolean, java.lang.String, scala.Boolean],
    addDictionaryEventListener: js.Function1[XDictionaryEventListener, scala.Boolean],
    addEntry: js.Function1[XDictionaryEntry, scala.Boolean],
    clear: js.Function0[scala.Unit],
    getCount: js.Function0[scala.Double],
    getDictionaryType: js.Function0[DictionaryType],
    getEntries: js.Function0[activexDashInteropLib.SafeArray[XDictionaryEntry]],
    getEntry: js.Function1[java.lang.String, XDictionaryEntry],
    getLanguage: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    isActive: js.Function0[scala.Boolean],
    isFull: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[java.lang.String, scala.Boolean],
    removeDictionaryEventListener: js.Function1[XDictionaryEventListener, scala.Boolean],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setLanguage: js.Function1[scala.Double, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): XDictionary1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("DictionaryType")(DictionaryType)
    __obj.updateDynamic("Entries")(Entries)
    __obj.updateDynamic("Language")(Language)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addDictionaryEventListener")(addDictionaryEventListener)
    __obj.updateDynamic("addEntry")(addEntry)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getDictionaryType")(getDictionaryType)
    __obj.updateDynamic("getEntries")(getEntries)
    __obj.updateDynamic("getEntry")(getEntry)
    __obj.updateDynamic("getLanguage")(getLanguage)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isFull")(isFull)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeDictionaryEventListener")(removeDictionaryEventListener)
    __obj.updateDynamic("setActive")(setActive)
    __obj.updateDynamic("setLanguage")(setLanguage)
    __obj.updateDynamic("setName")(setName)
    __obj.asInstanceOf[XDictionary1]
  }
}

