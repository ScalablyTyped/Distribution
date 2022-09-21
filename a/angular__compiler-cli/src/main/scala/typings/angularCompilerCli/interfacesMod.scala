package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.style
import typings.std.Set
import typings.typescript.mod.CancellationToken
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CreateSourceFileOptions
import typings.typescript.mod.FileReference
import typings.typescript.mod.ModuleKind.CommonJS
import typings.typescript.mod.ModuleKind.ESNext
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Path
import typings.typescript.mod.ResolvedModule
import typings.typescript.mod.ResolvedProjectReference
import typings.typescript.mod.ResolvedTypeReferenceDirective
import typings.typescript.mod.ScriptTarget
import typings.typescript.mod.SourceFile
import typings.typescript.mod.WriteFileCallback
import typings.typescript.mod.WriteFileCallbackData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  /* Inlined parent typescript.typescript.CompilerHost */
  /* Inlined parent std.Partial<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/interfaces.ResourceHost> */
  /* Inlined parent std.Partial<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/interfaces.UnifiedModulesHost> */
  @js.native
  trait ExtendedTsCompilerHost extends StObject {
    
    var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
    
    var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.native
    
    def fileExists(fileName: String): Boolean = js.native
    
    var fileNameToModuleName: js.UndefOr[
        js.Function2[/* importedFilePath */ String, /* containingFilePath */ String, String]
      ] = js.native
    
    var getCancellationToken: js.UndefOr[js.Function0[CancellationToken]] = js.native
    
    def getCanonicalFileName(fileName: String): String = js.native
    
    def getCurrentDirectory(): String = js.native
    @JSName("getCurrentDirectory")
    var getCurrentDirectory_FExtendedTsCompilerHost: js.UndefOr[js.Function0[String]] = js.native
    
    def getDefaultLibFileName(options: CompilerOptions): String = js.native
    
    var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.native
    
    var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
    
    var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.native
    
    var getModifiedResourceFiles: js.UndefOr[js.Function0[js.UndefOr[Set[String]]]] = js.native
    
    /**
      * Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
      */
    var getModuleResolutionCache: js.UndefOr[js.Function0[js.UndefOr[ModuleResolutionCache]]] = js.native
    
    def getNewLine(): String = js.native
    
    var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ String, js.UndefOr[ParsedCommandLine]]] = js.native
    
    def getSourceFile(fileName: String, languageVersionOrOptions: CreateSourceFileOptions): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      onError: js.Function1[/* message */ String, Unit]
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      onError: js.Function1[/* message */ String, Unit],
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      onError: Unit,
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(fileName: String, languageVersionOrOptions: ScriptTarget): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: ScriptTarget,
      onError: js.Function1[/* message */ String, Unit]
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: ScriptTarget,
      onError: js.Function1[/* message */ String, Unit],
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: ScriptTarget,
      onError: Unit,
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    
    var getSourceFileByPath: js.UndefOr[
        js.Function5[
          /* fileName */ String, 
          /* path */ Path, 
          /* languageVersionOrOptions */ ScriptTarget | CreateSourceFileOptions, 
          /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
          /* shouldCreateNewSourceFile */ js.UndefOr[Boolean], 
          js.UndefOr[SourceFile]
        ]
      ] = js.native
    
    var readDirectory: js.UndefOr[
        js.Function5[
          /* rootDir */ String, 
          /* extensions */ js.Array[String], 
          /* excludes */ js.UndefOr[js.Array[String]], 
          /* includes */ js.Array[String], 
          /* depth */ js.UndefOr[Double], 
          js.Array[String]
        ]
      ] = js.native
    
    def readFile(fileName: String): js.UndefOr[String] = js.native
    
    var readResource: js.UndefOr[js.Function1[/* fileName */ String, js.Promise[String] | String]] = js.native
    
    /**
      * Resolve a symbolic link.
      * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
      */
    var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
    
    var resolveModuleNames: js.UndefOr[
        js.Function6[
          /* moduleNames */ js.Array[String], 
          /* containingFile */ String, 
          /* reusedNames */ js.UndefOr[js.Array[String]], 
          /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
          /* options */ CompilerOptions, 
          /* containingSourceFile */ js.UndefOr[SourceFile], 
          js.Array[js.UndefOr[ResolvedModule]]
        ]
      ] = js.native
    
    /**
      * This method is a companion for 'resolveModuleNames' and is used to resolve 'types' references to actual type declaration files
      */
    var resolveTypeReferenceDirectives: js.UndefOr[
        js.Function5[
          /* typeReferenceDirectiveNames */ js.Array[FileReference | String], 
          /* containingFile */ String, 
          /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
          /* options */ CompilerOptions, 
          /* containingFileMode */ js.UndefOr[ESNext | CommonJS], 
          js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
        ]
      ] = js.native
    
    var resourceNameToFileName: js.UndefOr[
        js.Function3[
          /* resourceName */ String, 
          /* containingFilePath */ String, 
          /* fallbackResolve */ js.UndefOr[js.Function2[/* url */ String, /* fromFile */ String, String | Null]], 
          String | Null
        ]
      ] = js.native
    
    var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
    
    var transformResource: js.UndefOr[
        js.Function2[
          /* data */ String, 
          /* context */ ResourceHostContext, 
          js.Promise[TransformResourceResult | Null]
        ]
      ] = js.native
    
    def useCaseSensitiveFileNames(): Boolean = js.native
    @JSName("useCaseSensitiveFileNames")
    var useCaseSensitiveFileNames_FExtendedTsCompilerHost: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
    
    def writeFile(fileName: String, text: String, writeByteOrderMark: Boolean): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: js.Function1[/* message */ String, Unit]
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: js.Function1[/* message */ String, Unit],
      sourceFiles: js.Array[SourceFile]
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: js.Function1[/* message */ String, Unit],
      sourceFiles: js.Array[SourceFile],
      data: WriteFileCallbackData
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: js.Function1[/* message */ String, Unit],
      sourceFiles: Unit,
      data: WriteFileCallbackData
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: Unit,
      sourceFiles: js.Array[SourceFile]
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: Unit,
      sourceFiles: js.Array[SourceFile],
      data: WriteFileCallbackData
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: Unit,
      sourceFiles: Unit,
      data: WriteFileCallbackData
    ): Unit = js.native
    @JSName("writeFile")
    var writeFile_Original: WriteFileCallback = js.native
  }
  
  @js.native
  trait ResourceHost extends StObject {
    
    /**
      * Get the absolute paths to the changed files that triggered the current compilation
      * or `undefined` if this is not an incremental build.
      */
    var getModifiedResourceFiles: js.UndefOr[js.Function0[js.UndefOr[Set[String]]]] = js.native
    
    /**
      * Load a referenced resource either statically or asynchronously. If the host returns a
      * `Promise<string>` it is assumed the user of the corresponding `Program` will call
      * `loadNgStructureAsync()`. Returning  `Promise<string>` outside `loadNgStructureAsync()` will
      * cause a diagnostics error or an exception to be thrown.
      */
    def readResource(fileName: String): js.Promise[String] | String = js.native
    
    /**
      * Converts a file path for a resource that is used in a source file or another resource
      * into a filepath.
      *
      * The optional `fallbackResolve` method can be used as a way to attempt a fallback resolution if
      * the implementation's `resourceNameToFileName` resolution fails.
      */
    def resourceNameToFileName(resourceName: String, containingFilePath: String): String | Null = js.native
    def resourceNameToFileName(
      resourceName: String,
      containingFilePath: String,
      fallbackResolve: js.Function2[/* url */ String, /* fromFile */ String, String | Null]
    ): String | Null = js.native
    
    /**
      * Transform an inline or external resource asynchronously.
      * It is assumed the consumer of the corresponding `Program` will call
      * `loadNgStructureAsync()`. Using outside `loadNgStructureAsync()` will
      * cause a diagnostics error or an exception to be thrown.
      * Only style resources are currently supported.
      *
      * @param data The resource data to transform.
      * @param context Information regarding the resource such as the type and containing file.
      * @returns A promise of either the transformed resource data or null if no transformation occurs.
      */
    var transformResource: js.UndefOr[
        js.Function2[
          /* data */ String, 
          /* context */ ResourceHostContext, 
          js.Promise[TransformResourceResult | Null]
        ]
      ] = js.native
  }
  
  trait ResourceHostContext extends StObject {
    
    /**
      * The absolute path to the file that contains the resource or reference to the resource.
      */
    val containingFile: String
    
    /**
      * The absolute path to the resource file. If the resource is inline, the value will be null.
      */
    val resourceFile: String | Null
    
    /**
      * The type of the component resource. Templates are not yet supported.
      * * Resources referenced via a component's `styles` or `styleUrls` properties are of
      * type `style`.
      */
    val `type`: style
  }
  object ResourceHostContext {
    
    inline def apply(containingFile: String): ResourceHostContext = {
      val __obj = js.Dynamic.literal(containingFile = containingFile.asInstanceOf[js.Any], resourceFile = null)
      __obj.updateDynamic("type")("style")
      __obj.asInstanceOf[ResourceHostContext]
    }
    
    extension [Self <: ResourceHostContext](x: Self) {
      
      inline def setContainingFile(value: String): Self = StObject.set(x, "containingFile", value.asInstanceOf[js.Any])
      
      inline def setResourceFile(value: String): Self = StObject.set(x, "resourceFile", value.asInstanceOf[js.Any])
      
      inline def setResourceFileNull: Self = StObject.set(x, "resourceFile", null)
      
      inline def setType(value: style): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformResourceResult extends StObject {
    
    /**
      * The content generated by the transformation.
      */
    var content: String
  }
  object TransformResourceResult {
    
    inline def apply(content: String): TransformResourceResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformResourceResult]
    }
    
    extension [Self <: TransformResourceResult](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnifiedModulesHost extends StObject {
    
    /**
      * Converts a file path to a module name that can be used as an `import ...`.
      *
      * For example, such a host might determine that `/absolute/path/to/monorepo/lib/importedFile.ts`
      * should be imported using a module specifier of `monorepo/lib/importedFile`.
      */
    def fileNameToModuleName(importedFilePath: String, containingFilePath: String): String
  }
  object UnifiedModulesHost {
    
    inline def apply(fileNameToModuleName: (String, String) => String): UnifiedModulesHost = {
      val __obj = js.Dynamic.literal(fileNameToModuleName = js.Any.fromFunction2(fileNameToModuleName))
      __obj.asInstanceOf[UnifiedModulesHost]
    }
    
    extension [Self <: UnifiedModulesHost](x: Self) {
      
      inline def setFileNameToModuleName(value: (String, String) => String): Self = StObject.set(x, "fileNameToModuleName", js.Any.fromFunction2(value))
    }
  }
}
