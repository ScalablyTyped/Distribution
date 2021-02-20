package typings.algoliaClientCommon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.algoliaClientCommon.algoliaClientCommonStrings.headers
import typings.algoliaClientCommon.algoliaClientCommonStrings.hosts
import typings.algoliaClientCommon.algoliaClientCommonStrings.hostsCache
import typings.algoliaClientCommon.algoliaClientCommonStrings.logger
import typings.algoliaClientCommon.algoliaClientCommonStrings.queryParameters
import typings.algoliaClientCommon.algoliaClientCommonStrings.requester
import typings.algoliaClientCommon.algoliaClientCommonStrings.requestsCache
import typings.algoliaClientCommon.algoliaClientCommonStrings.responsesCache
import typings.algoliaClientCommon.algoliaClientCommonStrings.timeouts
import typings.algoliaClientCommon.algoliaClientCommonStrings.userAgent
import typings.algoliaClientCommon.anon.Headers
import typings.algoliaClientCommon.anon.ReadonlyPromiseany
import typings.algoliaClientCommon.anon.ReadonlyPromisevoid
import typings.algoliaClientCommon.anon.Transporter
import typings.algoliaTransporter.mod.RequestOptions
import typings.algoliaTransporter.mod.TransporterOptions
import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/client-common", "AuthMode")
  @js.native
  val AuthMode: Record[String, AuthModeType] = js.native
  
  @JSImport("@algolia/client-common", "addMethods")
  @js.native
  def addMethods[TBase /* <: js.Object */, TMethods /* <: Methods[TBase] */](base: TBase): AddedMethods[TBase, TMethods] = js.native
  @JSImport("@algolia/client-common", "addMethods")
  @js.native
  def addMethods[TBase /* <: js.Object */, TMethods /* <: Methods[TBase] */](base: TBase, methods: TMethods): AddedMethods[TBase, TMethods] = js.native
  
  @JSImport("@algolia/client-common", "createAuth")
  @js.native
  def createAuth(authMode: AuthModeType, appId: String, apiKey: String): Auth = js.native
  
  @JSImport("@algolia/client-common", "createRetryablePromise")
  @js.native
  def createRetryablePromise[TResponse](callback: js.Function1[/* retry */ js.Function0[js.Promise[TResponse]], js.Promise[TResponse]]): js.Promise[TResponse] = js.native
  
  @JSImport("@algolia/client-common", "createWaitablePromise")
  @js.native
  def createWaitablePromise[TResponse](promise: js.Promise[TResponse]): WaitablePromise[TResponse] = js.native
  @JSImport("@algolia/client-common", "createWaitablePromise")
  @js.native
  def createWaitablePromise[TResponse](promise: js.Promise[TResponse], wait: Wait[TResponse]): WaitablePromise[TResponse] = js.native
  
  @JSImport("@algolia/client-common", "destroy")
  @js.native
  def destroy(base: Transporter): js.Function0[ReadonlyPromisevoid] = js.native
  
  @JSImport("@algolia/client-common", "encode")
  @js.native
  def encode(format: String, args: js.Any*): String = js.native
  
  @JSImport("@algolia/client-common", "shuffle")
  @js.native
  def shuffle[TData](array: js.Array[TData]): js.Array[TData] = js.native
  
  @JSImport("@algolia/client-common", "version")
  @js.native
  val version: /* "4.8.0" */ String = js.native
  
  type AddedMethods[TBase, TMethods /* <: Methods[TBase] */] = TBase with typings.algoliaClientCommon.algoliaClientCommonStrings.AddedMethods with TopLevel[TMethods]
  
  @js.native
  trait Auth extends StObject {
    
    /**
      * Returns the headers related to auth. Should be
      * merged to the transporter headers.
      */
    def headers(): Record[String, String] = js.native
    
    /**
      * Returns the query parameters related to auth. Should be
      * merged to the query parameters headers.
      */
    def queryParameters(): Record[String, String] = js.native
  }
  object Auth {
    
    @scala.inline
    def apply(headers: () => Record[String, String], queryParameters: () => Record[String, String]): Auth = {
      val __obj = js.Dynamic.literal(headers = js.Any.fromFunction0(headers), queryParameters = js.Any.fromFunction0(queryParameters))
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: () => Record[String, String]): Self = StObject.set(x, "headers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQueryParameters(value: () => Record[String, String]): Self = StObject.set(x, "queryParameters", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.algoliaClientCommon.algoliaClientCommonNumbers.`0`
    - typings.algoliaClientCommon.algoliaClientCommonNumbers.`1`
  */
  trait AuthModeType extends StObject
  object AuthModeType {
    
    @scala.inline
    def `0`: typings.algoliaClientCommon.algoliaClientCommonNumbers.`0` = 0.asInstanceOf[typings.algoliaClientCommon.algoliaClientCommonNumbers.`0`]
    
    @scala.inline
    def `1`: typings.algoliaClientCommon.algoliaClientCommonNumbers.`1` = 1.asInstanceOf[typings.algoliaClientCommon.algoliaClientCommonNumbers.`1`]
  }
  
  type ClientTransporterOptions = (Pick[
    TransporterOptions, 
    (Exclude[
      hostsCache | logger | requester | requestsCache | responsesCache | timeouts | hosts | headers | queryParameters | userAgent, 
      headers
    ]) with (Exclude[
      hostsCache | logger | requester | requestsCache | responsesCache | timeouts | hosts | headers | queryParameters | userAgent, 
      queryParameters
    ]) with (Exclude[
      hostsCache | logger | requester | requestsCache | responsesCache | timeouts | hosts | headers | queryParameters | userAgent, 
      hosts
    ])
  ]) with Headers
  
  type CreateClient[TClient, TOptions] = js.Function1[
    /* options */ TOptions with (typings.algoliaClientCommon.anon.Methods[
      StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]], 
      TClient
    ]), 
    TClient with typings.algoliaClientCommon.algoliaClientCommonStrings.CreateClient with TopLevel[js.Any]
  ]
  
  type Methods[TBase] = StringDictionary[js.Function1[/* base */ TBase, js.Function1[/* repeated */ js.Any, js.Any]]]
  
  type Wait[TResponse] = js.Function2[
    /* response */ TResponse, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseany
  ]
  
  /* Inlined std.Readonly<std.Promise<TResponse>> & {readonly wait (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<TResponse>>} */
  @js.native
  trait WaitablePromise[TResponse] extends StObject {
    
    def `catch`[TResult](): js.Promise[TResponse | TResult] = js.native
    
    def `finally`(): js.Promise[TResponse] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    
    def wait(requestOptions: RequestOptions): WaitablePromise[TResponse] = js.native
  }
}
