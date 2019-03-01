package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfiguredColorPalette
  extends IColorPalette
     with /* name */ org.scalablytyped.runtime.StringDictionary[IPalette]

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
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[IPalette] = null
  ): IConfiguredColorPalette = {
    val __obj = js.Dynamic.literal(`blue-grey` = `blue-grey`, `deep-orange` = `deep-orange`, `deep-purple` = `deep-purple`, `light-blue` = `light-blue`, `light-green` = `light-green`)
    __obj.updateDynamic("amber")(amber)
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("brown")(brown)
    __obj.updateDynamic("cyan")(cyan)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("grey")(grey)
    __obj.updateDynamic("indigo")(indigo)
    __obj.updateDynamic("lime")(lime)
    __obj.updateDynamic("orange")(orange)
    __obj.updateDynamic("pink")(pink)
    __obj.updateDynamic("red")(red)
    __obj.updateDynamic("teal")(teal)
    __obj.updateDynamic("yellow")(yellow)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IConfiguredColorPalette]
  }
}

