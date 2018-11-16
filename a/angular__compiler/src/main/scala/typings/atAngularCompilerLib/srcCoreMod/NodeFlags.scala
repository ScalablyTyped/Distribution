package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeFlags extends js.Object

@JSImport("@angular/compiler/src/core", "NodeFlags")
@js.native
object NodeFlags extends js.Object {
  @js.native
  sealed trait AfterContentChecked
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait AfterContentInit
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait AfterViewChecked
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait AfterViewInit
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait CatProvider
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait CatProviderNoDirective
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait CatPureExpression
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait CatQuery
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait CatRenderNode
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait Component
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait ComponentView
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait DoCheck
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait DynamicQuery
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait EmbeddedViews
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait LazyProvider
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait None
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait OnChanges
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait OnDestroy
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait OnInit
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait PrivateProvider
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait ProjectedTemplate
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait StaticQuery
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeClassProvider
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeContentQuery
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeDirective
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeElement
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeFactoryProvider
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeModuleProvider
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeNgContent
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypePipe
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypePureArray
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypePureObject
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypePurePipe
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeText
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeUseExistingProvider
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeValueProvider
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait TypeViewQuery
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  @js.native
  sealed trait Types
    extends atAngularCompilerLib.srcCoreMod.NodeFlags
  
  /* 2097152 */ val AfterContentChecked: AfterContentChecked with scala.Double = js.native
  /* 1048576 */ val AfterContentInit: AfterContentInit with scala.Double = js.native
  /* 8388608 */ val AfterViewChecked: AfterViewChecked with scala.Double = js.native
  /* 4194304 */ val AfterViewInit: AfterViewInit with scala.Double = js.native
  /* 20224 */ val CatProvider: CatProvider with scala.Double = js.native
  /* 3840 */ val CatProviderNoDirective: CatProviderNoDirective with scala.Double = js.native
  /* 224 */ val CatPureExpression: CatPureExpression with scala.Double = js.native
  /* 201326592 */ val CatQuery: CatQuery with scala.Double = js.native
  /* 3 */ val CatRenderNode: CatRenderNode with scala.Double = js.native
  /* 32768 */ val Component: Component with scala.Double = js.native
  /* 33554432 */ val ComponentView: ComponentView with scala.Double = js.native
  /* 262144 */ val DoCheck: DoCheck with scala.Double = js.native
  /* 536870912 */ val DynamicQuery: DynamicQuery with scala.Double = js.native
  /* 16777216 */ val EmbeddedViews: EmbeddedViews with scala.Double = js.native
  /* 4096 */ val LazyProvider: LazyProvider with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 524288 */ val OnChanges: OnChanges with scala.Double = js.native
  /* 131072 */ val OnDestroy: OnDestroy with scala.Double = js.native
  /* 65536 */ val OnInit: OnInit with scala.Double = js.native
  /* 8192 */ val PrivateProvider: PrivateProvider with scala.Double = js.native
  /* 4 */ val ProjectedTemplate: ProjectedTemplate with scala.Double = js.native
  /* 268435456 */ val StaticQuery: StaticQuery with scala.Double = js.native
  /* 512 */ val TypeClassProvider: TypeClassProvider with scala.Double = js.native
  /* 67108864 */ val TypeContentQuery: TypeContentQuery with scala.Double = js.native
  /* 16384 */ val TypeDirective: TypeDirective with scala.Double = js.native
  /* 1 */ val TypeElement: TypeElement with scala.Double = js.native
  /* 1024 */ val TypeFactoryProvider: TypeFactoryProvider with scala.Double = js.native
  /* 1073741824 */ val TypeModuleProvider: TypeModuleProvider with scala.Double = js.native
  /* 8 */ val TypeNgContent: TypeNgContent with scala.Double = js.native
  /* 16 */ val TypePipe: TypePipe with scala.Double = js.native
  /* 32 */ val TypePureArray: TypePureArray with scala.Double = js.native
  /* 64 */ val TypePureObject: TypePureObject with scala.Double = js.native
  /* 128 */ val TypePurePipe: TypePurePipe with scala.Double = js.native
  /* 2 */ val TypeText: TypeText with scala.Double = js.native
  /* 2048 */ val TypeUseExistingProvider: TypeUseExistingProvider with scala.Double = js.native
  /* 256 */ val TypeValueProvider: TypeValueProvider with scala.Double = js.native
  /* 134217728 */ val TypeViewQuery: TypeViewQuery with scala.Double = js.native
  /* 201347067 */ val Types: Types with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.NodeFlags with scala.Double] = js.native
}

