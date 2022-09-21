package typings.apimocker

import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apimocker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createServer(): ApiMocker = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[ApiMocker]
  inline def createServer(options: ConfigOptions): ApiMocker = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[ApiMocker]
  
  @JSImport("apimocker", "middlewares")
  @js.native
  val middlewares: js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ] = js.native
  
  inline def setConfigFile(file: String): ApiMocker = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfigFile")(file.asInstanceOf[js.Any]).asInstanceOf[ApiMocker]
  
  inline def start(serverPort: String): ApiMocker = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(serverPort.asInstanceOf[js.Any]).asInstanceOf[ApiMocker]
  inline def start(serverPort: String, callback: js.Function0[Unit]): ApiMocker = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(serverPort.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ApiMocker]
  inline def start(serverPort: Double): ApiMocker = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(serverPort.asInstanceOf[js.Any]).asInstanceOf[ApiMocker]
  inline def start(serverPort: Double, callback: js.Function0[Unit]): ApiMocker = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(serverPort.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ApiMocker]
  
  inline def stop(): ApiMocker = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[ApiMocker]
  inline def stop(callback: js.Function0[Unit]): ApiMocker = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(callback.asInstanceOf[js.Any]).asInstanceOf[ApiMocker]
  
  @js.native
  trait ApiMocker extends StObject {
    
    var express: Application_ = js.native
    
    def loadConfigFile(): Unit = js.native
    
    var middlewares: js.Array[
        RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ] = js.native
    
    def setConfigFile(file: String): ApiMocker = js.native
    
    /**
      * Set the route for express, in case it was not set yet
      */
    def setRoute(options: Any): Unit = js.native
    
    def setRoutes(webServices: Any): Unit = js.native
    
    /**
      * Start a new instance of API Mocker
      */
    def start(serverPort: String): ApiMocker = js.native
    def start(serverPort: String, callback: js.Function0[Unit]): ApiMocker = js.native
    def start(serverPort: Double): ApiMocker = js.native
    def start(serverPort: Double, callback: js.Function0[Unit]): ApiMocker = js.native
    
    /**
      * Stop the referenced instance of API Mocker
      */
    def stop(): ApiMocker = js.native
    def stop(callback: js.Function0[Unit]): ApiMocker = js.native
  }
  
  trait ConfigOptions extends StObject {
    
    var allowAvoidPreFlight: js.UndefOr[Boolean] = js.undefined
    
    var allowedDomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowedHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var logRequestHeaders: js.UndefOr[Boolean] = js.undefined
    
    var mockDirectory: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var useUploadFieldname: js.UndefOr[Boolean] = js.undefined
    
    var webServices: js.UndefOr[Any] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setAllowAvoidPreFlight(value: Boolean): Self = StObject.set(x, "allowAvoidPreFlight", value.asInstanceOf[js.Any])
      
      inline def setAllowAvoidPreFlightUndefined: Self = StObject.set(x, "allowAvoidPreFlight", js.undefined)
      
      inline def setAllowedDomains(value: js.Array[String]): Self = StObject.set(x, "allowedDomains", value.asInstanceOf[js.Any])
      
      inline def setAllowedDomainsUndefined: Self = StObject.set(x, "allowedDomains", js.undefined)
      
      inline def setAllowedDomainsVarargs(value: String*): Self = StObject.set(x, "allowedDomains", js.Array(value*))
      
      inline def setAllowedHeaders(value: js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
      
      inline def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value*))
      
      inline def setLogRequestHeaders(value: Boolean): Self = StObject.set(x, "logRequestHeaders", value.asInstanceOf[js.Any])
      
      inline def setLogRequestHeadersUndefined: Self = StObject.set(x, "logRequestHeaders", js.undefined)
      
      inline def setMockDirectory(value: String): Self = StObject.set(x, "mockDirectory", value.asInstanceOf[js.Any])
      
      inline def setMockDirectoryUndefined: Self = StObject.set(x, "mockDirectory", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setUseUploadFieldname(value: Boolean): Self = StObject.set(x, "useUploadFieldname", value.asInstanceOf[js.Any])
      
      inline def setUseUploadFieldnameUndefined: Self = StObject.set(x, "useUploadFieldname", js.undefined)
      
      inline def setWebServices(value: Any): Self = StObject.set(x, "webServices", value.asInstanceOf[js.Any])
      
      inline def setWebServicesUndefined: Self = StObject.set(x, "webServices", js.undefined)
    }
  }
}
