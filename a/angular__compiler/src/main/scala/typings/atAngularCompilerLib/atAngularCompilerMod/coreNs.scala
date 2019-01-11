package typings
package atAngularCompilerLib.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "core")
@js.native
object coreNs extends js.Object {
  val CUSTOM_ELEMENTS_SCHEMA: atAngularCompilerLib.srcCoreMod.SchemaMetadata = js.native
  val NO_ERRORS_SCHEMA: atAngularCompilerLib.srcCoreMod.SchemaMetadata = js.native
  val Type: stdLib.FunctionConstructor = js.native
  val createAttribute: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Attribute] = js.native
  val createComponent: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Component] = js.native
  val createContentChild: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Query] = js.native
  val createContentChildren: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Query] = js.native
  val createDirective: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Directive] = js.native
  val createHost: atAngularCompilerLib.srcCoreMod.MetadataFactory[js.Object] = js.native
  val createHostBinding: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.HostBinding] = js.native
  val createHostListener: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.HostListener] = js.native
  val createInject: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Inject] = js.native
  val createInjectable: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Injectable] = js.native
  val createInjectionToken: atAngularCompilerLib.srcCoreMod.MetadataFactory[js.Object] = js.native
  val createInput: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Input] = js.native
  val createNgModule: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.NgModule] = js.native
  val createOptional: atAngularCompilerLib.srcCoreMod.MetadataFactory[js.Object] = js.native
  val createOutput: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Output] = js.native
  val createPipe: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Pipe] = js.native
  val createSelf: atAngularCompilerLib.srcCoreMod.MetadataFactory[js.Object] = js.native
  val createSkipSelf: atAngularCompilerLib.srcCoreMod.MetadataFactory[js.Object] = js.native
  val createViewChild: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Query] = js.native
  val createViewChildren: atAngularCompilerLib.srcCoreMod.MetadataFactory[atAngularCompilerLib.srcCoreMod.Query] = js.native
  def parseSelectorToR3Selector(): atAngularCompilerLib.srcCoreMod.R3CssSelectorList = js.native
  def parseSelectorToR3Selector(selector: java.lang.String): atAngularCompilerLib.srcCoreMod.R3CssSelectorList = js.native
  @js.native
  object ArgumentType extends js.Object {
    /* 1 */ val Dynamic: atAngularCompilerLib.srcCoreMod.ArgumentType.Dynamic with scala.Double = js.native
    /* 0 */ val Inline: atAngularCompilerLib.srcCoreMod.ArgumentType.Inline with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ArgumentType with scala.Double] = js.native
  }
  
  @js.native
  object AttributeMarker extends js.Object {
    /* 1 */ val Classes: atAngularCompilerLib.srcCoreMod.AttributeMarker.Classes with scala.Double = js.native
    /* 0 */ val NamespaceURI: atAngularCompilerLib.srcCoreMod.AttributeMarker.NamespaceURI with scala.Double = js.native
    /* 3 */ val SelectOnly: atAngularCompilerLib.srcCoreMod.AttributeMarker.SelectOnly with scala.Double = js.native
    /* 2 */ val Styles: atAngularCompilerLib.srcCoreMod.AttributeMarker.Styles with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.AttributeMarker with scala.Double] = js.native
  }
  
  @js.native
  object BindingFlags extends js.Object {
    /* 48 */ val CatSyntheticProperty: atAngularCompilerLib.srcCoreMod.BindingFlags.CatSyntheticProperty with scala.Double = js.native
    /* 32 */ val SyntheticHostProperty: atAngularCompilerLib.srcCoreMod.BindingFlags.SyntheticHostProperty with scala.Double = js.native
    /* 16 */ val SyntheticProperty: atAngularCompilerLib.srcCoreMod.BindingFlags.SyntheticProperty with scala.Double = js.native
    /* 1 */ val TypeElementAttribute: atAngularCompilerLib.srcCoreMod.BindingFlags.TypeElementAttribute with scala.Double = js.native
    /* 2 */ val TypeElementClass: atAngularCompilerLib.srcCoreMod.BindingFlags.TypeElementClass with scala.Double = js.native
    /* 4 */ val TypeElementStyle: atAngularCompilerLib.srcCoreMod.BindingFlags.TypeElementStyle with scala.Double = js.native
    /* 8 */ val TypeProperty: atAngularCompilerLib.srcCoreMod.BindingFlags.TypeProperty with scala.Double = js.native
    /* 15 */ val Types: atAngularCompilerLib.srcCoreMod.BindingFlags.Types with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.BindingFlags with scala.Double] = js.native
  }
  
  @js.native
  object ChangeDetectionStrategy extends js.Object {
    /* 1 */ val Default: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy.Default with scala.Double = js.native
    /* 0 */ val OnPush: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy.OnPush with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy with scala.Double] = js.native
  }
  
  @js.native
  object DepFlags extends js.Object {
    /* 0 */ val None: atAngularCompilerLib.srcCoreMod.DepFlags.None with scala.Double = js.native
    /* 2 */ val Optional: atAngularCompilerLib.srcCoreMod.DepFlags.Optional with scala.Double = js.native
    /* 4 */ val Self: atAngularCompilerLib.srcCoreMod.DepFlags.Self with scala.Double = js.native
    /* 1 */ val SkipSelf: atAngularCompilerLib.srcCoreMod.DepFlags.SkipSelf with scala.Double = js.native
    /* 8 */ val Value: atAngularCompilerLib.srcCoreMod.DepFlags.Value with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.DepFlags with scala.Double] = js.native
  }
  
  @js.native
  object InjectFlags extends js.Object {
    /* 0 */ val Default: atAngularCompilerLib.srcCoreMod.InjectFlags.Default with scala.Double = js.native
    /* 1 */ val Host: atAngularCompilerLib.srcCoreMod.InjectFlags.Host with scala.Double = js.native
    /* 8 */ val Optional: atAngularCompilerLib.srcCoreMod.InjectFlags.Optional with scala.Double = js.native
    /* 2 */ val Self: atAngularCompilerLib.srcCoreMod.InjectFlags.Self with scala.Double = js.native
    /* 4 */ val SkipSelf: atAngularCompilerLib.srcCoreMod.InjectFlags.SkipSelf with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.InjectFlags with scala.Double] = js.native
  }
  
  @js.native
  object MissingTranslationStrategy extends js.Object {
    /* 0 */ val Error: atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy.Error with scala.Double = js.native
    /* 2 */ val Ignore: atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy.Ignore with scala.Double = js.native
    /* 1 */ val Warning: atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy.Warning with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy with scala.Double] = js.native
  }
  
  @js.native
  object NodeFlags extends js.Object {
    /* 2097152 */ val AfterContentChecked: atAngularCompilerLib.srcCoreMod.NodeFlags.AfterContentChecked with scala.Double = js.native
    /* 1048576 */ val AfterContentInit: atAngularCompilerLib.srcCoreMod.NodeFlags.AfterContentInit with scala.Double = js.native
    /* 8388608 */ val AfterViewChecked: atAngularCompilerLib.srcCoreMod.NodeFlags.AfterViewChecked with scala.Double = js.native
    /* 4194304 */ val AfterViewInit: atAngularCompilerLib.srcCoreMod.NodeFlags.AfterViewInit with scala.Double = js.native
    /* 20224 */ val CatProvider: atAngularCompilerLib.srcCoreMod.NodeFlags.CatProvider with scala.Double = js.native
    /* 3840 */ val CatProviderNoDirective: atAngularCompilerLib.srcCoreMod.NodeFlags.CatProviderNoDirective with scala.Double = js.native
    /* 224 */ val CatPureExpression: atAngularCompilerLib.srcCoreMod.NodeFlags.CatPureExpression with scala.Double = js.native
    /* 201326592 */ val CatQuery: atAngularCompilerLib.srcCoreMod.NodeFlags.CatQuery with scala.Double = js.native
    /* 3 */ val CatRenderNode: atAngularCompilerLib.srcCoreMod.NodeFlags.CatRenderNode with scala.Double = js.native
    /* 32768 */ val Component: atAngularCompilerLib.srcCoreMod.NodeFlags.Component with scala.Double = js.native
    /* 33554432 */ val ComponentView: atAngularCompilerLib.srcCoreMod.NodeFlags.ComponentView with scala.Double = js.native
    /* 262144 */ val DoCheck: atAngularCompilerLib.srcCoreMod.NodeFlags.DoCheck with scala.Double = js.native
    /* 536870912 */ val DynamicQuery: atAngularCompilerLib.srcCoreMod.NodeFlags.DynamicQuery with scala.Double = js.native
    /* 16777216 */ val EmbeddedViews: atAngularCompilerLib.srcCoreMod.NodeFlags.EmbeddedViews with scala.Double = js.native
    /* 4096 */ val LazyProvider: atAngularCompilerLib.srcCoreMod.NodeFlags.LazyProvider with scala.Double = js.native
    /* 0 */ val None: atAngularCompilerLib.srcCoreMod.NodeFlags.None with scala.Double = js.native
    /* 524288 */ val OnChanges: atAngularCompilerLib.srcCoreMod.NodeFlags.OnChanges with scala.Double = js.native
    /* 131072 */ val OnDestroy: atAngularCompilerLib.srcCoreMod.NodeFlags.OnDestroy with scala.Double = js.native
    /* 65536 */ val OnInit: atAngularCompilerLib.srcCoreMod.NodeFlags.OnInit with scala.Double = js.native
    /* 8192 */ val PrivateProvider: atAngularCompilerLib.srcCoreMod.NodeFlags.PrivateProvider with scala.Double = js.native
    /* 4 */ val ProjectedTemplate: atAngularCompilerLib.srcCoreMod.NodeFlags.ProjectedTemplate with scala.Double = js.native
    /* 268435456 */ val StaticQuery: atAngularCompilerLib.srcCoreMod.NodeFlags.StaticQuery with scala.Double = js.native
    /* 512 */ val TypeClassProvider: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeClassProvider with scala.Double = js.native
    /* 67108864 */ val TypeContentQuery: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeContentQuery with scala.Double = js.native
    /* 16384 */ val TypeDirective: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeDirective with scala.Double = js.native
    /* 1 */ val TypeElement: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeElement with scala.Double = js.native
    /* 1024 */ val TypeFactoryProvider: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeFactoryProvider with scala.Double = js.native
    /* 1073741824 */ val TypeModuleProvider: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeModuleProvider with scala.Double = js.native
    /* 8 */ val TypeNgContent: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeNgContent with scala.Double = js.native
    /* 16 */ val TypePipe: atAngularCompilerLib.srcCoreMod.NodeFlags.TypePipe with scala.Double = js.native
    /* 32 */ val TypePureArray: atAngularCompilerLib.srcCoreMod.NodeFlags.TypePureArray with scala.Double = js.native
    /* 64 */ val TypePureObject: atAngularCompilerLib.srcCoreMod.NodeFlags.TypePureObject with scala.Double = js.native
    /* 128 */ val TypePurePipe: atAngularCompilerLib.srcCoreMod.NodeFlags.TypePurePipe with scala.Double = js.native
    /* 2 */ val TypeText: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeText with scala.Double = js.native
    /* 2048 */ val TypeUseExistingProvider: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeUseExistingProvider with scala.Double = js.native
    /* 256 */ val TypeValueProvider: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeValueProvider with scala.Double = js.native
    /* 134217728 */ val TypeViewQuery: atAngularCompilerLib.srcCoreMod.NodeFlags.TypeViewQuery with scala.Double = js.native
    /* 201347067 */ val Types: atAngularCompilerLib.srcCoreMod.NodeFlags.Types with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.NodeFlags with scala.Double] = js.native
  }
  
  @js.native
  object QueryBindingType extends js.Object {
    /* 1 */ val All: atAngularCompilerLib.srcCoreMod.QueryBindingType.All with scala.Double = js.native
    /* 0 */ val First: atAngularCompilerLib.srcCoreMod.QueryBindingType.First with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.QueryBindingType with scala.Double] = js.native
  }
  
  @js.native
  object QueryValueType extends js.Object {
    /* 0 */ val ElementRef: atAngularCompilerLib.srcCoreMod.QueryValueType.ElementRef with scala.Double = js.native
    /* 4 */ val Provider: atAngularCompilerLib.srcCoreMod.QueryValueType.Provider with scala.Double = js.native
    /* 1 */ val RenderElement: atAngularCompilerLib.srcCoreMod.QueryValueType.RenderElement with scala.Double = js.native
    /* 2 */ val TemplateRef: atAngularCompilerLib.srcCoreMod.QueryValueType.TemplateRef with scala.Double = js.native
    /* 3 */ val ViewContainerRef: atAngularCompilerLib.srcCoreMod.QueryValueType.ViewContainerRef with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.QueryValueType with scala.Double] = js.native
  }
  
  @js.native
  object RenderFlags extends js.Object {
    /* 1 */ val Create: atAngularCompilerLib.srcCoreMod.RenderFlags.Create with scala.Double = js.native
    /* 2 */ val Update: atAngularCompilerLib.srcCoreMod.RenderFlags.Update with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.RenderFlags with scala.Double] = js.native
  }
  
  @js.native
  object SecurityContext extends js.Object {
    /* 1 */ val HTML: atAngularCompilerLib.srcCoreMod.SecurityContext.HTML with scala.Double = js.native
    /* 0 */ val NONE: atAngularCompilerLib.srcCoreMod.SecurityContext.NONE with scala.Double = js.native
    /* 5 */ val RESOURCE_URL: atAngularCompilerLib.srcCoreMod.SecurityContext.RESOURCE_URL with scala.Double = js.native
    /* 3 */ val SCRIPT: atAngularCompilerLib.srcCoreMod.SecurityContext.SCRIPT with scala.Double = js.native
    /* 2 */ val STYLE: atAngularCompilerLib.srcCoreMod.SecurityContext.STYLE with scala.Double = js.native
    /* 4 */ val URL: atAngularCompilerLib.srcCoreMod.SecurityContext.URL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.SecurityContext with scala.Double] = js.native
  }
  
  @js.native
  object SelectorFlags extends js.Object {
    /* 2 */ val ATTRIBUTE: atAngularCompilerLib.srcCoreMod.SelectorFlags.ATTRIBUTE with scala.Double = js.native
    /* 8 */ val CLASS: atAngularCompilerLib.srcCoreMod.SelectorFlags.CLASS with scala.Double = js.native
    /* 4 */ val ELEMENT: atAngularCompilerLib.srcCoreMod.SelectorFlags.ELEMENT with scala.Double = js.native
    /* 1 */ val NOT: atAngularCompilerLib.srcCoreMod.SelectorFlags.NOT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.SelectorFlags with scala.Double] = js.native
  }
  
  @js.native
  object ViewEncapsulation extends js.Object {
    /* 0 */ val Emulated: atAngularCompilerLib.srcCoreMod.ViewEncapsulation.Emulated with scala.Double = js.native
    /* 1 */ val Native: atAngularCompilerLib.srcCoreMod.ViewEncapsulation.Native with scala.Double = js.native
    /* 2 */ val None: atAngularCompilerLib.srcCoreMod.ViewEncapsulation.None with scala.Double = js.native
    /* 3 */ val ShadowDom: atAngularCompilerLib.srcCoreMod.ViewEncapsulation.ShadowDom with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ViewEncapsulation with scala.Double] = js.native
  }
  
  @js.native
  object ViewFlags extends js.Object {
    /* 0 */ val None: atAngularCompilerLib.srcCoreMod.ViewFlags.None with scala.Double = js.native
    /* 2 */ val OnPush: atAngularCompilerLib.srcCoreMod.ViewFlags.OnPush with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ViewFlags with scala.Double] = js.native
  }
  
  type ArgumentType = atAngularCompilerLib.srcCoreMod.ArgumentType
  type AttributeMarker = atAngularCompilerLib.srcCoreMod.AttributeMarker
  type BindingFlags = atAngularCompilerLib.srcCoreMod.BindingFlags
  type ChangeDetectionStrategy = atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy
  type DepFlags = atAngularCompilerLib.srcCoreMod.DepFlags
  type InjectFlags = atAngularCompilerLib.srcCoreMod.InjectFlags
  type MissingTranslationStrategy = atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy
  type NodeFlags = atAngularCompilerLib.srcCoreMod.NodeFlags
  type QueryBindingType = atAngularCompilerLib.srcCoreMod.QueryBindingType
  type QueryValueType = atAngularCompilerLib.srcCoreMod.QueryValueType
  type RenderFlags = atAngularCompilerLib.srcCoreMod.RenderFlags
  type SecurityContext = atAngularCompilerLib.srcCoreMod.SecurityContext
  type SelectorFlags = atAngularCompilerLib.srcCoreMod.SelectorFlags
  type ViewEncapsulation = atAngularCompilerLib.srcCoreMod.ViewEncapsulation
  type ViewFlags = atAngularCompilerLib.srcCoreMod.ViewFlags
}

