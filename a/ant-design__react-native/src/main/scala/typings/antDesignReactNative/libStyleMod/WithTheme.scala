package typings.antDesignReactNative.libStyleMod

import typings.antDesignReactNative.AnonThemeStyles
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/style", "WithTheme")
@js.native
class WithTheme[T, S] ()
  extends Component[WithThemeProps[T, S], js.Object, js.Any] {
  def getStyles(theme: Theme): T = js.native
}

/* static members */
@JSImport("@ant-design/react-native/lib/style", "WithTheme")
@js.native
object WithTheme extends js.Object {
  var defaultProps: AnonThemeStyles = js.native
}

