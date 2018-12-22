package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/provider", JSImport.Namespace)
@js.native
object srcViewProviderMod extends js.Object {
  def _def(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def _def(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    bindings: js.Array[atAngularCoreLib.srcViewTypesMod.BindingDef]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def _def(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    bindings: js.Array[atAngularCoreLib.srcViewTypesMod.BindingDef],
    outputs: js.Array[atAngularCoreLib.srcViewTypesMod.OutputDef]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def _def(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def _def(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    bindings: js.Array[atAngularCoreLib.srcViewTypesMod.BindingDef]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def _def(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    bindings: js.Array[atAngularCoreLib.srcViewTypesMod.BindingDef],
    outputs: js.Array[atAngularCoreLib.srcViewTypesMod.OutputDef]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def callLifecycleHooksChildrenFirst(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    lifecycles: atAngularCoreLib.srcViewTypesMod.NodeFlags
  ): scala.Unit = js.native
  def checkAndUpdateDirectiveDynamic(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    `def`: atAngularCoreLib.srcViewTypesMod.NodeDef,
    values: js.Array[_]
  ): scala.Boolean = js.native
  def checkAndUpdateDirectiveInline(
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
  def createDirectiveInstance(view: atAngularCoreLib.srcViewTypesMod.ViewData, `def`: atAngularCoreLib.srcViewTypesMod.NodeDef): js.Any = js.native
  def createPipeInstance(view: atAngularCoreLib.srcViewTypesMod.ViewData, `def`: atAngularCoreLib.srcViewTypesMod.NodeDef): js.Any = js.native
  def createProviderInstance(view: atAngularCoreLib.srcViewTypesMod.ViewData, `def`: atAngularCoreLib.srcViewTypesMod.NodeDef): js.Any = js.native
  def directiveDef(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[scala.Double | java.lang.String, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _])]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def directiveDef(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[scala.Double | java.lang.String, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _])],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def directiveDef(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def directiveDef(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    props: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def directiveDef(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _])]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def directiveDef(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _])],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def directiveDef(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def directiveDef(
    checkIndex: scala.Double,
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    props: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def pipeDef(
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def providerDef(
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ],
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def providerDef(
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    matchedQueries: scala.Null,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
  def resolveDep(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    elDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    allowPrivateServices: scala.Boolean,
    depDef: atAngularCoreLib.srcViewTypesMod.DepDef
  ): js.Any = js.native
  def resolveDep(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    elDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    allowPrivateServices: scala.Boolean,
    depDef: atAngularCoreLib.srcViewTypesMod.DepDef,
    notFoundValue: js.Any
  ): js.Any = js.native
}

