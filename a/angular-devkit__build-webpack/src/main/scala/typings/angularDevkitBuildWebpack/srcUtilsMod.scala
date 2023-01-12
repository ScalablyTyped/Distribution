package typings.angularDevkitBuildWebpack

import typings.webpack.mod.Compilation
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("@angular-devkit/build-webpack/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEmittedFiles(compilation: Compilation): js.Array[EmittedFiles] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmittedFiles")(compilation.asInstanceOf[js.Any]).asInstanceOf[js.Array[EmittedFiles]]
  
  inline def getWebpackConfig(configPath: String): js.Promise[Configuration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebpackConfig")(configPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Configuration]]
  
  trait EmittedFiles extends StObject {
    
    var asset: js.UndefOr[Boolean] = js.undefined
    
    var `extension`: String
    
    var file: String
    
    var id: js.UndefOr[String] = js.undefined
    
    var initial: Boolean
    
    var name: js.UndefOr[String] = js.undefined
  }
  object EmittedFiles {
    
    inline def apply(`extension`: String, file: String, initial: Boolean): EmittedFiles = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmittedFiles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmittedFiles] (val x: Self) extends AnyVal {
      
      inline def setAsset(value: Boolean): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
