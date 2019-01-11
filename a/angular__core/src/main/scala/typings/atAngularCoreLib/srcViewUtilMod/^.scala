package typings
package atAngularCoreLib.srcViewUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EMPTY_ARRAY: js.Array[js.Any] = js.native
  val NOOP: js.Any = js.native
  def calcBindingFlags(bindings: js.Array[atAngularCoreLib.srcViewTypesMod.BindingDef]): atAngularCoreLib.srcViewTypesMod.BindingFlags = js.native
  def checkAndUpdateBinding(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    `def`: atAngularCoreLib.srcViewTypesMod.NodeDef,
    bindingIdx: scala.Double,
    value: js.Any
  ): scala.Boolean = js.native
  def checkBinding(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    `def`: atAngularCoreLib.srcViewTypesMod.NodeDef,
    bindingIdx: scala.Double,
    value: js.Any
  ): scala.Boolean = js.native
  def checkBindingNoChanges(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    `def`: atAngularCoreLib.srcViewTypesMod.NodeDef,
    bindingIdx: scala.Double,
    value: js.Any
  ): scala.Unit = js.native
  def createRendererType2(values: atAngularCoreLib.Anon_Data): atAngularCoreLib.srcRenderApiMod.RendererType2 = js.native
  def declaredViewContainer(view: atAngularCoreLib.srcViewTypesMod.ViewData): atAngularCoreLib.srcViewTypesMod.ElementData | scala.Null = js.native
  def dispatchEvent(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    nodeIndex: scala.Double,
    eventName: java.lang.String,
    event: js.Any
  ): js.UndefOr[scala.Boolean] = js.native
  def elementEventFullName(target: java.lang.String, name: java.lang.String): java.lang.String = js.native
  def elementEventFullName(target: scala.Null, name: java.lang.String): java.lang.String = js.native
  def filterQueryId(queryId: scala.Double): scala.Double = js.native
  def getParentRenderElement(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    renderHost: js.Any,
    `def`: atAngularCoreLib.srcViewTypesMod.NodeDef
  ): js.Any = js.native
  def inlineInterpolate(
    valueCount: scala.Double,
    c0: java.lang.String,
    a1: js.Any,
    c1: java.lang.String,
    a2: js.UndefOr[js.Any],
    c2: js.UndefOr[java.lang.String],
    a3: js.UndefOr[js.Any],
    c3: js.UndefOr[java.lang.String],
    a4: js.UndefOr[js.Any],
    c4: js.UndefOr[java.lang.String],
    a5: js.UndefOr[js.Any],
    c5: js.UndefOr[java.lang.String],
    a6: js.UndefOr[js.Any],
    c6: js.UndefOr[java.lang.String],
    a7: js.UndefOr[js.Any],
    c7: js.UndefOr[java.lang.String],
    a8: js.UndefOr[js.Any],
    c8: js.UndefOr[java.lang.String],
    a9: js.UndefOr[js.Any],
    c9: js.UndefOr[java.lang.String]
  ): java.lang.String = js.native
  def interpolate(valueCount: scala.Double, constAndInterp: js.Array[java.lang.String]): java.lang.String = js.native
  def isComponentView(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Boolean = js.native
  def isEmbeddedView(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Boolean = js.native
  def markParentViewsForCheck(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Unit = js.native
  def markParentViewsForCheckProjectedViews(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    endView: atAngularCoreLib.srcViewTypesMod.ViewData
  ): scala.Unit = js.native
  def renderNode(view: atAngularCoreLib.srcViewTypesMod.ViewData, `def`: atAngularCoreLib.srcViewTypesMod.NodeDef): js.Any = js.native
  def resolveDefinition[D /* <: atAngularCoreLib.srcViewTypesMod.Definition[_] */](factory: atAngularCoreLib.srcViewTypesMod.DefinitionFactory[D]): D = js.native
  def resolveRendererType2(): atAngularCoreLib.srcRenderApiMod.RendererType2 | scala.Null = js.native
  def resolveRendererType2(`type`: atAngularCoreLib.srcRenderApiMod.RendererType2): atAngularCoreLib.srcRenderApiMod.RendererType2 | scala.Null = js.native
  def rootRenderNodes(view: atAngularCoreLib.srcViewTypesMod.ViewData): js.Array[_] = js.native
  def splitDepsDsl(deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _]): js.Array[atAngularCoreLib.srcViewTypesMod.DepDef] = js.native
  def splitDepsDsl(
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _],
    sourceName: java.lang.String
  ): js.Array[atAngularCoreLib.srcViewTypesMod.DepDef] = js.native
  def splitMatchedQueriesDsl(): atAngularCoreLib.Anon_MatchedQueries = js.native
  def splitMatchedQueriesDsl(
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, atAngularCoreLib.srcViewTypesMod.QueryValueType]
    ]
  ): atAngularCoreLib.Anon_MatchedQueries = js.native
  def splitNamespace(name: java.lang.String): js.Array[java.lang.String] = js.native
  def tokenKey(token: js.Any): java.lang.String = js.native
  def unwrapValue(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    nodeIdx: scala.Double,
    bindingIdx: scala.Double,
    value: js.Any
  ): js.Any = js.native
  def viewParentEl(view: atAngularCoreLib.srcViewTypesMod.ViewData): atAngularCoreLib.srcViewTypesMod.NodeDef | scala.Null = js.native
  def visitProjectedRenderNodes(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    ngContentIndex: scala.Double,
    action: atAngularCoreLib.srcViewUtilMod.RenderNodeAction,
    parentNode: js.Any,
    nextSibling: js.Any
  ): scala.Unit = js.native
  def visitProjectedRenderNodes(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    ngContentIndex: scala.Double,
    action: atAngularCoreLib.srcViewUtilMod.RenderNodeAction,
    parentNode: js.Any,
    nextSibling: js.Any,
    target: js.Array[_]
  ): scala.Unit = js.native
  def visitRootRenderNodes(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    action: atAngularCoreLib.srcViewUtilMod.RenderNodeAction,
    parentNode: js.Any,
    nextSibling: js.Any
  ): scala.Unit = js.native
  def visitRootRenderNodes(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    action: atAngularCoreLib.srcViewUtilMod.RenderNodeAction,
    parentNode: js.Any,
    nextSibling: js.Any,
    target: js.Array[_]
  ): scala.Unit = js.native
  def visitSiblingRenderNodes(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    action: atAngularCoreLib.srcViewUtilMod.RenderNodeAction,
    startIndex: scala.Double,
    endIndex: scala.Double,
    parentNode: js.Any,
    nextSibling: js.Any
  ): scala.Unit = js.native
  def visitSiblingRenderNodes(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    action: atAngularCoreLib.srcViewUtilMod.RenderNodeAction,
    startIndex: scala.Double,
    endIndex: scala.Double,
    parentNode: js.Any,
    nextSibling: js.Any,
    target: js.Array[_]
  ): scala.Unit = js.native
}

