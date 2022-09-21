package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the collection of dimensions of a data pilot source.
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XDimensionsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of dimensions.
    * @see com.sun.star.sheet.DataPilotSourceDimensions
    */
  val Dimensions: XNameAccess
  
  /**
    * returns the collection of dimensions.
    * @see com.sun.star.sheet.DataPilotSourceDimensions
    */
  def getDimensions(): XNameAccess
}
object XDimensionsSupplier {
  
  inline def apply(
    Dimensions: XNameAccess,
    acquire: () => Unit,
    getDimensions: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDimensionsSupplier = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDimensions = js.Any.fromFunction0(getDimensions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDimensionsSupplier]
  }
  
  extension [Self <: XDimensionsSupplier](x: Self) {
    
    inline def setDimensions(value: XNameAccess): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setGetDimensions(value: () => XNameAccess): Self = StObject.set(x, "getDimensions", js.Any.fromFunction0(value))
  }
}
