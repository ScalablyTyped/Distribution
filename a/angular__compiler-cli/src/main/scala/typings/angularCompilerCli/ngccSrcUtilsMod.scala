package typings.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompilerCli.angularCompilerCliBooleans.`true`
import typings.angularCompilerCli.anon.FnCallStartEnd
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration
import typings.std.Array
import typings.std.Parameters
import typings.typescript.mod.BindingName
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.PropertyName
import typings.typescript.mod.Symbol
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/utils", "FactoryMap")
  @js.native
  open class FactoryMap[K, V] protected () extends StObject {
    def this(factory: js.Function1[/* key */ K, V]) = this()
    def this(factory: js.Function1[/* key */ K, V], entries: js.Array[js.Tuple2[K, V]]) = this()
    
    /* private */ var factory: Any = js.native
    
    def get(key: K): V = js.native
    
    /* private */ var internalMap: Any = js.native
    
    def set(key: K, value: V): Unit = js.native
  }
  
  inline def getNameText(name: BindingName): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameText")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getNameText(name: PropertyName): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameText")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOriginalSymbol(checker: TypeChecker): js.Function1[/* symbol */ Symbol, Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalSymbol")(checker.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* symbol */ Symbol, Symbol]]
  
  inline def getTsHelperFnFromDeclaration(decl: DeclarationNode): KnownDeclaration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTsHelperFnFromDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[KnownDeclaration | Null]
  
  inline def getTsHelperFnFromIdentifier(id: Identifier): KnownDeclaration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTsHelperFnFromIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[KnownDeclaration | Null]
  
  inline def hasNameIdentifier(declaration: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNameIdentifier")(declaration.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  inline def isDefined[T](value: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isRelativePath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativePath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadJson[T /* <: JsonObject */](fs: ReadonlyFileSystem, packageJsonPath: AbsoluteFsPath): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("loadJson")(fs.asInstanceOf[js.Any], packageJsonPath.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def loadSecondaryEntryPointInfoForApfV14(
    fs: ReadonlyFileSystem,
    primaryPackageJson: Null,
    packagePath: AbsoluteFsPath,
    entryPointPath: AbsoluteFsPath
  ): JsonObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSecondaryEntryPointInfoForApfV14")(fs.asInstanceOf[js.Any], primaryPackageJson.asInstanceOf[js.Any], packagePath.asInstanceOf[js.Any], entryPointPath.asInstanceOf[js.Any])).asInstanceOf[JsonObject | Null]
  inline def loadSecondaryEntryPointInfoForApfV14(
    fs: ReadonlyFileSystem,
    primaryPackageJson: JsonObject,
    packagePath: AbsoluteFsPath,
    entryPointPath: AbsoluteFsPath
  ): JsonObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSecondaryEntryPointInfoForApfV14")(fs.asInstanceOf[js.Any], primaryPackageJson.asInstanceOf[js.Any], packagePath.asInstanceOf[js.Any], entryPointPath.asInstanceOf[js.Any])).asInstanceOf[JsonObject | Null]
  
  inline def resolveFileWithPostfixes(fs: ReadonlyFileSystem, path: AbsoluteFsPath, postFixes: js.Array[String]): AbsoluteFsPath | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFileWithPostfixes")(fs.asInstanceOf[js.Any], path.asInstanceOf[js.Any], postFixes.asInstanceOf[js.Any])).asInstanceOf[AbsoluteFsPath | Null]
  
  inline def stripDollarSuffix(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripDollarSuffix")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripExtension(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type JsonArray = js.Array[JsonValue]
  
  trait JsonObject
    extends StObject
       with /* key */ StringDictionary[JsonValue]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  type JsonPrimitive = String | Double | Boolean | Null
  
  type JsonValue = js.UndefOr[JsonPrimitive | Any | JsonObject]
  
  @js.native
  trait PartiallyOrderedList[T]
    extends StObject
       with Array[T] {
    
    var _partiallyOrdered: `true` = js.native
    
    def slice(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Array<T>['slice']> is not an array type */ args: Parameters[FnCallStartEnd[T]]
    ): PartiallyOrderedList[T] = js.native
  }
}
