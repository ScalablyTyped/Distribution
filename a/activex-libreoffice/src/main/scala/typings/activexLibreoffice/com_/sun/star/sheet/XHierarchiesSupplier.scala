package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the collection of hierarchies of a data pilot source dimension.
  * @see com.sun.star.sheet.DataPilotSourceDimension
  * @see com.sun.star.sheet.DataPilotSource
  */
@js.native
trait XHierarchiesSupplier extends XInterface {
  
  /**
    * returns the collection of hierarchies.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  val Hierarchies: XNameAccess = js.native
  
  /**
    * returns the collection of hierarchies.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  def getHierarchies(): XNameAccess = js.native
}
object XHierarchiesSupplier {
  
  @scala.inline
  def apply(
    Hierarchies: XNameAccess,
    acquire: () => Unit,
    getHierarchies: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHierarchiesSupplier = {
    val __obj = js.Dynamic.literal(Hierarchies = Hierarchies.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHierarchies = js.Any.fromFunction0(getHierarchies), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHierarchiesSupplier]
  }
  
  @scala.inline
  implicit class XHierarchiesSupplierMutableBuilder[Self <: XHierarchiesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHierarchies(value: () => XNameAccess): Self = StObject.set(x, "getHierarchies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHierarchies(value: XNameAccess): Self = StObject.set(x, "Hierarchies", value.asInstanceOf[js.Any])
  }
}
