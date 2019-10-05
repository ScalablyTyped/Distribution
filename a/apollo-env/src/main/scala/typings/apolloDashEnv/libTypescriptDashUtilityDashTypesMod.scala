package typings.apolloDashEnv

import typings.std.Pick
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/typescript-utility-types", JSImport.Namespace)
@js.native
object libTypescriptDashUtilityDashTypesMod extends js.Object {
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias apollo-env.apollo-env/lib/typescript-utility-types.DeepPartial<T[P]> * / object}
    */ typings.apolloDashEnv.apolloDashEnvStrings.DeepPartial with js.Any
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}

