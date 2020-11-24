package typings.algoliasearch.algoliasearchMod

import typings.algoliaClientSearch.anon.ReadonlyPromisevoid
import typings.algoliaClientSearch.mod.ApiKeyACLType
import typings.algoliaClientSearch.mod.CopyIndexOptions
import typings.algoliaClientSearch.mod.HasPendingMappingsOptions
import typings.algoliaClientSearch.mod.ListUserIDsOptions
import typings.algoliaClientSearch.mod.MultipleBatchRequest
import typings.algoliaClientSearch.mod.MultipleGetObject
import typings.algoliaClientSearch.mod.MultipleGetObjectsResponse
import typings.algoliaClientSearch.mod.MultipleQueriesOptions
import typings.algoliaClientSearch.mod.MultipleQueriesQuery
import typings.algoliaClientSearch.mod.MultipleQueriesResponse
import typings.algoliaClientSearch.mod.SearchUserIDsOptions
import typings.algoliaClientSearch.mod.SecuredApiKeyRestrictions
import typings.algoliaTransporter.mod.RequestOptions
import typings.algoliaTransporter.mod.Transporter
import typings.algoliasearch.anon.AddApiKeyOptionsPickReque
import typings.algoliasearch.anon.IndexName
import typings.algoliasearch.anon.ReadonlyPromiseArraySearc
import typings.algoliasearch.anon.ReadonlyPromiseAssignUser
import typings.algoliasearch.anon.ReadonlyPromiseAssignUserCatch
import typings.algoliasearch.anon.ReadonlyPromiseGetApiKeyR
import typings.algoliasearch.anon.ReadonlyPromiseGetLogsRes
import typings.algoliasearch.anon.ReadonlyPromiseGetTopUser
import typings.algoliasearch.anon.ReadonlyPromiseHasPending
import typings.algoliasearch.anon.ReadonlyPromiseListApiKey
import typings.algoliasearch.anon.ReadonlyPromiseListCluste
import typings.algoliasearch.anon.ReadonlyPromiseListIndice
import typings.algoliasearch.anon.ReadonlyPromiseListUserID
import typings.algoliasearch.anon.ReadonlyPromiseRemoveUser
import typings.algoliasearch.anon.ReadonlyPromiseSearchUser
import typings.algoliasearch.anon.ReadonlyPromiseUserIDResp
import typings.algoliasearch.anon.ReadonlyWaitablePromiseAd
import typings.algoliasearch.anon.ReadonlyWaitablePromiseDe
import typings.algoliasearch.anon.ReadonlyWaitablePromiseIn
import typings.algoliasearch.anon.ReadonlyWaitablePromiseMu
import typings.algoliasearch.anon.ReadonlyWaitablePromiseRe
import typings.algoliasearch.anon.ReadonlyWaitablePromiseUp
import typings.algoliasearch.anon.UpdateApiKeyOptionsPickRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-search.@algolia/client-search.SearchClient & {readonly initIndex (indexName : string): algoliasearch.algoliasearch/dist/algoliasearch.SearchIndex, readonly search <TObject>(queries : std.Array<@algolia/client-search.@algolia/client-search.MultipleQueriesQuery>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.MultipleQueriesOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.MultipleQueriesResponse<TObject>>>, readonly searchForFacetValues (queries : std.ReadonlyArray<{ readonly indexName :string,  readonly params :@algolia/client-search.@algolia/client-search.SearchForFacetValuesQueryParams & @algolia/client-search.@algolia/client-search.SearchOptions}>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>>, readonly multipleBatch (requests : std.Array<@algolia/client-search.@algolia/client-search.MultipleBatchRequest>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.MultipleBatchResponse>>, readonly multipleGetObjects <TObject>(requests : std.Array<@algolia/client-search.@algolia/client-search.MultipleGetObject>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.MultipleGetObjectsResponse<TObject>>>, readonly multipleQueries <TObject>(queries : std.Array<@algolia/client-search.@algolia/client-search.MultipleQueriesQuery>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.MultipleQueriesOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.MultipleQueriesResponse<TObject>>>, readonly copyIndex (from : string, to : string, requestOptions : @algolia/client-search.@algolia/client-search.CopyIndexOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly copySettings (from : string, to : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly copyRules (from : string, to : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly copySynonyms (from : string, to : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly moveIndex (from : string, to : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly listIndices (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListIndicesResponse>>, readonly getLogs (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetLogsResponse>>, readonly listClusters (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListClustersResponse>>, readonly multipleSearchForFacetValues (queries : std.ReadonlyArray<{ readonly indexName :string,  readonly params :@algolia/client-search.@algolia/client-search.SearchForFacetValuesQueryParams & @algolia/client-search.@algolia/client-search.SearchOptions}>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>>, readonly getApiKey (apiKey : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetApiKeyResponse>>, readonly addApiKey (acl : std.Array<@algolia/client-search.@algolia/client-search.ApiKeyACLType>, requestOptions : @algolia/client-search.@algolia/client-search.AddApiKeyOptions & std.Pick<@algolia/transporter.@algolia/transporter.RequestOptions, std.Exclude<keyof @algolia/transporter.@algolia/transporter.RequestOptions, 'queryParameters'>> | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.AddApiKeyResponse>>, readonly listApiKeys (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListApiKeysResponse>>, readonly updateApiKey (apiKey : string, requestOptions : @algolia/client-search.@algolia/client-search.UpdateApiKeyOptions & std.Pick<@algolia/transporter.@algolia/transporter.RequestOptions, std.Exclude<keyof @algolia/transporter.@algolia/transporter.RequestOptions, 'queryParameters'>> | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.UpdateApiKeyResponse>>, readonly deleteApiKey (apiKey : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteApiKeyResponse>>, readonly restoreApiKey (apiKey : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.RestoreApiKeyResponse>>, readonly assignUserID (userID : string, clusterName : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDResponse>>, readonly assignUserIDs (userIDs : std.Array<string>, clusterName : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDsResponse>>, readonly getUserID (userID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.UserIDResponse>>, readonly searchUserIDs (query : string, requestOptions : @algolia/client-search.@algolia/client-search.SearchUserIDsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchUserIDsResponse>>, readonly listUserIDs (requestOptions : @algolia/client-search.@algolia/client-search.ListUserIDsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListUserIDsResponse>>, readonly getTopUserIDs (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetTopUserIDsResponse>>, readonly removeUserID (userID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.RemoveUserIDResponse>>, readonly hasPendingMappings (requestOptions : @algolia/client-search.@algolia/client-search.HasPendingMappingsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.HasPendingMappingsResponse>>, readonly generateSecuredApiKey (parentApiKey : string, restrictions : @algolia/client-search.@algolia/client-search.SecuredApiKeyRestrictions): string, readonly getSecuredApiKeyRemainingValidity (securedApiKey : string): number, readonly initAnalytics (options : algoliasearch.algoliasearch/dist/algoliasearch.InitAnalyticsOptions | undefined): algoliasearch.algoliasearch/dist/algoliasearch.AnalyticsClient, readonly initRecommendation (options : algoliasearch.algoliasearch/dist/algoliasearch.InitRecommendationOptions | undefined): algoliasearch.algoliasearch/dist/algoliasearch.RecommendationClient} & @algolia/requester-common.@algolia/requester-common.Destroyable */
@js.native
trait SearchClient extends js.Object {
  
  /**
    * Mutates the transporter, adding the given user agent.
    */
  def addAlgoliaAgent(segment: String): Unit = js.native
  def addAlgoliaAgent(segment: String, version: String): Unit = js.native
  
  def addApiKey(acl: js.Array[ApiKeyACLType]): ReadonlyWaitablePromiseAd = js.native
  def addApiKey(acl: js.Array[ApiKeyACLType], requestOptions: AddApiKeyOptionsPickReque): ReadonlyWaitablePromiseAd = js.native
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  def assignUserID(userID: String, clusterName: String): ReadonlyPromiseAssignUser = js.native
  def assignUserID(userID: String, clusterName: String, requestOptions: RequestOptions): ReadonlyPromiseAssignUser = js.native
  
  def assignUserIDs(userIDs: js.Array[String], clusterName: String): ReadonlyPromiseAssignUserCatch = js.native
  def assignUserIDs(userIDs: js.Array[String], clusterName: String, requestOptions: RequestOptions): ReadonlyPromiseAssignUserCatch = js.native
  
  /**
    * Clears both requests and responses caches.
    */
  def clearCache(): ReadonlyPromisevoid = js.native
  
  def copyIndex(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
  def copyIndex(from: String, to: String, requestOptions: CopyIndexOptions with RequestOptions): ReadonlyWaitablePromiseIn = js.native
  
  def copyRules(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
  def copyRules(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
  
  def copySettings(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
  def copySettings(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
  
  def copySynonyms(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
  def copySynonyms(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
  
  def deleteApiKey(apiKey: String): ReadonlyWaitablePromiseDe = js.native
  def deleteApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDe = js.native
  
  /**
    * Destroy any sockets that are currently in use by the agent.
    *
    * It is usually not necessary to do this. However, if using an agent with keepAlive enabled, then
    * it is best to explicitly shut down the agent when it will no longer be used. Otherwise, sockets
    * may hang open for quite a long time before the server terminates them.
    */
  def destroy(): typings.algoliaRequesterCommon.anon.ReadonlyPromisevoid = js.native
  
  def generateSecuredApiKey(parentApiKey: String, restrictions: SecuredApiKeyRestrictions): String = js.native
  
  def getApiKey(apiKey: String): ReadonlyPromiseGetApiKeyR = js.native
  def getApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyPromiseGetApiKeyR = js.native
  
  def getLogs(): ReadonlyPromiseGetLogsRes = js.native
  def getLogs(requestOptions: RequestOptions): ReadonlyPromiseGetLogsRes = js.native
  
  def getSecuredApiKeyRemainingValidity(securedApiKey: String): Double = js.native
  
  def getTopUserIDs(): ReadonlyPromiseGetTopUser = js.native
  def getTopUserIDs(requestOptions: RequestOptions): ReadonlyPromiseGetTopUser = js.native
  
  def getUserID(userID: String): ReadonlyPromiseUserIDResp = js.native
  def getUserID(userID: String, requestOptions: RequestOptions): ReadonlyPromiseUserIDResp = js.native
  
  def hasPendingMappings(): ReadonlyPromiseHasPending = js.native
  def hasPendingMappings(requestOptions: HasPendingMappingsOptions with RequestOptions): ReadonlyPromiseHasPending = js.native
  
  def initAnalytics(): AnalyticsClient = js.native
  def initAnalytics(options: InitAnalyticsOptions): AnalyticsClient = js.native
  
  def initIndex(indexName: String): SearchIndex = js.native
  
  def initRecommendation(): RecommendationClient = js.native
  def initRecommendation(options: InitRecommendationOptions): RecommendationClient = js.native
  
  def listApiKeys(): ReadonlyPromiseListApiKey = js.native
  def listApiKeys(requestOptions: RequestOptions): ReadonlyPromiseListApiKey = js.native
  
  def listClusters(): ReadonlyPromiseListCluste = js.native
  def listClusters(requestOptions: RequestOptions): ReadonlyPromiseListCluste = js.native
  
  def listIndices(): ReadonlyPromiseListIndice = js.native
  def listIndices(requestOptions: RequestOptions): ReadonlyPromiseListIndice = js.native
  
  def listUserIDs(): ReadonlyPromiseListUserID = js.native
  def listUserIDs(requestOptions: ListUserIDsOptions with RequestOptions): ReadonlyPromiseListUserID = js.native
  
  def moveIndex(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
  def moveIndex(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
  
  def multipleBatch(requests: js.Array[MultipleBatchRequest]): ReadonlyWaitablePromiseMu = js.native
  def multipleBatch(requests: js.Array[MultipleBatchRequest], requestOptions: RequestOptions): ReadonlyWaitablePromiseMu = js.native
  
  def multipleGetObjects[TObject](requests: js.Array[MultipleGetObject]): js.Promise[MultipleGetObjectsResponse[TObject]] = js.native
  def multipleGetObjects[TObject](requests: js.Array[MultipleGetObject], requestOptions: RequestOptions): js.Promise[MultipleGetObjectsResponse[TObject]] = js.native
  
  def multipleQueries[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
  def multipleQueries[TObject](
    queries: js.Array[MultipleQueriesQuery],
    requestOptions: RequestOptions with MultipleQueriesOptions
  ): js.Promise[MultipleQueriesResponse[TObject]] = js.native
  
  def multipleSearchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
  def multipleSearchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
  
  def removeUserID(userID: String): ReadonlyPromiseRemoveUser = js.native
  def removeUserID(userID: String, requestOptions: RequestOptions): ReadonlyPromiseRemoveUser = js.native
  
  def restoreApiKey(apiKey: String): ReadonlyWaitablePromiseRe = js.native
  def restoreApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseRe = js.native
  
  def search[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
  def search[TObject](
    queries: js.Array[MultipleQueriesQuery],
    requestOptions: RequestOptions with MultipleQueriesOptions
  ): js.Promise[MultipleQueriesResponse[TObject]] = js.native
  
  def searchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
  def searchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
  
  def searchUserIDs(query: String): ReadonlyPromiseSearchUser = js.native
  def searchUserIDs(query: String, requestOptions: SearchUserIDsOptions with RequestOptions): ReadonlyPromiseSearchUser = js.native
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
  
  def updateApiKey(apiKey: String): ReadonlyWaitablePromiseUp = js.native
  def updateApiKey(apiKey: String, requestOptions: UpdateApiKeyOptionsPickRe): ReadonlyWaitablePromiseUp = js.native
}
