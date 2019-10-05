package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPalette extends js.Object {
  var amber: IPalette
  var blue: IPalette
  var `blue-grey`: IPalette
  var brown: IPalette
  var cyan: IPalette
  var `deep-orange`: IPalette
  var `deep-purple`: IPalette
  var green: IPalette
  var grey: IPalette
  var indigo: IPalette
  var `light-blue`: IPalette
  var `light-green`: IPalette
  var lime: IPalette
  var orange: IPalette
  var pink: IPalette
  var red: IPalette
  var teal: IPalette
  var yellow: IPalette
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
    val __obj = js.Dynamic.literal(amber = amber, blue = blue, brown = brown, cyan = cyan, green = green, grey = grey, indigo = indigo, lime = lime, orange = orange, pink = pink, red = red, teal = teal, yellow = yellow)
    __obj.updateDynamic("blue-grey")(`blue-grey`)
    __obj.updateDynamic("deep-orange")(`deep-orange`)
    __obj.updateDynamic("deep-purple")(`deep-purple`)
    __obj.updateDynamic("light-blue")(`light-blue`)
    __obj.updateDynamic("light-green")(`light-green`)
    __obj.asInstanceOf[IColorPalette]
  }
}

