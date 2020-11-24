package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is allowing to transform a {@link XGraphic}
  *
  * To transform a {@link XGraphic} , just the corresponding method has to be used, a new {@link XGraphic} instance will be returned
  */
@js.native
trait XGraphicTransformer extends XInterface {
  
  /**
    * changes brightness/contrast
    * @param In The input {@link Graphic} .
    * @param brightness The brightness that shall be applied.
    * @param contrast The contrast that shall be applied.
    * @param mso whether to use MSOffice brightness/contrast formula
    * @returns The modified graphic
    */
  def applyBrightnessContrast(In: XGraphic, brightness: Double, contrast: Double, mso: Boolean): XGraphic = js.native
  
  /**
    * applies Duotone effect
    * @returns The modified graphic
    */
  def applyDuotone(In: XGraphic, ColorOne: Double, ColorTwo: Double): XGraphic = js.native
  
  /**
    * transforms a {@link Graphic}
    * @returns The transformed graphic
    */
  def colorChange(In: XGraphic, ColorFrom: Double, tolerance: Double, ColorTo: Double, AlphaTo: Double): XGraphic = js.native
}
object XGraphicTransformer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    applyBrightnessContrast: (XGraphic, Double, Double, Boolean) => XGraphic,
    applyDuotone: (XGraphic, Double, Double) => XGraphic,
    colorChange: (XGraphic, Double, Double, Double, Double) => XGraphic,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGraphicTransformer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applyBrightnessContrast = js.Any.fromFunction4(applyBrightnessContrast), applyDuotone = js.Any.fromFunction3(applyDuotone), colorChange = js.Any.fromFunction5(colorChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGraphicTransformer]
  }
  
  @scala.inline
  implicit class XGraphicTransformerOps[Self <: XGraphicTransformer] (val x: Self) extends AnyVal {
    
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
    def setApplyBrightnessContrast(value: (XGraphic, Double, Double, Boolean) => XGraphic): Self = this.set("applyBrightnessContrast", js.Any.fromFunction4(value))
    
    @scala.inline
    def setApplyDuotone(value: (XGraphic, Double, Double) => XGraphic): Self = this.set("applyDuotone", js.Any.fromFunction3(value))
    
    @scala.inline
    def setColorChange(value: (XGraphic, Double, Double, Double, Double) => XGraphic): Self = this.set("colorChange", js.Any.fromFunction5(value))
  }
}
