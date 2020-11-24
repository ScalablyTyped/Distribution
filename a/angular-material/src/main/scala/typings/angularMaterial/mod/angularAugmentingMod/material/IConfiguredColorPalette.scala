package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
    yellow: IPalette
  ): IConfiguredColorPalette = {
    val __obj = js.Dynamic.literal(amber = amber.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], brown = brown.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], indigo = indigo.asInstanceOf[js.Any], lime = lime.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], pink = pink.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.updateDynamic("blue-grey")(`blue-grey`.asInstanceOf[js.Any])
    __obj.updateDynamic("deep-orange")(`deep-orange`.asInstanceOf[js.Any])
    __obj.updateDynamic("deep-purple")(`deep-purple`.asInstanceOf[js.Any])
    __obj.updateDynamic("light-blue")(`light-blue`.asInstanceOf[js.Any])
    __obj.updateDynamic("light-green")(`light-green`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguredColorPalette]
  }
}
