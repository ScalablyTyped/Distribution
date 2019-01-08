package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/context_discovery", JSImport.Namespace)
@js.native
object srcRender3ContextUnderscoreDiscoveryMod extends js.Object {
  def attachPatchData(target: js.Any, data: atAngularCoreLib.srcRender3InterfacesContextMod.LContext): scala.Unit = js.native
  def attachPatchData(target: js.Any, data: atAngularCoreLib.srcRender3InterfacesViewMod.LView): scala.Unit = js.native
  def discoverLocalRefs(lView: atAngularCoreLib.srcRender3InterfacesViewMod.LView, nodeIndex: scala.Double): org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null = js.native
  def getComponentAtNodeIndex(nodeIndex: scala.Double, lView: atAngularCoreLib.srcRender3InterfacesViewMod.LView): js.Object | scala.Null = js.native
  def getComponentViewByInstance(componentInstance: js.Object): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def getDirectivesAtNodeIndex(
    nodeIndex: scala.Double,
    lView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    includeComponents: scala.Boolean
  ): js.Array[_] | scala.Null = js.native
  def getLContext(target: js.Any): atAngularCoreLib.srcRender3InterfacesContextMod.LContext | scala.Null = js.native
  def isComponentInstance(instance: js.Any): scala.Boolean = js.native
  def isDirectiveInstance(instance: js.Any): scala.Boolean = js.native
}

