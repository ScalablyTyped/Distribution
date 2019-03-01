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
    acquire: js.Function0[scala.Unit],
    applyBrightnessContrast: js.Function4[XGraphic, scala.Double, scala.Double, scala.Boolean, XGraphic],
    applyDuotone: js.Function3[XGraphic, scala.Double, scala.Double, XGraphic],
    colorChange: js.Function5[XGraphic, scala.Double, scala.Double, scala.Double, scala.Double, XGraphic],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XGraphicTransformer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("applyBrightnessContrast")(applyBrightnessContrast)
    __obj.updateDynamic("applyDuotone")(applyDuotone)
    __obj.updateDynamic("colorChange")(colorChange)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XGraphicTransformer]
  }
}

