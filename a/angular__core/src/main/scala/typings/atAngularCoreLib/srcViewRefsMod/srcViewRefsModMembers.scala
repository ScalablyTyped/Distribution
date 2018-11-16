package typings
package atAngularCoreLib.srcViewRefsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/refs", JSImport.Namespace)
@js.native
object srcViewRefsModMembers extends js.Object {
  def createChangeDetectorRef(view: atAngularCoreLib.srcViewTypesMod.ViewData): atAngularCoreLib.srcChangeUnderscoreDetectionChangeUnderscoreDetectionMod.ChangeDetectorRef = js.native
  def createComponentFactory(
    selector: java.lang.String,
    componentType: atAngularCoreLib.srcTypeMod.Type[_],
    viewDefFactory: atAngularCoreLib.srcViewTypesMod.ViewDefinitionFactory,
    inputs: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    outputs: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    ngContentSelectors: js.Array[java.lang.String]
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_] = js.native
  def createComponentFactory(
    selector: java.lang.String,
    componentType: atAngularCoreLib.srcTypeMod.Type[_],
    viewDefFactory: atAngularCoreLib.srcViewTypesMod.ViewDefinitionFactory,
    inputs: scala.Null,
    outputs: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    ngContentSelectors: js.Array[java.lang.String]
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_] = js.native
  def createInjector(view: atAngularCoreLib.srcViewTypesMod.ViewData, elDef: atAngularCoreLib.srcViewTypesMod.NodeDef): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createNgModuleRef(
    moduleType: atAngularCoreLib.srcTypeMod.Type[_],
    parent: atAngularCoreLib.srcDiInjectorMod.Injector,
    bootstrapComponents: js.Array[atAngularCoreLib.srcTypeMod.Type[_]],
    `def`: atAngularCoreLib.srcViewTypesMod.NgModuleDefinition
  ): atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_] = js.native
  def createRendererV1(view: atAngularCoreLib.srcViewTypesMod.ViewData): atAngularCoreLib.srcRenderApiMod.Renderer = js.native
  def createTemplateData(view: atAngularCoreLib.srcViewTypesMod.ViewData, `def`: atAngularCoreLib.srcViewTypesMod.NodeDef): atAngularCoreLib.srcViewTypesMod.TemplateData = js.native
  def createViewContainerData(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    elDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    elData: atAngularCoreLib.srcViewTypesMod.ElementData
  ): atAngularCoreLib.srcViewTypesMod.ViewContainerData = js.native
  def getComponentViewDefinitionFactory(componentFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_]): atAngularCoreLib.srcViewTypesMod.ViewDefinitionFactory = js.native
  def nodeValue(view: atAngularCoreLib.srcViewTypesMod.ViewData, index: scala.Double): js.Any = js.native
}

