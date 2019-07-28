package typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is allowing to transform a {@link XGraphic}
  *
  * To transform a {@link XGraphic} , just the corresponding method has to be used, a new {@link XGraphic} instance will be returned
  */
trait XGraphicTransformer extends XInterface {
  /**
    * changes brightness/contrast
    * @param In The input {@link Graphic} .
    * @param brightness The brightness that shall be applied.
    * @param contrast The contrast that shall be applied.
    * @param mso whether to use MSOffice brightness/contrast formula
    * @returns The modified graphic
    */
  def applyBrightnessContrast(In: XGraphic, brightness: Double, contrast: Double, mso: Boolean): XGraphic
  /**
    * applies Duotone effect
    * @returns The modified graphic
    */
  def applyDuotone(In: XGraphic, ColorOne: Double, ColorTwo: Double): XGraphic
  /**
    * transforms a {@link Graphic}
    * @returns The transformed graphic
    */
  def colorChange(In: XGraphic, ColorFrom: Double, tolerance: Double, ColorTo: Double, AlphaTo: Double): XGraphic
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
}

