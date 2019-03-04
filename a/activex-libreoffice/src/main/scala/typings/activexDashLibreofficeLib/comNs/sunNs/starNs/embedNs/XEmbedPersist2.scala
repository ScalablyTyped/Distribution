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
    acquire: js.Function0[scala.Unit],
    getEntryName: js.Function0[java.lang.String],
    hasEntry: js.Function0[scala.Boolean],
    isReadonly: js.Function0[scala.Boolean],
    isStored: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    saveCompleted: js.Function1[scala.Boolean, scala.Unit],
    setPersistentEntry: js.Function5[
      XStorage, 
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeAsEntry: js.Function4[
      XStorage, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeOwn: js.Function0[scala.Unit],
    storeToEntry: js.Function4[
      XStorage, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): XEmbedPersist2 = {
    val __obj = js.Dynamic.literal(EntryName = EntryName, acquire = acquire, getEntryName = getEntryName, hasEntry = hasEntry, isReadonly = isReadonly, isStored = isStored, queryInterface = queryInterface, release = release, reload = reload, saveCompleted = saveCompleted, setPersistentEntry = setPersistentEntry, storeAsEntry = storeAsEntry, storeOwn = storeOwn, storeToEntry = storeToEntry)
  
    __obj.asInstanceOf[XEmbedPersist2]
  }
}

