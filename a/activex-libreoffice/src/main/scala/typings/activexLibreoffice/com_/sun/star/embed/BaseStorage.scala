package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a service that allows to get access to a storage hierarchy. */
@js.native
trait BaseStorage
  extends XStorage
     with XPropertySet {
  
  /**
    * allows to get the mode the storage is opened in.
    *
    * Can be a combination of values from {@link ElementModes} .
    */
  var OpenMode: Double = js.native
  
  /** allows to retrieve URL the storage is based on. */
  var URL: String = js.native
}
object BaseStorage {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    OpenMode: Double,
    PropertySetInfo: XPropertySetInfo,
    URL: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    cloneEncryptedStreamElement: (String, String) => XStream,
    cloneStreamElement: String => XStream,
    copyElementTo: (String, XStorage, String) => Unit,
    copyLastCommitTo: XStorage => Unit,
    copyStorageElementLastCommitTo: (String, XStorage) => Unit,
    copyToStorage: XStorage => Unit,
    dispose: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isStorageElement: String => Boolean,
    isStreamElement: String => Boolean,
    moveElementTo: (String, XStorage, String) => Unit,
    openEncryptedStreamElement: (String, Double, String) => XStream,
    openStorageElement: (String, Double) => XStorage,
    openStreamElement: (String, Double) => XStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeElement: String => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    renameElement: (String, String) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): BaseStorage = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], OpenMode = OpenMode.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), copyElementTo = js.Any.fromFunction3(copyElementTo), copyLastCommitTo = js.Any.fromFunction1(copyLastCommitTo), copyStorageElementLastCommitTo = js.Any.fromFunction2(copyStorageElementLastCommitTo), copyToStorage = js.Any.fromFunction1(copyToStorage), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3(moveElementTo), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeElement = js.Any.fromFunction1(removeElement), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), renameElement = js.Any.fromFunction2(renameElement), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[BaseStorage]
  }
  
  @scala.inline
  implicit class BaseStorageOps[Self <: BaseStorage] (val x: Self) extends AnyVal {
    
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
    def setOpenMode(value: Double): Self = this.set("OpenMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
}
