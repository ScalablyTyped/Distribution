package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal interface to update the used css::frame::XModel
  * @since LibreOffice 5.1
  */
trait XUpdateModel
  extends StObject
     with XInterface {
  
  def updateModel(xModel: XModel): Unit
}
object XUpdateModel {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    updateModel: XModel => Unit
  ): XUpdateModel = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateModel = js.Any.fromFunction1(updateModel))
    __obj.asInstanceOf[XUpdateModel]
  }
  
  extension [Self <: XUpdateModel](x: Self) {
    
    inline def setUpdateModel(value: XModel => Unit): Self = StObject.set(x, "updateModel", js.Any.fromFunction1(value))
  }
}
