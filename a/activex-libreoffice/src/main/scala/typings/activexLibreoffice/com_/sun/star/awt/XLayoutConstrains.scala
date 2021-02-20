package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the layout constraints for a surrounding container. */
@js.native
trait XLayoutConstrains extends XInterface {
  
  /** returns the minimum size for this component. */
  val MinimumSize: Size = js.native
  
  /** returns the preferred size for this component. */
  val PreferredSize: Size = js.native
  
  /** calculates the adjusted size for a given maximum size. */
  def calcAdjustedSize(aNewSize: Size): Size = js.native
  
  /** returns the minimum size for this component. */
  def getMinimumSize(): Size = js.native
  
  /** returns the preferred size for this component. */
  def getPreferredSize(): Size = js.native
}
object XLayoutConstrains {
  
  @scala.inline
  def apply(
    MinimumSize: Size,
    PreferredSize: Size,
    acquire: () => Unit,
    calcAdjustedSize: Size => Size,
    getMinimumSize: () => Size,
    getPreferredSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLayoutConstrains = {
    val __obj = js.Dynamic.literal(MinimumSize = MinimumSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLayoutConstrains]
  }
  
  @scala.inline
  implicit class XLayoutConstrainsMutableBuilder[Self <: XLayoutConstrains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalcAdjustedSize(value: Size => Size): Self = StObject.set(x, "calcAdjustedSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMinimumSize(value: () => Size): Self = StObject.set(x, "getMinimumSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreferredSize(value: () => Size): Self = StObject.set(x, "getPreferredSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinimumSize(value: Size): Self = StObject.set(x, "MinimumSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredSize(value: Size): Self = StObject.set(x, "PreferredSize", value.asInstanceOf[js.Any])
  }
}
