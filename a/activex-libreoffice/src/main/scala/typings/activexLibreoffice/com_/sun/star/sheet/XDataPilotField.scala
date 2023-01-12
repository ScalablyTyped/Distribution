package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to control a data pilot field which has already been created.
  * @see com.sun.star.sheet.DataPilotField
  */
trait XDataPilotField
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  val Items: XIndexAccess
  
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  def getItems(): XIndexAccess
}
object XDataPilotField {
  
  inline def apply(
    Items: XIndexAccess,
    acquire: () => Unit,
    getItems: () => XIndexAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDataPilotField = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getItems = js.Any.fromFunction0(getItems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataPilotField] (val x: Self) extends AnyVal {
    
    inline def setGetItems(value: () => XIndexAccess): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    inline def setItems(value: XIndexAccess): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
  }
}
