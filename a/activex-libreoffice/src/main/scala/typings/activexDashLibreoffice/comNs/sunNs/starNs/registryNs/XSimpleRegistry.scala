package typings.activexDashLibreoffice.comNs.sunNs.starNs.registryNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to a registry (a persistent data source). The data is stored in a hierarchical key structure beginning with a root key. Each key can
  * store a value and can have multiple subkeys.
  * @see XRegistryKey
  */
trait XSimpleRegistry extends XInterface {
  /**
    * @returns the root key of the registry.
    * @throws InvalidRegistryException if no registry is open
    */
  val RootKey: XRegistryKey
  /** returns the URL of the current data source of the registry. */
  val URL: String
  /**
    * disconnects the registry from the data-source.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def close(): Unit
  /**
    * destroys the registry and the data source.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def destroy(): Unit
  /**
    * @returns the root key of the registry.
    * @throws InvalidRegistryException if no registry is open
    */
  def getRootKey(): XRegistryKey
  /** returns the URL of the current data source of the registry. */
  def getURL(): String
  /**
    * checks if the registry is readonly.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def isReadOnly(): Boolean
  /** checks if the registry points to a valid data-source. */
  def isValid(): Boolean
  /**
    * DEPRECATED: this method lacks a registry key (better than a URL).
    *
    * merges a registry under the specified key.
    *
    * If the key does not exist it will be created. Existing keys will be overridden from keys of registry specified by **aUrl** .
    * @throws InvalidRegistryException if the registry is not open.
    * @throws MergeConflictException if any differences occur during merging
    */
  def mergeKey(aKeyName: String, aUrl: String): Unit
  /**
    * connects the registry to a persistent data source represented by an URL.
    *
    * If a local registry is already open, this function will close the currently open registry.
    * @param rURL specifies the complete URL to access the data source.
    * @param bReadOnly specifies if the data source should be opened for read only.
    * @param bCreate specifies if the data source should be created if it does not already exist.
    * @throws InvalidRegistryException if the registry does not exist.
    */
  def open(rURL: String, bReadOnly: Boolean, bCreate: Boolean): Unit
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
    val __obj = js.Dynamic.literal(RootKey = RootKey, URL = URL, acquire = js.Any.fromFunction0(acquire), close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), getRootKey = js.Any.fromFunction0(getRootKey), getURL = js.Any.fromFunction0(getURL), isReadOnly = js.Any.fromFunction0(isReadOnly), isValid = js.Any.fromFunction0(isValid), mergeKey = js.Any.fromFunction2(mergeKey), open = js.Any.fromFunction3(open), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSimpleRegistry]
  }
}

