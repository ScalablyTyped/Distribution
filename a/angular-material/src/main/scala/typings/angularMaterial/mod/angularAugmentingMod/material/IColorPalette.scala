package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPalette extends js.Object {
  var amber: IPalette = js.native
  var blue: IPalette = js.native
  var `blue-grey`: IPalette = js.native
  var brown: IPalette = js.native
  var cyan: IPalette = js.native
  var `deep-orange`: IPalette = js.native
  var `deep-purple`: IPalette = js.native
  var green: IPalette = js.native
  var grey: IPalette = js.native
  var indigo: IPalette = js.native
  var `light-blue`: IPalette = js.native
  var `light-green`: IPalette = js.native
  var lime: IPalette = js.native
  var orange: IPalette = js.native
  var pink: IPalette = js.native
  var red: IPalette = js.native
  var teal: IPalette = js.native
  var yellow: IPalette = js.native
}

object IColorPalette {
  @scala.inline
  def apply(
    amber: IPalette,
    blue: IPalette,
    `blue-grey`: IPalette,
    brown: IPalette,
    cyan: IPalette,
    `deep-orange`: IPalette,
    `deep-purple`: IPalette,
    green: IPalette,
    grey: IPalette,
    indigo: IPalette,
    `light-blue`: IPalette,
    `light-green`: IPalette,
    lime: IPalette,
    orange: IPalette,
    pink: IPalette,
    red: IPalette,
    teal: IPalette,
    yellow: IPalette
  ): IColorPalette = {
    val __obj = js.Dynamic.literal(amber = amber.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], brown = brown.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], indigo = indigo.asInstanceOf[js.Any], lime = lime.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], pink = pink.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.updateDynamic("blue-grey")(`blue-grey`.asInstanceOf[js.Any])
    __obj.updateDynamic("deep-orange")(`deep-orange`.asInstanceOf[js.Any])
    __obj.updateDynamic("deep-purple")(`deep-purple`.asInstanceOf[js.Any])
    __obj.updateDynamic("light-blue")(`light-blue`.asInstanceOf[js.Any])
    __obj.updateDynamic("light-green")(`light-green`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPalette]
  }
  @scala.inline
  implicit class IColorPaletteOps[Self <: IColorPalette] (val x: Self) extends AnyVal {
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
    def setAmber(value: IPalette): Self = this.set("amber", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlue(value: IPalette): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBlue-grey`(value: IPalette): Self = this.set("blue-grey", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrown(value: IPalette): Self = this.set("brown", value.asInstanceOf[js.Any])
    @scala.inline
    def setCyan(value: IPalette): Self = this.set("cyan", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDeep-orange`(value: IPalette): Self = this.set("deep-orange", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDeep-purple`(value: IPalette): Self = this.set("deep-purple", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreen(value: IPalette): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrey(value: IPalette): Self = this.set("grey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndigo(value: IPalette): Self = this.set("indigo", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLight-blue`(value: IPalette): Self = this.set("light-blue", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLight-green`(value: IPalette): Self = this.set("light-green", value.asInstanceOf[js.Any])
    @scala.inline
    def setLime(value: IPalette): Self = this.set("lime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrange(value: IPalette): Self = this.set("orange", value.asInstanceOf[js.Any])
    @scala.inline
    def setPink(value: IPalette): Self = this.set("pink", value.asInstanceOf[js.Any])
    @scala.inline
    def setRed(value: IPalette): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeal(value: IPalette): Self = this.set("teal", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellow(value: IPalette): Self = this.set("yellow", value.asInstanceOf[js.Any])
  }
  
}

