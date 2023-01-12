package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface is supplied by objects inside a document object model that have children that can be the target of a link inside a document.
  *
  * These targets implement the service {@link LinkTarget} .
  */
trait XLinkTargetSupplier
  extends StObject
     with XInterface {
  
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  val Links: XNameAccess
  
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  def getLinks(): XNameAccess
}
object XLinkTargetSupplier {
  
  inline def apply(
    Links: XNameAccess,
    acquire: () => Unit,
    getLinks: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XLinkTargetSupplier = {
    val __obj = js.Dynamic.literal(Links = Links.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLinks = js.Any.fromFunction0(getLinks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLinkTargetSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLinkTargetSupplier] (val x: Self) extends AnyVal {
    
    inline def setGetLinks(value: () => XNameAccess): Self = StObject.set(x, "getLinks", js.Any.fromFunction0(value))
    
    inline def setLinks(value: XNameAccess): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
  }
}
