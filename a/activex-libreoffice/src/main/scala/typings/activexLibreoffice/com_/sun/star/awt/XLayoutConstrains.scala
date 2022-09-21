package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the layout constraints for a surrounding container. */
trait XLayoutConstrains
  extends StObject
     with XInterface {
  
  /** returns the minimum size for this component. */
  val MinimumSize: Size
  
  /** returns the preferred size for this component. */
  val PreferredSize: Size
  
  /** calculates the adjusted size for a given maximum size. */
  def calcAdjustedSize(aNewSize: Size): Size
  
  /** returns the minimum size for this component. */
  def getMinimumSize(): Size
  
  /** returns the preferred size for this component. */
  def getPreferredSize(): Size
}
object XLayoutConstrains {
  
  inline def apply(
    MinimumSize: Size,
    PreferredSize: Size,
    acquire: () => Unit,
    calcAdjustedSize: Size => Size,
    getMinimumSize: () => Size,
    getPreferredSize: () => Size,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XLayoutConstrains = {
    val __obj = js.Dynamic.literal(MinimumSize = MinimumSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLayoutConstrains]
  }
  
  extension [Self <: XLayoutConstrains](x: Self) {
    
    inline def setCalcAdjustedSize(value: Size => Size): Self = StObject.set(x, "calcAdjustedSize", js.Any.fromFunction1(value))
    
    inline def setGetMinimumSize(value: () => Size): Self = StObject.set(x, "getMinimumSize", js.Any.fromFunction0(value))
    
    inline def setGetPreferredSize(value: () => Size): Self = StObject.set(x, "getPreferredSize", js.Any.fromFunction0(value))
    
    inline def setMinimumSize(value: Size): Self = StObject.set(x, "MinimumSize", value.asInstanceOf[js.Any])
    
    inline def setPreferredSize(value: Size): Self = StObject.set(x, "PreferredSize", value.asInstanceOf[js.Any])
  }
}
