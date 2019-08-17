package typings.apolloDashUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStoreUtilsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.languageAstMod.BooleanValueNode
  import typings.graphql.languageAstMod.EnumValueNode
  import typings.graphql.languageAstMod.FloatValueNode
  import typings.graphql.languageAstMod.IntValueNode
  import typings.graphql.languageAstMod.StringValueNode
  import typings.graphql.languageAstMod.VariableNode

  type Directives = StringDictionary[StringDictionary[js.Any]]
  type ListValue = js.Array[Null | IdValue]
  type NumberValue = IntValueNode | FloatValueNode
  type ScalarValue = StringValueNode | BooleanValueNode | EnumValueNode
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.apolloDashUtilities.libStoreUtilsMod.IdValue
    - typings.apolloDashUtilities.libStoreUtilsMod.ListValue
    - typings.apolloDashUtilities.libStoreUtilsMod.JsonValue
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - scala.Unit
    - js.Object
  */
  type StoreValue = js.UndefOr[
    _StoreValue | js.Array[String] | Double | String | ListValue | Null | Unit | js.Object
  ]
  type VariableValue = js.Function1[/* node */ VariableNode, js.Any]
}
