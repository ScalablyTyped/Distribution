package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Nodei18nI18nMetaundefined
import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.i18nAstMod.IcuPlaceholder
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.mlParserAstMod.Element
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.LiteralExpr
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nUtilMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_ATTR")
  @js.native
  val I18N_ATTR: /* "i18n" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_ATTR_PREFIX")
  @js.native
  val I18N_ATTR_PREFIX: /* "i18n-" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_ICU_MAPPING_PREFIX")
  @js.native
  val I18N_ICU_MAPPING_PREFIX: /* "I18N_EXP_" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_ICU_VAR_PREFIX")
  @js.native
  val I18N_ICU_VAR_PREFIX: /* "VAR_" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "I18N_PLACEHOLDER_SYMBOL")
  @js.native
  val I18N_PLACEHOLDER_SYMBOL: /* "\\uFFFD" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/util", "TRANSLATION_VAR_PREFIX")
  @js.native
  val TRANSLATION_VAR_PREFIX: /* "i18n_" */ String = js.native
  
  @scala.inline
  def assembleBoundTextPlaceholders(meta: I18nMeta): Map[String, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleBoundTextPlaceholders")(meta.asInstanceOf[js.Any]).asInstanceOf[Map[String, js.Array[js.Any]]]
  @scala.inline
  def assembleBoundTextPlaceholders(meta: I18nMeta, bindingStartIndex: Double): Map[String, js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleBoundTextPlaceholders")(meta.asInstanceOf[js.Any], bindingStartIndex.asInstanceOf[js.Any])).asInstanceOf[Map[String, js.Array[js.Any]]]
  @scala.inline
  def assembleBoundTextPlaceholders(meta: I18nMeta, bindingStartIndex: Double, contextId: Double): Map[String, js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleBoundTextPlaceholders")(meta.asInstanceOf[js.Any], bindingStartIndex.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[Map[String, js.Array[js.Any]]]
  @scala.inline
  def assembleBoundTextPlaceholders(meta: I18nMeta, bindingStartIndex: Unit, contextId: Double): Map[String, js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleBoundTextPlaceholders")(meta.asInstanceOf[js.Any], bindingStartIndex.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[Map[String, js.Array[js.Any]]]
  
  @scala.inline
  def assembleI18nBoundString(strings: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleI18nBoundString")(strings.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def assembleI18nBoundString(strings: js.Array[String], bindingStartIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleI18nBoundString")(strings.asInstanceOf[js.Any], bindingStartIndex.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def assembleI18nBoundString(strings: js.Array[String], bindingStartIndex: Double, contextId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleI18nBoundString")(strings.asInstanceOf[js.Any], bindingStartIndex.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def assembleI18nBoundString(strings: js.Array[String], bindingStartIndex: Unit, contextId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleI18nBoundString")(strings.asInstanceOf[js.Any], bindingStartIndex.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def declareI18nVariable(variable: ReadVarExpr): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("declareI18nVariable")(variable.asInstanceOf[js.Any]).asInstanceOf[Statement]
  
  @scala.inline
  def formatI18nPlaceholderName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatI18nPlaceholderName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatI18nPlaceholderName(name: String, useCamelCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatI18nPlaceholderName")(name.asInstanceOf[js.Any], useCamelCase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getSeqNumberGenerator(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeqNumberGenerator")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def getSeqNumberGenerator(startsAt: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeqNumberGenerator")(startsAt.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def getTranslationConstPrefix(extra: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslationConstPrefix")(extra.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hasI18nAttrs(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasI18nAttrs")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def hasI18nMeta(node: Nodei18nI18nMetaundefined): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasI18nMeta")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def i18nFormatPlaceholderNames(params: StringDictionary[Expression], useCamelCase: Boolean): StringDictionary[Expression] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nFormatPlaceholderNames")(params.asInstanceOf[js.Any], useCamelCase.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Expression]]
  @scala.inline
  def i18nFormatPlaceholderNames(params: Unit, useCamelCase: Boolean): StringDictionary[Expression] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nFormatPlaceholderNames")(params.asInstanceOf[js.Any], useCamelCase.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Expression]]
  
  @scala.inline
  def icuFromI18nMessage(message: Message): IcuPlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("icuFromI18nMessage")(message.asInstanceOf[js.Any]).asInstanceOf[IcuPlaceholder]
  
  @scala.inline
  def isI18nAttribute(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isI18nAttribute")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isI18nRootNode(): /* is @angular/compiler.@angular/compiler/src/i18n/i18n_ast.Message */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isI18nRootNode")().asInstanceOf[/* is @angular/compiler.@angular/compiler/src/i18n/i18n_ast.Message */ Boolean]
  @scala.inline
  def isI18nRootNode(meta: I18nMeta): /* is @angular/compiler.@angular/compiler/src/i18n/i18n_ast.Message */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isI18nRootNode")(meta.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler.@angular/compiler/src/i18n/i18n_ast.Message */ Boolean]
  
  @scala.inline
  def isSingleI18nIcu(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleI18nIcu")().asInstanceOf[Boolean]
  @scala.inline
  def isSingleI18nIcu(meta: I18nMeta): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleI18nIcu")(meta.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def placeholdersToParams(placeholders: Map[String, js.Array[String]]): StringDictionary[LiteralExpr] = ^.asInstanceOf[js.Dynamic].applyDynamic("placeholdersToParams")(placeholders.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[LiteralExpr]]
  
  @scala.inline
  def updatePlaceholderMap(map: Map[String, js.Array[js.Any]], name: String, values: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePlaceholderMap")(map.asInstanceOf[js.Any], name.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def wrapI18nPlaceholder(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapI18nPlaceholder")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def wrapI18nPlaceholder(content: String, contextId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapI18nPlaceholder")(content.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def wrapI18nPlaceholder(content: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapI18nPlaceholder")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def wrapI18nPlaceholder(content: Double, contextId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapI18nPlaceholder")(content.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[String]
}
