package typings.angularDevkitBuildWebpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The path to the Webpack configuration file.
      */
    var webpackConfig: String
  }
  object Schema {
    
    inline def apply(webpackConfig: String): Schema = {
      val __obj = js.Dynamic.literal(webpackConfig = webpackConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setWebpackConfig(value: String): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
    }
  }
}
