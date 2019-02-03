package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distPlaygroundMod {
  type PlaygroundConfig = (RecursivePartial[
    atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.RenderPageOptions
  ]) | scala.Boolean
  type RecursivePartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | apollo-env.apollo-env/lib/polyfills/array.Global.Array<object>}
    */ apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.RecursivePartial with T
}
