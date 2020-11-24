package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
  implicit class XLayoutConstrainsOps[Self <: XLayoutConstrains] (val x: Self) extends AnyVal {
    
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
    def setMinimumSize(value: Size): Self = this.set("MinimumSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredSize(value: Size): Self = this.set("PreferredSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalcAdjustedSize(value: Size => Size): Self = this.set("calcAdjustedSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMinimumSize(value: () => Size): Self = this.set("getMinimumSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreferredSize(value: () => Size): Self = this.set("getPreferredSize", js.Any.fromFunction0(value))
  }
}
