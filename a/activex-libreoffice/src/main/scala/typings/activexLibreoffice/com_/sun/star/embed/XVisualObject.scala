package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common visualization functionality for embedded objects. */
trait XVisualObject
  extends StObject
     with XInterface {
  
  /**
    * retrieves map mode the object communicates in.
    * @param nAspect the aspect the map mode is requested for. Can take values from {@link Aspects} constant set.
    * @returns the map mode the object communicates in, it can take values from {@link EmbedMapUnits} constant
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of problems
    */
  def getMapUnit(nAspect: Double): Double
  
  /**
    * retrieves visual representation of the object in preferable format.
    *
    * If the object persistence entry contains cached visual representation then it can be retrieved by using this method even in loaded state.
    * @param nAspect the aspect the representation is requested for. Can take values from {@link Aspects} constant set.
    * @returns the visual representation of the object in the default format and the format
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of problems
    */
  def getPreferredVisualRepresentation(nAspect: Double): VisualRepresentation
  
  /**
    * gets the size of object's visual area.
    *
    * The size must be provided in logical units according to map mode the object communicates in.
    * @param nAspect the aspect specifying the form of object representation. Can take values from {@link Aspects} constant set.
    * @returns the size of visual area
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def getVisualAreaSize(nAspect: Double): Size
  
  /**
    * sets the size of object's visual area.
    *
    * The size must be provided in logical units according to map mode the object communicates in.
    *
    * If an object is inplace- or ui-active the method must not initiate repainting itself.
    * @param nAspect the aspect specifying the form of object representation. Can take values from {@link Aspects} constant set.
    * @param aSize the new size of the visual area
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception the object failed to resize
    */
  def setVisualAreaSize(nAspect: Double, aSize: Size): Unit
}
object XVisualObject {
  
  inline def apply(
    acquire: () => Unit,
    getMapUnit: Double => Double,
    getPreferredVisualRepresentation: Double => VisualRepresentation,
    getVisualAreaSize: Double => Size,
    queryInterface: `type` => Any,
    release: () => Unit,
    setVisualAreaSize: (Double, Size) => Unit
  ): XVisualObject = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getMapUnit = js.Any.fromFunction1(getMapUnit), getPreferredVisualRepresentation = js.Any.fromFunction1(getPreferredVisualRepresentation), getVisualAreaSize = js.Any.fromFunction1(getVisualAreaSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVisualAreaSize = js.Any.fromFunction2(setVisualAreaSize))
    __obj.asInstanceOf[XVisualObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XVisualObject] (val x: Self) extends AnyVal {
    
    inline def setGetMapUnit(value: Double => Double): Self = StObject.set(x, "getMapUnit", js.Any.fromFunction1(value))
    
    inline def setGetPreferredVisualRepresentation(value: Double => VisualRepresentation): Self = StObject.set(x, "getPreferredVisualRepresentation", js.Any.fromFunction1(value))
    
    inline def setGetVisualAreaSize(value: Double => Size): Self = StObject.set(x, "getVisualAreaSize", js.Any.fromFunction1(value))
    
    inline def setSetVisualAreaSize(value: (Double, Size) => Unit): Self = StObject.set(x, "setVisualAreaSize", js.Any.fromFunction2(value))
  }
}
