package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.anon.ChangeDetection
import typings.angularCompiler.anon.ComponentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "CompileDirectiveMetadata")
@js.native
class CompileDirectiveMetadata protected ()
  extends typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata {
  def this(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostListenersHostPropertiesHostAttributesProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ComponentFactory) = this()
}
/* static members */
object CompileDirectiveMetadata {
  
  @JSImport("@angular/compiler/src/compiler", "CompileDirectiveMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ChangeDetection
  ): typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata]
}
