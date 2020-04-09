package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object generatePickerMod {
  type InjectDefaultProps[Props] = (typings.std.Omit[
    Props, 
    typings.antd.antdStrings.locale | typings.antd.antdStrings.generateConfig | typings.antd.antdStrings.prevIcon | typings.antd.antdStrings.nextIcon | typings.antd.antdStrings.superPrevIcon | typings.antd.antdStrings.superNextIcon | typings.antd.antdStrings.hideHeader | typings.antd.antdStrings.components
  ]) with typings.antd.AnonLocaleSize
}
