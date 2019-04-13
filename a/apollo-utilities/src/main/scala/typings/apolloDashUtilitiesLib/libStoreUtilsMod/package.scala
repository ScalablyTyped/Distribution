package typings
package apolloDashUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStoreUtilsMod {
  type Directives = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
  type ListValue = js.Array[scala.Null | IdValue]
  type NumberValue = graphqlLib.languageAstMod.IntValueNode | graphqlLib.languageAstMod.FloatValueNode
  type ScalarValue = graphqlLib.languageAstMod.StringValueNode | graphqlLib.languageAstMod.BooleanValueNode | graphqlLib.languageAstMod.EnumValueNode
  type StoreValue = js.UndefOr[
    scala.Double | java.lang.String | js.Array[java.lang.String] | IdValue | ListValue | JsonValue | scala.Null | scala.Unit | js.Object
  ]
  type VariableValue = js.Function1[/* node */ graphqlLib.languageAstMod.VariableNode, js.Any]
}
