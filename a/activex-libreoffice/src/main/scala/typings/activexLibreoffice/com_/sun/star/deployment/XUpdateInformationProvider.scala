package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.xml.dom.XElement
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface provide access to the xml root of one or more update information files for a given set of URLs.
  * @since OOo 2.2
  */
@js.native
trait XUpdateInformationProvider extends js.Object {
  
  /** interrupts a getUpdateInformation call and let's it return immediately. */
  def cancel(): Unit = js.native
  
  /**
    * get update information for a specific extension or all available information from a repository.
    * @param repositories a repository and its mirrors.
    * @param extensionId the unique identifier of an extension. If it is not empty and the update document is an atom feed, only items whose "term" attribute
    */
  def getUpdateInformation(repositories: SeqEquiv[String], extensionId: String): SafeArray[XElement] = js.native
  
  /**
    * get update information for a specific extension or all available information from a repository.
    * @param repositories a repository and its mirrors.
    * @param extensionId the unique identifier of an extension. If it is not empty and the update document is an atom feed, only items whose "term" attribute
    * @returns an enumeration of {@link UpdateInformationEntry} .
    */
  def getUpdateInformationEnumeration(repositories: SeqEquiv[String], extensionId: String): XEnumeration = js.native
  
  /**
    * Sets an interaction handler to be used for further operations.
    *
    * A default interaction handler is available as service {@link com.sun.star.task.InteractionHandler} . The documentation of this service also contains
    * further information about the interaction handler concept.
    * @param handler The interaction handler to be set
    * @see com.sun.star.task.InteractionHandler
    */
  def setInteractionHandler(handler: XInteractionHandler): Unit = js.native
}
object XUpdateInformationProvider {
  
  @scala.inline
  def apply(
    cancel: () => Unit,
    getUpdateInformation: (SeqEquiv[String], String) => SafeArray[XElement],
    getUpdateInformationEnumeration: (SeqEquiv[String], String) => XEnumeration,
    setInteractionHandler: XInteractionHandler => Unit
  ): XUpdateInformationProvider = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), getUpdateInformation = js.Any.fromFunction2(getUpdateInformation), getUpdateInformationEnumeration = js.Any.fromFunction2(getUpdateInformationEnumeration), setInteractionHandler = js.Any.fromFunction1(setInteractionHandler))
    __obj.asInstanceOf[XUpdateInformationProvider]
  }
  
  @scala.inline
  implicit class XUpdateInformationProviderOps[Self <: XUpdateInformationProvider] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdateInformation(value: (SeqEquiv[String], String) => SafeArray[XElement]): Self = this.set("getUpdateInformation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUpdateInformationEnumeration(value: (SeqEquiv[String], String) => XEnumeration): Self = this.set("getUpdateInformationEnumeration", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetInteractionHandler(value: XInteractionHandler => Unit): Self = this.set("setInteractionHandler", js.Any.fromFunction1(value))
  }
}
