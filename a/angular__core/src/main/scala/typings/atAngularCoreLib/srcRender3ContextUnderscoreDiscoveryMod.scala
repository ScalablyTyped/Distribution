package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/context_discovery", JSImport.Namespace)
@js.native
object srcRender3ContextUnderscoreDiscoveryMod extends js.Object {
  def attachPatchData(target: js.Any, data: atAngularCoreLib.srcRender3InterfacesContextMod.LContext): scala.Unit = js.native
  def attachPatchData(target: js.Any, data: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Unit = js.native
  def discoverDirectives(
    nodeIndex: scala.Double,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    includeComponents: scala.Boolean
  ): js.Array[_] | scala.Null = js.native
  def discoverLocalRefs(lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, nodeIndex: scala.Double): ScalablyTyped.runtime.StringDictionary[js.Any] | scala.Null = js.native
  def getComponentViewByInstance(componentInstance: js.Object): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getContext(target: js.Any): atAngularCoreLib.srcRender3InterfacesContextMod.LContext | scala.Null = js.native
  def isComponentInstance(instance: js.Any): scala.Boolean = js.native
  def isDirectiveInstance(instance: js.Any): scala.Boolean = js.native
}

