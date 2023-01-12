package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularLocalize.mod.ɵParsedTranslation
import typings.angularLocalize.mod.ɵSourceLocation
import typings.angularLocalize.toolsSrcDiagnosticsMod.DiagnosticHandlingStrategy
import typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import typings.std.Error
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcSourceFileUtilsMod {
  
  @JSImport("@angular/localize/tools/src/source_file_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/localize/tools/src/source_file_utils", "BabelParseError")
  @js.native
  open class BabelParseError protected ()
    extends StObject
       with Error {
    def this(
      node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Node */ Any,
      message: String
    ) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Node */ Any = js.native
    
    /* private */ val `type`: Any = js.native
  }
  
  inline def buildCodeFrameError(
    fs: PathManipulation,
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath */ Any,
    e: BabelParseError
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCodeFrameError")(fs.asInstanceOf[js.Any], path.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildLocalizeReplacement(
    messageParts: TemplateStringsArray,
    substitutions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLocalizeReplacement")(messageParts.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getLocation(
    fs: PathManipulation,
    startPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath */ Any
  ): js.UndefOr[ɵSourceLocation] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(fs.asInstanceOf[js.Any], startPath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ɵSourceLocation]]
  inline def getLocation(
    fs: PathManipulation,
    startPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath */ Any,
    endPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath */ Any
  ): js.UndefOr[ɵSourceLocation] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(fs.asInstanceOf[js.Any], startPath.asInstanceOf[js.Any], endPath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ɵSourceLocation]]
  
  inline def isArrayOfExpressions(
    paths: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Node> */ Any
    ]
  ): /* is std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Expression> * / any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfExpressions")(paths.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Expression> * / any> */ Boolean]
  
  inline def isBabelParseError(e: Any): /* is @angular/localize.@angular/localize/tools/src/source_file_utils.BabelParseError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBabelParseError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/localize.@angular/localize/tools/src/source_file_utils.BabelParseError */ Boolean]
  
  inline def isGlobalIdentifier(
    identifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Identifier> */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGlobalIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLocalize(
    expression: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath */ Any,
    localizeName: String
  ): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Identifier> * / any */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocalize")(expression.asInstanceOf[js.Any], localizeName.asInstanceOf[js.Any])).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Identifier> * / any */ Boolean]
  
  inline def isNamedIdentifier(
    expression: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath */ Any,
    name: String
  ): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Identifier> * / any */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNamedIdentifier")(expression.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Identifier> * / any */ Boolean]
  
  inline def isStringLiteralArray(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Node */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralArray")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def serializeLocationPosition(location: ɵSourceLocation): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeLocationPosition")(location.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def translate(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    messageParts: TemplateStringsArray,
    substitutions: js.Array[Any],
    missingTranslation: DiagnosticHandlingStrategy
  ): js.Tuple2[TemplateStringsArray, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], messageParts.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any], missingTranslation.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[Any]]]
  
  inline def unwrapExpressionsFromTemplateLiteral(
    quasi: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateLiteral> */ Any
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpressionsFromTemplateLiteral")(quasi.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ]]
  inline def unwrapExpressionsFromTemplateLiteral(
    quasi: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateLiteral> */ Any,
    fs: PathManipulation
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpressionsFromTemplateLiteral")(quasi.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ]]
  
  inline def unwrapLazyLoadHelperCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapLazyLoadHelperCall")(call.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def unwrapMessagePartsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromLocalizeCall")(call.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapMessagePartsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any,
    fs: PathManipulation
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromLocalizeCall")(call.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  
  inline def unwrapMessagePartsFromTemplateLiteral(
    elements: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateElement> */ Any
    ]
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromTemplateLiteral")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapMessagePartsFromTemplateLiteral(
    elements: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateElement> */ Any
    ],
    fs: PathManipulation
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromTemplateLiteral")(elements.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  
  inline def unwrapStringLiteralArray(
    array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Expression> */ Any
  ): js.Tuple2[js.Array[String], js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapStringLiteralArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[String], js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapStringLiteralArray(
    array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Expression> */ Any,
    fs: PathManipulation
  ): js.Tuple2[js.Array[String], js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapStringLiteralArray")(array.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[String], js.Array[js.UndefOr[ɵSourceLocation]]]]
  
  inline def unwrapSubstitutionsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapSubstitutionsFromLocalizeCall")(call.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ]]
  inline def unwrapSubstitutionsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any,
    fs: PathManipulation
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapSubstitutionsFromLocalizeCall")(call.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ]]
  
  inline def wrapInParensIfNecessary(
    expression: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInParensIfNecessary")(expression.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait TranslatePluginOptions extends StObject {
    
    var localizeName: js.UndefOr[String] = js.undefined
    
    var missingTranslation: js.UndefOr[DiagnosticHandlingStrategy] = js.undefined
  }
  object TranslatePluginOptions {
    
    inline def apply(): TranslatePluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslatePluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TranslatePluginOptions] (val x: Self) extends AnyVal {
      
      inline def setLocalizeName(value: String): Self = StObject.set(x, "localizeName", value.asInstanceOf[js.Any])
      
      inline def setLocalizeNameUndefined: Self = StObject.set(x, "localizeName", js.undefined)
      
      inline def setMissingTranslation(value: DiagnosticHandlingStrategy): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
      
      inline def setMissingTranslationUndefined: Self = StObject.set(x, "missingTranslation", js.undefined)
    }
  }
}
