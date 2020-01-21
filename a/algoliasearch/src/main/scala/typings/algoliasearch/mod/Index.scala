package typings.algoliasearch.mod

import typings.algoliasearch.AnonForwardToReplicas
import typings.algoliasearch.AnonResults
import typings.algoliasearch.mod.SearchForFacetValues.Parameters
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the index algolia object
  */
@js.native
trait Index extends js.Object {
  var indexName: String = js.native
  /**
    * Add key for this index
    */
  def addApiKey(scopes: js.Array[String]): js.Promise[AddApiKeyTask] = js.native
  /**
    * Add key for this index
    */
  def addApiKey(scopes: js.Array[String], cb: js.Function2[/* err */ Error, /* res */ AddApiKeyTask, Unit]): Unit = js.native
  def addApiKey(scopes: js.Array[String], options: ApiKeyOptions): js.Promise[AddApiKeyTask] = js.native
  /**
    * Add key for this index
    */
  def addApiKey(
    scopes: js.Array[String],
    options: ApiKeyOptions,
    cb: js.Function2[/* err */ Error, /* res */ AddApiKeyTask, Unit]
  ): Unit = js.native
  /**
    * Add a list of objects
    */
  def addObject(`object`: js.Object): js.Promise[Task] = js.native
  /**
    * Add a specific object
    */
  def addObject(`object`: js.Object, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  def addObject(`object`: js.Object, objectID: String): js.Promise[Task] = js.native
  /**
    * Add a list of objects
    */
  def addObject(`object`: js.Object, objectID: String, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Add list of objects
    */
  def addObjects(objects: js.Array[js.Object]): js.Promise[MultiObjectTask] = js.native
  /**
    * Add list of objects
    */
  def addObjects(objects: js.Array[js.Object], cb: js.Function2[/* err */ Error, /* res */ MultiObjectTask, Unit]): Unit = js.native
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
    cb: js.Function2[/* err */ Error, /* res */ Task, Unit]
  ): Unit = js.native
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
    cb: js.Function2[/* err */ Error, /* res */ Task, Unit]
  ): Unit = js.native
  /**
    * Browse an index
    */
  def browse(query: String): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index
    */
  def browse(query: String, cb: js.Function2[/* err */ Error, /* res */ BrowseResponse, Unit]): Unit = js.native
  def browse(query: String, parameters: BrowseParameters): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index
    */
  def browse(
    query: String,
    parameters: BrowseParameters,
    cb: js.Function2[/* err */ Error, /* res */ BrowseResponse, Unit]
  ): Unit = js.native
  /**
    * Browse an entire index
    */
  def browseAll(): Browser = js.native
  def browseAll(query: String): Browser = js.native
  def browseAll(query: String, parameters: BrowseParameters): Browser = js.native
  /**
    * Browse an index from a cursor
    */
  def browseFrom(cursor: String): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index from a cursor
    */
  def browseFrom(cursor: String, cb: js.Function2[/* err */ Error, /* res */ BrowseResponse, Unit]): Unit = js.native
  /**
    * Clear cache of an index
    */
  def clearCache(): Unit = js.native
  /**
    * Clear an index content
    */
  def clearIndex(): js.Promise[Task] = js.native
  /**
    * Clear an index content
    */
  def clearIndex(cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Clear all query rules of an index
    */
  def clearRules(options: RuleOption): js.Promise[Task] = js.native
  /**
    * Clear all rules of an index
    */
  def clearRules(options: RuleOption, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Clear all synonyms of an index
    */
  def clearSynonyms(options: SynonymOption): js.Promise[Task] = js.native
  /**
    * Clear all synonyms of an index
    */
  def clearSynonyms(options: SynonymOption, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Deletes an index specific key
    */
  def deleteApiKey(key: String): js.Promise[DeleteApiKeyTask] = js.native
  /**
    * Deletes an index specific key
    */
  def deleteApiKey(key: String, cb: js.Function2[/* err */ Error, /* res */ DeleteApiKeyTask, Unit]): Unit = js.native
  /**
    * Delete objects that matches the query
    */
  def deleteBy(params: js.Object): js.Promise[Task] = js.native
  /**
    * Delete objects that matches the query
    */
  def deleteBy(params: js.Object, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Delete objects that matches the query
    */
  def deleteByQuery(query: String): js.Promise[_] = js.native
  /**
    * Delete objects that matches the query
    */
  def deleteByQuery(query: String, cb: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def deleteByQuery(query: String, params: js.Object): js.Promise[_] = js.native
  /**
    * Delete objects that matches the query
    */
  def deleteByQuery(query: String, params: js.Object, cb: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  /**
    * Delete a specific object
    */
  def deleteObject(objectID: String): js.Promise[Task] = js.native
  /**
    * Delete a specific object
    */
  def deleteObject(objectID: String, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Delete a list of objects
    */
  def deleteObjects(objectIDs: js.Array[String]): js.Promise[Task] = js.native
  /**
    * Delete a list of objects
    */
  def deleteObjects(objectIDs: js.Array[String], cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Delete a specific rule
    */
  def deleteRule(identifier: String, options: RuleOption): js.Promise[Task] = js.native
  /**
    * Delete a specific rule
    */
  def deleteRule(identifier: String, options: RuleOption, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Delete a specific synonym
    */
  def deleteSynonym(
    identifier: String,
    options: SynonymOption,
    cb: js.Function2[/* err */ Error, /* res */ Task, Unit]
  ): Unit = js.native
  /**
    * Delete a specific synonym
    */
  def deleteSynonym(objectID: String, options: SynonymOption): js.Promise[Task] = js.native
  /**
    * Gets the rights of an index specific key
    */
  def getApiKey(key: String): js.Promise[ApiKey] = js.native
  /**
    * Gets the rights of an index specific key
    */
  def getApiKey(key: String, cb: js.Function2[/* err */ Error, /* res */ ApiKey, Unit]): Unit = js.native
  /**
    * Gets specific attributes from an object
    */
  def getObject(objectID: String): js.Promise[js.Object] = js.native
  def getObject(objectID: String, attributes: js.Array[String]): js.Promise[js.Object] = js.native
  /**
    * Gets specific attributes from an object
    */
  def getObject(
    objectID: String,
    attributes: js.Array[String],
    cb: js.Function2[/* err */ Error, /* res */ js.Object, Unit]
  ): Unit = js.native
  /**
    * Gets a specific object
    */
  def getObject(objectID: String, cb: js.Function2[/* err */ Error, /* res */ js.Object, Unit]): Unit = js.native
  /**
    * Gets a list of objects
    */
  def getObjects(objectIDs: js.Array[String]): js.Promise[AnonResults] = js.native
  /**
    * Gets a list of objects
    */
  def getObjects(objectIDs: js.Array[String], cb: js.Function2[/* err */ Error, /* res */ AnonResults, Unit]): Unit = js.native
  /**
    * Get a specific query rule
    */
  def getRule(identifier: String): js.Promise[Rule] = js.native
  /**
    * Get a specific rule
    */
  def getRule(identifier: String, cb: js.Function2[/* err */ Error, /* res */ Rule, Unit]): Unit = js.native
  /**
    * Get an index settings
    */
  def getSettings(): js.Promise[IndexSettings] = js.native
  /**
    * Get an index settings
    */
  def getSettings(cb: js.Function2[/* err */ Error, /* res */ IndexSettings, Unit]): Unit = js.native
  /**
    * Get a specific synonym
    */
  def getSynonym(identifier: String, cb: js.Function2[/* err */ Error, /* res */ Synonym, Unit]): Unit = js.native
  /**
    * Get a specific synonym
    */
  def getSynonym(objectID: String): js.Promise[Synonym] = js.native
  /**
    * List index user keys
    */
  def listApiKeys(): js.Promise[js.Array[ApiKey]] = js.native
  /**
    * List index user keys
    */
  def listApiKeys(cb: js.Function2[/* err */ Error, /* res */ js.Array[ApiKey], Unit]): Unit = js.native
  /**
    * Update parameters of a specific object
    */
  def partialUpdateObject(`object`: js.Object): js.Promise[Task] = js.native
  /**
    * Update parameters of a specific object
    */
  def partialUpdateObject(`object`: js.Object, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  def partialUpdateObject(`object`: js.Object, createIfNotExists: Boolean): js.Promise[Task] = js.native
  def partialUpdateObject(
    `object`: js.Object,
    createIfNotExists: Boolean,
    cb: js.Function2[/* err */ Error, /* res */ Task, Unit]
  ): Unit = js.native
  /**
    * Update parameters of a list of objects
    */
  def partialUpdateObjects(objects: js.Array[js.Object]): js.Promise[Task] = js.native
  /**
    * Update parameters of a list of objects
    */
  def partialUpdateObjects(objects: js.Array[js.Object], cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  def partialUpdateObjects(objects: js.Array[js.Object], createIfNotExists: Boolean): js.Promise[Task] = js.native
  def partialUpdateObjects(
    objects: js.Array[js.Object],
    createIfNotExists: Boolean,
    cb: js.Function2[/* err */ Error, /* res */ Task, Unit]
  ): Unit = js.native
  /**
    * Add or replace a specific object
    */
  def saveObject(`object`: js.Object): js.Promise[Task] = js.native
  /**
    * Add or replace a specific object
    */
  def saveObject(`object`: js.Object, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Add or replace several objects
    */
  def saveObjects(objects: js.Array[js.Object]): js.Promise[Task] = js.native
  /**
    * Add or replace several objects
    */
  def saveObjects(objects: js.Array[js.Object], cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Save a rule object
    */
  def saveRule(rule: Rule, options: RuleOption): js.Promise[Task] = js.native
  /**
    * Save a rule object
    */
  def saveRule(rule: Rule, options: RuleOption, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Save a synonym object
    */
  def saveSynonym(synonym: Synonym, options: SynonymOption): js.Promise[Task] = js.native
  /**
    * Save a synonym object
    */
  def saveSynonym(synonym: Synonym, options: SynonymOption, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * Search in an index
    */
  def search[T](params: QueryParameters): js.Promise[Response[T]] = js.native
  /**
    * Search in an index
    */
  def search[T](params: QueryParameters, cb: js.Function2[/* err */ Error, /* res */ Response[T], Unit]): Unit = js.native
  /**
    * Search in an index
    */
  def searchForFacetValues(options: Parameters): js.Promise[typings.algoliasearch.mod.SearchForFacetValues.Response] = js.native
  /**
    * Search in an index
    */
  def searchForFacetValues(
    options: Parameters,
    cb: js.Function2[
      /* err */ Error, 
      /* res */ typings.algoliasearch.mod.SearchForFacetValues.Response, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Search for query rules
    */
  def searchRules(options: SearchRuleOptions): js.Promise[_] = js.native
  /**
    * Search a rules
    */
  def searchRules(options: SearchRuleOptions, cb: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  /**
    * Search a synonyms
    */
  def searchSynonyms(options: SearchSynonymOptions): js.Promise[_] = js.native
  /**
    * Search a synonyms
    */
  def searchSynonyms(options: SearchSynonymOptions, cb: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  /**
    * Set an index settings
    */
  def setSettings(settings: IndexSettings): js.Promise[Task] = js.native
  /**
    * Set an index settings
    */
  def setSettings(settings: IndexSettings, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  def setSettings(settings: IndexSettings, extra: AnonForwardToReplicas): js.Promise[Task] = js.native
  /**
    * Set an index settings
    */
  def setSettings(
    settings: IndexSettings,
    extra: AnonForwardToReplicas,
    cb: js.Function2[/* err */ Error, /* res */ Task, Unit]
  ): Unit = js.native
  /**
    * Update a key for this index
    */
  def updateApiKey(key: String, scopes: js.Array[String]): js.Promise[UpdateApiKeyTask] = js.native
  /**
    * Update a key for this index
    */
  def updateApiKey(
    key: String,
    scopes: js.Array[String],
    cb: js.Function2[/* err */ Error, /* res */ UpdateApiKeyTask, Unit]
  ): Unit = js.native
  /**
    * Update a key for this index
    */
  def updateApiKey(key: String, scopes: js.Array[String], options: ApiKeyOptions): js.Promise[UpdateApiKeyTask] = js.native
  /**
    * Update a key for this index
    */
  def updateApiKey(
    key: String,
    scopes: js.Array[String],
    options: ApiKeyOptions,
    cb: js.Function2[/* err */ Error, /* res */ UpdateApiKeyTask, Unit]
  ): Unit = js.native
  /**
    * Wait for an indexing task to be compete
    */
  def waitTask(taskID: Double): js.Promise[TaskStatus] = js.native
  /**
    * Wait for an indexing task to be compete
    */
  def waitTask(taskID: Double, cb: js.Function2[/* err */ Error, /* res */ TaskStatus, Unit]): Unit = js.native
}

