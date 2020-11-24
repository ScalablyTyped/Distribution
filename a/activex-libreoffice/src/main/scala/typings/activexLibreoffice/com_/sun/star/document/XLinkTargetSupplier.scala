package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface is supplied by objects inside a document object model that have children that can be the target of a link inside a document.
  *
  * These targets implement the service {@link LinkTarget} .
  */
@js.native
trait XLinkTargetSupplier extends XInterface {
  
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  val Links: XNameAccess = js.native
  
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  def getLinks(): XNameAccess = js.native
}
object XLinkTargetSupplier {
  
  @scala.inline
  def apply(
    Links: XNameAccess,
    acquire: () => Unit,
    getLinks: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLinkTargetSupplier = {
    val __obj = js.Dynamic.literal(Links = Links.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLinks = js.Any.fromFunction0(getLinks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLinkTargetSupplier]
  }
  
  @scala.inline
  implicit class XLinkTargetSupplierOps[Self <: XLinkTargetSupplier] (val x: Self) extends AnyVal {
    
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
    def setLinks(value: XNameAccess): Self = this.set("Links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLinks(value: () => XNameAccess): Self = this.set("getLinks", js.Any.fromFunction0(value))
  }
}
