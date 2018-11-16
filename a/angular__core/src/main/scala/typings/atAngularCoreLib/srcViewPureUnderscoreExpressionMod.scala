package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/pure_expression", JSImport.Namespace)
@js.native
object srcViewPureUnderscoreExpressionMod extends js.Object {
  def checkAndUpdatePureExpressionDynamic(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    `def`: atAngularCoreLib.srcViewTypesMod.NodeDef,
    values: js.Array[_]
  ): scala.Boolean = js.native
  def checkAndUpdatePureExpressionInline(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    `def`: atAngularCoreLib.srcViewTypesMod.NodeDef,
    v0: js.Any,
    v1: js.Any,
    v2: js.Any,
    v3: js.Any,
    v4: js.Any,
    v5: js.Any,
    v6: js.Any,
    v7: js.Any,
    v8: js.Any,
    v9: js.Any
  ): scala.Boolean = js.native
  def createPureExpression(view: atAngularCoreLib.srcViewTypesMod.ViewData, `def`: atAngularCoreLib.srcViewTypesMod.NodeDef): atAngularCoreLib.srcViewTypesMod.PureExpressionData = js.native
  def pureArrayDef(checkIndex: scala.Double, argCount: scala.Double): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def pureObjectDef(checkIndex: scala.Double, propToIndex: ScalablyTyped.runtime.StringDictionary[scala.Double]): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def purePipeDef(checkIndex: scala.Double, argCount: scala.Double): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
}

