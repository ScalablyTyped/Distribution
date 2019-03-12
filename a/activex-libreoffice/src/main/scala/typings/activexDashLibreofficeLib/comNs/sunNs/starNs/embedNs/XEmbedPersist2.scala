package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEmbedPersist2 extends XEmbedPersist {
  /** Checks whether or not the object has created its persistent representation counterpart of its in-memory model. */
  def isStored(): scala.Boolean
}

object XEmbedPersist2 {
  @scala.inline
  def apply(
    EntryName: java.lang.String,
    acquire: () => scala.Unit,
    getEntryName: () => java.lang.String,
    hasEntry: () => scala.Boolean,
    isReadonly: () => scala.Boolean,
    isStored: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reload: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    saveCompleted: scala.Boolean => scala.Unit,
    setPersistentEntry: (XStorage, java.lang.String, scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    storeAsEntry: (XStorage, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    storeOwn: () => scala.Unit,
    storeToEntry: (XStorage, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit
  ): XEmbedPersist2 = {
    val __obj = js.Dynamic.literal(EntryName = EntryName, acquire = js.Any.fromFunction0(acquire), getEntryName = js.Any.fromFunction0(getEntryName), hasEntry = js.Any.fromFunction0(hasEntry), isReadonly = js.Any.fromFunction0(isReadonly), isStored = js.Any.fromFunction0(isStored), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction2(reload), saveCompleted = js.Any.fromFunction1(saveCompleted), setPersistentEntry = js.Any.fromFunction5(setPersistentEntry), storeAsEntry = js.Any.fromFunction4(storeAsEntry), storeOwn = js.Any.fromFunction0(storeOwn), storeToEntry = js.Any.fromFunction4(storeToEntry))
  
    __obj.asInstanceOf[XEmbedPersist2]
  }
}

