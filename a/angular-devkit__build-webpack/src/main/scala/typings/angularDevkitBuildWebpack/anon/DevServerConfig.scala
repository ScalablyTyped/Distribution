package typings.angularDevkitBuildWebpack.anon

import typings.angularDevkitBuildWebpack.webpackDevServerMod.WebpackDevServerFactory
import typings.angularDevkitBuildWebpack.webpackMod.WebpackFactory
import typings.angularDevkitBuildWebpack.webpackMod.WebpackLoggingCallback
import typings.webpack.mod.Compiler
import typings.webpack.mod.Stats
import typings.webpackDevServer.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevServerConfig extends StObject {
  
  var devServerConfig: js.UndefOr[Configuration] = js.undefined
  
  var logging: js.UndefOr[WebpackLoggingCallback] = js.undefined
  
  var webpackDevServerFactory: js.UndefOr[WebpackDevServerFactory] = js.undefined
  
  var webpackFactory: js.UndefOr[WebpackFactory] = js.undefined
}
object DevServerConfig {
  
  inline def apply(): DevServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevServerConfig]
  }
  
  extension [Self <: DevServerConfig](x: Self) {
    
    inline def setDevServerConfig(value: Configuration): Self = StObject.set(x, "devServerConfig", value.asInstanceOf[js.Any])
    
    inline def setDevServerConfigUndefined: Self = StObject.set(x, "devServerConfig", js.undefined)
    
    inline def setLogging(value: (/* stats */ Stats, /* config */ typings.webpack.mod.Configuration) => Unit): Self = StObject.set(x, "logging", js.Any.fromFunction2(value))
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setWebpackDevServerFactory(value: WebpackDevServerFactory): Self = StObject.set(x, "webpackDevServerFactory", value.asInstanceOf[js.Any])
    
    inline def setWebpackDevServerFactoryUndefined: Self = StObject.set(x, "webpackDevServerFactory", js.undefined)
    
    inline def setWebpackFactory(
      value: /* config */ typings.webpack.mod.Configuration => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<webpack.Compiler> */ Any) | Compiler
    ): Self = StObject.set(x, "webpackFactory", js.Any.fromFunction1(value))
    
    inline def setWebpackFactoryUndefined: Self = StObject.set(x, "webpackFactory", js.undefined)
  }
}
