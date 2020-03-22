package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.AqlLiteral
import typings.arangodb.ArangoDB.ArangoSearchView
import typings.arangodb.ArangoDB.ArangoSearchViewPropertiesOptions
import typings.arangodb.ArangoDB.Collection
import typings.arangodb.ArangoDB.CreateCollectionOptions
import typings.arangodb.ArangoDB.Cursor
import typings.arangodb.ArangoDB.Database
import typings.arangodb.ArangoDB.DatabaseUser
import typings.arangodb.ArangoDB.Document
import typings.arangodb.ArangoDB.DocumentMetadata
import typings.arangodb.ArangoDB.EngineType
import typings.arangodb.ArangoDB.Index
import typings.arangodb.ArangoDB.IndexLike
import typings.arangodb.ArangoDB.ObjectWithId
import typings.arangodb.ArangoDB.ParsedQuery
import typings.arangodb.ArangoDB.Query
import typings.arangodb.ArangoDB.QueryOptions
import typings.arangodb.ArangoDB.Statement
import typings.arangodb.ArangoDB.Transaction
import typings.arangodb.ArangoDB.ViewType
import typings.arangodb.arangodbBooleans.`true`
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def query(strings: TemplateStringsArray, args: js.Any*): Cursor[_] = js.native
  def time(): Double = js.native
  @js.native
  object aql extends js.Object {
    def apply(strings: TemplateStringsArray, args: js.Any*): Query = js.native
    def literal(value: js.Any): AqlLiteral = js.native
  }
  
  @js.native
  object db
    extends /* key */ StringDictionary[js.UndefOr[Collection[_]]] {
    // Collection
    def _collection(name: String): Collection[_] = js.native
    def _collections(): js.Array[Collection[_]] = js.native
    def _create(name: String): Collection[_] = js.native
    def _create(name: String, properties: CreateCollectionOptions): Collection[_] = js.native
    // Database
    def _createDatabase(name: String): `true` = js.native
    def _createDatabase(name: String, options: scala.Nothing): `true` = js.native
    def _createDatabase(name: String, options: scala.Nothing, users: js.Array[DatabaseUser]): `true` = js.native
    def _createDocumentCollection(name: String): Collection[_] = js.native
    def _createDocumentCollection(name: String, properties: CreateCollectionOptions): Collection[_] = js.native
    def _createEdgeCollection(name: String): Collection[_] = js.native
    def _createEdgeCollection(name: String, properties: CreateCollectionOptions): Collection[_] = js.native
    def _createStatement(query: String): Statement[_] = js.native
    // AQL
    def _createStatement(query: Query): Statement[_] = js.native
    def _createView(name: String, `type`: ViewType, properties: ArangoSearchViewPropertiesOptions): ArangoSearchView = js.native
    def _databases(): js.Array[String] = js.native
    // Document
    def _document(name: String): Document[_] = js.native
    def _drop(name: String): Unit = js.native
    def _dropDatabase(name: String): `true` = js.native
    def _dropIndex(index: String): Boolean = js.native
    def _dropIndex(index: IndexLike): Boolean = js.native
    def _dropView(name: String): Unit = js.native
    // Global
    def _engine(): EngineType = js.native
    def _engineStats(): StringDictionary[js.Any] = js.native
    def _executeTransaction(transaction: Transaction): Unit = js.native
    def _exists(selector: String): DocumentMetadata = js.native
    def _exists(selector: ObjectWithId): DocumentMetadata = js.native
    def _explain(query: String): Unit = js.native
    def _explain(query: Query): Unit = js.native
    // Properties
    def _id(): String = js.native
    // Indexes
    def _index(index: String): Index[_] | Null = js.native
    def _index(index: IndexLike): Index[_] | Null = js.native
    def _isSystem(): Boolean = js.native
    def _name(): String = js.native
    def _parse(query: String): ParsedQuery = js.native
    def _path(): String = js.native
    def _query(query: String): Cursor[_] = js.native
    def _query(query: String, bindVars: js.Object): Cursor[_] = js.native
    def _query(query: String, bindVars: js.Object, options: QueryOptions): Cursor[_] = js.native
    def _query(query: Query): Cursor[_] = js.native
    def _query(query: Query, options: QueryOptions): Cursor[_] = js.native
    def _remove(selector: String): DocumentMetadata = js.native
    def _remove(selector: ObjectWithId): DocumentMetadata = js.native
    def _replace(selector: String, data: js.Object): DocumentMetadata = js.native
    def _replace(selector: ObjectWithId, data: js.Object): DocumentMetadata = js.native
    def _truncate(name: String): Unit = js.native
    def _update(selector: String, data: js.Object): DocumentMetadata = js.native
    def _update(selector: ObjectWithId, data: js.Object): DocumentMetadata = js.native
    def _useDatabase(name: String): Database = js.native
    def _version(): String = js.native
    // Views
    def _view(name: String): ArangoSearchView | Null = js.native
    def _views(): js.Array[ArangoSearchView] = js.native
  }
  
  @js.native
  object errors extends js.Object {
    var COMMUNICATOR_DISABLED: AnonCode = js.native
    var COMMUNICATOR_REQUEST_ABORTED: AnonCode = js.native
    var ERROR_AGENCY_CANNOT_REBUILD_DBS: AnonCode = js.native
    var ERROR_AGENCY_INFORM_MUST_BE_OBJECT: AnonCode = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE: AnonCode = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_ID: AnonCode = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING: AnonCode = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING: AnonCode = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL: AnonCode = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM: AnonCode = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT: AnonCode = js.native
    var ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING: AnonCode = js.native
    var ERROR_AGENCY_INQUIRY_SYNTAX: AnonCode = js.native
    var ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED: AnonCode = js.native
    var ERROR_ARANGO_BUSY: AnonCode = js.native
    var ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS: AnonCode = js.native
    var ERROR_ARANGO_COLLECTION_NOT_LOADED: AnonCode = js.native
    var ERROR_ARANGO_COLLECTION_NOT_UNLOADED: AnonCode = js.native
    var ERROR_ARANGO_COLLECTION_PARAMETER_MISSING: AnonCode = js.native
    var ERROR_ARANGO_COLLECTION_TYPE_INVALID: AnonCode = js.native
    var ERROR_ARANGO_COLLECTION_TYPE_MISMATCH: AnonCode = js.native
    var ERROR_ARANGO_CONFLICT: AnonCode = js.native
    var ERROR_ARANGO_CORRUPTED_COLLECTION: AnonCode = js.native
    var ERROR_ARANGO_CORRUPTED_DATAFILE: AnonCode = js.native
    var ERROR_ARANGO_CROSS_COLLECTION_REQUEST: AnonCode = js.native
    var ERROR_ARANGO_DATABASE_NAME_INVALID: AnonCode = js.native
    var ERROR_ARANGO_DATABASE_NOT_FOUND: AnonCode = js.native
    var ERROR_ARANGO_DATADIR_INVALID: AnonCode = js.native
    var ERROR_ARANGO_DATADIR_LOCKED: AnonCode = js.native
    var ERROR_ARANGO_DATADIR_NOT_WRITABLE: AnonCode = js.native
    var ERROR_ARANGO_DATADIR_UNLOCKABLE: AnonCode = js.native
    var ERROR_ARANGO_DATAFILE_ALREADY_EXISTS: AnonCode = js.native
    var ERROR_ARANGO_DATAFILE_EMPTY: AnonCode = js.native
    var ERROR_ARANGO_DATAFILE_FULL: AnonCode = js.native
    var ERROR_ARANGO_DATAFILE_SEALED: AnonCode = js.native
    var ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND: AnonCode = js.native
    var ERROR_ARANGO_DATAFILE_UNREADABLE: AnonCode = js.native
    var ERROR_ARANGO_DATA_SOURCE_NOT_FOUND: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_HANDLE_BAD: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_KEY_BAD: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_KEY_MISSING: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_NOT_FOUND: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_REV_BAD: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_TOO_LARGE: AnonCode = js.native
    var ERROR_ARANGO_DOCUMENT_TYPE_INVALID: AnonCode = js.native
    var ERROR_ARANGO_DUPLICATE_IDENTIFIER: AnonCode = js.native
    var ERROR_ARANGO_DUPLICATE_NAME: AnonCode = js.native
    var ERROR_ARANGO_EMPTY_DATADIR: AnonCode = js.native
    var ERROR_ARANGO_ENDPOINT_NOT_FOUND: AnonCode = js.native
    var ERROR_ARANGO_FILESYSTEM_FULL: AnonCode = js.native
    var ERROR_ARANGO_ICU_ERROR: AnonCode = js.native
    var ERROR_ARANGO_ILLEGAL_NAME: AnonCode = js.native
    var ERROR_ARANGO_ILLEGAL_PARAMETER_FILE: AnonCode = js.native
    var ERROR_ARANGO_ILLEGAL_STATE: AnonCode = js.native
    var ERROR_ARANGO_INDEX_CREATION_FAILED: AnonCode = js.native
    var ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING: AnonCode = js.native
    var ERROR_ARANGO_INDEX_HANDLE_BAD: AnonCode = js.native
    var ERROR_ARANGO_INDEX_NOT_FOUND: AnonCode = js.native
    var ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE: AnonCode = js.native
    var ERROR_ARANGO_INVALID_KEY_GENERATOR: AnonCode = js.native
    var ERROR_ARANGO_IO_ERROR: AnonCode = js.native
    var ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL: AnonCode = js.native
    var ERROR_ARANGO_MERGE_IN_PROGRESS: AnonCode = js.native
    var ERROR_ARANGO_MMAP_FAILED: AnonCode = js.native
    var ERROR_ARANGO_MSYNC_FAILED: AnonCode = js.native
    var ERROR_ARANGO_NO_INDEX: AnonCode = js.native
    var ERROR_ARANGO_NO_JOURNAL: AnonCode = js.native
    var ERROR_ARANGO_OUT_OF_KEYS: AnonCode = js.native
    var ERROR_ARANGO_READ_ONLY: AnonCode = js.native
    var ERROR_ARANGO_RECOVERY: AnonCode = js.native
    var ERROR_ARANGO_SYNC_TIMEOUT: AnonCode = js.native
    var ERROR_ARANGO_TRY_AGAIN: AnonCode = js.native
    var ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED: AnonCode = js.native
    var ERROR_ARANGO_USE_SYSTEM_DATABASE: AnonCode = js.native
    var ERROR_ARANGO_VALIDATION_FAILED: AnonCode = js.native
    var ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT: AnonCode = js.native
    var ERROR_BAD_PARAMETER: AnonCode = js.native
    var ERROR_CANNOT_CREATE_DIRECTORY: AnonCode = js.native
    var ERROR_CANNOT_CREATE_TEMP_FILE: AnonCode = js.native
    var ERROR_CANNOT_DROP_SMART_COLLECTION: AnonCode = js.native
    var ERROR_CANNOT_OVERWRITE_FILE: AnonCode = js.native
    var ERROR_CANNOT_READ_FILE: AnonCode = js.native
    var ERROR_CANNOT_WRITE_FILE: AnonCode = js.native
    var ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED: AnonCode = js.native
    var ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID: AnonCode = js.native
    var ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC: AnonCode = js.native
    var ERROR_CLUSTER_AQL_COMMUNICATION: AnonCode = js.native
    var ERROR_CLUSTER_BACKEND_UNAVAILABLE: AnonCode = js.native
    var ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE: AnonCode = js.native
    var ERROR_CLUSTER_COLLECTION_ID_EXISTS: AnonCode = js.native
    var ERROR_CLUSTER_CONNECTION_LOST: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_DETERMINE_ID: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_LOCK_PLAN: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN: AnonCode = js.native
    var ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION: AnonCode = js.native
    var ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS: AnonCode = js.native
    var ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR: AnonCode = js.native
    var ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS: AnonCode = js.native
    var ERROR_CLUSTER_INSUFFICIENT_DBSERVERS: AnonCode = js.native
    var ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING: AnonCode = js.native
    var ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES: AnonCode = js.native
    var ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE: AnonCode = js.native
    var ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY: AnonCode = js.native
    var ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN: AnonCode = js.native
    var ERROR_CLUSTER_NOT_LEADER: AnonCode = js.native
    var ERROR_CLUSTER_NO_AGENCY: AnonCode = js.native
    var ERROR_CLUSTER_NO_COORDINATOR_HEADER: AnonCode = js.native
    var ERROR_CLUSTER_ONLY_ON_COORDINATOR: AnonCode = js.native
    var ERROR_CLUSTER_ONLY_ON_DBSERVER: AnonCode = js.native
    var ERROR_CLUSTER_READING_PLAN_AGENCY: AnonCode = js.native
    var ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION: AnonCode = js.native
    var ERROR_CLUSTER_SHARD_GONE: AnonCode = js.native
    var ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION: AnonCode = js.native
    var ERROR_CLUSTER_SHARD_LEADER_RESIGNED: AnonCode = js.native
    var ERROR_CLUSTER_TIMEOUT: AnonCode = js.native
    var ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT: AnonCode = js.native
    var ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE: AnonCode = js.native
    var ERROR_CLUSTER_UNSUPPORTED: AnonCode = js.native
    var ERROR_CORRUPTED_CSV: AnonCode = js.native
    var ERROR_CURSOR_BUSY: AnonCode = js.native
    var ERROR_CURSOR_NOT_FOUND: AnonCode = js.native
    var ERROR_DEADLOCK: AnonCode = js.native
    var ERROR_DEAD_PID: AnonCode = js.native
    var ERROR_DEBUG: AnonCode = js.native
    var ERROR_DISPATCHER_IS_STOPPING: AnonCode = js.native
    var ERROR_FAILED: AnonCode = js.native
    var ERROR_FILE_EXISTS: AnonCode = js.native
    var ERROR_FILE_NOT_FOUND: AnonCode = js.native
    var ERROR_FORBIDDEN: AnonCode = js.native
    var ERROR_GRAPH_COULD_NOT_CHANGE_EDGE: AnonCode = js.native
    var ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX: AnonCode = js.native
    var ERROR_GRAPH_COULD_NOT_CREATE_EDGE: AnonCode = js.native
    var ERROR_GRAPH_COULD_NOT_CREATE_GRAPH: AnonCode = js.native
    var ERROR_GRAPH_COULD_NOT_CREATE_VERTEX: AnonCode = js.native
    var ERROR_GRAPH_EMPTY: AnonCode = js.native
    var ERROR_GRAPH_INVALID_EDGE: AnonCode = js.native
    var ERROR_GRAPH_INVALID_FILTER_RESULT: AnonCode = js.native
    var ERROR_GRAPH_INVALID_GRAPH: AnonCode = js.native
    var ERROR_GRAPH_INVALID_VERTEX: AnonCode = js.native
    var ERROR_GRAPH_TOO_MANY_ITERATIONS: AnonCode = js.native
    var ERROR_HTTP_BAD_PARAMETER: AnonCode = js.native
    var ERROR_HTTP_CORRUPTED_JSON: AnonCode = js.native
    var ERROR_HTTP_FORBIDDEN: AnonCode = js.native
    var ERROR_HTTP_GATEWAY_TIMEOUT: AnonCode = js.native
    var ERROR_HTTP_METHOD_NOT_ALLOWED: AnonCode = js.native
    var ERROR_HTTP_NOT_ACCEPTABLE: AnonCode = js.native
    var ERROR_HTTP_NOT_FOUND: AnonCode = js.native
    var ERROR_HTTP_PRECONDITION_FAILED: AnonCode = js.native
    var ERROR_HTTP_SERVER_ERROR: AnonCode = js.native
    var ERROR_HTTP_SERVICE_UNAVAILABLE: AnonCode = js.native
    var ERROR_HTTP_SUPERFLUOUS_SUFFICES: AnonCode = js.native
    var ERROR_HTTP_UNAUTHORIZED: AnonCode = js.native
    var ERROR_ILLEGAL_NUMBER: AnonCode = js.native
    var ERROR_ILLEGAL_OPTION: AnonCode = js.native
    var ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE: AnonCode = js.native
    var ERROR_INTERNAL: AnonCode = js.native
    var ERROR_INVALID_FOXX_OPTIONS: AnonCode = js.native
    var ERROR_INVALID_MOUNTPOINT: AnonCode = js.native
    var ERROR_INVALID_SERVICE_MANIFEST: AnonCode = js.native
    var ERROR_IP_ADDRESS_INVALID: AnonCode = js.native
    var ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE: AnonCode = js.native
    var ERROR_LDAP_CANNOT_BIND: AnonCode = js.native
    var ERROR_LDAP_CANNOT_INIT: AnonCode = js.native
    var ERROR_LDAP_CANNOT_SEARCH: AnonCode = js.native
    var ERROR_LDAP_CANNOT_SET_OPTION: AnonCode = js.native
    var ERROR_LDAP_CANNOT_START_TLS: AnonCode = js.native
    var ERROR_LDAP_CANNOT_UNBIND: AnonCode = js.native
    var ERROR_LDAP_FOUND_NO_OBJECTS: AnonCode = js.native
    var ERROR_LDAP_INVALID_MODE: AnonCode = js.native
    var ERROR_LDAP_NOT_ONE_USER_FOUND: AnonCode = js.native
    var ERROR_LDAP_USER_NOT_IDENTIFIED: AnonCode = js.native
    var ERROR_LOCKED: AnonCode = js.native
    var ERROR_LOCK_TIMEOUT: AnonCode = js.native
    var ERROR_MALFORMED_MANIFEST_FILE: AnonCode = js.native
    var ERROR_MODULE_FAILURE: AnonCode = js.native
    var ERROR_MODULE_NOT_FOUND: AnonCode = js.native
    var ERROR_MODULE_SYNTAX_ERROR: AnonCode = js.native
    var ERROR_NOT_IMPLEMENTED: AnonCode = js.native
    var ERROR_NO_ERROR: AnonCode = js.native
    var ERROR_NO_SMART_COLLECTION: AnonCode = js.native
    var ERROR_NO_SMART_GRAPH_ATTRIBUTE: AnonCode = js.native
    var ERROR_NUMERIC_OVERFLOW: AnonCode = js.native
    var ERROR_ONLY_ENTERPRISE: AnonCode = js.native
    var ERROR_OUT_OF_MEMORY: AnonCode = js.native
    var ERROR_OUT_OF_MEMORY_MMAP: AnonCode = js.native
    var ERROR_QUERY_ACCESS_AFTER_MODIFICATION: AnonCode = js.native
    var ERROR_QUERY_ARRAY_EXPECTED: AnonCode = js.native
    var ERROR_QUERY_BAD_JSON_PLAN: AnonCode = js.native
    var ERROR_QUERY_BIND_PARAMETERS_INVALID: AnonCode = js.native
    var ERROR_QUERY_BIND_PARAMETER_MISSING: AnonCode = js.native
    var ERROR_QUERY_BIND_PARAMETER_TYPE: AnonCode = js.native
    var ERROR_QUERY_BIND_PARAMETER_UNDECLARED: AnonCode = js.native
    var ERROR_QUERY_COLLECTION_LOCK_FAILED: AnonCode = js.native
    var ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION: AnonCode = js.native
    var ERROR_QUERY_COMPILE_TIME_OPTIONS: AnonCode = js.native
    var ERROR_QUERY_DISALLOWED_DYNAMIC_CALL: AnonCode = js.native
    var ERROR_QUERY_DIVISION_BY_ZERO: AnonCode = js.native
    var ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED: AnonCode = js.native
    var ERROR_QUERY_EMPTY: AnonCode = js.native
    var ERROR_QUERY_EXCEPTION_OPTIONS: AnonCode = js.native
    var ERROR_QUERY_FAIL_CALLED: AnonCode = js.native
    var ERROR_QUERY_FULLTEXT_INDEX_MISSING: AnonCode = js.native
    var ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH: AnonCode = js.native
    var ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH: AnonCode = js.native
    var ERROR_QUERY_FUNCTION_INVALID_CODE: AnonCode = js.native
    var ERROR_QUERY_FUNCTION_INVALID_NAME: AnonCode = js.native
    var ERROR_QUERY_FUNCTION_NAME_UNKNOWN: AnonCode = js.native
    var ERROR_QUERY_FUNCTION_NOT_FOUND: AnonCode = js.native
    var ERROR_QUERY_FUNCTION_RUNTIME_ERROR: AnonCode = js.native
    var ERROR_QUERY_GEO_INDEX_MISSING: AnonCode = js.native
    var ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION: AnonCode = js.native
    var ERROR_QUERY_INVALID_ARITHMETIC_VALUE: AnonCode = js.native
    var ERROR_QUERY_INVALID_DATE_VALUE: AnonCode = js.native
    var ERROR_QUERY_INVALID_LOGICAL_VALUE: AnonCode = js.native
    var ERROR_QUERY_INVALID_REGEX: AnonCode = js.native
    var ERROR_QUERY_IN_USE: AnonCode = js.native
    var ERROR_QUERY_KILLED: AnonCode = js.native
    var ERROR_QUERY_MULTI_MODIFY: AnonCode = js.native
    var ERROR_QUERY_NOT_FOUND: AnonCode = js.native
    var ERROR_QUERY_NUMBER_OUT_OF_RANGE: AnonCode = js.native
    var ERROR_QUERY_PARSE: AnonCode = js.native
    var ERROR_QUERY_SCRIPT: AnonCode = js.native
    var ERROR_QUERY_TOO_MANY_COLLECTIONS: AnonCode = js.native
    var ERROR_QUERY_USER_ASSERT: AnonCode = js.native
    var ERROR_QUERY_USER_WARN: AnonCode = js.native
    var ERROR_QUERY_VARIABLE_NAME_INVALID: AnonCode = js.native
    var ERROR_QUERY_VARIABLE_NAME_UNKNOWN: AnonCode = js.native
    var ERROR_QUERY_VARIABLE_REDECLARED: AnonCode = js.native
    var ERROR_QUEUE_FULL: AnonCode = js.native
    var ERROR_QUEUE_UNKNOWN: AnonCode = js.native
    var ERROR_REPLICATION_APPLIER_STOPPED: AnonCode = js.native
    var ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION: AnonCode = js.native
    var ERROR_REPLICATION_INVALID_APPLIER_STATE: AnonCode = js.native
    var ERROR_REPLICATION_INVALID_RESPONSE: AnonCode = js.native
    var ERROR_REPLICATION_LOOP: AnonCode = js.native
    var ERROR_REPLICATION_MASTER_CHANGE: AnonCode = js.native
    var ERROR_REPLICATION_MASTER_ERROR: AnonCode = js.native
    var ERROR_REPLICATION_MASTER_INCOMPATIBLE: AnonCode = js.native
    var ERROR_REPLICATION_NO_RESPONSE: AnonCode = js.native
    var ERROR_REPLICATION_NO_START_TICK: AnonCode = js.native
    var ERROR_REPLICATION_RUNNING: AnonCode = js.native
    var ERROR_REPLICATION_SHARD_NONEMPTY: AnonCode = js.native
    var ERROR_REPLICATION_START_TICK_NOT_PRESENT: AnonCode = js.native
    var ERROR_REPLICATION_UNEXPECTED_MARKER: AnonCode = js.native
    var ERROR_REPLICATION_UNEXPECTED_TRANSACTION: AnonCode = js.native
    var ERROR_REPLICATION_WRONG_CHECKSUM: AnonCode = js.native
    var ERROR_REQUEST_CANCELED: AnonCode = js.native
    var ERROR_RESOURCE_LIMIT: AnonCode = js.native
    var ERROR_SERVICE_DOWNLOAD_FAILED: AnonCode = js.native
    var ERROR_SERVICE_FILES_MISSING: AnonCode = js.native
    var ERROR_SERVICE_FILES_OUTDATED: AnonCode = js.native
    var ERROR_SERVICE_INVALID_MOUNT: AnonCode = js.native
    var ERROR_SERVICE_INVALID_NAME: AnonCode = js.native
    var ERROR_SERVICE_MANIFEST_NOT_FOUND: AnonCode = js.native
    var ERROR_SERVICE_MOUNTPOINT_CONFLICT: AnonCode = js.native
    var ERROR_SERVICE_NEEDS_CONFIGURATION: AnonCode = js.native
    var ERROR_SERVICE_NOT_FOUND: AnonCode = js.native
    var ERROR_SERVICE_OPTIONS_MALFORMED: AnonCode = js.native
    var ERROR_SERVICE_SOURCE_ERROR: AnonCode = js.native
    var ERROR_SERVICE_SOURCE_NOT_FOUND: AnonCode = js.native
    var ERROR_SERVICE_UNKNOWN_SCRIPT: AnonCode = js.native
    var ERROR_SERVICE_UPLOAD_FAILED: AnonCode = js.native
    var ERROR_SESSION_EXPIRED: AnonCode = js.native
    var ERROR_SESSION_UNKNOWN: AnonCode = js.native
    var ERROR_SHUTTING_DOWN: AnonCode = js.native
    var ERROR_SUPERVISION_GENERAL_FAILURE: AnonCode = js.native
    var ERROR_SYS_ERROR: AnonCode = js.native
    var ERROR_TASK_DUPLICATE_ID: AnonCode = js.native
    var ERROR_TASK_INVALID_ID: AnonCode = js.native
    var ERROR_TASK_NOT_FOUND: AnonCode = js.native
    var ERROR_TRANSACTION_ABORTED: AnonCode = js.native
    var ERROR_TRANSACTION_DISALLOWED_OPERATION: AnonCode = js.native
    var ERROR_TRANSACTION_INTERNAL: AnonCode = js.native
    var ERROR_TRANSACTION_NESTED: AnonCode = js.native
    var ERROR_TRANSACTION_UNREGISTERED_COLLECTION: AnonCode = js.native
    var ERROR_TYPE_ERROR: AnonCode = js.native
    var ERROR_USER_CHANGE_PASSWORD: AnonCode = js.native
    var ERROR_USER_DUPLICATE: AnonCode = js.native
    var ERROR_USER_EXTERNAL: AnonCode = js.native
    var ERROR_USER_INVALID_NAME: AnonCode = js.native
    var ERROR_USER_INVALID_PASSWORD: AnonCode = js.native
    var ERROR_USER_NOT_FOUND: AnonCode = js.native
    var SIMPLE_CLIENT_COULD_NOT_CONNECT: AnonCode = js.native
    var SIMPLE_CLIENT_COULD_NOT_READ: AnonCode = js.native
    var SIMPLE_CLIENT_COULD_NOT_WRITE: AnonCode = js.native
    var SIMPLE_CLIENT_UNKNOWN_ERROR: AnonCode = js.native
  }
  
}

