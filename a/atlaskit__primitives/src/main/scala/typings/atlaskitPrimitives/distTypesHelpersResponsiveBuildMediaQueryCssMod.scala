package typings.atlaskitPrimitives

import typings.atlaskitPrimitives.anon.RequiredOmitPartialRecord
import typings.atlaskitPrimitives.anon.RequiredPartialRecordBrea
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxs
import typings.atlaskitPrimitives.distTypesHelpersResponsiveTypesMod.Breakpoint
import typings.emotionSerialize.mod.CSSObject
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHelpersResponsiveBuildMediaQueryCssMod {
  
  @JSImport("@atlaskit/primitives/dist/types/helpers/responsive/build-media-query-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UNSAFEBuildAboveMediaQueryCSS(input: js.Function1[/* breakpoint */ Breakpoint, CSSObject]): RequiredPartialRecordBrea = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_buildAboveMediaQueryCSS")(input.asInstanceOf[js.Any]).asInstanceOf[RequiredPartialRecordBrea]
  inline def UNSAFEBuildAboveMediaQueryCSS(input: CSSObject): RequiredPartialRecordBrea = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_buildAboveMediaQueryCSS")(input.asInstanceOf[js.Any]).asInstanceOf[RequiredPartialRecordBrea]
  
  inline def UNSAFEBuildBelowMediaQueryCSS(input: CSSObject): RequiredOmitPartialRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_buildBelowMediaQueryCSS")(input.asInstanceOf[js.Any]).asInstanceOf[RequiredOmitPartialRecord]
  
  inline def UNSAFEBuildBelowMediaQueryCSS_xxs(input: js.Function1[/* breakpoint */ Exclude[Breakpoint, xxs], CSSObject]): RequiredOmitPartialRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_buildBelowMediaQueryCSS")(input.asInstanceOf[js.Any]).asInstanceOf[RequiredOmitPartialRecord]
}
