package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loginItemMod {
  type LoginItem = typings.react.mod.Component[typings.antDesignPro.loginItemMod.LoginItemProps, js.Any, js.Any]
  type LoginItemType = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemMap * / any ]: react.react.FC<ant-design-pro.ant-design-pro/lib/Login/LoginItem.WrappedLoginItemProps>}
    */ typings.antDesignPro.antDesignProStrings.LoginItemType with js.Any
  type WrappedLoginItemProps = typings.std.Omit[
    typings.antDesignPro.loginItemMod.LoginItemProps, 
    typings.antDesignPro.antDesignProStrings.form | typings.antDesignPro.antDesignProStrings.`type` | typings.antDesignPro.antDesignProStrings.updateActive
  ]
}
