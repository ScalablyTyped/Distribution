package typings
package atAngularCompilerLib.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  class TypeCls protected ()
    extends js.Function {
    /**
      * Creates a new function.
      * @param args A list of arguments the function accepts.
      */
    def this(args: java.lang.String*) = this()
  }
  
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
  object ChangeDetectionStrategy extends js.Object {
    /* 1 */ val Default: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy.Default with scala.Double = js.native
    /* 0 */ val OnPush: atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy.OnPush with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy with scala.Double] = js.native
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
  object ViewEncapsulation extends js.Object {
    /* 0 */ val Emulated: atAngularCompilerLib.srcCoreMod.ViewEncapsulation.Emulated with scala.Double = js.native
    /* 1 */ val Native: atAngularCompilerLib.srcCoreMod.ViewEncapsulation.Native with scala.Double = js.native
    /* 2 */ val None: atAngularCompilerLib.srcCoreMod.ViewEncapsulation.None with scala.Double = js.native
    /* 3 */ val ShadowDom: atAngularCompilerLib.srcCoreMod.ViewEncapsulation.ShadowDom with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ViewEncapsulation with scala.Double] = js.native
  }
  
  type ArgumentType = atAngularCompilerLib.srcCoreMod.ArgumentType
  type AttributeMarker = atAngularCompilerLib.srcCoreMod.AttributeMarker
  type BindingFlags = atAngularCompilerLib.srcCoreMod.BindingFlags
  type DepFlags = atAngularCompilerLib.srcCoreMod.DepFlags
  type InjectFlags = atAngularCompilerLib.srcCoreMod.InjectFlags
  type NodeFlags = atAngularCompilerLib.srcCoreMod.NodeFlags
  type QueryBindingType = atAngularCompilerLib.srcCoreMod.QueryBindingType
  type QueryValueType = atAngularCompilerLib.srcCoreMod.QueryValueType
  type RenderFlags = atAngularCompilerLib.srcCoreMod.RenderFlags
  type SelectorFlags = atAngularCompilerLib.srcCoreMod.SelectorFlags
  type ViewFlags = atAngularCompilerLib.srcCoreMod.ViewFlags
}

