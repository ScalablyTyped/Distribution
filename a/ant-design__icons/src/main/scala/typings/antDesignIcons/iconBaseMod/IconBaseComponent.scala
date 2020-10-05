package typings.antDesignIcons.iconBaseMod

import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconBaseComponent[P] extends FunctionComponent[P] {
  var getTwoToneColors: js.Function0[TwoToneColorPalette] = js.native
  var setTwoToneColors: js.Function1[/* hasPrimaryColorSecondaryColor */ TwoToneColorPaletteSetter, Unit] = js.native
}

