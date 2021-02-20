package typings.apimocker

import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apimocker", "createServer")
  @js.native
  def createServer(): ApiMocker = js.native
  @JSImport("apimocker", "createServer")
  @js.native
  def createServer(options: ConfigOptions): ApiMocker = js.native
  
  @JSImport("apimocker", "middlewares")
  @js.native
  val middlewares: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.native
  
  @JSImport("apimocker", "setConfigFile")
  @js.native
  def setConfigFile(file: String): ApiMocker = js.native
  
  @JSImport("apimocker", "start")
  @js.native
  def start(serverPort: String): ApiMocker = js.native
  @JSImport("apimocker", "start")
  @js.native
  def start(serverPort: String, callback: js.Function0[Unit]): ApiMocker = js.native
  @JSImport("apimocker", "start")
  @js.native
  def start(serverPort: Double): ApiMocker = js.native
  @JSImport("apimocker", "start")
  @js.native
  def start(serverPort: Double, callback: js.Function0[Unit]): ApiMocker = js.native
  
  @JSImport("apimocker", "stop")
  @js.native
  def stop(): ApiMocker = js.native
  @JSImport("apimocker", "stop")
  @js.native
  def stop(callback: js.Function0[Unit]): ApiMocker = js.native
  
  @js.native
  trait ApiMocker extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def express(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def express(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def express(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def express(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("express")
    var express_Original: Application_ = js.native
    
    def loadConfigFile(): Unit = js.native
    
    var middlewares: js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    def setConfigFile(file: String): ApiMocker = js.native
    
    /**
      * Set the route for express, in case it was not set yet
      */
    def setRoute(options: js.Any): Unit = js.native
    
    def setRoutes(webServices: js.Any): Unit = js.native
    
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
  
  @js.native
  trait ConfigOptions extends StObject {
    
    var allowAvoidPreFlight: js.UndefOr[Boolean] = js.native
    
    var allowedDomains: js.UndefOr[js.Array[String]] = js.native
    
    var allowedHeaders: js.UndefOr[js.Array[String]] = js.native
    
    var logRequestHeaders: js.UndefOr[Boolean] = js.native
    
    var mockDirectory: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[String] = js.native
    
    var quiet: js.UndefOr[Boolean] = js.native
    
    var useUploadFieldname: js.UndefOr[Boolean] = js.native
    
    var webServices: js.UndefOr[js.Any] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAvoidPreFlight(value: Boolean): Self = StObject.set(x, "allowAvoidPreFlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAvoidPreFlightUndefined: Self = StObject.set(x, "allowAvoidPreFlight", js.undefined)
      
      @scala.inline
      def setAllowedDomains(value: js.Array[String]): Self = StObject.set(x, "allowedDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedDomainsUndefined: Self = StObject.set(x, "allowedDomains", js.undefined)
      
      @scala.inline
      def setAllowedDomainsVarargs(value: String*): Self = StObject.set(x, "allowedDomains", js.Array(value :_*))
      
      @scala.inline
      def setAllowedHeaders(value: js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
      
      @scala.inline
      def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value :_*))
      
      @scala.inline
      def setLogRequestHeaders(value: Boolean): Self = StObject.set(x, "logRequestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogRequestHeadersUndefined: Self = StObject.set(x, "logRequestHeaders", js.undefined)
      
      @scala.inline
      def setMockDirectory(value: String): Self = StObject.set(x, "mockDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockDirectoryUndefined: Self = StObject.set(x, "mockDirectory", js.undefined)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setUseUploadFieldname(value: Boolean): Self = StObject.set(x, "useUploadFieldname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUploadFieldnameUndefined: Self = StObject.set(x, "useUploadFieldname", js.undefined)
      
      @scala.inline
      def setWebServices(value: js.Any): Self = StObject.set(x, "webServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebServicesUndefined: Self = StObject.set(x, "webServices", js.undefined)
    }
  }
}
