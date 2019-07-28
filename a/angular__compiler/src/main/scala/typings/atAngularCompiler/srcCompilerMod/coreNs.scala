package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcCoreMod.Component
import typings.atAngularCompiler.srcCoreMod.Directive
import typings.atAngularCompiler.srcCoreMod.HostBinding
import typings.atAngularCompiler.srcCoreMod.HostListener
import typings.atAngularCompiler.srcCoreMod.Inject
import typings.atAngularCompiler.srcCoreMod.Injectable
import typings.atAngularCompiler.srcCoreMod.Input
import typings.atAngularCompiler.srcCoreMod.MetadataFactory
import typings.atAngularCompiler.srcCoreMod.NgModule
import typings.atAngularCompiler.srcCoreMod.Output
import typings.atAngularCompiler.srcCoreMod.Pipe
import typings.atAngularCompiler.srcCoreMod.Query
import typings.atAngularCompiler.srcCoreMod.R3CssSelectorList
import typings.atAngularCompiler.srcCoreMod.SchemaMetadata
import typings.std.FunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  class TypeCls protected ()
    extends js.Function {
    /**
      * Creates a new function.
      * @param args A list of arguments the function accepts.
      */
    def this(args: String*) = this()
  }
  
  val CUSTOM_ELEMENTS_SCHEMA: SchemaMetadata = js.native
  val NO_ERRORS_SCHEMA: SchemaMetadata = js.native
  val Type: FunctionConstructor = js.native
  val createAttribute: MetadataFactory[typings.atAngularCompiler.srcCoreMod.Attribute] = js.native
  val createComponent: MetadataFactory[Component] = js.native
  val createContentChild: MetadataFactory[Query] = js.native
  val createContentChildren: MetadataFactory[Query] = js.native
  val createDirective: MetadataFactory[Directive] = js.native
  val createHost: MetadataFactory[js.Object] = js.native
  val createHostBinding: MetadataFactory[HostBinding] = js.native
  val createHostListener: MetadataFactory[HostListener] = js.native
  val createInject: MetadataFactory[Inject] = js.native
  val createInjectable: MetadataFactory[Injectable] = js.native
  val createInjectionToken: MetadataFactory[js.Object] = js.native
  val createInput: MetadataFactory[Input] = js.native
  val createNgModule: MetadataFactory[NgModule] = js.native
  val createOptional: MetadataFactory[js.Object] = js.native
  val createOutput: MetadataFactory[Output] = js.native
  val createPipe: MetadataFactory[Pipe] = js.native
  val createSelf: MetadataFactory[js.Object] = js.native
  val createSkipSelf: MetadataFactory[js.Object] = js.native
  val createViewChild: MetadataFactory[Query] = js.native
  val createViewChildren: MetadataFactory[Query] = js.native
  def parseSelectorToR3Selector(): R3CssSelectorList = js.native
  def parseSelectorToR3Selector(selector: String): R3CssSelectorList = js.native
  @js.native
  object ChangeDetectionStrategy extends js.Object {
    /* 1 */ val Default: typings.atAngularCompiler.srcCoreMod.ChangeDetectionStrategy.Default with Double = js.native
    /* 0 */ val OnPush: typings.atAngularCompiler.srcCoreMod.ChangeDetectionStrategy.OnPush with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atAngularCompiler.srcCoreMod.ChangeDetectionStrategy with Double] = js.native
  }
  
  @js.native
  object MissingTranslationStrategy extends js.Object {
    /* 0 */ val Error: typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy.Error with Double = js.native
    /* 2 */ val Ignore: typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy.Ignore with Double = js.native
    /* 1 */ val Warning: typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy.Warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy with Double] = js.native
  }
  
  @js.native
  object SecurityContext extends js.Object {
    /* 1 */ val HTML: typings.atAngularCompiler.srcCoreMod.SecurityContext.HTML with Double = js.native
    /* 0 */ val NONE: typings.atAngularCompiler.srcCoreMod.SecurityContext.NONE with Double = js.native
    /* 5 */ val RESOURCE_URL: typings.atAngularCompiler.srcCoreMod.SecurityContext.RESOURCE_URL with Double = js.native
    /* 3 */ val SCRIPT: typings.atAngularCompiler.srcCoreMod.SecurityContext.SCRIPT with Double = js.native
    /* 2 */ val STYLE: typings.atAngularCompiler.srcCoreMod.SecurityContext.STYLE with Double = js.native
    /* 4 */ val URL: typings.atAngularCompiler.srcCoreMod.SecurityContext.URL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atAngularCompiler.srcCoreMod.SecurityContext with Double] = js.native
  }
  
  @js.native
  object ViewEncapsulation extends js.Object {
    /* 0 */ val Emulated: typings.atAngularCompiler.srcCoreMod.ViewEncapsulation.Emulated with Double = js.native
    /* 1 */ val Native: typings.atAngularCompiler.srcCoreMod.ViewEncapsulation.Native with Double = js.native
    /* 2 */ val None: typings.atAngularCompiler.srcCoreMod.ViewEncapsulation.None with Double = js.native
    /* 3 */ val ShadowDom: typings.atAngularCompiler.srcCoreMod.ViewEncapsulation.ShadowDom with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atAngularCompiler.srcCoreMod.ViewEncapsulation with Double] = js.native
  }
  
  type ArgumentType = typings.atAngularCompiler.srcCoreMod.ArgumentType
  type AttributeMarker = typings.atAngularCompiler.srcCoreMod.AttributeMarker
  type BindingFlags = typings.atAngularCompiler.srcCoreMod.BindingFlags
  type DepFlags = typings.atAngularCompiler.srcCoreMod.DepFlags
  type InjectFlags = typings.atAngularCompiler.srcCoreMod.InjectFlags
  type NodeFlags = typings.atAngularCompiler.srcCoreMod.NodeFlags
  type QueryBindingType = typings.atAngularCompiler.srcCoreMod.QueryBindingType
  type QueryValueType = typings.atAngularCompiler.srcCoreMod.QueryValueType
  type RenderFlags = typings.atAngularCompiler.srcCoreMod.RenderFlags
  type SelectorFlags = typings.atAngularCompiler.srcCoreMod.SelectorFlags
  type ViewFlags = typings.atAngularCompiler.srcCoreMod.ViewFlags
}

