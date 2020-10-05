package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object generateCalendarMod {
  type HeaderRender[DateType] = js.Function1[/* config */ typings.antd.anon.OnChange[DateType], typings.react.mod.ReactNode]
  type InjectDefaultProps[Props] = (typings.std.Omit[
    Props, 
    typings.antd.antdStrings.locale | typings.antd.antdStrings.generateConfig | typings.antd.antdStrings.prevIcon | typings.antd.antdStrings.nextIcon | typings.antd.antdStrings.superPrevIcon | typings.antd.antdStrings.superNextIcon
  ]) with typings.antd.anon.Locale
}
