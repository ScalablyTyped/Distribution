package typings.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLoginLoginItemMod {
  import typings.antDashDesignDashPro.antDashDesignDashProStrings.`type`
  import typings.antDashDesignDashPro.antDashDesignDashProStrings.form
  import typings.antDashDesignDashPro.antDashDesignDashProStrings.updateActive
  import typings.react.reactMod.Component
  import typings.std.Omit

  type LoginItem = Component[LoginItemProps, js.Any, js.Any]
  type LoginItemType = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemMap * / any ]: react.react.FC<ant-design-pro.ant-design-pro/lib/Login/LoginItem.WrappedLoginItemProps>}
    */ typings.antDashDesignDashPro.antDashDesignDashProStrings.LoginItemType with js.Any
  type WrappedLoginItemProps = Omit[LoginItemProps, form | `type` | updateActive]
}
