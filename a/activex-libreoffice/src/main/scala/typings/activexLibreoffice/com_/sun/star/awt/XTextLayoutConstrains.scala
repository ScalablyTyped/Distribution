package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the layout constraints for a text field. */
@js.native
trait XTextLayoutConstrains extends XInterface {
  
  /** returns the ideal number of columns and lines for displaying this text. */
  def getColumnsAndLines(nCols: js.Array[Double], nLines: js.Array[Double]): Unit = js.native
  
  /** returns the minimum size for a given number of columns and lines. */
  def getMinimumSize(nCols: Double, nLines: Double): Size = js.native
}
object XTextLayoutConstrains {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getColumnsAndLines: (js.Array[Double], js.Array[Double]) => Unit,
    getMinimumSize: (Double, Double) => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextLayoutConstrains = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getColumnsAndLines = js.Any.fromFunction2(getColumnsAndLines), getMinimumSize = js.Any.fromFunction2(getMinimumSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextLayoutConstrains]
  }
  
  @scala.inline
  implicit class XTextLayoutConstrainsMutableBuilder[Self <: XTextLayoutConstrains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetColumnsAndLines(value: (js.Array[Double], js.Array[Double]) => Unit): Self = StObject.set(x, "getColumnsAndLines", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMinimumSize(value: (Double, Double) => Size): Self = StObject.set(x, "getMinimumSize", js.Any.fromFunction2(value))
  }
}
