package typings
package atAntDashDesignReactDashNativeLib.esStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/es/style", "WithTheme")
@js.native
class WithTheme[T, S] ()
  extends reactLib.reactMod.Component[WithThemeProps[T, S], js.Object, js.Any] {
  def getStyles(theme: Theme): T = js.native
}

/* static members */
@JSImport("@ant-design/react-native/es/style", "WithTheme")
@js.native
object WithTheme extends js.Object {
  var defaultProps: atAntDashDesignReactDashNativeLib.Anon_ThemeStyles = js.native
}

