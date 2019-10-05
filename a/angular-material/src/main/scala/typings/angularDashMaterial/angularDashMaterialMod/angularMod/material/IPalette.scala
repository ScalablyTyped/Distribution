package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPalette extends js.Object {
  var `0`: js.UndefOr[String] = js.undefined
  var `100`: js.UndefOr[String] = js.undefined
  var `200`: js.UndefOr[String] = js.undefined
  var `300`: js.UndefOr[String] = js.undefined
  var `400`: js.UndefOr[String] = js.undefined
  var `50`: js.UndefOr[String] = js.undefined
  var `500`: js.UndefOr[String] = js.undefined
  var `600`: js.UndefOr[String] = js.undefined
  var `700`: js.UndefOr[String] = js.undefined
  var `800`: js.UndefOr[String] = js.undefined
  var `900`: js.UndefOr[String] = js.undefined
  var A100: js.UndefOr[String] = js.undefined
  var A200: js.UndefOr[String] = js.undefined
  var A400: js.UndefOr[String] = js.undefined
  var A700: js.UndefOr[String] = js.undefined
  var contrastDarkColors: js.UndefOr[String | js.Array[String]] = js.undefined
  var contrastDefaultColor: js.UndefOr[String] = js.undefined
  var contrastLightColors: js.UndefOr[String | js.Array[String]] = js.undefined
  var contrastStrongLightColors: js.UndefOr[String | js.Array[String]] = js.undefined
}

object IPalette {
  @scala.inline
  def apply(
    `0`: String = null,
    `100`: String = null,
    `200`: String = null,
    `300`: String = null,
    `400`: String = null,
    `50`: String = null,
    `500`: String = null,
    `600`: String = null,
    `700`: String = null,
    `800`: String = null,
    `900`: String = null,
    A100: String = null,
    A200: String = null,
    A400: String = null,
    A700: String = null,
    contrastDarkColors: String | js.Array[String] = null,
    contrastDefaultColor: String = null,
    contrastLightColors: String | js.Array[String] = null,
    contrastStrongLightColors: String | js.Array[String] = null
  ): IPalette = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`)
    if (`100` != null) __obj.updateDynamic("100")(`100`)
    if (`200` != null) __obj.updateDynamic("200")(`200`)
    if (`300` != null) __obj.updateDynamic("300")(`300`)
    if (`400` != null) __obj.updateDynamic("400")(`400`)
    if (`50` != null) __obj.updateDynamic("50")(`50`)
    if (`500` != null) __obj.updateDynamic("500")(`500`)
    if (`600` != null) __obj.updateDynamic("600")(`600`)
    if (`700` != null) __obj.updateDynamic("700")(`700`)
    if (`800` != null) __obj.updateDynamic("800")(`800`)
    if (`900` != null) __obj.updateDynamic("900")(`900`)
    if (A100 != null) __obj.updateDynamic("A100")(A100)
    if (A200 != null) __obj.updateDynamic("A200")(A200)
    if (A400 != null) __obj.updateDynamic("A400")(A400)
    if (A700 != null) __obj.updateDynamic("A700")(A700)
    if (contrastDarkColors != null) __obj.updateDynamic("contrastDarkColors")(contrastDarkColors.asInstanceOf[js.Any])
    if (contrastDefaultColor != null) __obj.updateDynamic("contrastDefaultColor")(contrastDefaultColor)
    if (contrastLightColors != null) __obj.updateDynamic("contrastLightColors")(contrastLightColors.asInstanceOf[js.Any])
    if (contrastStrongLightColors != null) __obj.updateDynamic("contrastStrongLightColors")(contrastStrongLightColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPalette]
  }
}

