package typings.apolloUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storeUtilsMod {
  type Directives = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
  type ListValue = js.Array[scala.Null | typings.apolloUtilities.storeUtilsMod.IdValue]
  type NumberValue = typings.graphql.astMod.IntValueNode | typings.graphql.astMod.FloatValueNode
  type ScalarValue = typings.graphql.astMod.StringValueNode | typings.graphql.astMod.BooleanValueNode | typings.graphql.astMod.EnumValueNode
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.apolloUtilities.storeUtilsMod.IdValue
    - typings.apolloUtilities.storeUtilsMod.ListValue
    - typings.apolloUtilities.storeUtilsMod.JsonValue
    - scala.Null
    - `js.undefined`
    - scala.Unit
    - js.Object
  */
  type StoreValue = js.UndefOr[
    typings.apolloUtilities.storeUtilsMod._StoreValue | js.Array[java.lang.String] | scala.Double | java.lang.String | typings.apolloUtilities.storeUtilsMod.ListValue | scala.Null | scala.Unit | js.Object
  ]
  type VariableValue = js.Function1[/* node */ typings.graphql.astMod.VariableNode, js.Any]
}
