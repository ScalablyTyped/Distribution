package typings.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPathMappingsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/path_mappings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathMappingsFromTsConfig(fs: PathManipulation, tsConfig: Null, projectPath: AbsoluteFsPath): js.UndefOr[PathMappings] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathMappingsFromTsConfig")(fs.asInstanceOf[js.Any], tsConfig.asInstanceOf[js.Any], projectPath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PathMappings]]
  inline def getPathMappingsFromTsConfig(fs: PathManipulation, tsConfig: ParsedConfiguration, projectPath: AbsoluteFsPath): js.UndefOr[PathMappings] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathMappingsFromTsConfig")(fs.asInstanceOf[js.Any], tsConfig.asInstanceOf[js.Any], projectPath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PathMappings]]
  
  trait PathMappings extends StObject {
    
    var baseUrl: String
    
    var paths: StringDictionary[js.Array[String]]
  }
  object PathMappings {
    
    inline def apply(baseUrl: String, paths: StringDictionary[js.Array[String]]): PathMappings = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathMappings]
    }
    
    extension [Self <: PathMappings](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
}
