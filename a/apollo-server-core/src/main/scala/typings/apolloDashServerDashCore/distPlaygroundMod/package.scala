package typings.apolloDashServerDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distPlaygroundMod {
  import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.RenderPageOptions

  type PlaygroundConfig = RecursivePartial[RenderPageOptions] | Boolean
  type RecursivePartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias apollo-server-core.apollo-server-core/dist/playground.RecursivePartial<U> * / object> : T[P] extends object | undefined? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias apollo-server-core.apollo-server-core/dist/playground.RecursivePartial<T[P]> * / object : T[P]}
    */ typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.RecursivePartial with js.Any
}
