package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.algoliaClientCommon.mod.ClientTransporterOptions
import typings.algoliaClientCommon.mod.CreateClient
import typings.algoliaClientSearch.anon.DistinctSeqID
import typings.algoliaClientSearch.anon.IndexName_
import typings.algoliaClientSearch.anon.Methods
import typings.algoliaClientSearch.anon.ReadonlyPromiseArraySearc
import typings.algoliaClientSearch.anon.ReadonlyPromiseAssignUser
import typings.algoliaClientSearch.anon.ReadonlyPromiseAssignUserCatch
import typings.algoliaClientSearch.anon.ReadonlyPromiseGetApiKeyR
import typings.algoliaClientSearch.anon.ReadonlyPromiseGetDiction
import typings.algoliaClientSearch.anon.ReadonlyPromiseGetLogsRes
import typings.algoliaClientSearch.anon.ReadonlyPromiseGetTopUser
import typings.algoliaClientSearch.anon.ReadonlyPromiseHasPending
import typings.algoliaClientSearch.anon.ReadonlyPromiseListApiKey
import typings.algoliaClientSearch.anon.ReadonlyPromiseListCluste
import typings.algoliaClientSearch.anon.ReadonlyPromiseListIndice
import typings.algoliaClientSearch.anon.ReadonlyPromiseListUserID
import typings.algoliaClientSearch.anon.ReadonlyPromiseRemoveUser
import typings.algoliaClientSearch.anon.ReadonlyPromiseRule
import typings.algoliaClientSearch.anon.ReadonlyPromiseSearchDict
import typings.algoliaClientSearch.anon.ReadonlyPromiseSearchForF
import typings.algoliaClientSearch.anon.ReadonlyPromiseSearchResp
import typings.algoliaClientSearch.anon.ReadonlyPromiseSearchSyno
import typings.algoliaClientSearch.anon.ReadonlyPromiseSearchUser
import typings.algoliaClientSearch.anon.ReadonlyPromiseSettings
import typings.algoliaClientSearch.anon.ReadonlyPromiseSynonym
import typings.algoliaClientSearch.anon.ReadonlyPromiseTaskStatus
import typings.algoliaClientSearch.anon.ReadonlyPromiseUserIDResp
import typings.algoliaClientSearch.anon.ReadonlyPromiseboolean
import typings.algoliaClientSearch.anon.ReadonlyPromisevoid
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseAd
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseBa
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDeCatch
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDi
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseMu
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromisePa
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseRe
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaFinally
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaThen
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaWait
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSe
import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseUp
import typings.algoliaClientSearch.anon.Request
import typings.algoliaClientSearch.anon.RequestOptionsPickSaveSyn
import typings.algoliaClientSearch.mod.^
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ApiKeyACLEnum: Record[String, ApiKeyACLType] = ^.asInstanceOf[js.Dynamic].selectDynamic("ApiKeyACLEnum").asInstanceOf[Record[String, ApiKeyACLType]]

inline def BatchActionEnum: Record[String, BatchActionType] = ^.asInstanceOf[js.Dynamic].selectDynamic("BatchActionEnum").asInstanceOf[Record[String, BatchActionType]]

inline def ScopeEnum: Record[String, ScopeType] = ^.asInstanceOf[js.Dynamic].selectDynamic("ScopeEnum").asInstanceOf[Record[String, ScopeType]]

inline def StrategyEnum: Record[String, StrategyType] = ^.asInstanceOf[js.Dynamic].selectDynamic("StrategyEnum").asInstanceOf[Record[String, StrategyType]]

inline def SynonymEnum: Record[String, SynonymType] = ^.asInstanceOf[js.Dynamic].selectDynamic("SynonymEnum").asInstanceOf[Record[String, SynonymType]]

inline def addApiKey(base: SearchClient): js.Function2[
/* acl */ js.Array[ApiKeyACLType], 
/* requestOptions */ js.UndefOr[AddApiKeyOptions & (Pick[RequestOptions, String | Double])], 
ReadonlyWaitablePromiseAd] = ^.asInstanceOf[js.Dynamic].applyDynamic("addApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* acl */ js.Array[ApiKeyACLType], 
/* requestOptions */ js.UndefOr[AddApiKeyOptions & (Pick[RequestOptions, String | Double])], 
ReadonlyWaitablePromiseAd]]

inline def assignUserID(base: SearchClient): js.Function3[
/* userID */ String, 
/* clusterName */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseAssignUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* userID */ String, 
/* clusterName */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseAssignUser]]

inline def assignUserIDs(base: SearchClient): js.Function3[
/* userIDs */ js.Array[String], 
/* clusterName */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseAssignUserCatch] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* userIDs */ js.Array[String], 
/* clusterName */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseAssignUserCatch]]

inline def batch(base: SearchIndex): js.Function2[
/* requests */ js.Array[BatchRequest], 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseBa] = ^.asInstanceOf[js.Dynamic].applyDynamic("batch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* requests */ js.Array[BatchRequest], 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseBa]]

inline def browseObjects(base: SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[SearchOptions & BrowseOptions[Any] & RequestOptions], 
ReadonlyPromisevoid] = ^.asInstanceOf[js.Dynamic].applyDynamic("browseObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[SearchOptions & BrowseOptions[Any] & RequestOptions], 
ReadonlyPromisevoid]]

inline def browseRules(base: SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[SearchRulesOptions & BrowseOptions[Rule] & RequestOptions], 
ReadonlyPromisevoid] = ^.asInstanceOf[js.Dynamic].applyDynamic("browseRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[SearchRulesOptions & BrowseOptions[Rule] & RequestOptions], 
ReadonlyPromisevoid]]

inline def browseSynonyms(base: SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[SearchSynonymsOptions & BrowseOptions[Synonym] & RequestOptions], 
ReadonlyPromisevoid] = ^.asInstanceOf[js.Dynamic].applyDynamic("browseSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[SearchSynonymsOptions & BrowseOptions[Synonym] & RequestOptions], 
ReadonlyPromisevoid]]

inline def chunkedBatch(base: SearchIndex): js.Function3[
/* bodies */ js.Array[js.Object], 
/* action */ BatchActionType, 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions], 
ReadonlyWaitablePromiseCh] = ^.asInstanceOf[js.Dynamic].applyDynamic("chunkedBatch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* bodies */ js.Array[js.Object], 
/* action */ BatchActionType, 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions], 
ReadonlyWaitablePromiseCh]]

inline def clearDictionaryEntries(base: SearchClient): js.Function2[
/* dictionary */ DictionaryName, 
/* requestOptions */ js.UndefOr[RequestOptions & DictionaryEntriesOptions], 
ReadonlyWaitablePromiseDi] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDictionaryEntries")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* dictionary */ DictionaryName, 
/* requestOptions */ js.UndefOr[RequestOptions & DictionaryEntriesOptions], 
ReadonlyWaitablePromiseDi]]

inline def clearObjects(base: SearchIndex): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyWaitablePromiseDe] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyWaitablePromiseDe]]

inline def clearRules(base: SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[RequestOptions & ClearRulesOptions], 
ReadonlyWaitablePromiseDe] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[RequestOptions & ClearRulesOptions], 
ReadonlyWaitablePromiseDe]]

inline def clearSynonyms(base: SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[ClearSynonymsOptions & RequestOptions], 
ReadonlyWaitablePromiseDe] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[ClearSynonymsOptions & RequestOptions], 
ReadonlyWaitablePromiseDe]]

inline def copyIndex(base: SearchClient): js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[CopyIndexOptions & RequestOptions], 
ReadonlyWaitablePromiseIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[CopyIndexOptions & RequestOptions], 
ReadonlyWaitablePromiseIn]]

inline def copyRules(base: SearchClient): js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseIn]]

inline def copySettings(base: SearchClient): js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("copySettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseIn]]

inline def copySynonyms(base: SearchClient): js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("copySynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseIn]]

inline def createBrowsablePromise[TObject](options: Request[TObject] & BrowseOptions[TObject]): ReadonlyPromisevoid = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowsablePromise")(options.asInstanceOf[js.Any]).asInstanceOf[ReadonlyPromisevoid]

inline def createMissingObjectIDError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingObjectIDError")().asInstanceOf[js.Error]

inline def createObjectNotFoundError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectNotFoundError")().asInstanceOf[js.Error]

inline def createSearchClient: CreateClient[SearchClient, SearchClientOptions & ClientTransporterOptions] = ^.asInstanceOf[js.Dynamic].selectDynamic("createSearchClient").asInstanceOf[CreateClient[SearchClient, SearchClientOptions & ClientTransporterOptions]]

inline def createValidUntilNotFoundError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("createValidUntilNotFoundError")().asInstanceOf[js.Error]

inline def customRequest[TResponse](base: SearchClient): js.Function2[
/* request */ typings.algoliaTransporter.mod.Request, 
/* requestOptions */ js.UndefOr[RequestOptions], 
js.Promise[TResponse]] = ^.asInstanceOf[js.Dynamic].applyDynamic("customRequest")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* request */ typings.algoliaTransporter.mod.Request, 
/* requestOptions */ js.UndefOr[RequestOptions], 
js.Promise[TResponse]]]

inline def deleteApiKey(base: SearchClient): js.Function2[
/* apiKey */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDeCatch] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* apiKey */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDeCatch]]

inline def deleteBy(base: SearchIndex): js.Function2[
/* filters */ DeleteByFiltersOptions, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDe] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteBy")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* filters */ DeleteByFiltersOptions, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDe]]

inline def deleteDictionaryEntries(base: SearchClient): js.Function3[
/* dictionary */ DictionaryName, 
/* objectIDs */ js.Array[String], 
/* requestOptions */ js.UndefOr[RequestOptions & DictionaryEntriesOptions], 
ReadonlyWaitablePromiseDi] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDictionaryEntries")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* dictionary */ DictionaryName, 
/* objectIDs */ js.Array[String], 
/* requestOptions */ js.UndefOr[RequestOptions & DictionaryEntriesOptions], 
ReadonlyWaitablePromiseDi]]

inline def deleteIndex(base: SearchIndex): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyWaitablePromiseDe] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyWaitablePromiseDe]]

inline def deleteObject(base: SearchIndex): js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDe] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDe]]

inline def deleteObjects(base: SearchIndex): js.Function2[
/* objectIDs */ js.Array[String], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions], 
ReadonlyWaitablePromiseCh] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectIDs */ js.Array[String], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions], 
ReadonlyWaitablePromiseCh]]

inline def deleteRule(base: SearchIndex): js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDe] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDe]]

inline def deleteSynonym(base: SearchIndex): js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & DeleteSynonymOptions], 
ReadonlyWaitablePromiseDe] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & DeleteSynonymOptions], 
ReadonlyWaitablePromiseDe]]

inline def exists(base: SearchIndex): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseboolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseboolean]]

inline def findAnswers(base: SearchIndex): js.Function3[
/* query */ String, 
/* queryLanguages */ js.Array[String], 
/* requestOptions */ js.UndefOr[RequestOptions & FindAnswersOptions], 
js.Promise[FindAnswersResponse[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAnswers")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* query */ String, 
/* queryLanguages */ js.Array[String], 
/* requestOptions */ js.UndefOr[RequestOptions & FindAnswersOptions], 
js.Promise[FindAnswersResponse[Any]]]]

inline def findObject(base: SearchIndex): js.Function2[
/* callback */ js.Function1[/* object */ Any & ObjectWithObjectID, Boolean], 
/* requestOptions */ js.UndefOr[FindObjectOptions & RequestOptions], 
js.Promise[FindObjectResponse[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* callback */ js.Function1[/* object */ Any & ObjectWithObjectID, Boolean], 
/* requestOptions */ js.UndefOr[FindObjectOptions & RequestOptions], 
js.Promise[FindObjectResponse[Any]]]]

inline def generateSecuredApiKey(): js.Function2[/* parentApiKey */ String, /* restrictions */ SecuredApiKeyRestrictions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecuredApiKey")().asInstanceOf[js.Function2[/* parentApiKey */ String, /* restrictions */ SecuredApiKeyRestrictions, String]]

inline def getApiKey(base: SearchClient): js.Function2[
/* apiKey */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseGetApiKeyR] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* apiKey */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseGetApiKeyR]]

inline def getAppTask(base: SearchClient): js.Function2[
/* taskID */ Double, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseTaskStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppTask")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* taskID */ Double, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseTaskStatus]]

inline def getDictionarySettings(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetDiction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDictionarySettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetDiction]]

inline def getLogs(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetLogsRes] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetLogsRes]]

inline def getObject(base: SearchIndex): js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & GetObjectOptions], 
js.Promise[Any & ObjectWithObjectID]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & GetObjectOptions], 
js.Promise[Any & ObjectWithObjectID]]]

inline def getObjectPosition[TObject](): js.Function2[/* searchResponse */ SearchResponse[TObject], /* objectID */ String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectPosition")().asInstanceOf[js.Function2[/* searchResponse */ SearchResponse[TObject], /* objectID */ String, Double]]

inline def getObjects(base: SearchIndex): js.Function2[
/* objectIDs */ js.Array[String], 
/* requestOptions */ js.UndefOr[RequestOptions & GetObjectsOptions], 
js.Promise[GetObjectsResponse[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectIDs */ js.Array[String], 
/* requestOptions */ js.UndefOr[RequestOptions & GetObjectsOptions], 
js.Promise[GetObjectsResponse[Any]]]]

inline def getRule(base: SearchIndex): js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseRule]]

inline def getSecuredApiKeyRemainingValidity(): js.Function1[/* securedApiKey */ String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecuredApiKeyRemainingValidity")().asInstanceOf[js.Function1[/* securedApiKey */ String, Double]]

inline def getSettings(base: SearchIndex): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseSettings]]

inline def getSynonym(base: SearchIndex): js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseSynonym] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseSynonym]]

inline def getTask(base: SearchIndex): js.Function2[
/* taskID */ Double, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseTaskStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTask")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* taskID */ Double, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseTaskStatus]]

inline def getTopUserIDs(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetTopUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetTopUser]]

inline def getUserID(base: SearchClient): js.Function2[
/* userID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseUserIDResp] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* userID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseUserIDResp]]

inline def hasPendingMappings(base: SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[HasPendingMappingsOptions & RequestOptions], 
ReadonlyPromiseHasPending] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPendingMappings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[HasPendingMappingsOptions & RequestOptions], 
ReadonlyPromiseHasPending]]

inline def initIndex(base: SearchClient): CreateIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("initIndex")(base.asInstanceOf[js.Any]).asInstanceOf[CreateIndex]

inline def listApiKeys(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListApiKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("listApiKeys")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListApiKey]]

inline def listClusters(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListCluste] = ^.asInstanceOf[js.Dynamic].applyDynamic("listClusters")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListCluste]]

inline def listIndices(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListIndice] = ^.asInstanceOf[js.Dynamic].applyDynamic("listIndices")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListIndice]]

inline def listUserIDs(base: SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[ListUserIDsOptions & RequestOptions], 
ReadonlyPromiseListUserID] = ^.asInstanceOf[js.Dynamic].applyDynamic("listUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[ListUserIDsOptions & RequestOptions], 
ReadonlyPromiseListUserID]]

inline def moveIndex(base: SearchClient): js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ String, 
/* to */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseIn]]

inline def multipleBatch(base: SearchClient): js.Function2[
/* requests */ js.Array[MultipleBatchRequest], 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseMu] = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleBatch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* requests */ js.Array[MultipleBatchRequest], 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseMu]]

inline def multipleGetObjects(base: SearchClient): js.Function2[
/* requests */ js.Array[MultipleGetObject], 
/* requestOptions */ js.UndefOr[RequestOptions], 
js.Promise[MultipleGetObjectsResponse[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleGetObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* requests */ js.Array[MultipleGetObject], 
/* requestOptions */ js.UndefOr[RequestOptions], 
js.Promise[MultipleGetObjectsResponse[Any]]]]

inline def multipleQueries(base: SearchClient): js.Function2[
/* queries */ js.Array[MultipleQueriesQuery], 
/* requestOptions */ js.UndefOr[RequestOptions & MultipleQueriesOptions], 
js.Promise[MultipleQueriesResponse[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleQueries")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* queries */ js.Array[MultipleQueriesQuery], 
/* requestOptions */ js.UndefOr[RequestOptions & MultipleQueriesOptions], 
js.Promise[MultipleQueriesResponse[Any]]]]

inline def multipleSearchForFacetValues(base: SearchClient): js.Function2[
/* queries */ js.Array[IndexName_], 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseArraySearc] = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleSearchForFacetValues")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* queries */ js.Array[IndexName_], 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseArraySearc]]

inline def partialUpdateObject(base: SearchIndex): js.Function2[
/* object */ Record[String, Any], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions & PartialUpdateObjectsOptions], 
ReadonlyWaitablePromisePa] = ^.asInstanceOf[js.Dynamic].applyDynamic("partialUpdateObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* object */ Record[String, Any], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions & PartialUpdateObjectsOptions], 
ReadonlyWaitablePromisePa]]

inline def partialUpdateObjects(base: SearchIndex): js.Function2[
/* objects */ js.Array[Record[String, Any]], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions & PartialUpdateObjectsOptions], 
ReadonlyWaitablePromiseCh] = ^.asInstanceOf[js.Dynamic].applyDynamic("partialUpdateObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objects */ js.Array[Record[String, Any]], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions & PartialUpdateObjectsOptions], 
ReadonlyWaitablePromiseCh]]

inline def removeUserID(base: SearchClient): js.Function2[
/* userID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseRemoveUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* userID */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseRemoveUser]]

inline def replaceAllObjects(base: SearchIndex): js.Function2[
/* objects */ js.Array[Record[String, Any]], 
/* requestOptions */ js.UndefOr[ReplaceAllObjectsOptions & ChunkOptions & SaveObjectsOptions & RequestOptions], 
ReadonlyWaitablePromiseCh] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objects */ js.Array[Record[String, Any]], 
/* requestOptions */ js.UndefOr[ReplaceAllObjectsOptions & ChunkOptions & SaveObjectsOptions & RequestOptions], 
ReadonlyWaitablePromiseCh]]

inline def replaceAllRules(base: SearchIndex): js.Function2[
/* rules */ js.Array[Rule], 
/* requestOptions */ js.UndefOr[RequestOptions & SaveRulesOptions], 
ReadonlyWaitablePromiseSa] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* rules */ js.Array[Rule], 
/* requestOptions */ js.UndefOr[RequestOptions & SaveRulesOptions], 
ReadonlyWaitablePromiseSa]]

inline def replaceAllSynonyms(base: SearchIndex): js.Function2[
/* synonyms */ js.Array[Synonym], 
/* requestOptions */ js.UndefOr[RequestOptionsPickSaveSyn], 
ReadonlyWaitablePromiseSaCatch] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* synonyms */ js.Array[Synonym], 
/* requestOptions */ js.UndefOr[RequestOptionsPickSaveSyn], 
ReadonlyWaitablePromiseSaCatch]]

inline def replaceDictionaryEntries(base: SearchClient): js.Function3[
/* dictionary */ DictionaryName, 
/* entries */ js.Array[DictionaryEntry], 
/* requestOptions */ js.UndefOr[RequestOptions & DictionaryEntriesOptions], 
ReadonlyWaitablePromiseDi] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceDictionaryEntries")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* dictionary */ DictionaryName, 
/* entries */ js.Array[DictionaryEntry], 
/* requestOptions */ js.UndefOr[RequestOptions & DictionaryEntriesOptions], 
ReadonlyWaitablePromiseDi]]

inline def restoreApiKey(base: SearchClient): js.Function2[
/* apiKey */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseRe] = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* apiKey */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseRe]]

inline def saveDictionaryEntries(base: SearchClient): js.Function3[
/* dictionary */ DictionaryName, 
/* entries */ js.Array[DictionaryEntry], 
/* requestOptions */ js.UndefOr[RequestOptions & DictionaryEntriesOptions], 
ReadonlyWaitablePromiseDi] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveDictionaryEntries")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* dictionary */ DictionaryName, 
/* entries */ js.Array[DictionaryEntry], 
/* requestOptions */ js.UndefOr[RequestOptions & DictionaryEntriesOptions], 
ReadonlyWaitablePromiseDi]]

inline def saveObject(base: SearchIndex): js.Function2[
/* object */ Record[String, Any], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions & SaveObjectsOptions], 
ReadonlyWaitablePromiseSaFinally] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* object */ Record[String, Any], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions & SaveObjectsOptions], 
ReadonlyWaitablePromiseSaFinally]]

inline def saveObjects(base: SearchIndex): js.Function2[
/* objects */ js.Array[Record[String, Any]], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions & SaveObjectsOptions], 
ReadonlyWaitablePromiseCh] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objects */ js.Array[Record[String, Any]], 
/* requestOptions */ js.UndefOr[RequestOptions & ChunkOptions & SaveObjectsOptions], 
ReadonlyWaitablePromiseCh]]

inline def saveRule(base: SearchIndex): js.Function2[
/* rule */ Rule, 
/* requestOptions */ js.UndefOr[RequestOptions & SaveRulesOptions], 
ReadonlyWaitablePromiseSaThen] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* rule */ Rule, 
/* requestOptions */ js.UndefOr[RequestOptions & SaveRulesOptions], 
ReadonlyWaitablePromiseSaThen]]

inline def saveRules(base: SearchIndex): js.Function2[
/* rules */ js.Array[Rule], 
/* requestOptions */ js.UndefOr[RequestOptions & SaveRulesOptions], 
ReadonlyWaitablePromiseSa] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* rules */ js.Array[Rule], 
/* requestOptions */ js.UndefOr[RequestOptions & SaveRulesOptions], 
ReadonlyWaitablePromiseSa]]

inline def saveSynonym(base: SearchIndex): js.Function2[
/* synonym */ Synonym, 
/* requestOptions */ js.UndefOr[RequestOptions & SaveSynonymsOptions], 
ReadonlyWaitablePromiseSaWait] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* synonym */ Synonym, 
/* requestOptions */ js.UndefOr[RequestOptions & SaveSynonymsOptions], 
ReadonlyWaitablePromiseSaWait]]

inline def saveSynonyms(base: SearchIndex): js.Function2[
/* synonyms */ js.Array[Synonym], 
/* requestOptions */ js.UndefOr[SaveSynonymsOptions & RequestOptions], 
ReadonlyWaitablePromiseSaCatch] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* synonyms */ js.Array[Synonym], 
/* requestOptions */ js.UndefOr[SaveSynonymsOptions & RequestOptions], 
ReadonlyWaitablePromiseSaCatch]]

inline def search(base: SearchIndex): js.Function2[
/* query */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & SearchOptions], 
js.Promise[SearchResponse[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* query */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & SearchOptions], 
js.Promise[SearchResponse[Any]]]]

inline def searchDictionaryEntries(base: SearchClient): js.Function3[
/* dictionary */ DictionaryName, 
/* query */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseSearchDict] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchDictionaryEntries")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* dictionary */ DictionaryName, 
/* query */ String, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromiseSearchDict]]

inline def searchForFacetValues(base: SearchIndex): js.Function3[
/* facetName */ String, 
/* facetQuery */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & SearchOptions], 
ReadonlyPromiseSearchForF] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchForFacetValues")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* facetName */ String, 
/* facetQuery */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & SearchOptions], 
ReadonlyPromiseSearchForF]]

inline def searchRules(base: SearchIndex): js.Function2[
/* query */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & SearchRulesOptions], 
ReadonlyPromiseSearchResp] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* query */ String, 
/* requestOptions */ js.UndefOr[RequestOptions & SearchRulesOptions], 
ReadonlyPromiseSearchResp]]

inline def searchSynonyms(base: SearchIndex): js.Function2[
/* query */ String, 
/* requestOptions */ js.UndefOr[SearchSynonymsOptions & RequestOptions], 
ReadonlyPromiseSearchSyno] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* query */ String, 
/* requestOptions */ js.UndefOr[SearchSynonymsOptions & RequestOptions], 
ReadonlyPromiseSearchSyno]]

inline def searchUserIDs(base: SearchClient): js.Function2[
/* query */ String, 
/* requestOptions */ js.UndefOr[SearchUserIDsOptions & RequestOptions], 
ReadonlyPromiseSearchUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* query */ String, 
/* requestOptions */ js.UndefOr[SearchUserIDsOptions & RequestOptions], 
ReadonlyPromiseSearchUser]]

inline def setDictionarySettings(base: SearchClient): js.Function2[
/* settings */ DictionarySettings, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDi] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDictionarySettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* settings */ DictionarySettings, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyWaitablePromiseDi]]

inline def setSettings(base: SearchIndex): js.Function2[
/* settings */ Settings, 
/* requestOptions */ js.UndefOr[RequestOptions & SetSettingsOptions], 
ReadonlyWaitablePromiseSe] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* settings */ Settings, 
/* requestOptions */ js.UndefOr[RequestOptions & SetSettingsOptions], 
ReadonlyWaitablePromiseSe]]

inline def updateApiKey(base: SearchClient): js.Function2[
/* apiKey */ String, 
/* requestOptions */ js.UndefOr[UpdateApiKeyOptions & (Pick[RequestOptions, String | Double])], 
ReadonlyWaitablePromiseUp] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* apiKey */ String, 
/* requestOptions */ js.UndefOr[UpdateApiKeyOptions & (Pick[RequestOptions, String | Double])], 
ReadonlyWaitablePromiseUp]]

inline def waitAppTask(base: SearchClient): js.Function2[
/* taskID */ Double, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromisevoid] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitAppTask")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* taskID */ Double, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromisevoid]]

inline def waitTask(base: SearchIndex): js.Function2[
/* taskID */ Double, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromisevoid] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitTask")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* taskID */ Double, 
/* requestOptions */ js.UndefOr[RequestOptions], 
ReadonlyPromisevoid]]

type CreateIndex = js.Function2[
/* indexName */ String, 
/* options */ js.UndefOr[
  Methods[
    StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ Any, Any]]]
  ]
], 
SearchIndex & typings.algoliaClientSearch.algoliaClientSearchStrings.CreateIndex & TopLevel[Any]]

type HighlightResult[THit] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ KAttribute in keyof THit ]:? @algolia/client-search.@algolia/client-search.HighlightResult<THit[KAttribute]>}
  */ typings.algoliaClientSearch.algoliaClientSearchStrings.HighlightResult & TopLevel[THit]) | HighlightMatch

type Hit[THit] = THit & DistinctSeqID[THit]

type Indice = Index

type RequireAtLeastOne[TType] = /* import warning: importer.ImportType#apply Failed type conversion: {[ TKey in keyof TType ]: -? std.Required<std.Pick<TType, TKey>> & std.Partial<std.Pick<TType, std.Exclude<keyof TType, TKey>>>}[keyof TType] */ js.Any

type SnippetResult[THit] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ KAttribute in keyof THit ]: @algolia/client-search.@algolia/client-search.SnippetResult<THit[KAttribute]>}
  */ typings.algoliaClientSearch.algoliaClientSearchStrings.SnippetResult & TopLevel[THit]) | SnippetMatch
