package typings
package atAngularCoreLib.srcRender3StylingPlayerUnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/styling/player_factory", "BoundPlayerFactory")
@js.native
class BoundPlayerFactory[T] protected () extends js.Object {
  def this(fn: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactoryBuildFn, value: T) = this()
  var `__brand__`: atAngularCoreLib.atAngularCoreLibStrings.`Brand for PlayerFactory that nothing will match` = js.native
  @JSName("fn")
  var fn_Original: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerFactoryBuildFn = js.native
  var value: T = js.native
  def fn(
    element: stdLib.HTMLElement,
    `type`: atAngularCoreLib.srcRender3InterfacesPlayerMod.BindingType,
    values: ScalablyTyped.runtime.StringDictionary[js.Any],
    isFirstRender: scala.Boolean
  ): atAngularCoreLib.srcRender3InterfacesPlayerMod.Player | scala.Null = js.native
  def fn(
    element: stdLib.HTMLElement,
    `type`: atAngularCoreLib.srcRender3InterfacesPlayerMod.BindingType,
    values: ScalablyTyped.runtime.StringDictionary[js.Any],
    isFirstRender: scala.Boolean,
    currentPlayer: atAngularCoreLib.srcRender3InterfacesPlayerMod.Player
  ): atAngularCoreLib.srcRender3InterfacesPlayerMod.Player | scala.Null = js.native
}

