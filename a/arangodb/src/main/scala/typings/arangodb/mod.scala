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
import typings.arangodb.anon.Code
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
    def join(values: js.Array[_]): Query = js.native
    def join(values: js.Array[_], sep: String): Query = js.native
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
    def _createDatabase(name: String, options: js.UndefOr[scala.Nothing], users: js.Array[DatabaseUser]): `true` = js.native
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
    def _query(query: String, bindVars: js.UndefOr[scala.Nothing], options: QueryOptions): Cursor[_] = js.native
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
    var COMMUNICATOR_DISABLED: Code = js.native
    var COMMUNICATOR_REQUEST_ABORTED: Code = js.native
    var ERROR_AGENCY_CANNOT_REBUILD_DBS: Code = js.native
    var ERROR_AGENCY_INFORM_MUST_BE_OBJECT: Code = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE: Code = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_ID: Code = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING: Code = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING: Code = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL: Code = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM: Code = js.native
    var ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT: Code = js.native
    var ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING: Code = js.native
    var ERROR_AGENCY_INQUIRY_SYNTAX: Code = js.native
    var ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED: Code = js.native
    var ERROR_ARANGO_BUSY: Code = js.native
    var ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS: Code = js.native
    var ERROR_ARANGO_COLLECTION_NOT_LOADED: Code = js.native
    var ERROR_ARANGO_COLLECTION_NOT_UNLOADED: Code = js.native
    var ERROR_ARANGO_COLLECTION_PARAMETER_MISSING: Code = js.native
    var ERROR_ARANGO_COLLECTION_TYPE_INVALID: Code = js.native
    var ERROR_ARANGO_COLLECTION_TYPE_MISMATCH: Code = js.native
    var ERROR_ARANGO_CONFLICT: Code = js.native
    var ERROR_ARANGO_CORRUPTED_COLLECTION: Code = js.native
    var ERROR_ARANGO_CORRUPTED_DATAFILE: Code = js.native
    var ERROR_ARANGO_CROSS_COLLECTION_REQUEST: Code = js.native
    var ERROR_ARANGO_DATABASE_NAME_INVALID: Code = js.native
    var ERROR_ARANGO_DATABASE_NOT_FOUND: Code = js.native
    var ERROR_ARANGO_DATADIR_INVALID: Code = js.native
    var ERROR_ARANGO_DATADIR_LOCKED: Code = js.native
    var ERROR_ARANGO_DATADIR_NOT_WRITABLE: Code = js.native
    var ERROR_ARANGO_DATADIR_UNLOCKABLE: Code = js.native
    var ERROR_ARANGO_DATAFILE_ALREADY_EXISTS: Code = js.native
    var ERROR_ARANGO_DATAFILE_EMPTY: Code = js.native
    var ERROR_ARANGO_DATAFILE_FULL: Code = js.native
    var ERROR_ARANGO_DATAFILE_SEALED: Code = js.native
    var ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND: Code = js.native
    var ERROR_ARANGO_DATAFILE_UNREADABLE: Code = js.native
    var ERROR_ARANGO_DATA_SOURCE_NOT_FOUND: Code = js.native
    var ERROR_ARANGO_DOCUMENT_HANDLE_BAD: Code = js.native
    var ERROR_ARANGO_DOCUMENT_KEY_BAD: Code = js.native
    var ERROR_ARANGO_DOCUMENT_KEY_MISSING: Code = js.native
    var ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED: Code = js.native
    var ERROR_ARANGO_DOCUMENT_NOT_FOUND: Code = js.native
    var ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED: Code = js.native
    var ERROR_ARANGO_DOCUMENT_REV_BAD: Code = js.native
    var ERROR_ARANGO_DOCUMENT_TOO_LARGE: Code = js.native
    var ERROR_ARANGO_DOCUMENT_TYPE_INVALID: Code = js.native
    var ERROR_ARANGO_DUPLICATE_IDENTIFIER: Code = js.native
    var ERROR_ARANGO_DUPLICATE_NAME: Code = js.native
    var ERROR_ARANGO_EMPTY_DATADIR: Code = js.native
    var ERROR_ARANGO_ENDPOINT_NOT_FOUND: Code = js.native
    var ERROR_ARANGO_FILESYSTEM_FULL: Code = js.native
    var ERROR_ARANGO_ICU_ERROR: Code = js.native
    var ERROR_ARANGO_ILLEGAL_NAME: Code = js.native
    var ERROR_ARANGO_ILLEGAL_PARAMETER_FILE: Code = js.native
    var ERROR_ARANGO_ILLEGAL_STATE: Code = js.native
    var ERROR_ARANGO_INDEX_CREATION_FAILED: Code = js.native
    var ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING: Code = js.native
    var ERROR_ARANGO_INDEX_HANDLE_BAD: Code = js.native
    var ERROR_ARANGO_INDEX_NOT_FOUND: Code = js.native
    var ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE: Code = js.native
    var ERROR_ARANGO_INVALID_KEY_GENERATOR: Code = js.native
    var ERROR_ARANGO_IO_ERROR: Code = js.native
    var ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL: Code = js.native
    var ERROR_ARANGO_MERGE_IN_PROGRESS: Code = js.native
    var ERROR_ARANGO_MMAP_FAILED: Code = js.native
    var ERROR_ARANGO_MSYNC_FAILED: Code = js.native
    var ERROR_ARANGO_NO_INDEX: Code = js.native
    var ERROR_ARANGO_NO_JOURNAL: Code = js.native
    var ERROR_ARANGO_OUT_OF_KEYS: Code = js.native
    var ERROR_ARANGO_READ_ONLY: Code = js.native
    var ERROR_ARANGO_RECOVERY: Code = js.native
    var ERROR_ARANGO_SYNC_TIMEOUT: Code = js.native
    var ERROR_ARANGO_TRY_AGAIN: Code = js.native
    var ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED: Code = js.native
    var ERROR_ARANGO_USE_SYSTEM_DATABASE: Code = js.native
    var ERROR_ARANGO_VALIDATION_FAILED: Code = js.native
    var ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT: Code = js.native
    var ERROR_BAD_PARAMETER: Code = js.native
    var ERROR_CANNOT_CREATE_DIRECTORY: Code = js.native
    var ERROR_CANNOT_CREATE_TEMP_FILE: Code = js.native
    var ERROR_CANNOT_DROP_SMART_COLLECTION: Code = js.native
    var ERROR_CANNOT_OVERWRITE_FILE: Code = js.native
    var ERROR_CANNOT_READ_FILE: Code = js.native
    var ERROR_CANNOT_WRITE_FILE: Code = js.native
    var ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED: Code = js.native
    var ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID: Code = js.native
    var ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC: Code = js.native
    var ERROR_CLUSTER_AQL_COMMUNICATION: Code = js.native
    var ERROR_CLUSTER_BACKEND_UNAVAILABLE: Code = js.native
    var ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE: Code = js.native
    var ERROR_CLUSTER_COLLECTION_ID_EXISTS: Code = js.native
    var ERROR_CLUSTER_CONNECTION_LOST: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_DETERMINE_ID: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_LOCK_PLAN: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN: Code = js.native
    var ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION: Code = js.native
    var ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS: Code = js.native
    var ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR: Code = js.native
    var ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS: Code = js.native
    var ERROR_CLUSTER_INSUFFICIENT_DBSERVERS: Code = js.native
    var ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING: Code = js.native
    var ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES: Code = js.native
    var ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE: Code = js.native
    var ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY: Code = js.native
    var ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN: Code = js.native
    var ERROR_CLUSTER_NOT_LEADER: Code = js.native
    var ERROR_CLUSTER_NO_AGENCY: Code = js.native
    var ERROR_CLUSTER_NO_COORDINATOR_HEADER: Code = js.native
    var ERROR_CLUSTER_ONLY_ON_COORDINATOR: Code = js.native
    var ERROR_CLUSTER_ONLY_ON_DBSERVER: Code = js.native
    var ERROR_CLUSTER_READING_PLAN_AGENCY: Code = js.native
    var ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION: Code = js.native
    var ERROR_CLUSTER_SHARD_GONE: Code = js.native
    var ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION: Code = js.native
    var ERROR_CLUSTER_SHARD_LEADER_RESIGNED: Code = js.native
    var ERROR_CLUSTER_TIMEOUT: Code = js.native
    var ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT: Code = js.native
    var ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE: Code = js.native
    var ERROR_CLUSTER_UNSUPPORTED: Code = js.native
    var ERROR_CORRUPTED_CSV: Code = js.native
    var ERROR_CURSOR_BUSY: Code = js.native
    var ERROR_CURSOR_NOT_FOUND: Code = js.native
    var ERROR_DEADLOCK: Code = js.native
    var ERROR_DEAD_PID: Code = js.native
    var ERROR_DEBUG: Code = js.native
    var ERROR_DISPATCHER_IS_STOPPING: Code = js.native
    var ERROR_FAILED: Code = js.native
    var ERROR_FILE_EXISTS: Code = js.native
    var ERROR_FILE_NOT_FOUND: Code = js.native
    var ERROR_FORBIDDEN: Code = js.native
    var ERROR_GRAPH_COULD_NOT_CHANGE_EDGE: Code = js.native
    var ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX: Code = js.native
    var ERROR_GRAPH_COULD_NOT_CREATE_EDGE: Code = js.native
    var ERROR_GRAPH_COULD_NOT_CREATE_GRAPH: Code = js.native
    var ERROR_GRAPH_COULD_NOT_CREATE_VERTEX: Code = js.native
    var ERROR_GRAPH_EMPTY: Code = js.native
    var ERROR_GRAPH_INVALID_EDGE: Code = js.native
    var ERROR_GRAPH_INVALID_FILTER_RESULT: Code = js.native
    var ERROR_GRAPH_INVALID_GRAPH: Code = js.native
    var ERROR_GRAPH_INVALID_VERTEX: Code = js.native
    var ERROR_GRAPH_TOO_MANY_ITERATIONS: Code = js.native
    var ERROR_HTTP_BAD_PARAMETER: Code = js.native
    var ERROR_HTTP_CORRUPTED_JSON: Code = js.native
    var ERROR_HTTP_FORBIDDEN: Code = js.native
    var ERROR_HTTP_GATEWAY_TIMEOUT: Code = js.native
    var ERROR_HTTP_METHOD_NOT_ALLOWED: Code = js.native
    var ERROR_HTTP_NOT_ACCEPTABLE: Code = js.native
    var ERROR_HTTP_NOT_FOUND: Code = js.native
    var ERROR_HTTP_PRECONDITION_FAILED: Code = js.native
    var ERROR_HTTP_SERVER_ERROR: Code = js.native
    var ERROR_HTTP_SERVICE_UNAVAILABLE: Code = js.native
    var ERROR_HTTP_SUPERFLUOUS_SUFFICES: Code = js.native
    var ERROR_HTTP_UNAUTHORIZED: Code = js.native
    var ERROR_ILLEGAL_NUMBER: Code = js.native
    var ERROR_ILLEGAL_OPTION: Code = js.native
    var ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE: Code = js.native
    var ERROR_INTERNAL: Code = js.native
    var ERROR_INVALID_FOXX_OPTIONS: Code = js.native
    var ERROR_INVALID_MOUNTPOINT: Code = js.native
    var ERROR_INVALID_SERVICE_MANIFEST: Code = js.native
    var ERROR_IP_ADDRESS_INVALID: Code = js.native
    var ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE: Code = js.native
    var ERROR_LDAP_CANNOT_BIND: Code = js.native
    var ERROR_LDAP_CANNOT_INIT: Code = js.native
    var ERROR_LDAP_CANNOT_SEARCH: Code = js.native
    var ERROR_LDAP_CANNOT_SET_OPTION: Code = js.native
    var ERROR_LDAP_CANNOT_START_TLS: Code = js.native
    var ERROR_LDAP_CANNOT_UNBIND: Code = js.native
    var ERROR_LDAP_FOUND_NO_OBJECTS: Code = js.native
    var ERROR_LDAP_INVALID_MODE: Code = js.native
    var ERROR_LDAP_NOT_ONE_USER_FOUND: Code = js.native
    var ERROR_LDAP_USER_NOT_IDENTIFIED: Code = js.native
    var ERROR_LOCKED: Code = js.native
    var ERROR_LOCK_TIMEOUT: Code = js.native
    var ERROR_MALFORMED_MANIFEST_FILE: Code = js.native
    var ERROR_MODULE_FAILURE: Code = js.native
    var ERROR_MODULE_NOT_FOUND: Code = js.native
    var ERROR_MODULE_SYNTAX_ERROR: Code = js.native
    var ERROR_NOT_IMPLEMENTED: Code = js.native
    var ERROR_NO_ERROR: Code = js.native
    var ERROR_NO_SMART_COLLECTION: Code = js.native
    var ERROR_NO_SMART_GRAPH_ATTRIBUTE: Code = js.native
    var ERROR_NUMERIC_OVERFLOW: Code = js.native
    var ERROR_ONLY_ENTERPRISE: Code = js.native
    var ERROR_OUT_OF_MEMORY: Code = js.native
    var ERROR_OUT_OF_MEMORY_MMAP: Code = js.native
    var ERROR_QUERY_ACCESS_AFTER_MODIFICATION: Code = js.native
    var ERROR_QUERY_ARRAY_EXPECTED: Code = js.native
    var ERROR_QUERY_BAD_JSON_PLAN: Code = js.native
    var ERROR_QUERY_BIND_PARAMETERS_INVALID: Code = js.native
    var ERROR_QUERY_BIND_PARAMETER_MISSING: Code = js.native
    var ERROR_QUERY_BIND_PARAMETER_TYPE: Code = js.native
    var ERROR_QUERY_BIND_PARAMETER_UNDECLARED: Code = js.native
    var ERROR_QUERY_COLLECTION_LOCK_FAILED: Code = js.native
    var ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION: Code = js.native
    var ERROR_QUERY_COMPILE_TIME_OPTIONS: Code = js.native
    var ERROR_QUERY_DISALLOWED_DYNAMIC_CALL: Code = js.native
    var ERROR_QUERY_DIVISION_BY_ZERO: Code = js.native
    var ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED: Code = js.native
    var ERROR_QUERY_EMPTY: Code = js.native
    var ERROR_QUERY_EXCEPTION_OPTIONS: Code = js.native
    var ERROR_QUERY_FAIL_CALLED: Code = js.native
    var ERROR_QUERY_FULLTEXT_INDEX_MISSING: Code = js.native
    var ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH: Code = js.native
    var ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH: Code = js.native
    var ERROR_QUERY_FUNCTION_INVALID_CODE: Code = js.native
    var ERROR_QUERY_FUNCTION_INVALID_NAME: Code = js.native
    var ERROR_QUERY_FUNCTION_NAME_UNKNOWN: Code = js.native
    var ERROR_QUERY_FUNCTION_NOT_FOUND: Code = js.native
    var ERROR_QUERY_FUNCTION_RUNTIME_ERROR: Code = js.native
    var ERROR_QUERY_GEO_INDEX_MISSING: Code = js.native
    var ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION: Code = js.native
    var ERROR_QUERY_INVALID_ARITHMETIC_VALUE: Code = js.native
    var ERROR_QUERY_INVALID_DATE_VALUE: Code = js.native
    var ERROR_QUERY_INVALID_LOGICAL_VALUE: Code = js.native
    var ERROR_QUERY_INVALID_REGEX: Code = js.native
    var ERROR_QUERY_IN_USE: Code = js.native
    var ERROR_QUERY_KILLED: Code = js.native
    var ERROR_QUERY_MULTI_MODIFY: Code = js.native
    var ERROR_QUERY_NOT_FOUND: Code = js.native
    var ERROR_QUERY_NUMBER_OUT_OF_RANGE: Code = js.native
    var ERROR_QUERY_PARSE: Code = js.native
    var ERROR_QUERY_SCRIPT: Code = js.native
    var ERROR_QUERY_TOO_MANY_COLLECTIONS: Code = js.native
    var ERROR_QUERY_USER_ASSERT: Code = js.native
    var ERROR_QUERY_USER_WARN: Code = js.native
    var ERROR_QUERY_VARIABLE_NAME_INVALID: Code = js.native
    var ERROR_QUERY_VARIABLE_NAME_UNKNOWN: Code = js.native
    var ERROR_QUERY_VARIABLE_REDECLARED: Code = js.native
    var ERROR_QUEUE_FULL: Code = js.native
    var ERROR_QUEUE_UNKNOWN: Code = js.native
    var ERROR_REPLICATION_APPLIER_STOPPED: Code = js.native
    var ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION: Code = js.native
    var ERROR_REPLICATION_INVALID_APPLIER_STATE: Code = js.native
    var ERROR_REPLICATION_INVALID_RESPONSE: Code = js.native
    var ERROR_REPLICATION_LOOP: Code = js.native
    var ERROR_REPLICATION_MASTER_CHANGE: Code = js.native
    var ERROR_REPLICATION_MASTER_ERROR: Code = js.native
    var ERROR_REPLICATION_MASTER_INCOMPATIBLE: Code = js.native
    var ERROR_REPLICATION_NO_RESPONSE: Code = js.native
    var ERROR_REPLICATION_NO_START_TICK: Code = js.native
    var ERROR_REPLICATION_RUNNING: Code = js.native
    var ERROR_REPLICATION_SHARD_NONEMPTY: Code = js.native
    var ERROR_REPLICATION_START_TICK_NOT_PRESENT: Code = js.native
    var ERROR_REPLICATION_UNEXPECTED_MARKER: Code = js.native
    var ERROR_REPLICATION_UNEXPECTED_TRANSACTION: Code = js.native
    var ERROR_REPLICATION_WRONG_CHECKSUM: Code = js.native
    var ERROR_REQUEST_CANCELED: Code = js.native
    var ERROR_RESOURCE_LIMIT: Code = js.native
    var ERROR_SERVICE_DOWNLOAD_FAILED: Code = js.native
    var ERROR_SERVICE_FILES_MISSING: Code = js.native
    var ERROR_SERVICE_FILES_OUTDATED: Code = js.native
    var ERROR_SERVICE_INVALID_MOUNT: Code = js.native
    var ERROR_SERVICE_INVALID_NAME: Code = js.native
    var ERROR_SERVICE_MANIFEST_NOT_FOUND: Code = js.native
    var ERROR_SERVICE_MOUNTPOINT_CONFLICT: Code = js.native
    var ERROR_SERVICE_NEEDS_CONFIGURATION: Code = js.native
    var ERROR_SERVICE_NOT_FOUND: Code = js.native
    var ERROR_SERVICE_OPTIONS_MALFORMED: Code = js.native
    var ERROR_SERVICE_SOURCE_ERROR: Code = js.native
    var ERROR_SERVICE_SOURCE_NOT_FOUND: Code = js.native
    var ERROR_SERVICE_UNKNOWN_SCRIPT: Code = js.native
    var ERROR_SERVICE_UPLOAD_FAILED: Code = js.native
    var ERROR_SESSION_EXPIRED: Code = js.native
    var ERROR_SESSION_UNKNOWN: Code = js.native
    var ERROR_SHUTTING_DOWN: Code = js.native
    var ERROR_SUPERVISION_GENERAL_FAILURE: Code = js.native
    var ERROR_SYS_ERROR: Code = js.native
    var ERROR_TASK_DUPLICATE_ID: Code = js.native
    var ERROR_TASK_INVALID_ID: Code = js.native
    var ERROR_TASK_NOT_FOUND: Code = js.native
    var ERROR_TRANSACTION_ABORTED: Code = js.native
    var ERROR_TRANSACTION_DISALLOWED_OPERATION: Code = js.native
    var ERROR_TRANSACTION_INTERNAL: Code = js.native
    var ERROR_TRANSACTION_NESTED: Code = js.native
    var ERROR_TRANSACTION_UNREGISTERED_COLLECTION: Code = js.native
    var ERROR_TYPE_ERROR: Code = js.native
    var ERROR_USER_CHANGE_PASSWORD: Code = js.native
    var ERROR_USER_DUPLICATE: Code = js.native
    var ERROR_USER_EXTERNAL: Code = js.native
    var ERROR_USER_INVALID_NAME: Code = js.native
    var ERROR_USER_INVALID_PASSWORD: Code = js.native
    var ERROR_USER_NOT_FOUND: Code = js.native
    var SIMPLE_CLIENT_COULD_NOT_CONNECT: Code = js.native
    var SIMPLE_CLIENT_COULD_NOT_READ: Code = js.native
    var SIMPLE_CLIENT_COULD_NOT_WRITE: Code = js.native
    var SIMPLE_CLIENT_UNKNOWN_ERROR: Code = js.native
  }
  
}

