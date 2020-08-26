package typings.angularCompiler.mod

import typings.angularCompiler.anon.ChangeDetection
import typings.angularCompiler.anon.ComponentFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "CompileDirectiveMetadata")
@js.native
class CompileDirectiveMetadata protected ()
  extends typings.angularCompiler.compilerMod.CompileDirectiveMetadata {
  def this(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostListenersHostPropertiesHostAttributesProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ComponentFactory) = this()
}

/* static members */
@JSImport("@angular/compiler", "CompileDirectiveMetadata")
@js.native
object CompileDirectiveMetadata extends js.Object {
  def create(
    hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ChangeDetection
  ): typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata = js.native
}

