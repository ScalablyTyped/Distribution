package typings.angularCompilerCli

import typings.angularCompilerCli.bundleProgramMod.BundleProgram
import typings.angularCompilerCli.entryPointMod.EntryPoint
import typings.angularCompilerCli.entryPointMod.EntryPointFormat
import typings.angularCompilerCli.pathMappingsMod.PathMappings
import typings.angularCompilerCli.sourceFileCacheMod.SharedFileCache
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.FileSystem
import typings.angularCompilerCli.tasksApiMod.DtsProcessing
import typings.typescript.mod.ModuleResolutionCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointBundleMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/entry_point_bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeEntryPointBundle(
    fs: FileSystem,
    entryPoint: EntryPoint,
    sharedFileCache: SharedFileCache,
    moduleResolutionCache: ModuleResolutionCache,
    formatPath: String,
    isCore: Boolean,
    format: EntryPointFormat,
    dtsProcessing: DtsProcessing
  ): EntryPointBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntryPointBundle")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], sharedFileCache.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], formatPath.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dtsProcessing.asInstanceOf[js.Any])).asInstanceOf[EntryPointBundle]
  inline def makeEntryPointBundle(
    fs: FileSystem,
    entryPoint: EntryPoint,
    sharedFileCache: SharedFileCache,
    moduleResolutionCache: ModuleResolutionCache,
    formatPath: String,
    isCore: Boolean,
    format: EntryPointFormat,
    dtsProcessing: DtsProcessing,
    pathMappings: Unit,
    mirrorDtsFromSrc: Boolean
  ): EntryPointBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntryPointBundle")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], sharedFileCache.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], formatPath.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dtsProcessing.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any], mirrorDtsFromSrc.asInstanceOf[js.Any])).asInstanceOf[EntryPointBundle]
  inline def makeEntryPointBundle(
    fs: FileSystem,
    entryPoint: EntryPoint,
    sharedFileCache: SharedFileCache,
    moduleResolutionCache: ModuleResolutionCache,
    formatPath: String,
    isCore: Boolean,
    format: EntryPointFormat,
    dtsProcessing: DtsProcessing,
    pathMappings: Unit,
    mirrorDtsFromSrc: Boolean,
    enableI18nLegacyMessageIdFormat: Boolean
  ): EntryPointBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntryPointBundle")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], sharedFileCache.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], formatPath.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dtsProcessing.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any], mirrorDtsFromSrc.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any])).asInstanceOf[EntryPointBundle]
  inline def makeEntryPointBundle(
    fs: FileSystem,
    entryPoint: EntryPoint,
    sharedFileCache: SharedFileCache,
    moduleResolutionCache: ModuleResolutionCache,
    formatPath: String,
    isCore: Boolean,
    format: EntryPointFormat,
    dtsProcessing: DtsProcessing,
    pathMappings: Unit,
    mirrorDtsFromSrc: Unit,
    enableI18nLegacyMessageIdFormat: Boolean
  ): EntryPointBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntryPointBundle")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], sharedFileCache.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], formatPath.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dtsProcessing.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any], mirrorDtsFromSrc.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any])).asInstanceOf[EntryPointBundle]
  inline def makeEntryPointBundle(
    fs: FileSystem,
    entryPoint: EntryPoint,
    sharedFileCache: SharedFileCache,
    moduleResolutionCache: ModuleResolutionCache,
    formatPath: String,
    isCore: Boolean,
    format: EntryPointFormat,
    dtsProcessing: DtsProcessing,
    pathMappings: PathMappings
  ): EntryPointBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntryPointBundle")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], sharedFileCache.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], formatPath.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dtsProcessing.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any])).asInstanceOf[EntryPointBundle]
  inline def makeEntryPointBundle(
    fs: FileSystem,
    entryPoint: EntryPoint,
    sharedFileCache: SharedFileCache,
    moduleResolutionCache: ModuleResolutionCache,
    formatPath: String,
    isCore: Boolean,
    format: EntryPointFormat,
    dtsProcessing: DtsProcessing,
    pathMappings: PathMappings,
    mirrorDtsFromSrc: Boolean
  ): EntryPointBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntryPointBundle")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], sharedFileCache.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], formatPath.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dtsProcessing.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any], mirrorDtsFromSrc.asInstanceOf[js.Any])).asInstanceOf[EntryPointBundle]
  inline def makeEntryPointBundle(
    fs: FileSystem,
    entryPoint: EntryPoint,
    sharedFileCache: SharedFileCache,
    moduleResolutionCache: ModuleResolutionCache,
    formatPath: String,
    isCore: Boolean,
    format: EntryPointFormat,
    dtsProcessing: DtsProcessing,
    pathMappings: PathMappings,
    mirrorDtsFromSrc: Boolean,
    enableI18nLegacyMessageIdFormat: Boolean
  ): EntryPointBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntryPointBundle")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], sharedFileCache.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], formatPath.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dtsProcessing.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any], mirrorDtsFromSrc.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any])).asInstanceOf[EntryPointBundle]
  inline def makeEntryPointBundle(
    fs: FileSystem,
    entryPoint: EntryPoint,
    sharedFileCache: SharedFileCache,
    moduleResolutionCache: ModuleResolutionCache,
    formatPath: String,
    isCore: Boolean,
    format: EntryPointFormat,
    dtsProcessing: DtsProcessing,
    pathMappings: PathMappings,
    mirrorDtsFromSrc: Unit,
    enableI18nLegacyMessageIdFormat: Boolean
  ): EntryPointBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntryPointBundle")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], sharedFileCache.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], formatPath.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dtsProcessing.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any], mirrorDtsFromSrc.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any])).asInstanceOf[EntryPointBundle]
  
  trait EntryPointBundle extends StObject {
    
    var dts: BundleProgram | Null
    
    var dtsProcessing: DtsProcessing
    
    var enableI18nLegacyMessageIdFormat: Boolean
    
    var entryPoint: EntryPoint
    
    var format: EntryPointFormat
    
    var isCore: Boolean
    
    var isFlatCore: Boolean
    
    var rootDirs: js.Array[AbsoluteFsPath]
    
    var src: BundleProgram
  }
  object EntryPointBundle {
    
    inline def apply(
      dtsProcessing: DtsProcessing,
      enableI18nLegacyMessageIdFormat: Boolean,
      entryPoint: EntryPoint,
      format: EntryPointFormat,
      isCore: Boolean,
      isFlatCore: Boolean,
      rootDirs: js.Array[AbsoluteFsPath],
      src: BundleProgram
    ): EntryPointBundle = {
      val __obj = js.Dynamic.literal(dtsProcessing = dtsProcessing.asInstanceOf[js.Any], enableI18nLegacyMessageIdFormat = enableI18nLegacyMessageIdFormat.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isCore = isCore.asInstanceOf[js.Any], isFlatCore = isFlatCore.asInstanceOf[js.Any], rootDirs = rootDirs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], dts = null)
      __obj.asInstanceOf[EntryPointBundle]
    }
    
    extension [Self <: EntryPointBundle](x: Self) {
      
      inline def setDts(value: BundleProgram): Self = StObject.set(x, "dts", value.asInstanceOf[js.Any])
      
      inline def setDtsNull: Self = StObject.set(x, "dts", null)
      
      inline def setDtsProcessing(value: DtsProcessing): Self = StObject.set(x, "dtsProcessing", value.asInstanceOf[js.Any])
      
      inline def setEnableI18nLegacyMessageIdFormat(value: Boolean): Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", value.asInstanceOf[js.Any])
      
      inline def setEntryPoint(value: EntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: EntryPointFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setIsCore(value: Boolean): Self = StObject.set(x, "isCore", value.asInstanceOf[js.Any])
      
      inline def setIsFlatCore(value: Boolean): Self = StObject.set(x, "isFlatCore", value.asInstanceOf[js.Any])
      
      inline def setRootDirs(value: js.Array[AbsoluteFsPath]): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      inline def setRootDirsVarargs(value: AbsoluteFsPath*): Self = StObject.set(x, "rootDirs", js.Array(value*))
      
      inline def setSrc(value: BundleProgram): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
