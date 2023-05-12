package typings.atlaskitPrimitives

import typings.atlaskitPrimitives.anon.Lg
import typings.atlaskitPrimitives.anon.Md
import typings.atlaskitPrimitives.anon.RequiredOmitPartialRecord
import typings.atlaskitPrimitives.anon.RequiredPartialRecordBrea
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.lg
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.md
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.sm
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xl
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xs
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxl
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxs
import typings.atlaskitPrimitives.distTypesHelpersResponsiveTypesMod.Breakpoint
import typings.atlaskitPrimitives.distTypesHelpersResponsiveTypesMod.BreakpointConfig
import typings.emotionSerialize.mod.CSSObject
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHelpersResponsiveMod {
  
  @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UNSAFEBuildAboveMediaQueryCSS(input: js.Function1[/* breakpoint */ Breakpoint, CSSObject]): RequiredPartialRecordBrea = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_buildAboveMediaQueryCSS")(input.asInstanceOf[js.Any]).asInstanceOf[RequiredPartialRecordBrea]
  inline def UNSAFEBuildAboveMediaQueryCSS(input: CSSObject): RequiredPartialRecordBrea = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_buildAboveMediaQueryCSS")(input.asInstanceOf[js.Any]).asInstanceOf[RequiredPartialRecordBrea]
  
  inline def UNSAFEBuildBelowMediaQueryCSS(input: CSSObject): RequiredOmitPartialRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_buildBelowMediaQueryCSS")(input.asInstanceOf[js.Any]).asInstanceOf[RequiredOmitPartialRecord]
  
  inline def UNSAFEBuildBelowMediaQueryCSS_xxs(input: js.Function1[/* breakpoint */ Exclude[Breakpoint, xxs], CSSObject]): RequiredOmitPartialRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_buildBelowMediaQueryCSS")(input.asInstanceOf[js.Any]).asInstanceOf[RequiredOmitPartialRecord]
  
  object UNSAFEMedia {
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_media.above")
    @js.native
    val above: Lg = js.native
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_media.below")
    @js.native
    val below: Md = js.native
  }
  
  /* Inlined std.Record<@atlaskit/primitives.@atlaskit/primitives/dist/types/helpers/responsive/types.Breakpoint, @atlaskit/primitives.@atlaskit/primitives/dist/types/helpers/responsive/types.BreakpointConfig> */
  object UNSAFE_BREAKPOINTS_CONFIG {
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_CONFIG.lg")
    @js.native
    def lg: BreakpointConfig = js.native
    inline def lg_=(x: BreakpointConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lg")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_CONFIG.md")
    @js.native
    def md: BreakpointConfig = js.native
    inline def md_=(x: BreakpointConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_CONFIG.sm")
    @js.native
    def sm: BreakpointConfig = js.native
    inline def sm_=(x: BreakpointConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sm")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_CONFIG.xl")
    @js.native
    def xl: BreakpointConfig = js.native
    inline def xl_=(x: BreakpointConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xl")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_CONFIG.xs")
    @js.native
    def xs: BreakpointConfig = js.native
    inline def xs_=(x: BreakpointConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xs")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_CONFIG.xxl")
    @js.native
    def xxl: BreakpointConfig = js.native
    inline def xxl_=(x: BreakpointConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xxl")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_CONFIG.xxs")
    @js.native
    def xxs: BreakpointConfig = js.native
    inline def xxs_=(x: BreakpointConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xxs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@atlaskit/primitives/dist/types/helpers/responsive", "UNSAFE_BREAKPOINTS_ORDERED_LIST")
  @js.native
  val UNSAFE_BREAKPOINTS_ORDERED_LIST: js.Tuple7[xxs, xs, sm, md, lg, xl, xxl] = js.native
}
