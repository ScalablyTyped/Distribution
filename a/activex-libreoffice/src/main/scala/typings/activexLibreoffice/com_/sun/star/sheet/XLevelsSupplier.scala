package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the collection of levels of a data pilot source hierarchy.
  * @see com.sun.star.sheet.DataPilotSourceHierarchy
  * @see com.sun.star.sheet.DataPilotSource
  */
@js.native
trait XLevelsSupplier extends XInterface {
  
  /**
    * returns the collection of levels.
    * @see com.sun.star.sheet.DataPilotSourceLevels
    */
  val Levels: XNameAccess = js.native
  
  /**
    * returns the collection of levels.
    * @see com.sun.star.sheet.DataPilotSourceLevels
    */
  def getLevels(): XNameAccess = js.native
}
object XLevelsSupplier {
  
  @scala.inline
  def apply(
    Levels: XNameAccess,
    acquire: () => Unit,
    getLevels: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLevelsSupplier = {
    val __obj = js.Dynamic.literal(Levels = Levels.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLevels = js.Any.fromFunction0(getLevels), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLevelsSupplier]
  }
  
  @scala.inline
  implicit class XLevelsSupplierMutableBuilder[Self <: XLevelsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLevels(value: () => XNameAccess): Self = StObject.set(x, "getLevels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLevels(value: XNameAccess): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
  }
}
