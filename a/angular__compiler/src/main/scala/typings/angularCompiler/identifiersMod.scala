package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.outputAstMod.ExternalReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/identifiers", JSImport.Namespace)
@js.native
object identifiersMod extends js.Object {
  @js.native
  class Identifiers () extends js.Object
  
  def createTokenForExternalReference(reflector: CompileReflector, reference: ExternalReference): CompileTokenMetadata = js.native
  def createTokenForReference(reference: js.Any): CompileTokenMetadata = js.native
  /* static members */
  @js.native
  object Identifiers extends js.Object {
    var ANALYZE_FOR_ENTRY_COMPONENTS: ExternalReference = js.native
    var ChangeDetectionStrategy: ExternalReference = js.native
    var ChangeDetectorRef: ExternalReference = js.native
    var CodegenComponentFactoryResolver: ExternalReference = js.native
    var ComponentFactory: ExternalReference = js.native
    var ComponentFactoryResolver: ExternalReference = js.native
    var ComponentRef: ExternalReference = js.native
    var EMPTY_ARRAY: ExternalReference = js.native
    var EMPTY_MAP: ExternalReference = js.native
    var ElementRef: ExternalReference = js.native
    var INJECTOR: ExternalReference = js.native
    var InjectableDef: ExternalReference = js.native
    var Injector: ExternalReference = js.native
    var LOCALE_ID: ExternalReference = js.native
    var NgModuleFactory: ExternalReference = js.native
    var NgModuleRef: ExternalReference = js.native
    var QueryList: ExternalReference = js.native
    var RegisterModuleFactoryFn: ExternalReference = js.native
    var Renderer: ExternalReference = js.native
    var Renderer2: ExternalReference = js.native
    var RendererType2: ExternalReference = js.native
    var SecurityContext: ExternalReference = js.native
    var TRANSLATIONS_FORMAT: ExternalReference = js.native
    var TemplateRef: ExternalReference = js.native
    var ViewContainerRef: ExternalReference = js.native
    var ViewDefinition: ExternalReference = js.native
    var ViewEncapsulation: ExternalReference = js.native
    var anchorDef: ExternalReference = js.native
    var createComponentFactory: ExternalReference = js.native
    var createModuleFactory: ExternalReference = js.native
    var createRendererType2: ExternalReference = js.native
    var directiveDef: ExternalReference = js.native
    var directiveInject: ExternalReference = js.native
    var elementDef: ExternalReference = js.native
    var inject: ExternalReference = js.native
    var inlineInterpolate: ExternalReference = js.native
    var interpolate: ExternalReference = js.native
    var moduleDef: ExternalReference = js.native
    var moduleProviderDef: ExternalReference = js.native
    var ngContentDef: ExternalReference = js.native
    var nodeValue: ExternalReference = js.native
    var pipeDef: ExternalReference = js.native
    var providerDef: ExternalReference = js.native
    var pureArrayDef: ExternalReference = js.native
    var pureObjectDef: ExternalReference = js.native
    var purePipeDef: ExternalReference = js.native
    var queryDef: ExternalReference = js.native
    var setClassMetadata: ExternalReference = js.native
    var textDef: ExternalReference = js.native
    var unwrapValue: ExternalReference = js.native
    var viewDef: ExternalReference = js.native
    var ɵɵdefineInjectable: ExternalReference = js.native
  }
  
}

