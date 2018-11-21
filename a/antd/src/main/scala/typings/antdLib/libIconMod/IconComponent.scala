package typings
package antdLib.libIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconComponent[P]
  extends reactLib.reactMod.ReactNs.FunctionComponent[P] {
  var createFromIconfontCN: js.UndefOr[
    js.Function1[
      /* options */ js.UndefOr[antdLib.libIconIconFontMod.CustomIconOptions], 
      reactLib.reactMod.ReactNs.SFC[IconProps]
    ]
  ] = js.native
  var getTwoToneColor: js.UndefOr[js.Function0[java.lang.String]] = js.native
  var setTwoToneColor: js.UndefOr[js.Function1[/* primaryColor */ java.lang.String, scala.Unit]] = js.native
  var unstable_ChangeDefaultThemeOfIcons: js.UndefOr[js.Function1[/* theme */ ThemeType, scala.Unit]] = js.native
  var unstable_ChangeThemeOfIconsDangerously: js.UndefOr[js.Function1[/* theme */ js.UndefOr[ThemeType], scala.Unit]] = js.native
}

