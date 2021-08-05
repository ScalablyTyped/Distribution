package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCoordinateSystemContainer
  extends StObject
     with XInterface {
  
  /** retrieve all coordinate systems */
  var CoordinateSystems: SafeArray[XCoordinateSystem]
  
  /**
    * add an coordinate system to the coordinate system container
    * @throws IllegalArgumentException If the given coordinate system is already contained in the container.
    */
  def addCoordinateSystem(aCoordSys: XCoordinateSystem): Unit
  
  /** retrieve all coordinate systems */
  def getCoordinateSystems(): SafeArray[XCoordinateSystem]
  
  /** removes one coordinate system from the coordinate system container. */
  def removeCoordinateSystem(aCoordSys: XCoordinateSystem): Unit
  
  /** set all coordinate systems */
  def setCoordinateSystems(aCoordinateSystems: SeqEquiv[XCoordinateSystem]): Unit
}
object XCoordinateSystemContainer {
  
  inline def apply(
    CoordinateSystems: SafeArray[XCoordinateSystem],
    acquire: () => Unit,
    addCoordinateSystem: XCoordinateSystem => Unit,
    getCoordinateSystems: () => SafeArray[XCoordinateSystem],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCoordinateSystem: XCoordinateSystem => Unit,
    setCoordinateSystems: SeqEquiv[XCoordinateSystem] => Unit
  ): XCoordinateSystemContainer = {
    val __obj = js.Dynamic.literal(CoordinateSystems = CoordinateSystems.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addCoordinateSystem = js.Any.fromFunction1(addCoordinateSystem), getCoordinateSystems = js.Any.fromFunction0(getCoordinateSystems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCoordinateSystem = js.Any.fromFunction1(removeCoordinateSystem), setCoordinateSystems = js.Any.fromFunction1(setCoordinateSystems))
    __obj.asInstanceOf[XCoordinateSystemContainer]
  }
  
  extension [Self <: XCoordinateSystemContainer](x: Self) {
    
    inline def setAddCoordinateSystem(value: XCoordinateSystem => Unit): Self = StObject.set(x, "addCoordinateSystem", js.Any.fromFunction1(value))
    
    inline def setCoordinateSystems(value: SafeArray[XCoordinateSystem]): Self = StObject.set(x, "CoordinateSystems", value.asInstanceOf[js.Any])
    
    inline def setGetCoordinateSystems(value: () => SafeArray[XCoordinateSystem]): Self = StObject.set(x, "getCoordinateSystems", js.Any.fromFunction0(value))
    
    inline def setRemoveCoordinateSystem(value: XCoordinateSystem => Unit): Self = StObject.set(x, "removeCoordinateSystem", js.Any.fromFunction1(value))
    
    inline def setSetCoordinateSystems(value: SeqEquiv[XCoordinateSystem] => Unit): Self = StObject.set(x, "setCoordinateSystems", js.Any.fromFunction1(value))
  }
}
