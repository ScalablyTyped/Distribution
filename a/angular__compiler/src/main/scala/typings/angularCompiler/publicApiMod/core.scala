package typings.angularCompiler.publicApiMod

import typings.angularCompiler.coreMod.Component
import typings.angularCompiler.coreMod.Directive
import typings.angularCompiler.coreMod.HostBinding
import typings.angularCompiler.coreMod.HostListener
import typings.angularCompiler.coreMod.Inject
import typings.angularCompiler.coreMod.Injectable
import typings.angularCompiler.coreMod.Input
import typings.angularCompiler.coreMod.MetadataFactory
import typings.angularCompiler.coreMod.NgModule
import typings.angularCompiler.coreMod.Output
import typings.angularCompiler.coreMod.Pipe
import typings.angularCompiler.coreMod.Query
import typings.angularCompiler.coreMod.R3CssSelectorList
import typings.angularCompiler.coreMod.SchemaMetadata
import typings.std.FunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSImport("@angular/compiler/public_api", "core.CUSTOM_ELEMENTS_SCHEMA")
  @js.native
  val CUSTOM_ELEMENTS_SCHEMA: SchemaMetadata = js.native
  
  @JSImport("@angular/compiler/public_api", "core.ChangeDetectionStrategy")
  @js.native
  object ChangeDetectionStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompiler.coreMod.ChangeDetectionStrategy with Double] = js.native
    
    /* 1 */ val Default: typings.angularCompiler.coreMod.ChangeDetectionStrategy.Default with Double = js.native
    
    /* 0 */ val OnPush: typings.angularCompiler.coreMod.ChangeDetectionStrategy.OnPush with Double = js.native
  }
  
  @JSImport("@angular/compiler/public_api", "core.MissingTranslationStrategy")
  @js.native
  object MissingTranslationStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompiler.coreMod.MissingTranslationStrategy with Double] = js.native
    
    /* 0 */ val Error: typings.angularCompiler.coreMod.MissingTranslationStrategy.Error with Double = js.native
    
    /* 2 */ val Ignore: typings.angularCompiler.coreMod.MissingTranslationStrategy.Ignore with Double = js.native
    
    /* 1 */ val Warning: typings.angularCompiler.coreMod.MissingTranslationStrategy.Warning with Double = js.native
  }
  
  @JSImport("@angular/compiler/public_api", "core.NO_ERRORS_SCHEMA")
  @js.native
  val NO_ERRORS_SCHEMA: SchemaMetadata = js.native
  
  @JSImport("@angular/compiler/public_api", "core.SecurityContext")
  @js.native
  object SecurityContext extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompiler.coreMod.SecurityContext with Double] = js.native
    
    /* 1 */ val HTML: typings.angularCompiler.coreMod.SecurityContext.HTML with Double = js.native
    
    /* 0 */ val NONE: typings.angularCompiler.coreMod.SecurityContext.NONE with Double = js.native
    
    /* 5 */ val RESOURCE_URL: typings.angularCompiler.coreMod.SecurityContext.RESOURCE_URL with Double = js.native
    
    /* 3 */ val SCRIPT: typings.angularCompiler.coreMod.SecurityContext.SCRIPT with Double = js.native
    
    /* 2 */ val STYLE: typings.angularCompiler.coreMod.SecurityContext.STYLE with Double = js.native
    
    /* 4 */ val URL: typings.angularCompiler.coreMod.SecurityContext.URL with Double = js.native
  }
  
  @JSImport("@angular/compiler/public_api", "core.Type")
  @js.native
  val Type: FunctionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler/public_api", "core.Type")
  @js.native
  class TypeCls protected ()
    extends js.Function {
    /**
      * Creates a new function.
      * @param args A list of arguments the function accepts.
      */
    def this(args: String*) = this()
  }
  
  @JSImport("@angular/compiler/public_api", "core.ViewEncapsulation")
  @js.native
  object ViewEncapsulation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompiler.coreMod.ViewEncapsulation with Double] = js.native
    
    /* 0 */ val Emulated: typings.angularCompiler.coreMod.ViewEncapsulation.Emulated with Double = js.native
    
    /* 2 */ val None: typings.angularCompiler.coreMod.ViewEncapsulation.None with Double = js.native
    
    /* 3 */ val ShadowDom: typings.angularCompiler.coreMod.ViewEncapsulation.ShadowDom with Double = js.native
  }
  
  @JSImport("@angular/compiler/public_api", "core.createAttribute")
  @js.native
  val createAttribute: MetadataFactory[typings.angularCompiler.coreMod.Attribute] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createComponent")
  @js.native
  val createComponent: MetadataFactory[Component] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createContentChild")
  @js.native
  val createContentChild: MetadataFactory[Query] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createContentChildren")
  @js.native
  val createContentChildren: MetadataFactory[Query] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createDirective")
  @js.native
  val createDirective: MetadataFactory[Directive] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createHost")
  @js.native
  val createHost: MetadataFactory[js.Any] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createHostBinding")
  @js.native
  val createHostBinding: MetadataFactory[HostBinding] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createHostListener")
  @js.native
  val createHostListener: MetadataFactory[HostListener] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createInject")
  @js.native
  val createInject: MetadataFactory[Inject] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createInjectable")
  @js.native
  val createInjectable: MetadataFactory[Injectable] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createInjectionToken")
  @js.native
  val createInjectionToken: MetadataFactory[js.Object] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createInput")
  @js.native
  val createInput: MetadataFactory[Input] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createNgModule")
  @js.native
  val createNgModule: MetadataFactory[NgModule] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createOptional")
  @js.native
  val createOptional: MetadataFactory[js.Any] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createOutput")
  @js.native
  val createOutput: MetadataFactory[Output] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createPipe")
  @js.native
  val createPipe: MetadataFactory[Pipe] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createSelf")
  @js.native
  val createSelf: MetadataFactory[js.Any] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createSkipSelf")
  @js.native
  val createSkipSelf: MetadataFactory[js.Any] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createViewChild")
  @js.native
  val createViewChild: MetadataFactory[Query] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.createViewChildren")
  @js.native
  val createViewChildren: MetadataFactory[Query] = js.native
  
  @JSImport("@angular/compiler/public_api", "core.parseSelectorToR3Selector")
  @js.native
  def parseSelectorToR3Selector(): R3CssSelectorList = js.native
  @JSImport("@angular/compiler/public_api", "core.parseSelectorToR3Selector")
  @js.native
  def parseSelectorToR3Selector(selector: String): R3CssSelectorList = js.native
}
