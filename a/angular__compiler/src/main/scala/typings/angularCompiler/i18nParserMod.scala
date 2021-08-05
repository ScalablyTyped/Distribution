package typings.angularCompiler

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.mlParserAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nParserMod {
  
  @JSImport("@angular/compiler/src/i18n/i18n_parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createI18nMessageFactory(interpolationConfig: InterpolationConfig): I18nMessageFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18nMessageFactory")(interpolationConfig.asInstanceOf[js.Any]).asInstanceOf[I18nMessageFactory]
  
  type I18nMessageFactory = js.Function5[
    /* nodes */ js.Array[Node], 
    /* meaning */ js.UndefOr[String], 
    /* description */ js.UndefOr[String], 
    /* customId */ js.UndefOr[String], 
    /* visitNodeFn */ js.UndefOr[VisitNodeFn], 
    Message
  ]
  
  type VisitNodeFn = js.Function2[
    /* html */ Node, 
    /* i18n */ typings.angularCompiler.i18nAstMod.Node, 
    typings.angularCompiler.i18nAstMod.Node
  ]
}
