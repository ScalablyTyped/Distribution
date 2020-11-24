package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfiguredThemes
  extends IThemes
     with /* name */ StringDictionary[ITheme]
object IConfiguredThemes {
  
  @scala.inline
  def apply(default: ITheme): IConfiguredThemes = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguredThemes]
  }
}
