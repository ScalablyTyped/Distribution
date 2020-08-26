package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface is used to help transform Scripting Framework storage locations to Scripting Framework script URIs and vice versa. */
@js.native
trait XScriptURIHelper extends XInterface {
  /**
    * Obtain the root storage URI for this {@link ScriptURIHelper} . The resulting string can be used to access the storage for this using the Universal
    * Content Broker
    * @returns a URI to the storage as a `string`
    */
  val RootStorageURI: String = js.native
  /**
    * Obtain the root storage URI for this {@link ScriptURIHelper} . The resulting string can be used to access the storage for this using the Universal
    * Content Broker
    * @returns a URI to the storage as a `string`
    */
  def getRootStorageURI(): String = js.native
  /**
    * Obtain the Scripting Framework script URI for a specific UCB URI
    * @returns the URI as a `string`
    * @throws com::sun::star::lang::IllegalArgumentException if the storageURI is not a valid
    */
  def getScriptURI(storageURI: String): String = js.native
  /**
    * Obtain the storage URI for a specific Scripting Framework script URI.
    * @returns a URI to the storage as a `string`
    * @throws com::sun::star::lang::IllegalArgumentException if the storageURI is not a valid
    */
  def getStorageURI(scriptURI: String): String = js.native
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
    val __obj = js.Dynamic.literal(RootStorageURI = RootStorageURI.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRootStorageURI = js.Any.fromFunction0(getRootStorageURI), getScriptURI = js.Any.fromFunction1(getScriptURI), getStorageURI = js.Any.fromFunction1(getStorageURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptURIHelper]
  }
  @scala.inline
  implicit class XScriptURIHelperOps[Self <: XScriptURIHelper] (val x: Self) extends AnyVal {
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
    def setRootStorageURI(value: String): Self = this.set("RootStorageURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRootStorageURI(value: () => String): Self = this.set("getRootStorageURI", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScriptURI(value: String => String): Self = this.set("getScriptURI", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStorageURI(value: String => String): Self = this.set("getStorageURI", js.Any.fromFunction1(value))
  }
  
}

