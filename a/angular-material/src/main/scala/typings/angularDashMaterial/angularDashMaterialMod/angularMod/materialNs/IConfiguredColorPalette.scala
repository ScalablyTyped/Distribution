package typings.angularDashMaterial.angularDashMaterialMod.angularMod.materialNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfiguredColorPalette
  extends IColorPalette
     with /* name */ StringDictionary[IPalette]

object IConfiguredColorPalette {
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
    yellow: IPalette,
    StringDictionary: /* name */ StringDictionary[IPalette] = null
  ): IConfiguredColorPalette = {
    val __obj = js.Dynamic.literal(amber = amber, blue = blue, brown = brown, cyan = cyan, green = green, grey = grey, indigo = indigo, lime = lime, orange = orange, pink = pink, red = red, teal = teal, yellow = yellow)
    __obj.updateDynamic("blue-grey")(`blue-grey`)
    __obj.updateDynamic("deep-orange")(`deep-orange`)
    __obj.updateDynamic("deep-purple")(`deep-purple`)
    __obj.updateDynamic("light-blue")(`light-blue`)
    __obj.updateDynamic("light-green")(`light-green`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IConfiguredColorPalette]
  }
}

