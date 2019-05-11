package typings
package antdLib.esIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconComponent[P]
  extends reactLib.reactMod.FunctionComponent[P] {
  @JSName("createFromIconfontCN")
  var createFromIconfontCN_Original: js.Function1[
    /* options */ js.UndefOr[antdLib.esIconIconFontMod.CustomIconOptions], 
    reactLib.reactMod.SFC[IconProps]
  ] = js.native
  @JSName("getTwoToneColor")
  var getTwoToneColor_Original: js.Function0[java.lang.String] = js.native
  @JSName("setTwoToneColor")
  var setTwoToneColor_Original: js.Function1[/* primaryColor */ java.lang.String, scala.Unit] = js.native
  var unstable_ChangeDefaultThemeOfIcons: js.UndefOr[js.Function1[/* theme */ ThemeType, scala.Unit]] = js.native
  var unstable_ChangeThemeOfIconsDangerously: js.UndefOr[js.Function1[/* theme */ js.UndefOr[ThemeType], scala.Unit]] = js.native
  def createFromIconfontCN(): reactLib.reactMod.SFC[IconProps] = js.native
  def createFromIconfontCN(options: antdLib.esIconIconFontMod.CustomIconOptions): reactLib.reactMod.SFC[IconProps] = js.native
  def getTwoToneColor(): java.lang.String = js.native
  def setTwoToneColor(primaryColor: java.lang.String): scala.Unit = js.native
}

