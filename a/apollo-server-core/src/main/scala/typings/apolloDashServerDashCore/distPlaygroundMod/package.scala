package typings.apolloDashServerDashCore

import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.RenderPageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distPlaygroundMod {
  type PlaygroundConfig = RecursivePartial[RenderPageOptions] | Boolean
  type RecursivePartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array<object> : T[P] extends object | undefined? object : T[P]}
    */ typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.RecursivePartial with js.Any
}
