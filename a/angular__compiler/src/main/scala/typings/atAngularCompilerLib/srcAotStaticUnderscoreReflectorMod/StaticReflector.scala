package typings
package atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/static_reflector", "StaticReflector")
@js.native
class StaticReflector protected ()
  extends atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector {
  def this(summaryResolver: atAngularCompilerLib.srcSummaryUnderscoreResolverMod.SummaryResolver[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol], symbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver) = this()
  def this(summaryResolver: atAngularCompilerLib.srcSummaryUnderscoreResolverMod.SummaryResolver[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol], symbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver, knownMetadataClasses: js.Array[atAngularCompilerLib.Anon_FilePath]) = this()
  def this(summaryResolver: atAngularCompilerLib.srcSummaryUnderscoreResolverMod.SummaryResolver[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol], symbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver, knownMetadataClasses: js.Array[atAngularCompilerLib.Anon_FilePath], knownMetadataFunctions: js.Array[atAngularCompilerLib.Anon_FilePathName]) = this()
  def this(summaryResolver: atAngularCompilerLib.srcSummaryUnderscoreResolverMod.SummaryResolver[atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol], symbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver, knownMetadataClasses: js.Array[atAngularCompilerLib.Anon_FilePath], knownMetadataFunctions: js.Array[atAngularCompilerLib.Anon_FilePathName], errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[java.lang.String], scala.Unit]) = this()
  var ANALYZE_FOR_ENTRY_COMPONENTS: js.Any = js.native
  var ROUTES: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
  var _annotations: js.Any = js.native
  var _methodNames: js.Any = js.native
  var _registerDecoratorOrConstructor: js.Any = js.native
  var _registerFunction: js.Any = js.native
  var _staticMembers: js.Any = js.native
  var annotationCache: js.Any = js.native
  var annotationForParentClassWithSummaryKind: js.Any = js.native
  var conversionMap: js.Any = js.native
  var error: js.Any = js.native
  var errorRecorder: js.UndefOr[js.Any] = js.native
  var findParentType: js.Any = js.native
  var getTypeMetadata: js.Any = js.native
  var initializeConversionMap: js.Any = js.native
  var injectionToken: js.Any = js.native
  var methodCache: js.Any = js.native
  var opaqueToken: js.Any = js.native
  var parameterCache: js.Any = js.native
  var propertyCache: js.Any = js.native
  var reportError: js.Any = js.native
  var resolvedExternalReferences: js.Any = js.native
  var shallowAnnotationCache: js.Any = js.native
  var staticCache: js.Any = js.native
  var summaryResolver: js.Any = js.native
  var symbolResolver: js.Any = js.native
  /**
    * Simplify but discard any errors
    */
  var trySimplify: js.Any = js.native
  def annotations(`type`: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol): js.Array[_] = js.native
  def componentModuleUrl(typeOrFunc: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol): java.lang.String = js.native
  def findDeclaration(moduleUrl: java.lang.String, name: java.lang.String): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
  def findDeclaration(moduleUrl: java.lang.String, name: java.lang.String, containingFile: java.lang.String): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
  def findSymbolDeclaration(symbol: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
  /**
    * getStaticSymbol produces a Type whose metadata is known but whose implementation is not loaded.
    * All types passed to the StaticResolver should be pseudo-types returned by this method.
    *
    * @param declarationFile the absolute path of the file where the symbol is declared
    * @param name the name of the type.
    */
  def getStaticSymbol(declarationFile: java.lang.String, name: java.lang.String): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
  def getStaticSymbol(declarationFile: java.lang.String, name: java.lang.String, members: js.Array[java.lang.String]): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
  def parameters(`type`: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol): js.Array[_] = js.native
  def propMetadata(`type`: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol): org.scalablytyped.runtime.StringDictionary[js.Array[_]] = js.native
  def resolveExternalReference(
    ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    containingFile: java.lang.String
  ): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
  def shallowAnnotations(`type`: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol): js.Array[_] = js.native
  def tryAnnotations(`type`: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol): js.Array[_] = js.native
  def tryFindDeclaration(moduleUrl: java.lang.String, name: java.lang.String): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
  def tryFindDeclaration(moduleUrl: java.lang.String, name: java.lang.String, containingFile: java.lang.String): atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol = js.native
}

