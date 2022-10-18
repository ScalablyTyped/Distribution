package typings.algoliasearch

import typings.algoliaClientAnalytics.mod.ABTest
import typings.algoliaClientAnalytics.mod.GetABTestsOptions
import typings.algoliaClientCommon.mod.ClientTransporterOptions
import typings.algoliaClientPersonalization.mod.PersonalizationStrategy
import typings.algoliaClientSearch.mod.ApiKeyACLType
import typings.algoliaClientSearch.mod.BatchRequest
import typings.algoliaClientSearch.mod.BrowseOptions
import typings.algoliaClientSearch.mod.ChunkOptions
import typings.algoliaClientSearch.mod.ClearRulesOptions
import typings.algoliaClientSearch.mod.ClearSynonymsOptions
import typings.algoliaClientSearch.mod.CopyIndexOptions
import typings.algoliaClientSearch.mod.DeleteByFiltersOptions
import typings.algoliaClientSearch.mod.DeleteSynonymOptions
import typings.algoliaClientSearch.mod.DictionaryEntriesOptions
import typings.algoliaClientSearch.mod.DictionaryEntry
import typings.algoliaClientSearch.mod.DictionaryName
import typings.algoliaClientSearch.mod.DictionarySettings
import typings.algoliaClientSearch.mod.FindAnswersOptions
import typings.algoliaClientSearch.mod.FindAnswersResponse
import typings.algoliaClientSearch.mod.FindObjectOptions
import typings.algoliaClientSearch.mod.FindObjectResponse
import typings.algoliaClientSearch.mod.GetObjectOptions
import typings.algoliaClientSearch.mod.GetObjectsOptions
import typings.algoliaClientSearch.mod.GetObjectsResponse
import typings.algoliaClientSearch.mod.HasPendingMappingsOptions
import typings.algoliaClientSearch.mod.ListUserIDsOptions
import typings.algoliaClientSearch.mod.MultipleBatchRequest
import typings.algoliaClientSearch.mod.MultipleGetObject
import typings.algoliaClientSearch.mod.MultipleGetObjectsResponse
import typings.algoliaClientSearch.mod.MultipleQueriesOptions
import typings.algoliaClientSearch.mod.MultipleQueriesQuery
import typings.algoliaClientSearch.mod.MultipleQueriesResponse
import typings.algoliaClientSearch.mod.ObjectWithObjectID
import typings.algoliaClientSearch.mod.PartialUpdateObjectsOptions
import typings.algoliaClientSearch.mod.ReplaceAllObjectsOptions
import typings.algoliaClientSearch.mod.Rule
import typings.algoliaClientSearch.mod.SaveObjectsOptions
import typings.algoliaClientSearch.mod.SaveRulesOptions
import typings.algoliaClientSearch.mod.SaveSynonymsOptions
import typings.algoliaClientSearch.mod.SearchOptions
import typings.algoliaClientSearch.mod.SearchResponse
import typings.algoliaClientSearch.mod.SearchRulesOptions
import typings.algoliaClientSearch.mod.SearchSynonymsOptions
import typings.algoliaClientSearch.mod.SearchUserIDsOptions
import typings.algoliaClientSearch.mod.SecuredApiKeyRestrictions
import typings.algoliaClientSearch.mod.Settings
import typings.algoliaClientSearch.mod.Synonym
import typings.algoliaRequesterCommon.mod.Destroyable
import typings.algoliaTransporter.mod.Request
import typings.algoliaTransporter.mod.RequestOptions
import typings.algoliasearch.algoliasearchStrings.apiKey
import typings.algoliasearch.algoliasearchStrings.appId
import typings.algoliasearch.anon.AddApiKeyOptionsPickReque
import typings.algoliasearch.anon.IndexName
import typings.algoliasearch.anon.OptionalCredentialsAnalyt
import typings.algoliasearch.anon.OptionalCredentialsPerson
import typings.algoliasearch.anon.ReadonlyPromiseAddABTestR
import typings.algoliasearch.anon.ReadonlyPromiseArraySearc
import typings.algoliasearch.anon.ReadonlyPromiseAssignUser
import typings.algoliasearch.anon.ReadonlyPromiseAssignUserCatch
import typings.algoliasearch.anon.ReadonlyPromiseDeleteABTe
import typings.algoliasearch.anon.ReadonlyPromiseGetABTestR
import typings.algoliasearch.anon.ReadonlyPromiseGetABTests
import typings.algoliasearch.anon.ReadonlyPromiseGetApiKeyR
import typings.algoliasearch.anon.ReadonlyPromiseGetDiction
import typings.algoliasearch.anon.ReadonlyPromiseGetLogsRes
import typings.algoliasearch.anon.ReadonlyPromiseGetPersona
import typings.algoliasearch.anon.ReadonlyPromiseGetTopUser
import typings.algoliasearch.anon.ReadonlyPromiseHasPending
import typings.algoliasearch.anon.ReadonlyPromiseListApiKey
import typings.algoliasearch.anon.ReadonlyPromiseListCluste
import typings.algoliasearch.anon.ReadonlyPromiseListIndice
import typings.algoliasearch.anon.ReadonlyPromiseListUserID
import typings.algoliasearch.anon.ReadonlyPromiseRemoveUser
import typings.algoliasearch.anon.ReadonlyPromiseRule
import typings.algoliasearch.anon.ReadonlyPromiseSearchDict
import typings.algoliasearch.anon.ReadonlyPromiseSearchForF
import typings.algoliasearch.anon.ReadonlyPromiseSearchResp
import typings.algoliasearch.anon.ReadonlyPromiseSearchSyno
import typings.algoliasearch.anon.ReadonlyPromiseSearchUser
import typings.algoliasearch.anon.ReadonlyPromiseSetPersona
import typings.algoliasearch.anon.ReadonlyPromiseSettings
import typings.algoliasearch.anon.ReadonlyPromiseStopABTest
import typings.algoliasearch.anon.ReadonlyPromiseSynonym
import typings.algoliasearch.anon.ReadonlyPromiseTaskStatus
import typings.algoliasearch.anon.ReadonlyPromiseUserIDResp
import typings.algoliasearch.anon.ReadonlyPromiseboolean
import typings.algoliasearch.anon.ReadonlyPromisevoid
import typings.algoliasearch.anon.ReadonlyWaitablePromiseAd
import typings.algoliasearch.anon.ReadonlyWaitablePromiseBa
import typings.algoliasearch.anon.ReadonlyWaitablePromiseCh
import typings.algoliasearch.anon.ReadonlyWaitablePromiseDe
import typings.algoliasearch.anon.ReadonlyWaitablePromiseDeCatch
import typings.algoliasearch.anon.ReadonlyWaitablePromiseDi
import typings.algoliasearch.anon.ReadonlyWaitablePromiseIn
import typings.algoliasearch.anon.ReadonlyWaitablePromiseMu
import typings.algoliasearch.anon.ReadonlyWaitablePromisePa
import typings.algoliasearch.anon.ReadonlyWaitablePromiseRe
import typings.algoliasearch.anon.ReadonlyWaitablePromiseSa
import typings.algoliasearch.anon.ReadonlyWaitablePromiseSaCatch
import typings.algoliasearch.anon.ReadonlyWaitablePromiseSaFinally
import typings.algoliasearch.anon.ReadonlyWaitablePromiseSaThen
import typings.algoliasearch.anon.ReadonlyWaitablePromiseSaWait
import typings.algoliasearch.anon.ReadonlyWaitablePromiseSe
import typings.algoliasearch.anon.ReadonlyWaitablePromiseUp
import typings.algoliasearch.anon.RequestOptionsPickSaveSyn
import typings.algoliasearch.anon.UpdateApiKeyOptionsPickRe
import typings.algoliasearch.anon.WithoutCredentialsSearchC
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAlgoliasearchMod {
  
  object default {
    
    inline def apply(appId: String, apiKey: String): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    inline def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    
    @JSImport("algoliasearch/dist/algoliasearch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("algoliasearch/dist/algoliasearch", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  type AlgoliaSearchOptions = Partial[ClientTransporterOptions] & WithoutCredentialsSearchC
  
  @js.native
  trait AnalyticsClient
    extends StObject
       with typings.algoliaClientAnalytics.mod.AnalyticsClient {
    
    def addABTest(abTest: ABTest): ReadonlyPromiseAddABTestR = js.native
    def addABTest(abTest: ABTest, requestOptions: RequestOptions): ReadonlyPromiseAddABTestR = js.native
    
    def deleteABTest(abTestID: Double): ReadonlyPromiseDeleteABTe = js.native
    def deleteABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseDeleteABTe = js.native
    
    def getABTest(abTestID: Double): ReadonlyPromiseGetABTestR = js.native
    def getABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseGetABTestR = js.native
    
    def getABTests(): ReadonlyPromiseGetABTests = js.native
    def getABTests(requestOptions: RequestOptions & GetABTestsOptions): ReadonlyPromiseGetABTests = js.native
    
    def stopABTest(abTestID: Double): ReadonlyPromiseStopABTest = js.native
    def stopABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseStopABTest = js.native
  }
  
  trait Credentials extends StObject {
    
    val apiKey: String
    
    val appId: String
  }
  object Credentials {
    
    inline def apply(apiKey: String, appId: String): Credentials = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  type InitAnalyticsOptions = Partial[ClientTransporterOptions] & OptionalCredentialsAnalyt
  
  type InitPersonalizationOptions = Partial[ClientTransporterOptions] & OptionalCredentialsPerson
  
  type InitRecommendationOptions = InitPersonalizationOptions
  
  type OptionalCredentials[TClientOptions /* <: Credentials */] = (Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ]) & (Pick[
    Partial[TClientOptions], 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ])
  
  @js.native
  trait PersonalizationClient
    extends StObject
       with typings.algoliaClientPersonalization.mod.PersonalizationClient {
    
    def getPersonalizationStrategy(): ReadonlyPromiseGetPersona = js.native
    def getPersonalizationStrategy(requestOptions: RequestOptions): ReadonlyPromiseGetPersona = js.native
    
    def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy): ReadonlyPromiseSetPersona = js.native
    def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy, requestOptions: RequestOptions): ReadonlyPromiseSetPersona = js.native
  }
  
  type RecommendationClient = PersonalizationClient
  
  @js.native
  trait SearchClient
    extends StObject
       with typings.algoliaClientSearch.mod.SearchClient
       with Destroyable {
    
    def addApiKey(acl: js.Array[ApiKeyACLType]): ReadonlyWaitablePromiseAd = js.native
    def addApiKey(acl: js.Array[ApiKeyACLType], requestOptions: AddApiKeyOptionsPickReque): ReadonlyWaitablePromiseAd = js.native
    
    def assignUserID(userID: String, clusterName: String): ReadonlyPromiseAssignUser = js.native
    def assignUserID(userID: String, clusterName: String, requestOptions: RequestOptions): ReadonlyPromiseAssignUser = js.native
    
    def assignUserIDs(userIDs: js.Array[String], clusterName: String): ReadonlyPromiseAssignUserCatch = js.native
    def assignUserIDs(userIDs: js.Array[String], clusterName: String, requestOptions: RequestOptions): ReadonlyPromiseAssignUserCatch = js.native
    
    def clearDictionaryEntries(dictionary: DictionaryName): ReadonlyWaitablePromiseDi = js.native
    def clearDictionaryEntries(dictionary: DictionaryName, requestOptions: RequestOptions & DictionaryEntriesOptions): ReadonlyWaitablePromiseDi = js.native
    
    def copyIndex(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copyIndex(from: String, to: String, requestOptions: CopyIndexOptions & RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copyRules(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copyRules(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copySettings(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copySettings(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copySynonyms(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copySynonyms(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def customRequest[TResponse](request: Request): js.Promise[TResponse] = js.native
    def customRequest[TResponse](request: Request, requestOptions: RequestOptions): js.Promise[TResponse] = js.native
    
    def deleteApiKey(apiKey: String): ReadonlyWaitablePromiseDe = js.native
    def deleteApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDe = js.native
    
    def deleteDictionaryEntries(dictionary: DictionaryName, objectIDs: js.Array[String]): ReadonlyWaitablePromiseDi = js.native
    def deleteDictionaryEntries(
      dictionary: DictionaryName,
      objectIDs: js.Array[String],
      requestOptions: RequestOptions & DictionaryEntriesOptions
    ): ReadonlyWaitablePromiseDi = js.native
    
    def generateSecuredApiKey(parentApiKey: String, restrictions: SecuredApiKeyRestrictions): String = js.native
    
    def getApiKey(apiKey: String): ReadonlyPromiseGetApiKeyR = js.native
    def getApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyPromiseGetApiKeyR = js.native
    
    def getAppTask(taskID: Double): ReadonlyPromiseTaskStatus = js.native
    def getAppTask(taskID: Double, requestOptions: RequestOptions): ReadonlyPromiseTaskStatus = js.native
    
    def getDictionarySettings(): ReadonlyPromiseGetDiction = js.native
    def getDictionarySettings(requestOptions: RequestOptions): ReadonlyPromiseGetDiction = js.native
    
    def getLogs(): ReadonlyPromiseGetLogsRes = js.native
    def getLogs(requestOptions: RequestOptions): ReadonlyPromiseGetLogsRes = js.native
    
    def getSecuredApiKeyRemainingValidity(securedApiKey: String): Double = js.native
    
    def getTopUserIDs(): ReadonlyPromiseGetTopUser = js.native
    def getTopUserIDs(requestOptions: RequestOptions): ReadonlyPromiseGetTopUser = js.native
    
    def getUserID(userID: String): ReadonlyPromiseUserIDResp = js.native
    def getUserID(userID: String, requestOptions: RequestOptions): ReadonlyPromiseUserIDResp = js.native
    
    def hasPendingMappings(): ReadonlyPromiseHasPending = js.native
    def hasPendingMappings(requestOptions: HasPendingMappingsOptions & RequestOptions): ReadonlyPromiseHasPending = js.native
    
    def initAnalytics(): AnalyticsClient = js.native
    def initAnalytics(options: InitAnalyticsOptions): AnalyticsClient = js.native
    
    def initIndex(indexName: String): SearchIndex = js.native
    
    def initPersonalization(): PersonalizationClient = js.native
    def initPersonalization(options: InitPersonalizationOptions): PersonalizationClient = js.native
    
    /**
      * @deprecated Use `initPersonalization` instead.
      */
    def initRecommendation(): PersonalizationClient = js.native
    def initRecommendation(options: InitPersonalizationOptions): PersonalizationClient = js.native
    
    def listApiKeys(): ReadonlyPromiseListApiKey = js.native
    def listApiKeys(requestOptions: RequestOptions): ReadonlyPromiseListApiKey = js.native
    
    def listClusters(): ReadonlyPromiseListCluste = js.native
    def listClusters(requestOptions: RequestOptions): ReadonlyPromiseListCluste = js.native
    
    def listIndices(): ReadonlyPromiseListIndice = js.native
    def listIndices(requestOptions: RequestOptions): ReadonlyPromiseListIndice = js.native
    
    def listUserIDs(): ReadonlyPromiseListUserID = js.native
    def listUserIDs(requestOptions: ListUserIDsOptions & RequestOptions): ReadonlyPromiseListUserID = js.native
    
    def moveIndex(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def moveIndex(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def multipleBatch(requests: js.Array[MultipleBatchRequest]): ReadonlyWaitablePromiseMu = js.native
    def multipleBatch(requests: js.Array[MultipleBatchRequest], requestOptions: RequestOptions): ReadonlyWaitablePromiseMu = js.native
    
    def multipleGetObjects[TObject](requests: js.Array[MultipleGetObject]): js.Promise[MultipleGetObjectsResponse[TObject]] = js.native
    def multipleGetObjects[TObject](requests: js.Array[MultipleGetObject], requestOptions: RequestOptions): js.Promise[MultipleGetObjectsResponse[TObject]] = js.native
    
    def multipleQueries[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    def multipleQueries[TObject](queries: js.Array[MultipleQueriesQuery], requestOptions: RequestOptions & MultipleQueriesOptions): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    
    def multipleSearchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
    def multipleSearchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
    
    def removeUserID(userID: String): ReadonlyPromiseRemoveUser = js.native
    def removeUserID(userID: String, requestOptions: RequestOptions): ReadonlyPromiseRemoveUser = js.native
    
    def replaceDictionaryEntries(dictionary: DictionaryName, entries: js.Array[DictionaryEntry]): ReadonlyWaitablePromiseDi = js.native
    def replaceDictionaryEntries(
      dictionary: DictionaryName,
      entries: js.Array[DictionaryEntry],
      requestOptions: RequestOptions & DictionaryEntriesOptions
    ): ReadonlyWaitablePromiseDi = js.native
    
    def restoreApiKey(apiKey: String): ReadonlyWaitablePromiseRe = js.native
    def restoreApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseRe = js.native
    
    def saveDictionaryEntries(dictionary: DictionaryName, entries: js.Array[DictionaryEntry]): ReadonlyWaitablePromiseDi = js.native
    def saveDictionaryEntries(
      dictionary: DictionaryName,
      entries: js.Array[DictionaryEntry],
      requestOptions: RequestOptions & DictionaryEntriesOptions
    ): ReadonlyWaitablePromiseDi = js.native
    
    def search[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    def search[TObject](queries: js.Array[MultipleQueriesQuery], requestOptions: RequestOptions & MultipleQueriesOptions): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    
    def searchDictionaryEntries(dictionary: DictionaryName, query: String): ReadonlyPromiseSearchDict = js.native
    def searchDictionaryEntries(dictionary: DictionaryName, query: String, requestOptions: RequestOptions): ReadonlyPromiseSearchDict = js.native
    
    def searchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
    def searchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
    
    def searchUserIDs(query: String): ReadonlyPromiseSearchUser = js.native
    def searchUserIDs(query: String, requestOptions: SearchUserIDsOptions & RequestOptions): ReadonlyPromiseSearchUser = js.native
    
    def setDictionarySettings(settings: DictionarySettings): ReadonlyWaitablePromiseDi = js.native
    def setDictionarySettings(settings: DictionarySettings, requestOptions: RequestOptions): ReadonlyWaitablePromiseDi = js.native
    
    def updateApiKey(apiKey: String): ReadonlyWaitablePromiseUp = js.native
    def updateApiKey(apiKey: String, requestOptions: UpdateApiKeyOptionsPickRe): ReadonlyWaitablePromiseUp = js.native
  }
  
  @js.native
  trait SearchIndex
    extends StObject
       with typings.algoliaClientSearch.mod.SearchIndex {
    
    def batch(requests: js.Array[BatchRequest]): ReadonlyWaitablePromiseBa = js.native
    def batch(requests: js.Array[BatchRequest], requestOptions: RequestOptions): ReadonlyWaitablePromiseBa = js.native
    
    def browseObjects[TObject](): ReadonlyPromisevoid = js.native
    def browseObjects[TObject](requestOptions: SearchOptions & BrowseOptions[TObject] & RequestOptions): ReadonlyPromisevoid = js.native
    
    def browseRules(): ReadonlyPromisevoid = js.native
    def browseRules(requestOptions: SearchRulesOptions & BrowseOptions[Rule] & RequestOptions): ReadonlyPromisevoid = js.native
    
    def browseSynonyms(): ReadonlyPromisevoid = js.native
    def browseSynonyms(requestOptions: SearchSynonymsOptions & BrowseOptions[Synonym] & RequestOptions): ReadonlyPromisevoid = js.native
    
    def clearObjects(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearObjects(requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def clearRules(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearRules(requestOptions: RequestOptions & ClearRulesOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def clearSynonyms(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearSynonyms(requestOptions: ClearSynonymsOptions & RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def delete(): ReadonlyWaitablePromiseDeCatch = js.native
    def delete(requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteBy(filters: DeleteByFiltersOptions): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteBy(filters: DeleteByFiltersOptions, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteObject(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteObject(objectID: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteObjects(objectIDs: js.Array[String]): ReadonlyWaitablePromiseCh = js.native
    def deleteObjects(objectIDs: js.Array[String], requestOptions: RequestOptions & ChunkOptions): ReadonlyWaitablePromiseCh = js.native
    
    def deleteRule(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteRule(objectID: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteSynonym(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteSynonym(objectID: String, requestOptions: DeleteSynonymOptions & RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def exists(): ReadonlyPromiseboolean = js.native
    def exists(requestOptions: RequestOptions): ReadonlyPromiseboolean = js.native
    
    def findAnswers[TObject](query: String, queryLanguages: js.Array[String]): js.Promise[FindAnswersResponse[TObject]] = js.native
    def findAnswers[TObject](
      query: String,
      queryLanguages: js.Array[String],
      requestOptions: RequestOptions & FindAnswersOptions
    ): js.Promise[FindAnswersResponse[TObject]] = js.native
    
    def findObject[TObject](callback: js.Function1[/* object */ TObject & ObjectWithObjectID, Boolean]): js.Promise[FindObjectResponse[TObject]] = js.native
    def findObject[TObject](
      callback: js.Function1[/* object */ TObject & ObjectWithObjectID, Boolean],
      requestOptions: FindObjectOptions & RequestOptions
    ): js.Promise[FindObjectResponse[TObject]] = js.native
    
    def getObject[TObject](objectID: String): js.Promise[TObject & ObjectWithObjectID] = js.native
    def getObject[TObject](objectID: String, requestOptions: RequestOptions & GetObjectOptions): js.Promise[TObject & ObjectWithObjectID] = js.native
    
    def getObjectPosition(searchResponse: SearchResponse[js.Object], objectID: String): Double = js.native
    
    def getObjects[TObject](objectIDs: js.Array[String]): js.Promise[GetObjectsResponse[TObject]] = js.native
    def getObjects[TObject](objectIDs: js.Array[String], requestOptions: RequestOptions & GetObjectsOptions): js.Promise[GetObjectsResponse[TObject]] = js.native
    
    def getRule(objectID: String): ReadonlyPromiseRule = js.native
    def getRule(objectID: String, requestOptions: RequestOptions): ReadonlyPromiseRule = js.native
    
    def getSettings(): ReadonlyPromiseSettings = js.native
    def getSettings(requestOptions: RequestOptions): ReadonlyPromiseSettings = js.native
    
    def getSynonym(objectID: String): ReadonlyPromiseSynonym = js.native
    def getSynonym(objectID: String, requestOptions: RequestOptions): ReadonlyPromiseSynonym = js.native
    
    def partialUpdateObject(`object`: Record[String, Any]): ReadonlyWaitablePromisePa = js.native
    def partialUpdateObject(
      `object`: Record[String, Any],
      requestOptions: RequestOptions & ChunkOptions & PartialUpdateObjectsOptions
    ): ReadonlyWaitablePromisePa = js.native
    
    def partialUpdateObjects(objects: js.Array[Record[String, Any]]): ReadonlyWaitablePromiseCh = js.native
    def partialUpdateObjects(
      objects: js.Array[Record[String, Any]],
      requestOptions: RequestOptions & ChunkOptions & PartialUpdateObjectsOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def replaceAllObjects(objects: js.Array[Record[String, Any]]): ReadonlyWaitablePromiseCh = js.native
    def replaceAllObjects(
      objects: js.Array[Record[String, Any]],
      requestOptions: ReplaceAllObjectsOptions & ChunkOptions & SaveObjectsOptions & RequestOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def replaceAllRules(rules: js.Array[Rule]): ReadonlyWaitablePromiseSaWait = js.native
    def replaceAllRules(rules: js.Array[Rule], requestOptions: RequestOptions & SaveRulesOptions): ReadonlyWaitablePromiseSaWait = js.native
    
    def replaceAllSynonyms(synonyms: js.Array[Synonym]): ReadonlyWaitablePromiseSaFinally = js.native
    def replaceAllSynonyms(synonyms: js.Array[Synonym], requestOptions: RequestOptionsPickSaveSyn): ReadonlyWaitablePromiseSaFinally = js.native
    
    def saveObject(`object`: Record[String, Any]): ReadonlyWaitablePromiseSa = js.native
    def saveObject(`object`: Record[String, Any], requestOptions: RequestOptions & ChunkOptions & SaveObjectsOptions): ReadonlyWaitablePromiseSa = js.native
    
    def saveObjects(objects: js.Array[Record[String, Any]]): ReadonlyWaitablePromiseCh = js.native
    def saveObjects(
      objects: js.Array[Record[String, Any]],
      requestOptions: RequestOptions & ChunkOptions & SaveObjectsOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def saveRule(rule: Rule): ReadonlyWaitablePromiseSaThen = js.native
    def saveRule(rule: Rule, requestOptions: RequestOptions & SaveRulesOptions): ReadonlyWaitablePromiseSaThen = js.native
    
    def saveRules(rules: js.Array[Rule]): ReadonlyWaitablePromiseSaWait = js.native
    def saveRules(rules: js.Array[Rule], requestOptions: RequestOptions & SaveRulesOptions): ReadonlyWaitablePromiseSaWait = js.native
    
    def saveSynonym(synonym: Synonym): ReadonlyWaitablePromiseSaCatch = js.native
    def saveSynonym(synonym: Synonym, requestOptions: RequestOptions & SaveSynonymsOptions): ReadonlyWaitablePromiseSaCatch = js.native
    
    def saveSynonyms(synonyms: js.Array[Synonym]): ReadonlyWaitablePromiseSaFinally = js.native
    def saveSynonyms(synonyms: js.Array[Synonym], requestOptions: SaveSynonymsOptions & RequestOptions): ReadonlyWaitablePromiseSaFinally = js.native
    
    def search[TObject](query: String): js.Promise[SearchResponse[TObject]] = js.native
    def search[TObject](query: String, requestOptions: RequestOptions & SearchOptions): js.Promise[SearchResponse[TObject]] = js.native
    
    def searchForFacetValues(facetName: String, facetQuery: String): ReadonlyPromiseSearchForF = js.native
    def searchForFacetValues(facetName: String, facetQuery: String, requestOptions: RequestOptions & SearchOptions): ReadonlyPromiseSearchForF = js.native
    
    def searchRules(query: String): ReadonlyPromiseSearchResp = js.native
    def searchRules(query: String, requestOptions: RequestOptions & SearchRulesOptions): ReadonlyPromiseSearchResp = js.native
    
    def searchSynonyms(query: String): ReadonlyPromiseSearchSyno = js.native
    def searchSynonyms(query: String, requestOptions: SearchSynonymsOptions & RequestOptions): ReadonlyPromiseSearchSyno = js.native
    
    def setSettings(settings: Settings): ReadonlyWaitablePromiseSe = js.native
    def setSettings(settings: Settings, requestOptions: RequestOptions): ReadonlyWaitablePromiseSe = js.native
    
    def waitTask(taskID: Double): ReadonlyPromisevoid = js.native
    def waitTask(taskID: Double, requestOptions: RequestOptions): ReadonlyPromisevoid = js.native
  }
  
  type WithoutCredentials[TClientOptions /* <: Credentials */] = Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ]
}
