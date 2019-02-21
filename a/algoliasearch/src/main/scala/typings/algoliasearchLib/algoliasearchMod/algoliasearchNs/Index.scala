package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the index algolia object
  */
@js.native
trait Index extends js.Object {
  var indexName: java.lang.String = js.native
  /**
    * Add key for this index
    * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
    */
  def addApiKey(scopes: js.Array[java.lang.String]): js.Promise[Task] = js.native
  /**
    * Add key for this index
    * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
    */
  def addApiKey(
    scopes: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  def addApiKey(scopes: js.Array[java.lang.String], options: ApiKeyOptions): js.Promise[Task] = js.native
  /**
    * Add key for this index
    * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
    */
  def addApiKey(
    scopes: js.Array[java.lang.String],
    options: ApiKeyOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Add a list of objects
    * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
    */
  def addObject(`object`: js.Object): js.Promise[Task] = js.native
  /**
    * Add a specific object
    * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
    */
  def addObject(`object`: js.Object, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  def addObject(`object`: js.Object, objectID: java.lang.String): js.Promise[Task] = js.native
  /**
    * Add a list of objects
    * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
    */
  def addObject(
    `object`: js.Object,
    objectID: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Add list of objects
    * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
    */
  def addObjects(objects: js.Array[js.Object]): js.Promise[Task] = js.native
  /**
    * Add list of objects
    * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
    */
  def addObjects(objects: js.Array[js.Object], cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Save a rule object
    */
  def batchRules(rules: js.Array[Rule], options: RuleOption): js.Promise[Task] = js.native
  /**
    * Save a rule object
    */
  def batchRules(
    rules: js.Array[Rule],
    options: RuleOption,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Save a synonym object
    */
  def batchSynonyms(synonyms: js.Array[Synonym], options: SynonymOption): js.Promise[Task] = js.native
  /**
    * Save a synonym object
    */
  def batchSynonyms(
    synonyms: js.Array[Synonym],
    options: SynonymOption,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Browse an index
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browse(query: java.lang.String): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browse(
    query: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ BrowseResponse, scala.Unit]
  ): scala.Unit = js.native
  def browse(query: java.lang.String, parameters: BrowseParameters): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browse(
    query: java.lang.String,
    parameters: BrowseParameters,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ BrowseResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Browse an entire index
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browseAll(): Browser = js.native
  def browseAll(query: java.lang.String): Browser = js.native
  def browseAll(query: java.lang.String, parameters: BrowseParameters): Browser = js.native
  /**
    * Browse an index from a cursor
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browseFrom(cursor: java.lang.String): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index from a cursor
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browseFrom(
    cursor: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ BrowseResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Clear cache of an index
    * https://github.com/algolia/algoliasearch-client-js#cache
    */
  def clearCache(): scala.Unit = js.native
  /**
    * Clear an index content
    * https://github.com/algolia/algoliasearch-client-js#clear-index---clearindex
    */
  def clearIndex(): js.Promise[Task] = js.native
  /**
    * Clear an index content
    * https://github.com/algolia/algoliasearch-client-js#clear-index---clearindex
    */
  def clearIndex(cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Clear all query rules of an index
    * https://github.com/algolia/algoliasearch-client-js#clear-all-rules---clearrules
    */
  def clearRules(options: RuleOption): js.Promise[Task] = js.native
  /**
    * Clear all rules of an index
    * https://github.com/algolia/algoliasearch-client-js#clear-all-rules---clearrules
    */
  def clearRules(options: RuleOption, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Clear all synonyms of an index
    * https://github.com/algolia/algoliasearch-client-js#clear-all-synonyms---clearsynonyms
    */
  def clearSynonyms(options: SynonymOption): js.Promise[Task] = js.native
  /**
    * Clear all synonyms of an index
    * https://github.com/algolia/algoliasearch-client-js#clear-all-synonyms---clearsynonyms
    */
  def clearSynonyms(options: SynonymOption, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Deletes an index specific key
    * https://github.com/algolia/algoliasearch-client-js#delete-user-key---deleteapikey
    */
  def deleteApiKey(key: java.lang.String): js.Promise[Task] = js.native
  /**
    * Deletes an index specific key
    * https://github.com/algolia/algoliasearch-client-js#delete-user-key---deleteapikey
    */
  def deleteApiKey(key: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Delete objects that matches the query
    * https://www.algolia.com/doc/api-reference/api-methods/delete-by-query/
    */
  def deleteBy(params: js.Object): js.Promise[Task] = js.native
  /**
    * Delete objects that matches the query
    * https://github.com/algolia/algoliasearch-client-js#delete-by-query---deleteby
    */
  def deleteBy(params: js.Object, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Delete objects that matches the query
    * https://github.com/algolia/algoliasearch-client-js#delete-by-query---deletebyquery
    */
  def deleteByQuery(query: java.lang.String): js.Promise[_] = js.native
  /**
    * Delete objects that matches the query
    * https://github.com/algolia/algoliasearch-client-js#delete-by-query---deletebyquery
    */
  def deleteByQuery(query: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def deleteByQuery(query: java.lang.String, params: js.Object): js.Promise[_] = js.native
  /**
    * Delete objects that matches the query
    * https://github.com/algolia/algoliasearch-client-js#delete-by-query---deletebyquery
    */
  def deleteByQuery(
    query: java.lang.String,
    params: js.Object,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Delete a specific object
    * https://github.com/algolia/algoliasearch-client-js#delete-objects---deleteobjects
    */
  def deleteObject(objectID: java.lang.String): js.Promise[Task] = js.native
  /**
    * Delete a specific object
    * https://github.com/algolia/algoliasearch-client-js#delete-objects---deleteobjects
    */
  def deleteObject(objectID: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Delete a list of objects
    * https://github.com/algolia/algoliasearch-client-js#delete-objects---deleteobjects
    */
  def deleteObjects(objectIDs: js.Array[java.lang.String]): js.Promise[Task] = js.native
  /**
    * Delete a list of objects
    * https://github.com/algolia/algoliasearch-client-js#delete-objects---deleteobjects
    */
  def deleteObjects(
    objectIDs: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Delete a specific rule
    * https://github.com/algolia/algoliasearch-client-js#batch-rules---batchrules
    */
  def deleteRule(identifier: java.lang.String, options: RuleOption): js.Promise[Task] = js.native
  /**
    * Delete a specific rule
    * https://github.com/algolia/algoliasearch-client-js#batch-rules---batchrules
    */
  def deleteRule(
    identifier: java.lang.String,
    options: RuleOption,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Delete a specific synonym
    * https://github.com/algolia/algoliasearch-client-js#batch-synonyms---batchsynonyms
    */
  def deleteSynonym(
    identifier: java.lang.String,
    options: SynonymOption,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Delete a specific synonym
    * https://github.com/algolia/algoliasearch-client-js#batch-synonyms---batchsynonyms
    */
  def deleteSynonym(objectID: java.lang.String, options: SynonymOption): js.Promise[Task] = js.native
  /**
    * Gets the rights of an index specific key
    * https://github.com/algolia/algoliasearch-client-js#get-key-permissions---getapikeyacl
    */
  def getApiKey(key: java.lang.String): js.Promise[_] = js.native
  /**
    * Gets the rights of an index specific key
    * https://github.com/algolia/algoliasearch-client-js#get-key-permissions---getapikeyacl
    */
  def getApiKey(key: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Gets specific attributes from an object
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObject(objectID: java.lang.String): js.Promise[js.Object] = js.native
  def getObject(objectID: java.lang.String, attributes: js.Array[java.lang.String]): js.Promise[js.Object] = js.native
  /**
    * Gets specific attributes from an object
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObject(
    objectID: java.lang.String,
    attributes: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets a specific object
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObject(
    objectID: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets a list of objects
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObjects(objectIDs: js.Array[java.lang.String]): js.Promise[algoliasearchLib.Anon_Results] = js.native
  /**
    * Gets a list of objects
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObjects(
    objectIDs: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ algoliasearchLib.Anon_Results, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get a specific query rule
    * https://github.com/algolia/algoliasearch-client-js#get-rule---getrule
    */
  def getRule(identifier: java.lang.String): js.Promise[Rule] = js.native
  /**
    * Get a specific rule
    * https://github.com/algolia/algoliasearch-client-js#get-rule---getrule
    */
  def getRule(identifier: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* res */ Rule, scala.Unit]): scala.Unit = js.native
  /**
    * Get an index settings
    * https://github.com/algolia/algoliasearch-client-js#get-settings---getsettings
    */
  def getSettings(): js.Promise[IndexSettings] = js.native
  /**
    * Get an index settings
    * https://github.com/algolia/algoliasearch-client-js#get-settings---getsettings
    */
  def getSettings(cb: js.Function2[/* err */ stdLib.Error, /* res */ IndexSettings, scala.Unit]): scala.Unit = js.native
  /**
    * Get a specific synonym
    * https://github.com/algolia/algoliasearch-client-js#get-synonym---getsynonym
    */
  def getSynonym(
    identifier: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Synonym, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get a specific synonym
    * https://github.com/algolia/algoliasearch-client-js#get-synonym---getsynonym
    */
  def getSynonym(objectID: java.lang.String): js.Promise[Synonym] = js.native
  /**
    * List index user keys
    * https://github.com/algolia/algoliasearch-client-js#list-api-keys---listapikeys
    */
  def listApiKeys(): js.Promise[_] = js.native
  /**
    * List index user keys
    * https://github.com/algolia/algoliasearch-client-js#list-api-keys---listapikeys
    */
  def listApiKeys(cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Update parameters of a specific object
    * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
    */
  def partialUpdateObject(`object`: js.Object): js.Promise[Task] = js.native
  /**
    * Update parameters of a specific object
    * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
    */
  def partialUpdateObject(`object`: js.Object, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  def partialUpdateObject(`object`: js.Object, createIfNotExists: scala.Boolean): js.Promise[Task] = js.native
  def partialUpdateObject(
    `object`: js.Object,
    createIfNotExists: scala.Boolean,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Update parameters of a list of objects
    * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
    */
  def partialUpdateObjects(objects: js.Array[js.Object]): js.Promise[Task] = js.native
  /**
    * Update parameters of a list of objects
    * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
    */
  def partialUpdateObjects(objects: js.Array[js.Object], cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  def partialUpdateObjects(objects: js.Array[js.Object], createIfNotExists: scala.Boolean): js.Promise[Task] = js.native
  def partialUpdateObjects(
    objects: js.Array[js.Object],
    createIfNotExists: scala.Boolean,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Add or replace a specific object
    * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
    */
  def saveObject(`object`: js.Object): js.Promise[Task] = js.native
  /**
    * Add or replace a specific object
    * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
    */
  def saveObject(`object`: js.Object, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Add or replace several objects
    * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
    */
  def saveObjects(objects: js.Array[js.Object]): js.Promise[Task] = js.native
  /**
    * Add or replace several objects
    * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
    */
  def saveObjects(objects: js.Array[js.Object], cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Save a rule object
    * https://github.com/algolia/algoliasearch-client-js#save-rule---saverule
    */
  def saveRule(rule: Rule, options: RuleOption): js.Promise[Task] = js.native
  /**
    * Save a rule object
    * https://github.com/algolia/algoliasearch-client-js#save-rule---saverule
    */
  def saveRule(
    rule: Rule,
    options: RuleOption,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Save a synonym object
    * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
    */
  def saveSynonym(synonym: Synonym, options: SynonymOption): js.Promise[Task] = js.native
  /**
    * Save a synonym object
    * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
    */
  def saveSynonym(
    synonym: Synonym,
    options: SynonymOption,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Search in an index
    * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
    */
  def search[T](params: QueryParameters): js.Promise[Response[T]] = js.native
  /**
    * Search in an index
    * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
    */
  def search[T](
    params: QueryParameters,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Response[T], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Search in an index
    * https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/
    */
  def searchForFacetValues(options: algoliasearchLib.algoliasearchMod.algoliasearchNs.SearchForFacetValuesNs.Parameters): js.Promise[
    algoliasearchLib.algoliasearchMod.algoliasearchNs.SearchForFacetValuesNs.Response
  ] = js.native
  /**
    * Search in an index
    * https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/
    */
  def searchForFacetValues(
    options: algoliasearchLib.algoliasearchMod.algoliasearchNs.SearchForFacetValuesNs.Parameters,
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ algoliasearchLib.algoliasearchMod.algoliasearchNs.SearchForFacetValuesNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Search for query rules
    * https://github.com/algolia/algoliasearch-client-js#search-rules---searchrules
    */
  def searchRules(options: SearchRuleOptions): js.Promise[_] = js.native
  /**
    * Search a rules
    * https://github.com/algolia/algoliasearch-client-js#search-rules---searchrules
    */
  def searchRules(options: SearchRuleOptions, cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Search a synonyms
    * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
    */
  def searchSynonyms(options: SearchSynonymOptions): js.Promise[_] = js.native
  /**
    * Search a synonyms
    * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
    */
  def searchSynonyms(
    options: SearchSynonymOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Set an index settings
    * https://github.com/algolia/algoliasearch-client-js#set-settings---setsettings
    */
  def setSettings(settings: IndexSettings): js.Promise[Task] = js.native
  /**
    * Set an index settings
    * https://github.com/algolia/algoliasearch-client-js#set-settings---setsettings
    */
  def setSettings(settings: IndexSettings, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Update a key for this index
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def updateApiKey(key: java.lang.String, scopes: js.Array[java.lang.String]): js.Promise[Task] = js.native
  /**
    * Update a key for this index
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def updateApiKey(
    key: java.lang.String,
    scopes: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Update a key for this index
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def updateApiKey(key: java.lang.String, scopes: js.Array[java.lang.String], options: ApiKeyOptions): js.Promise[Task] = js.native
  /**
    * Update a key for this index
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def updateApiKey(
    key: java.lang.String,
    scopes: js.Array[java.lang.String],
    options: ApiKeyOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Wait for an indexing task to be compete
    * https://github.com/algolia/algoliasearch-client-js#wait-for-operations---waittask
    */
  def waitTask(taskID: scala.Double): js.Promise[TaskStatus] = js.native
  /**
    * Wait for an indexing task to be compete
    * https://github.com/algolia/algoliasearch-client-js#wait-for-operations---waittask
    */
  def waitTask(taskID: scala.Double, cb: js.Function2[/* err */ stdLib.Error, /* res */ TaskStatus, scala.Unit]): scala.Unit = js.native
}

