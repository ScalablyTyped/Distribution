package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
  implicit class XHierarchiesSupplierOps[Self <: XHierarchiesSupplier] (val x: Self) extends AnyVal {
    
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
    def setHierarchies(value: XNameAccess): Self = this.set("Hierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHierarchies(value: () => XNameAccess): Self = this.set("getHierarchies", js.Any.fromFunction0(value))
  }
}
