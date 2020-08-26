package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEmbedPersist2 extends XEmbedPersist {
  /** Checks whether or not the object has created its persistent representation counterpart of its in-memory model. */
  def isStored(): Boolean = js.native
}

object XEmbedPersist2 {
  @scala.inline
  def apply(
    EntryName: String,
    acquire: () => Unit,
    getEntryName: () => String,
    hasEntry: () => Boolean,
    isReadonly: () => Boolean,
    isStored: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    saveCompleted: Boolean => Unit,
    setPersistentEntry: (XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    storeAsEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    storeOwn: () => Unit,
    storeToEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit
  ): XEmbedPersist2 = {
    val __obj = js.Dynamic.literal(EntryName = EntryName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEntryName = js.Any.fromFunction0(getEntryName), hasEntry = js.Any.fromFunction0(hasEntry), isReadonly = js.Any.fromFunction0(isReadonly), isStored = js.Any.fromFunction0(isStored), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction2(reload), saveCompleted = js.Any.fromFunction1(saveCompleted), setPersistentEntry = js.Any.fromFunction5(setPersistentEntry), storeAsEntry = js.Any.fromFunction4(storeAsEntry), storeOwn = js.Any.fromFunction0(storeOwn), storeToEntry = js.Any.fromFunction4(storeToEntry))
    __obj.asInstanceOf[XEmbedPersist2]
  }
  @scala.inline
  implicit class XEmbedPersist2Ops[Self <: XEmbedPersist2] (val x: Self) extends AnyVal {
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
    def setIsStored(value: () => Boolean): Self = this.set("isStored", js.Any.fromFunction0(value))
  }
  
}

