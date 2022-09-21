package typings.angularDevkitBuildWebpack.anon

import typings.angularDevkitBuildWebpack.webpackMod.WebpackFactory
import typings.angularDevkitBuildWebpack.webpackMod.WebpackLoggingCallback
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logging extends StObject {
  
  var logging: js.UndefOr[WebpackLoggingCallback] = js.undefined
  
  var shouldProvideStats: js.UndefOr[Boolean] = js.undefined
  
  var webpackFactory: js.UndefOr[WebpackFactory] = js.undefined
}
object Logging {
  
  inline def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  extension [Self <: Logging](x: Self) {
    
    inline def setLogging(value: (/* stats */ Stats, /* config */ Configuration) => Unit): Self = StObject.set(x, "logging", js.Any.fromFunction2(value))
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setShouldProvideStats(value: Boolean): Self = StObject.set(x, "shouldProvideStats", value.asInstanceOf[js.Any])
    
    inline def setShouldProvideStatsUndefined: Self = StObject.set(x, "shouldProvideStats", js.undefined)
    
    inline def setWebpackFactory(
      value: /* config */ Configuration => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<webpack.Compiler> */ Any) | Compiler
    ): Self = StObject.set(x, "webpackFactory", js.Any.fromFunction1(value))
    
    inline def setWebpackFactoryUndefined: Self = StObject.set(x, "webpackFactory", js.undefined)
  }
}
