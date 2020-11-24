package typings.activexLibreoffice.com_.sun.star.registry

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows access to a registry (a persistent data source). The data is stored in a hierarchical key structure beginning with a root key. Each key can
  * store a value and can have multiple subkeys.
  * @see XRegistryKey
  */
@js.native
trait XSimpleRegistry extends XInterface {
  
  /**
    * @returns the root key of the registry.
    * @throws InvalidRegistryException if no registry is open
    */
  val RootKey: XRegistryKey = js.native
  
  /** returns the URL of the current data source of the registry. */
  val URL: String = js.native
  
  /**
    * disconnects the registry from the data-source.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def close(): Unit = js.native
  
  /**
    * destroys the registry and the data source.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def destroy(): Unit = js.native
  
  /**
    * @returns the root key of the registry.
    * @throws InvalidRegistryException if no registry is open
    */
  def getRootKey(): XRegistryKey = js.native
  
  /** returns the URL of the current data source of the registry. */
  def getURL(): String = js.native
  
  /**
    * checks if the registry is readonly.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def isReadOnly(): Boolean = js.native
  
  /** checks if the registry points to a valid data-source. */
  def isValid(): Boolean = js.native
  
  /**
    * DEPRECATED: this method lacks a registry key (better than a URL).
    *
    * merges a registry under the specified key.
    *
    * If the key does not exist it will be created. Existing keys will be overridden from keys of registry specified by **aUrl** .
    * @throws InvalidRegistryException if the registry is not open.
    * @throws MergeConflictException if any differences occur during merging
    */
  def mergeKey(aKeyName: String, aUrl: String): Unit = js.native
  
  /**
    * connects the registry to a persistent data source represented by an URL.
    *
    * If a local registry is already open, this function will close the currently open registry.
    * @param rURL specifies the complete URL to access the data source.
    * @param bReadOnly specifies if the data source should be opened for read only.
    * @param bCreate specifies if the data source should be created if it does not already exist.
    * @throws InvalidRegistryException if the registry does not exist.
    */
  def open(rURL: String, bReadOnly: Boolean, bCreate: Boolean): Unit = js.native
}
object XSimpleRegistry {
  
  @scala.inline
  def apply(
    RootKey: XRegistryKey,
    URL: String,
    acquire: () => Unit,
    close: () => Unit,
    destroy: () => Unit,
    getRootKey: () => XRegistryKey,
    getURL: () => String,
    isReadOnly: () => Boolean,
    isValid: () => Boolean,
    mergeKey: (String, String) => Unit,
    open: (String, Boolean, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSimpleRegistry = {
    val __obj = js.Dynamic.literal(RootKey = RootKey.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), getRootKey = js.Any.fromFunction0(getRootKey), getURL = js.Any.fromFunction0(getURL), isReadOnly = js.Any.fromFunction0(isReadOnly), isValid = js.Any.fromFunction0(isValid), mergeKey = js.Any.fromFunction2(mergeKey), open = js.Any.fromFunction3(open), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSimpleRegistry]
  }
  
  @scala.inline
  implicit class XSimpleRegistryOps[Self <: XSimpleRegistry] (val x: Self) extends AnyVal {
    
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
    def setRootKey(value: XRegistryKey): Self = this.set("RootKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootKey(value: () => XRegistryKey): Self = this.set("getRootKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURL(value: () => String): Self = this.set("getURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMergeKey(value: (String, String) => Unit): Self = this.set("mergeKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpen(value: (String, Boolean, Boolean) => Unit): Self = this.set("open", js.Any.fromFunction3(value))
  }
}
