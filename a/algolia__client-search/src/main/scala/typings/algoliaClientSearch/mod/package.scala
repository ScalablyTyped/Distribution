package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ApiKeyACLEnum: typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.ApiKeyACLType] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ApiKeyACLEnum").asInstanceOf[typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.ApiKeyACLType]]

inline def BatchActionEnum: typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.BatchActionType] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BatchActionEnum").asInstanceOf[typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.BatchActionType]]

inline def ScopeEnum: typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.ScopeType] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ScopeEnum").asInstanceOf[typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.ScopeType]]

inline def StrategyEnum: typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.StrategyType] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("StrategyEnum").asInstanceOf[typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.StrategyType]]

inline def SynonymEnum: typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.SynonymType] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SynonymEnum").asInstanceOf[typings.std.Record[java.lang.String, typings.algoliaClientSearch.mod.SynonymType]]

inline def addApiKey(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* acl */ js.Array[typings.algoliaClientSearch.mod.ApiKeyACLType], 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.AddApiKeyOptions & (typings.std.Pick[typings.algoliaTransporter.mod.RequestOptions, java.lang.String | scala.Double])
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseAd] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* acl */ js.Array[typings.algoliaClientSearch.mod.ApiKeyACLType], 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.AddApiKeyOptions & (typings.std.Pick[typings.algoliaTransporter.mod.RequestOptions, java.lang.String | scala.Double])
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseAd]]

inline def assignUserID(base: typings.algoliaClientSearch.mod.SearchClient): js.Function3[
/* userID */ java.lang.String, 
/* clusterName */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseAssignUser] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assignUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* userID */ java.lang.String, 
/* clusterName */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseAssignUser]]

inline def assignUserIDs(base: typings.algoliaClientSearch.mod.SearchClient): js.Function3[
/* userIDs */ js.Array[java.lang.String], 
/* clusterName */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseAssignUserCatch] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assignUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* userIDs */ js.Array[java.lang.String], 
/* clusterName */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseAssignUserCatch]]

inline def batch(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* requests */ js.Array[typings.algoliaClientSearch.mod.BatchRequest], 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseBa] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("batch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* requests */ js.Array[typings.algoliaClientSearch.mod.BatchRequest], 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseBa]]

inline def browseObjects(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchOptions & typings.algoliaClientSearch.mod.BrowseOptions[js.Any] & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromisevoid] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("browseObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchOptions & typings.algoliaClientSearch.mod.BrowseOptions[js.Any] & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromisevoid]]

inline def browseRules(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchRulesOptions & typings.algoliaClientSearch.mod.BrowseOptions[typings.algoliaClientSearch.mod.Rule] & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromisevoid] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("browseRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchRulesOptions & typings.algoliaClientSearch.mod.BrowseOptions[typings.algoliaClientSearch.mod.Rule] & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromisevoid]]

inline def browseSynonyms(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchSynonymsOptions & typings.algoliaClientSearch.mod.BrowseOptions[typings.algoliaClientSearch.mod.Synonym] & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromisevoid] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("browseSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchSynonymsOptions & typings.algoliaClientSearch.mod.BrowseOptions[typings.algoliaClientSearch.mod.Synonym] & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromisevoid]]

inline def chunkedBatch(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function3[
/* bodies */ js.Array[js.Object], 
/* action */ typings.algoliaClientSearch.mod.BatchActionType, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chunkedBatch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* bodies */ js.Array[js.Object], 
/* action */ typings.algoliaClientSearch.mod.BatchActionType, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh]]

inline def clearObjects(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe]]

inline def clearRules(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ClearRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ClearRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe]]

inline def clearSynonyms(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.ClearSynonymsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.ClearSynonymsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe]]

inline def copyIndex(base: typings.algoliaClientSearch.mod.SearchClient): js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.CopyIndexOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.CopyIndexOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn]]

inline def copyRules(base: typings.algoliaClientSearch.mod.SearchClient): js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn]]

inline def copySettings(base: typings.algoliaClientSearch.mod.SearchClient): js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copySettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn]]

inline def copySynonyms(base: typings.algoliaClientSearch.mod.SearchClient): js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copySynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn]]

inline def createBrowsablePromise[TObject](
  options: typings.algoliaClientSearch.anon.Request[TObject] & typings.algoliaClientSearch.mod.BrowseOptions[TObject]
): typings.algoliaClientSearch.anon.ReadonlyPromisevoid = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrowsablePromise")(options.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaClientSearch.anon.ReadonlyPromisevoid]

inline def createMissingObjectIDError(): typings.std.Error = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMissingObjectIDError")().asInstanceOf[typings.std.Error]

inline def createObjectNotFoundError(): typings.std.Error = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createObjectNotFoundError")().asInstanceOf[typings.std.Error]

inline def createSearchClient: typings.algoliaClientCommon.mod.CreateClient[
typings.algoliaClientSearch.mod.SearchClient, 
typings.algoliaClientSearch.mod.SearchClientOptions & typings.algoliaClientCommon.mod.ClientTransporterOptions] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("createSearchClient").asInstanceOf[typings.algoliaClientCommon.mod.CreateClient[
typings.algoliaClientSearch.mod.SearchClient, 
typings.algoliaClientSearch.mod.SearchClientOptions & typings.algoliaClientCommon.mod.ClientTransporterOptions]]

inline def createValidUntilNotFoundError(): typings.std.Error = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createValidUntilNotFoundError")().asInstanceOf[typings.std.Error]

inline def deleteApiKey(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* apiKey */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDeCatch] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* apiKey */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDeCatch]]

inline def deleteBy(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* filters */ typings.algoliaClientSearch.mod.DeleteByFiltersOptions, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteBy")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* filters */ typings.algoliaClientSearch.mod.DeleteByFiltersOptions, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe]]

inline def deleteIndex(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe]]

inline def deleteObject(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe]]

inline def deleteObjects(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objectIDs */ js.Array[java.lang.String], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectIDs */ js.Array[java.lang.String], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh]]

inline def deleteRule(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe]]

inline def deleteSynonym(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.DeleteSynonymOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.DeleteSynonymOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe]]

inline def exists(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseboolean] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exists")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseboolean]]

inline def findAnswers(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function3[
/* query */ java.lang.String, 
/* queryLanguages */ js.Array[java.lang.String], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.FindAnswersOptions
], 
js.Promise[typings.algoliaClientSearch.mod.FindAnswersResponse[js.Any]]] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findAnswers")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* query */ java.lang.String, 
/* queryLanguages */ js.Array[java.lang.String], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.FindAnswersOptions
], 
js.Promise[typings.algoliaClientSearch.mod.FindAnswersResponse[js.Any]]]]

inline def findObject(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* callback */ js.Function1[
  /* object */ js.Any & typings.algoliaClientSearch.mod.ObjectWithObjectID, 
  scala.Boolean
], 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.FindObjectOptions & typings.algoliaTransporter.mod.RequestOptions
], 
js.Promise[typings.algoliaClientSearch.mod.FindObjectResponse[js.Any]]] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* callback */ js.Function1[
  /* object */ js.Any & typings.algoliaClientSearch.mod.ObjectWithObjectID, 
  scala.Boolean
], 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.FindObjectOptions & typings.algoliaTransporter.mod.RequestOptions
], 
js.Promise[typings.algoliaClientSearch.mod.FindObjectResponse[js.Any]]]]

inline def generateSecuredApiKey(): js.Function2[
/* parentApiKey */ java.lang.String, 
/* restrictions */ typings.algoliaClientSearch.mod.SecuredApiKeyRestrictions, 
java.lang.String] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecuredApiKey")().asInstanceOf[js.Function2[
/* parentApiKey */ java.lang.String, 
/* restrictions */ typings.algoliaClientSearch.mod.SecuredApiKeyRestrictions, 
java.lang.String]]

inline def getApiKey(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* apiKey */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseGetApiKeyR] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* apiKey */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseGetApiKeyR]]

inline def getLogs(base: typings.algoliaClientSearch.mod.SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseGetLogsRes] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLogs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseGetLogsRes]]

inline def getObject(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.GetObjectOptions
], 
js.Promise[js.Any & typings.algoliaClientSearch.mod.ObjectWithObjectID]] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.GetObjectOptions
], 
js.Promise[js.Any & typings.algoliaClientSearch.mod.ObjectWithObjectID]]]

inline def getObjectPosition[TObject](): js.Function2[
/* searchResponse */ typings.algoliaClientSearch.mod.SearchResponse[TObject], 
/* objectID */ java.lang.String, 
scala.Double] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getObjectPosition")().asInstanceOf[js.Function2[
/* searchResponse */ typings.algoliaClientSearch.mod.SearchResponse[TObject], 
/* objectID */ java.lang.String, 
scala.Double]]

inline def getObjects(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objectIDs */ js.Array[java.lang.String], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.GetObjectsOptions
], 
js.Promise[typings.algoliaClientSearch.mod.GetObjectsResponse[js.Any]]] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectIDs */ js.Array[java.lang.String], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.GetObjectsOptions
], 
js.Promise[typings.algoliaClientSearch.mod.GetObjectsResponse[js.Any]]]]

inline def getRule(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseRule] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseRule]]

inline def getSecuredApiKeyRemainingValidity(): js.Function1[/* securedApiKey */ java.lang.String, scala.Double] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSecuredApiKeyRemainingValidity")().asInstanceOf[js.Function1[/* securedApiKey */ java.lang.String, scala.Double]]

inline def getSettings(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSettings] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSettings]]

inline def getSynonym(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSynonym] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objectID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSynonym]]

inline def getTask(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* taskID */ scala.Double, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseTaskStatus] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTask")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* taskID */ scala.Double, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseTaskStatus]]

inline def getTopUserIDs(base: typings.algoliaClientSearch.mod.SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseGetTopUser] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTopUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseGetTopUser]]

inline def getUserID(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* userID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseUserIDResp] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* userID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseUserIDResp]]

inline def hasPendingMappings(base: typings.algoliaClientSearch.mod.SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.HasPendingMappingsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseHasPending] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasPendingMappings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.HasPendingMappingsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseHasPending]]

inline def initIndex(base: typings.algoliaClientSearch.mod.SearchClient): typings.algoliaClientSearch.mod.CreateIndex = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initIndex")(base.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaClientSearch.mod.CreateIndex]

inline def listApiKeys(base: typings.algoliaClientSearch.mod.SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseListApiKey] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("listApiKeys")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseListApiKey]]

inline def listClusters(base: typings.algoliaClientSearch.mod.SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseListCluste] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("listClusters")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseListCluste]]

inline def listIndices(base: typings.algoliaClientSearch.mod.SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseListIndice] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("listIndices")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseListIndice]]

inline def listUserIDs(base: typings.algoliaClientSearch.mod.SearchClient): js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.ListUserIDsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseListUserID] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("listUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.ListUserIDsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseListUserID]]

inline def moveIndex(base: typings.algoliaClientSearch.mod.SearchClient): js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* from */ java.lang.String, 
/* to */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn]]

inline def multipleBatch(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* requests */ js.Array[typings.algoliaClientSearch.mod.MultipleBatchRequest], 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseMu] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("multipleBatch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* requests */ js.Array[typings.algoliaClientSearch.mod.MultipleBatchRequest], 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseMu]]

inline def multipleGetObjects(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* requests */ js.Array[typings.algoliaClientSearch.mod.MultipleGetObject], 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
js.Promise[typings.algoliaClientSearch.mod.MultipleGetObjectsResponse[js.Any]]] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("multipleGetObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* requests */ js.Array[typings.algoliaClientSearch.mod.MultipleGetObject], 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
js.Promise[typings.algoliaClientSearch.mod.MultipleGetObjectsResponse[js.Any]]]]

inline def multipleQueries(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* queries */ js.Array[typings.algoliaClientSearch.mod.MultipleQueriesQuery], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.MultipleQueriesOptions
], 
js.Promise[typings.algoliaClientSearch.mod.MultipleQueriesResponse[js.Any]]] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("multipleQueries")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* queries */ js.Array[typings.algoliaClientSearch.mod.MultipleQueriesQuery], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.MultipleQueriesOptions
], 
js.Promise[typings.algoliaClientSearch.mod.MultipleQueriesResponse[js.Any]]]]

inline def multipleSearchForFacetValues(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* queries */ js.Array[typings.algoliaClientSearch.anon.IndexName_], 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseArraySearc] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("multipleSearchForFacetValues")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* queries */ js.Array[typings.algoliaClientSearch.anon.IndexName_], 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseArraySearc]]

inline def partialUpdateObject(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* object */ typings.std.Record[java.lang.String, js.Any], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.PartialUpdateObjectsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromisePa] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("partialUpdateObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* object */ typings.std.Record[java.lang.String, js.Any], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.PartialUpdateObjectsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromisePa]]

inline def partialUpdateObjects(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objects */ js.Array[typings.std.Record[java.lang.String, js.Any]], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.PartialUpdateObjectsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("partialUpdateObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objects */ js.Array[typings.std.Record[java.lang.String, js.Any]], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.PartialUpdateObjectsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh]]

inline def removeUserID(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* userID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseRemoveUser] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* userID */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromiseRemoveUser]]

inline def replaceAllObjects(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objects */ js.Array[typings.std.Record[java.lang.String, js.Any]], 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.ReplaceAllObjectsOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.SaveObjectsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objects */ js.Array[typings.std.Record[java.lang.String, js.Any]], 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.ReplaceAllObjectsOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.SaveObjectsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh]]

inline def replaceAllRules(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* rules */ js.Array[typings.algoliaClientSearch.mod.Rule], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SaveRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* rules */ js.Array[typings.algoliaClientSearch.mod.Rule], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SaveRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa]]

inline def replaceAllSynonyms(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* synonyms */ js.Array[typings.algoliaClientSearch.mod.Synonym], 
/* requestOptions */ js.UndefOr[typings.algoliaClientSearch.anon.RequestOptionsPickSaveSyn], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* synonyms */ js.Array[typings.algoliaClientSearch.mod.Synonym], 
/* requestOptions */ js.UndefOr[typings.algoliaClientSearch.anon.RequestOptionsPickSaveSyn], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch]]

inline def restoreApiKey(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* apiKey */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseRe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("restoreApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* apiKey */ java.lang.String, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseRe]]

inline def saveObject(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* object */ typings.std.Record[java.lang.String, js.Any], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.SaveObjectsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaFinally] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* object */ typings.std.Record[java.lang.String, js.Any], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.SaveObjectsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaFinally]]

inline def saveObjects(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* objects */ js.Array[typings.std.Record[java.lang.String, js.Any]], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.SaveObjectsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* objects */ js.Array[typings.std.Record[java.lang.String, js.Any]], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.ChunkOptions & typings.algoliaClientSearch.mod.SaveObjectsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh]]

inline def saveRule(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* rule */ typings.algoliaClientSearch.mod.Rule, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SaveRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaThen] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* rule */ typings.algoliaClientSearch.mod.Rule, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SaveRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaThen]]

inline def saveRules(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* rules */ js.Array[typings.algoliaClientSearch.mod.Rule], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SaveRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* rules */ js.Array[typings.algoliaClientSearch.mod.Rule], 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SaveRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa]]

inline def saveSynonym(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* synonym */ typings.algoliaClientSearch.mod.Synonym, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SaveSynonymsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaWait] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* synonym */ typings.algoliaClientSearch.mod.Synonym, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SaveSynonymsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaWait]]

inline def saveSynonyms(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* synonyms */ js.Array[typings.algoliaClientSearch.mod.Synonym], 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SaveSynonymsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* synonyms */ js.Array[typings.algoliaClientSearch.mod.Synonym], 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SaveSynonymsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch]]

inline def search(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* query */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SearchOptions
], 
js.Promise[typings.algoliaClientSearch.mod.SearchResponse[js.Any]]] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("search")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* query */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SearchOptions
], 
js.Promise[typings.algoliaClientSearch.mod.SearchResponse[js.Any]]]]

inline def searchForFacetValues(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function3[
/* facetName */ java.lang.String, 
/* facetQuery */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SearchOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSearchForF] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("searchForFacetValues")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* facetName */ java.lang.String, 
/* facetQuery */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SearchOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSearchForF]]

inline def searchRules(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* query */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SearchRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSearchResp] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("searchRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* query */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SearchRulesOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSearchResp]]

inline def searchSynonyms(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* query */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchSynonymsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSearchSyno] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("searchSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* query */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchSynonymsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSearchSyno]]

inline def searchUserIDs(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* query */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchUserIDsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSearchUser] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("searchUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* query */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.SearchUserIDsOptions & typings.algoliaTransporter.mod.RequestOptions
], 
typings.algoliaClientSearch.anon.ReadonlyPromiseSearchUser]]

inline def setSettings(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* settings */ typings.algoliaClientSearch.mod.Settings, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SetSettingsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSe] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* settings */ typings.algoliaClientSearch.mod.Settings, 
/* requestOptions */ js.UndefOr[
  typings.algoliaTransporter.mod.RequestOptions & typings.algoliaClientSearch.mod.SetSettingsOptions
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSe]]

inline def updateApiKey(base: typings.algoliaClientSearch.mod.SearchClient): js.Function2[
/* apiKey */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.UpdateApiKeyOptions & (typings.std.Pick[typings.algoliaTransporter.mod.RequestOptions, java.lang.String | scala.Double])
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseUp] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* apiKey */ java.lang.String, 
/* requestOptions */ js.UndefOr[
  typings.algoliaClientSearch.mod.UpdateApiKeyOptions & (typings.std.Pick[typings.algoliaTransporter.mod.RequestOptions, java.lang.String | scala.Double])
], 
typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseUp]]

inline def waitTask(base: typings.algoliaClientSearch.mod.SearchIndex): js.Function2[
/* taskID */ scala.Double, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromisevoid] = typings.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("waitTask")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* taskID */ scala.Double, 
/* requestOptions */ js.UndefOr[typings.algoliaTransporter.mod.RequestOptions], 
typings.algoliaClientSearch.anon.ReadonlyPromisevoid]]

type CreateIndex = js.Function2[
/* indexName */ java.lang.String, 
/* options */ js.UndefOr[
  typings.algoliaClientSearch.anon.Methods[
    org.scalablytyped.runtime.StringDictionary[
      js.Function1[
        /* base */ typings.algoliaClientSearch.mod.SearchIndex, 
        js.Function1[/* args */ js.Any, js.Any]
      ]
    ]
  ]
], 
typings.algoliaClientSearch.mod.SearchIndex & typings.algoliaClientSearch.algoliaClientSearchStrings.CreateIndex & org.scalablytyped.runtime.TopLevel[js.Any]]

type HighlightResult[THit] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ KAttribute in keyof THit ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @algolia/client-search.@algolia/client-search.HighlightResult<THit[KAttribute]> * / object}
  */ typings.algoliaClientSearch.algoliaClientSearchStrings.HighlightResult & org.scalablytyped.runtime.TopLevel[js.Any]) | typings.algoliaClientSearch.mod.HighlightMatch

type Hit[THit] = THit & typings.algoliaClientSearch.anon.DistinctSeqID[THit]

type SnippetResult[THit] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ KAttribute in keyof THit ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @algolia/client-search.@algolia/client-search.SnippetResult<THit[KAttribute]> * / object}
  */ typings.algoliaClientSearch.algoliaClientSearchStrings.SnippetResult & org.scalablytyped.runtime.TopLevel[js.Any]) | typings.algoliaClientSearch.mod.SnippetMatch
