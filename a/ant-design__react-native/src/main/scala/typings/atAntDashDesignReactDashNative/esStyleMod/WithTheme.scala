package typings.atAntDashDesignReactDashNative.esStyleMod

import typings.atAntDashDesignReactDashNative.Anon_ThemeStyles
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/es/style", "WithTheme")
@js.native
class WithTheme[T, S] ()
  extends Component[WithThemeProps[T, S], js.Object, js.Any] {
  def getStyles(theme: Theme): T = js.native
}

/* static members */
@JSImport("@ant-design/react-native/es/style", "WithTheme")
@js.native
object WithTheme extends js.Object {
  var defaultProps: Anon_ThemeStyles = js.native
}

