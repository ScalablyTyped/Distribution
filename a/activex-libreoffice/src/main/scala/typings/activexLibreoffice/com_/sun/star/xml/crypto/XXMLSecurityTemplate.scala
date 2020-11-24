package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of the XML security template
  *
  * This interface represents a security template, which is the super interface of the {@link XXMLSignatureTemplate} interface and the {@link
  * XXMLEncryptionTemplate} interface.
  */
@js.native
trait XXMLSecurityTemplate extends XInterface {
  
  /** Get the template status */
  var Status: SecurityOperationStatus = js.native
  
  /** Get the XML signature element that represents the signature template */
  var Template: XXMLElementWrapper = js.native
  
  /** Get the template status */
  def getStatus(): SecurityOperationStatus = js.native
  
  /** Get the XML signature element that represents the signature template */
  def getTemplate(): XXMLElementWrapper = js.native
  
  /** Set the template status */
  def setStatus(status: SecurityOperationStatus): Unit = js.native
  
  /** Load the target XML element, i.e. the element to be signed */
  def setTarget(aXmlElement: XXMLElementWrapper): Unit = js.native
  
  /** Load a XML signature template from XML signature element */
  def setTemplate(aXmlElement: XXMLElementWrapper): Unit = js.native
}
object XXMLSecurityTemplate {
  
  @scala.inline
  def apply(
    Status: SecurityOperationStatus,
    Template: XXMLElementWrapper,
    acquire: () => Unit,
    getStatus: () => SecurityOperationStatus,
    getTemplate: () => XXMLElementWrapper,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStatus: SecurityOperationStatus => Unit,
    setTarget: XXMLElementWrapper => Unit,
    setTemplate: XXMLElementWrapper => Unit
  ): XXMLSecurityTemplate = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStatus = js.Any.fromFunction0(getStatus), getTemplate = js.Any.fromFunction0(getTemplate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStatus = js.Any.fromFunction1(setStatus), setTarget = js.Any.fromFunction1(setTarget), setTemplate = js.Any.fromFunction1(setTemplate))
    __obj.asInstanceOf[XXMLSecurityTemplate]
  }
  
  @scala.inline
  implicit class XXMLSecurityTemplateOps[Self <: XXMLSecurityTemplate] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: SecurityOperationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: XXMLElementWrapper): Self = this.set("Template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStatus(value: () => SecurityOperationStatus): Self = this.set("getStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTemplate(value: () => XXMLElementWrapper): Self = this.set("getTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetStatus(value: SecurityOperationStatus => Unit): Self = this.set("setStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTarget(value: XXMLElementWrapper => Unit): Self = this.set("setTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTemplate(value: XXMLElementWrapper => Unit): Self = this.set("setTemplate", js.Any.fromFunction1(value))
  }
}
