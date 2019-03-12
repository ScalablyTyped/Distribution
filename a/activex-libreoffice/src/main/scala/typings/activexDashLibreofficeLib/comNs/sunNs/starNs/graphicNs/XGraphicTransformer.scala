package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is allowing to transform a {@link XGraphic}
  *
  * To transform a {@link XGraphic} , just the corresponding method has to be used, a new {@link XGraphic} instance will be returned
  */
trait XGraphicTransformer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * changes brightness/contrast
    * @param In The input {@link Graphic} .
    * @param brightness The brightness that shall be applied.
    * @param contrast The contrast that shall be applied.
    * @param mso whether to use MSOffice brightness/contrast formula
    * @returns The modified graphic
    */
  def applyBrightnessContrast(In: XGraphic, brightness: scala.Double, contrast: scala.Double, mso: scala.Boolean): XGraphic
  /**
    * applies Duotone effect
    * @returns The modified graphic
    */
  def applyDuotone(In: XGraphic, ColorOne: scala.Double, ColorTwo: scala.Double): XGraphic
  /**
    * transforms a {@link Graphic}
    * @returns The transformed graphic
    */
  def colorChange(
    In: XGraphic,
    ColorFrom: scala.Double,
    tolerance: scala.Double,
    ColorTo: scala.Double,
    AlphaTo: scala.Double
  ): XGraphic
}

object XGraphicTransformer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    applyBrightnessContrast: (XGraphic, scala.Double, scala.Double, scala.Boolean) => XGraphic,
    applyDuotone: (XGraphic, scala.Double, scala.Double) => XGraphic,
    colorChange: (XGraphic, scala.Double, scala.Double, scala.Double, scala.Double) => XGraphic,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XGraphicTransformer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applyBrightnessContrast = js.Any.fromFunction4(applyBrightnessContrast), applyDuotone = js.Any.fromFunction3(applyDuotone), colorChange = js.Any.fromFunction5(colorChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGraphicTransformer]
  }
}

