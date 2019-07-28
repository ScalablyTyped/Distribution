package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.providerNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface is used to help transform Scripting Framework storage locations to Scripting Framework script URIs and vice versa. */
trait XScriptURIHelper extends XInterface {
  /**
    * Obtain the root storage URI for this {@link ScriptURIHelper} . The resulting string can be used to access the storage for this using the Universal
    * Content Broker
    * @returns a URI to the storage as a `string`
    */
  val RootStorageURI: String
  /**
    * Obtain the root storage URI for this {@link ScriptURIHelper} . The resulting string can be used to access the storage for this using the Universal
    * Content Broker
    * @returns a URI to the storage as a `string`
    */
  def getRootStorageURI(): String
  /**
    * Obtain the Scripting Framework script URI for a specific UCB URI
    * @returns the URI as a `string`
    * @throws com::sun::star::lang::IllegalArgumentException if the storageURI is not a valid
    */
  def getScriptURI(storageURI: String): String
  /**
    * Obtain the storage URI for a specific Scripting Framework script URI.
    * @returns a URI to the storage as a `string`
    * @throws com::sun::star::lang::IllegalArgumentException if the storageURI is not a valid
    */
  def getStorageURI(scriptURI: String): String
}

object XScriptURIHelper {
  @scala.inline
  def apply(
    RootStorageURI: String,
    acquire: () => Unit,
    getRootStorageURI: () => String,
    getScriptURI: String => String,
    getStorageURI: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptURIHelper = {
    val __obj = js.Dynamic.literal(RootStorageURI = RootStorageURI, acquire = js.Any.fromFunction0(acquire), getRootStorageURI = js.Any.fromFunction0(getRootStorageURI), getScriptURI = js.Any.fromFunction1(getScriptURI), getStorageURI = js.Any.fromFunction1(getStorageURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScriptURIHelper]
  }
}

