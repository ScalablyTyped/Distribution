package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Opacity
import typings.atlaskitTokens.distTypesFigmaTypesMod.FigmaEffect
import typings.atlaskitTokens.distTypesFigmaTypesMod.FigmaPaint
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import typings.atlaskitTokens.distTypesTypesMod.ShadowToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFigmaSynchronizeFigmaTokensMod {
  
  type CreateEffects = js.Function1[/* value */ js.Array[Opacity], js.Array[FigmaEffect]]
  
  type CreatePaint = js.Function1[/* hex */ String, FigmaPaint]
  
  type FormatDescription = js.Function1[/* token */ PaintToken[String] | ShadowToken[String], String]
  
  type SynchronizeFigmaTokens = js.Function3[
    /* themeName */ String, 
    /* tokens */ Record[String, PaintToken[String] | ShadowToken[String]], 
    /* renameMap */ js.UndefOr[Record[String, String]], 
    Unit
  ]
}
