package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.ERROR_NO_ERROR
  - typings.arangodb.arangodbStrings.ERROR_FAILED
  - typings.arangodb.arangodbStrings.ERROR_SYS_ERROR
  - typings.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY
  - typings.arangodb.arangodbStrings.ERROR_INTERNAL
  - typings.arangodb.arangodbStrings.ERROR_ILLEGAL_NUMBER
  - typings.arangodb.arangodbStrings.ERROR_NUMERIC_OVERFLOW
  - typings.arangodb.arangodbStrings.ERROR_ILLEGAL_OPTION
  - typings.arangodb.arangodbStrings.ERROR_DEAD_PID
  - typings.arangodb.arangodbStrings.ERROR_NOT_IMPLEMENTED
  - typings.arangodb.arangodbStrings.ERROR_BAD_PARAMETER
  - typings.arangodb.arangodbStrings.ERROR_FORBIDDEN
  - typings.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY_MMAP
  - typings.arangodb.arangodbStrings.ERROR_CORRUPTED_CSV
  - typings.arangodb.arangodbStrings.ERROR_FILE_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_CANNOT_WRITE_FILE
  - typings.arangodb.arangodbStrings.ERROR_CANNOT_OVERWRITE_FILE
  - typings.arangodb.arangodbStrings.ERROR_TYPE_ERROR
  - typings.arangodb.arangodbStrings.ERROR_LOCK_TIMEOUT
  - typings.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_DIRECTORY
  - typings.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_TEMP_FILE
  - typings.arangodb.arangodbStrings.ERROR_REQUEST_CANCELED
  - typings.arangodb.arangodbStrings.ERROR_DEBUG
  - typings.arangodb.arangodbStrings.ERROR_IP_ADDRESS_INVALID
  - typings.arangodb.arangodbStrings.ERROR_FILE_EXISTS
  - typings.arangodb.arangodbStrings.ERROR_LOCKED
  - typings.arangodb.arangodbStrings.ERROR_DEADLOCK
  - typings.arangodb.arangodbStrings.ERROR_SHUTTING_DOWN
  - typings.arangodb.arangodbStrings.ERROR_ONLY_ENTERPRISE
  - typings.arangodb.arangodbStrings.ERROR_RESOURCE_LIMIT
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_ICU_ERROR
  - typings.arangodb.arangodbStrings.ERROR_CANNOT_READ_FILE
  - typings.arangodb.arangodbStrings.ERROR_HTTP_BAD_PARAMETER
  - typings.arangodb.arangodbStrings.ERROR_HTTP_UNAUTHORIZED
  - typings.arangodb.arangodbStrings.ERROR_HTTP_FORBIDDEN
  - typings.arangodb.arangodbStrings.ERROR_HTTP_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_HTTP_METHOD_NOT_ALLOWED
  - typings.arangodb.arangodbStrings.ERROR_HTTP_NOT_ACCEPTABLE
  - typings.arangodb.arangodbStrings.ERROR_HTTP_PRECONDITION_FAILED
  - typings.arangodb.arangodbStrings.ERROR_HTTP_SERVER_ERROR
  - typings.arangodb.arangodbStrings.ERROR_HTTP_SERVICE_UNAVAILABLE
  - typings.arangodb.arangodbStrings.ERROR_HTTP_GATEWAY_TIMEOUT
  - typings.arangodb.arangodbStrings.ERROR_HTTP_CORRUPTED_JSON
  - typings.arangodb.arangodbStrings.ERROR_HTTP_SUPERFLUOUS_SUFFICES
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_STATE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_SEALED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_READ_ONLY
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_IDENTIFIER
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_UNREADABLE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_EMPTY
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_RECOVERY
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_DATAFILE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_COLLECTION
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_MMAP_FAILED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_FILESYSTEM_FULL
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_NO_JOURNAL
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_LOCKED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_MSYNC_FAILED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_UNLOCKABLE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_SYNC_TIMEOUT
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_CONFLICT
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_INVALID
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_HANDLE_BAD
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_NAME
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_NAME
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_NO_INDEX
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_CROSS_COLLECTION_REQUEST
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_HANDLE_BAD
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TOO_LARGE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_UNLOADED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_INVALID
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_VALIDATION_FAILED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_BAD
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_NOT_WRITABLE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_OUT_OF_KEYS
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_MISSING
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TYPE_INVALID
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NAME_INVALID
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_USE_SYSTEM_DATABASE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_ENDPOINT_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_KEY_GENERATOR
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_CREATION_FAILED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_LOADED
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_REV_BAD
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_FULL
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_EMPTY_DATADIR
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_TRY_AGAIN
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_BUSY
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_MERGE_IN_PROGRESS
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_IO_ERROR
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_NO_RESPONSE
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_RESPONSE
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_ERROR
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_INCOMPATIBLE
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_CHANGE
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_LOOP
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_MARKER
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_STATE
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_TRANSACTION
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_RUNNING
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_APPLIER_STOPPED
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_NO_START_TICK
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_START_TICK_NOT_PRESENT
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_WRONG_CHECKSUM
  - typings.arangodb.arangodbStrings.ERROR_REPLICATION_SHARD_NONEMPTY
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_NO_AGENCY
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_NO_COORDINATOR_HEADER
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COLLECTION_ID_EXISTS
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_TIMEOUT
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_GONE
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_CONNECTION_LOST
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNSUPPORTED
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_COORDINATOR
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_READING_PLAN_AGENCY
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COMMUNICATION
  - typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_DBSERVER
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_BACKEND_UNAVAILABLE
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_RESIGNED
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_LEADER
  - typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN
  - typings.arangodb.arangodbStrings.ERROR_QUERY_KILLED
  - typings.arangodb.arangodbStrings.ERROR_QUERY_PARSE
  - typings.arangodb.arangodbStrings.ERROR_QUERY_EMPTY
  - typings.arangodb.arangodbStrings.ERROR_QUERY_SCRIPT
  - typings.arangodb.arangodbStrings.ERROR_QUERY_NUMBER_OUT_OF_RANGE
  - typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_INVALID
  - typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_REDECLARED
  - typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_UNKNOWN
  - typings.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_LOCK_FAILED
  - typings.arangodb.arangodbStrings.ERROR_QUERY_TOO_MANY_COLLECTIONS
  - typings.arangodb.arangodbStrings.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NAME_UNKNOWN
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH
  - typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_REGEX
  - typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETERS_INVALID
  - typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_MISSING
  - typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_UNDECLARED
  - typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_TYPE
  - typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_LOGICAL_VALUE
  - typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_ARITHMETIC_VALUE
  - typings.arangodb.arangodbStrings.ERROR_QUERY_DIVISION_BY_ZERO
  - typings.arangodb.arangodbStrings.ERROR_QUERY_ARRAY_EXPECTED
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FAIL_CALLED
  - typings.arangodb.arangodbStrings.ERROR_QUERY_GEO_INDEX_MISSING
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FULLTEXT_INDEX_MISSING
  - typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_DATE_VALUE
  - typings.arangodb.arangodbStrings.ERROR_QUERY_MULTI_MODIFY
  - typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION
  - typings.arangodb.arangodbStrings.ERROR_QUERY_COMPILE_TIME_OPTIONS
  - typings.arangodb.arangodbStrings.ERROR_QUERY_EXCEPTION_OPTIONS
  - typings.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION
  - typings.arangodb.arangodbStrings.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL
  - typings.arangodb.arangodbStrings.ERROR_QUERY_ACCESS_AFTER_MODIFICATION
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_NAME
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_CODE
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_RUNTIME_ERROR
  - typings.arangodb.arangodbStrings.ERROR_QUERY_BAD_JSON_PLAN
  - typings.arangodb.arangodbStrings.ERROR_QUERY_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_QUERY_IN_USE
  - typings.arangodb.arangodbStrings.ERROR_QUERY_USER_ASSERT
  - typings.arangodb.arangodbStrings.ERROR_QUERY_USER_WARN
  - typings.arangodb.arangodbStrings.ERROR_CURSOR_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_CURSOR_BUSY
  - typings.arangodb.arangodbStrings.ERROR_TRANSACTION_INTERNAL
  - typings.arangodb.arangodbStrings.ERROR_TRANSACTION_NESTED
  - typings.arangodb.arangodbStrings.ERROR_TRANSACTION_UNREGISTERED_COLLECTION
  - typings.arangodb.arangodbStrings.ERROR_TRANSACTION_DISALLOWED_OPERATION
  - typings.arangodb.arangodbStrings.ERROR_TRANSACTION_ABORTED
  - typings.arangodb.arangodbStrings.ERROR_USER_INVALID_NAME
  - typings.arangodb.arangodbStrings.ERROR_USER_INVALID_PASSWORD
  - typings.arangodb.arangodbStrings.ERROR_USER_DUPLICATE
  - typings.arangodb.arangodbStrings.ERROR_USER_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_USER_CHANGE_PASSWORD
  - typings.arangodb.arangodbStrings.ERROR_USER_EXTERNAL
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_NAME
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_MOUNT
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_DOWNLOAD_FAILED
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_UPLOAD_FAILED
  - typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_INIT
  - typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SET_OPTION
  - typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_BIND
  - typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_UNBIND
  - typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SEARCH
  - typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_START_TLS
  - typings.arangodb.arangodbStrings.ERROR_LDAP_FOUND_NO_OBJECTS
  - typings.arangodb.arangodbStrings.ERROR_LDAP_NOT_ONE_USER_FOUND
  - typings.arangodb.arangodbStrings.ERROR_LDAP_USER_NOT_IDENTIFIED
  - typings.arangodb.arangodbStrings.ERROR_LDAP_INVALID_MODE
  - typings.arangodb.arangodbStrings.ERROR_TASK_INVALID_ID
  - typings.arangodb.arangodbStrings.ERROR_TASK_DUPLICATE_ID
  - typings.arangodb.arangodbStrings.ERROR_TASK_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_GRAPH
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_VERTEX
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_EDGE
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_EDGE
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_TOO_MANY_ITERATIONS
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_FILTER_RESULT
  - typings.arangodb.arangodbStrings.ERROR_GRAPH_EMPTY
  - typings.arangodb.arangodbStrings.ERROR_SESSION_UNKNOWN
  - typings.arangodb.arangodbStrings.ERROR_SESSION_EXPIRED
  - typings.arangodb.arangodbStrings.SIMPLE_CLIENT_UNKNOWN_ERROR
  - typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_CONNECT
  - typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_WRITE
  - typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_READ
  - typings.arangodb.arangodbStrings.COMMUNICATOR_REQUEST_ABORTED
  - typings.arangodb.arangodbStrings.COMMUNICATOR_DISABLED
  - typings.arangodb.arangodbStrings.ERROR_MALFORMED_MANIFEST_FILE
  - typings.arangodb.arangodbStrings.ERROR_INVALID_SERVICE_MANIFEST
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_FILES_MISSING
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_FILES_OUTDATED
  - typings.arangodb.arangodbStrings.ERROR_INVALID_FOXX_OPTIONS
  - typings.arangodb.arangodbStrings.ERROR_INVALID_MOUNTPOINT
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_NEEDS_CONFIGURATION
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_MOUNTPOINT_CONFLICT
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_MANIFEST_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_OPTIONS_MALFORMED
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_ERROR
  - typings.arangodb.arangodbStrings.ERROR_SERVICE_UNKNOWN_SCRIPT
  - typings.arangodb.arangodbStrings.ERROR_MODULE_NOT_FOUND
  - typings.arangodb.arangodbStrings.ERROR_MODULE_SYNTAX_ERROR
  - typings.arangodb.arangodbStrings.ERROR_MODULE_FAILURE
  - typings.arangodb.arangodbStrings.ERROR_NO_SMART_COLLECTION
  - typings.arangodb.arangodbStrings.ERROR_NO_SMART_GRAPH_ATTRIBUTE
  - typings.arangodb.arangodbStrings.ERROR_CANNOT_DROP_SMART_COLLECTION
  - typings.arangodb.arangodbStrings.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE
  - typings.arangodb.arangodbStrings.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRY_SYNTAX
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_BE_OBJECT
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING
  - typings.arangodb.arangodbStrings.ERROR_AGENCY_CANNOT_REBUILD_DBS
  - typings.arangodb.arangodbStrings.ERROR_SUPERVISION_GENERAL_FAILURE
  - typings.arangodb.arangodbStrings.ERROR_DISPATCHER_IS_STOPPING
  - typings.arangodb.arangodbStrings.ERROR_QUEUE_UNKNOWN
  - typings.arangodb.arangodbStrings.ERROR_QUEUE_FULL
*/
trait ErrorName extends StObject
object ErrorName {
  
  @scala.inline
  def COMMUNICATOR_DISABLED: typings.arangodb.arangodbStrings.COMMUNICATOR_DISABLED = "COMMUNICATOR_DISABLED".asInstanceOf[typings.arangodb.arangodbStrings.COMMUNICATOR_DISABLED]
  
  @scala.inline
  def COMMUNICATOR_REQUEST_ABORTED: typings.arangodb.arangodbStrings.COMMUNICATOR_REQUEST_ABORTED = "COMMUNICATOR_REQUEST_ABORTED".asInstanceOf[typings.arangodb.arangodbStrings.COMMUNICATOR_REQUEST_ABORTED]
  
  @scala.inline
  def ERROR_AGENCY_CANNOT_REBUILD_DBS: typings.arangodb.arangodbStrings.ERROR_AGENCY_CANNOT_REBUILD_DBS = "ERROR_AGENCY_CANNOT_REBUILD_DBS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_CANNOT_REBUILD_DBS]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_BE_OBJECT: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_BE_OBJECT = "ERROR_AGENCY_INFORM_MUST_BE_OBJECT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_BE_OBJECT]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE = "ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ID: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID = "ERROR_AGENCY_INFORM_MUST_CONTAIN_ID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING = "ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING = "ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL = "ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM = "ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT = "ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT]
  
  @scala.inline
  def ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING: typings.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING = "ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING]
  
  @scala.inline
  def ERROR_AGENCY_INQUIRY_SYNTAX: typings.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRY_SYNTAX = "ERROR_AGENCY_INQUIRY_SYNTAX".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRY_SYNTAX]
  
  @scala.inline
  def ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED = "ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_BUSY: typings.arangodb.arangodbStrings.ERROR_ARANGO_BUSY = "ERROR_ARANGO_BUSY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_BUSY]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS = "ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_LOADED: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_LOADED = "ERROR_ARANGO_COLLECTION_NOT_LOADED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_LOADED]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_UNLOADED: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_UNLOADED = "ERROR_ARANGO_COLLECTION_NOT_UNLOADED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_UNLOADED]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_PARAMETER_MISSING: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING = "ERROR_ARANGO_COLLECTION_PARAMETER_MISSING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_INVALID: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_INVALID = "ERROR_ARANGO_COLLECTION_TYPE_INVALID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_INVALID]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_MISMATCH: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH = "ERROR_ARANGO_COLLECTION_TYPE_MISMATCH".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH]
  
  @scala.inline
  def ERROR_ARANGO_CONFLICT: typings.arangodb.arangodbStrings.ERROR_ARANGO_CONFLICT = "ERROR_ARANGO_CONFLICT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_CONFLICT]
  
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_COLLECTION: typings.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_COLLECTION = "ERROR_ARANGO_CORRUPTED_COLLECTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_COLLECTION]
  
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_DATAFILE: typings.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_DATAFILE = "ERROR_ARANGO_CORRUPTED_DATAFILE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_DATAFILE]
  
  @scala.inline
  def ERROR_ARANGO_CROSS_COLLECTION_REQUEST: typings.arangodb.arangodbStrings.ERROR_ARANGO_CROSS_COLLECTION_REQUEST = "ERROR_ARANGO_CROSS_COLLECTION_REQUEST".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_CROSS_COLLECTION_REQUEST]
  
  @scala.inline
  def ERROR_ARANGO_DATABASE_NAME_INVALID: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NAME_INVALID = "ERROR_ARANGO_DATABASE_NAME_INVALID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NAME_INVALID]
  
  @scala.inline
  def ERROR_ARANGO_DATABASE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NOT_FOUND = "ERROR_ARANGO_DATABASE_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_DATADIR_INVALID: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_INVALID = "ERROR_ARANGO_DATADIR_INVALID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_INVALID]
  
  @scala.inline
  def ERROR_ARANGO_DATADIR_LOCKED: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_LOCKED = "ERROR_ARANGO_DATADIR_LOCKED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_LOCKED]
  
  @scala.inline
  def ERROR_ARANGO_DATADIR_NOT_WRITABLE: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_NOT_WRITABLE = "ERROR_ARANGO_DATADIR_NOT_WRITABLE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_NOT_WRITABLE]
  
  @scala.inline
  def ERROR_ARANGO_DATADIR_UNLOCKABLE: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_UNLOCKABLE = "ERROR_ARANGO_DATADIR_UNLOCKABLE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_UNLOCKABLE]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_ALREADY_EXISTS: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS = "ERROR_ARANGO_DATAFILE_ALREADY_EXISTS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_EMPTY: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_EMPTY = "ERROR_ARANGO_DATAFILE_EMPTY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_EMPTY]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_FULL: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_FULL = "ERROR_ARANGO_DATAFILE_FULL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_FULL]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_SEALED: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_SEALED = "ERROR_ARANGO_DATAFILE_SEALED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_SEALED]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND = "ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_UNREADABLE: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_UNREADABLE = "ERROR_ARANGO_DATAFILE_UNREADABLE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_UNREADABLE]
  
  @scala.inline
  def ERROR_ARANGO_DATA_SOURCE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND = "ERROR_ARANGO_DATA_SOURCE_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_HANDLE_BAD: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_HANDLE_BAD = "ERROR_ARANGO_DOCUMENT_HANDLE_BAD".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_HANDLE_BAD]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_BAD: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_BAD = "ERROR_ARANGO_DOCUMENT_KEY_BAD".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_BAD]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_MISSING: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_MISSING = "ERROR_ARANGO_DOCUMENT_KEY_MISSING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_MISSING]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED = "ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND = "ERROR_ARANGO_DOCUMENT_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED = "ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_REV_BAD: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_REV_BAD = "ERROR_ARANGO_DOCUMENT_REV_BAD".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_REV_BAD]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TOO_LARGE: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TOO_LARGE = "ERROR_ARANGO_DOCUMENT_TOO_LARGE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TOO_LARGE]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TYPE_INVALID: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TYPE_INVALID = "ERROR_ARANGO_DOCUMENT_TYPE_INVALID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TYPE_INVALID]
  
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_IDENTIFIER: typings.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_IDENTIFIER = "ERROR_ARANGO_DUPLICATE_IDENTIFIER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_IDENTIFIER]
  
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_NAME: typings.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_NAME = "ERROR_ARANGO_DUPLICATE_NAME".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_NAME]
  
  @scala.inline
  def ERROR_ARANGO_EMPTY_DATADIR: typings.arangodb.arangodbStrings.ERROR_ARANGO_EMPTY_DATADIR = "ERROR_ARANGO_EMPTY_DATADIR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_EMPTY_DATADIR]
  
  @scala.inline
  def ERROR_ARANGO_ENDPOINT_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_ENDPOINT_NOT_FOUND = "ERROR_ARANGO_ENDPOINT_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_ENDPOINT_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_FILESYSTEM_FULL: typings.arangodb.arangodbStrings.ERROR_ARANGO_FILESYSTEM_FULL = "ERROR_ARANGO_FILESYSTEM_FULL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_FILESYSTEM_FULL]
  
  @scala.inline
  def ERROR_ARANGO_ICU_ERROR: typings.arangodb.arangodbStrings.ERROR_ARANGO_ICU_ERROR = "ERROR_ARANGO_ICU_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_ICU_ERROR]
  
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_NAME: typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_NAME = "ERROR_ARANGO_ILLEGAL_NAME".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_NAME]
  
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_PARAMETER_FILE: typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE = "ERROR_ARANGO_ILLEGAL_PARAMETER_FILE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE]
  
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_STATE: typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_STATE = "ERROR_ARANGO_ILLEGAL_STATE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_STATE]
  
  @scala.inline
  def ERROR_ARANGO_INDEX_CREATION_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_CREATION_FAILED = "ERROR_ARANGO_INDEX_CREATION_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_CREATION_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING: typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING = "ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING]
  
  @scala.inline
  def ERROR_ARANGO_INDEX_HANDLE_BAD: typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_HANDLE_BAD = "ERROR_ARANGO_INDEX_HANDLE_BAD".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_HANDLE_BAD]
  
  @scala.inline
  def ERROR_ARANGO_INDEX_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_NOT_FOUND = "ERROR_ARANGO_INDEX_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE: typings.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE = "ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE]
  
  @scala.inline
  def ERROR_ARANGO_INVALID_KEY_GENERATOR: typings.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_KEY_GENERATOR = "ERROR_ARANGO_INVALID_KEY_GENERATOR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_KEY_GENERATOR]
  
  @scala.inline
  def ERROR_ARANGO_IO_ERROR: typings.arangodb.arangodbStrings.ERROR_ARANGO_IO_ERROR = "ERROR_ARANGO_IO_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_IO_ERROR]
  
  @scala.inline
  def ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL: typings.arangodb.arangodbStrings.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL = "ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL]
  
  @scala.inline
  def ERROR_ARANGO_MERGE_IN_PROGRESS: typings.arangodb.arangodbStrings.ERROR_ARANGO_MERGE_IN_PROGRESS = "ERROR_ARANGO_MERGE_IN_PROGRESS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_MERGE_IN_PROGRESS]
  
  @scala.inline
  def ERROR_ARANGO_MMAP_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_MMAP_FAILED = "ERROR_ARANGO_MMAP_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_MMAP_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_MSYNC_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_MSYNC_FAILED = "ERROR_ARANGO_MSYNC_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_MSYNC_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_NO_INDEX: typings.arangodb.arangodbStrings.ERROR_ARANGO_NO_INDEX = "ERROR_ARANGO_NO_INDEX".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_NO_INDEX]
  
  @scala.inline
  def ERROR_ARANGO_NO_JOURNAL: typings.arangodb.arangodbStrings.ERROR_ARANGO_NO_JOURNAL = "ERROR_ARANGO_NO_JOURNAL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_NO_JOURNAL]
  
  @scala.inline
  def ERROR_ARANGO_OUT_OF_KEYS: typings.arangodb.arangodbStrings.ERROR_ARANGO_OUT_OF_KEYS = "ERROR_ARANGO_OUT_OF_KEYS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_OUT_OF_KEYS]
  
  @scala.inline
  def ERROR_ARANGO_READ_ONLY: typings.arangodb.arangodbStrings.ERROR_ARANGO_READ_ONLY = "ERROR_ARANGO_READ_ONLY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_READ_ONLY]
  
  @scala.inline
  def ERROR_ARANGO_RECOVERY: typings.arangodb.arangodbStrings.ERROR_ARANGO_RECOVERY = "ERROR_ARANGO_RECOVERY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_RECOVERY]
  
  @scala.inline
  def ERROR_ARANGO_SYNC_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_ARANGO_SYNC_TIMEOUT = "ERROR_ARANGO_SYNC_TIMEOUT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_SYNC_TIMEOUT]
  
  @scala.inline
  def ERROR_ARANGO_TRY_AGAIN: typings.arangodb.arangodbStrings.ERROR_ARANGO_TRY_AGAIN = "ERROR_ARANGO_TRY_AGAIN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_TRY_AGAIN]
  
  @scala.inline
  def ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED: typings.arangodb.arangodbStrings.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED = "ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED]
  
  @scala.inline
  def ERROR_ARANGO_USE_SYSTEM_DATABASE: typings.arangodb.arangodbStrings.ERROR_ARANGO_USE_SYSTEM_DATABASE = "ERROR_ARANGO_USE_SYSTEM_DATABASE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_USE_SYSTEM_DATABASE]
  
  @scala.inline
  def ERROR_ARANGO_VALIDATION_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_VALIDATION_FAILED = "ERROR_ARANGO_VALIDATION_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_VALIDATION_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT = "ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT]
  
  @scala.inline
  def ERROR_BAD_PARAMETER: typings.arangodb.arangodbStrings.ERROR_BAD_PARAMETER = "ERROR_BAD_PARAMETER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_BAD_PARAMETER]
  
  @scala.inline
  def ERROR_CANNOT_CREATE_DIRECTORY: typings.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_DIRECTORY = "ERROR_CANNOT_CREATE_DIRECTORY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_DIRECTORY]
  
  @scala.inline
  def ERROR_CANNOT_CREATE_TEMP_FILE: typings.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_TEMP_FILE = "ERROR_CANNOT_CREATE_TEMP_FILE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_TEMP_FILE]
  
  @scala.inline
  def ERROR_CANNOT_DROP_SMART_COLLECTION: typings.arangodb.arangodbStrings.ERROR_CANNOT_DROP_SMART_COLLECTION = "ERROR_CANNOT_DROP_SMART_COLLECTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CANNOT_DROP_SMART_COLLECTION]
  
  @scala.inline
  def ERROR_CANNOT_OVERWRITE_FILE: typings.arangodb.arangodbStrings.ERROR_CANNOT_OVERWRITE_FILE = "ERROR_CANNOT_OVERWRITE_FILE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CANNOT_OVERWRITE_FILE]
  
  @scala.inline
  def ERROR_CANNOT_READ_FILE: typings.arangodb.arangodbStrings.ERROR_CANNOT_READ_FILE = "ERROR_CANNOT_READ_FILE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CANNOT_READ_FILE]
  
  @scala.inline
  def ERROR_CANNOT_WRITE_FILE: typings.arangodb.arangodbStrings.ERROR_CANNOT_WRITE_FILE = "ERROR_CANNOT_WRITE_FILE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CANNOT_WRITE_FILE]
  
  @scala.inline
  def ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED: typings.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED = "ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED]
  
  @scala.inline
  def ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID: typings.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID = "ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID]
  
  @scala.inline
  def ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC: typings.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC = "ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC]
  
  @scala.inline
  def ERROR_CLUSTER_AQL_COMMUNICATION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COMMUNICATION = "ERROR_CLUSTER_AQL_COMMUNICATION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COMMUNICATION]
  
  @scala.inline
  def ERROR_CLUSTER_BACKEND_UNAVAILABLE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_BACKEND_UNAVAILABLE = "ERROR_CLUSTER_BACKEND_UNAVAILABLE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_BACKEND_UNAVAILABLE]
  
  @scala.inline
  def ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE]
  
  @scala.inline
  def ERROR_CLUSTER_COLLECTION_ID_EXISTS: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COLLECTION_ID_EXISTS = "ERROR_CLUSTER_COLLECTION_ID_EXISTS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COLLECTION_ID_EXISTS]
  
  @scala.inline
  def ERROR_CLUSTER_CONNECTION_LOST: typings.arangodb.arangodbStrings.ERROR_CLUSTER_CONNECTION_LOST = "ERROR_CLUSTER_CONNECTION_LOST".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_CONNECTION_LOST]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION = "ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE = "ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DETERMINE_ID: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID = "ERROR_CLUSTER_COULD_NOT_DETERMINE_ID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER = "ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_LOCK_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN = "ERROR_CLUSTER_COULD_NOT_LOCK_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION = "ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT = "ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT = "ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION = "ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION]
  
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS: typings.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS = "ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS]
  
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR: typings.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR = "ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR]
  
  @scala.inline
  def ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS: typings.arangodb.arangodbStrings.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS = "ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS]
  
  @scala.inline
  def ERROR_CLUSTER_INSUFFICIENT_DBSERVERS: typings.arangodb.arangodbStrings.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS = "ERROR_CLUSTER_INSUFFICIENT_DBSERVERS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS]
  
  @scala.inline
  def ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING: typings.arangodb.arangodbStrings.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING = "ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING]
  
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES: typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES = "ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES]
  
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE]
  
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY: typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY = "ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY]
  
  @scala.inline
  def ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN = "ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN]
  
  @scala.inline
  def ERROR_CLUSTER_NOT_LEADER: typings.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_LEADER = "ERROR_CLUSTER_NOT_LEADER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_LEADER]
  
  @scala.inline
  def ERROR_CLUSTER_NO_AGENCY: typings.arangodb.arangodbStrings.ERROR_CLUSTER_NO_AGENCY = "ERROR_CLUSTER_NO_AGENCY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_NO_AGENCY]
  
  @scala.inline
  def ERROR_CLUSTER_NO_COORDINATOR_HEADER: typings.arangodb.arangodbStrings.ERROR_CLUSTER_NO_COORDINATOR_HEADER = "ERROR_CLUSTER_NO_COORDINATOR_HEADER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_NO_COORDINATOR_HEADER]
  
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_COORDINATOR: typings.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_COORDINATOR = "ERROR_CLUSTER_ONLY_ON_COORDINATOR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_COORDINATOR]
  
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_DBSERVER: typings.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_DBSERVER = "ERROR_CLUSTER_ONLY_ON_DBSERVER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_DBSERVER]
  
  @scala.inline
  def ERROR_CLUSTER_READING_PLAN_AGENCY: typings.arangodb.arangodbStrings.ERROR_CLUSTER_READING_PLAN_AGENCY = "ERROR_CLUSTER_READING_PLAN_AGENCY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_READING_PLAN_AGENCY]
  
  @scala.inline
  def ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION = "ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION]
  
  @scala.inline
  def ERROR_CLUSTER_SHARD_GONE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_GONE = "ERROR_CLUSTER_SHARD_GONE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_GONE]
  
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION = "ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION]
  
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_RESIGNED: typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_RESIGNED = "ERROR_CLUSTER_SHARD_LEADER_RESIGNED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_RESIGNED]
  
  @scala.inline
  def ERROR_CLUSTER_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_CLUSTER_TIMEOUT = "ERROR_CLUSTER_TIMEOUT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_TIMEOUT]
  
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT: typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT = "ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT]
  
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE]
  
  @scala.inline
  def ERROR_CLUSTER_UNSUPPORTED: typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNSUPPORTED = "ERROR_CLUSTER_UNSUPPORTED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNSUPPORTED]
  
  @scala.inline
  def ERROR_CORRUPTED_CSV: typings.arangodb.arangodbStrings.ERROR_CORRUPTED_CSV = "ERROR_CORRUPTED_CSV".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CORRUPTED_CSV]
  
  @scala.inline
  def ERROR_CURSOR_BUSY: typings.arangodb.arangodbStrings.ERROR_CURSOR_BUSY = "ERROR_CURSOR_BUSY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CURSOR_BUSY]
  
  @scala.inline
  def ERROR_CURSOR_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_CURSOR_NOT_FOUND = "ERROR_CURSOR_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_CURSOR_NOT_FOUND]
  
  @scala.inline
  def ERROR_DEADLOCK: typings.arangodb.arangodbStrings.ERROR_DEADLOCK = "ERROR_DEADLOCK".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_DEADLOCK]
  
  @scala.inline
  def ERROR_DEAD_PID: typings.arangodb.arangodbStrings.ERROR_DEAD_PID = "ERROR_DEAD_PID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_DEAD_PID]
  
  @scala.inline
  def ERROR_DEBUG: typings.arangodb.arangodbStrings.ERROR_DEBUG = "ERROR_DEBUG".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_DEBUG]
  
  @scala.inline
  def ERROR_DISPATCHER_IS_STOPPING: typings.arangodb.arangodbStrings.ERROR_DISPATCHER_IS_STOPPING = "ERROR_DISPATCHER_IS_STOPPING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_DISPATCHER_IS_STOPPING]
  
  @scala.inline
  def ERROR_FAILED: typings.arangodb.arangodbStrings.ERROR_FAILED = "ERROR_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_FAILED]
  
  @scala.inline
  def ERROR_FILE_EXISTS: typings.arangodb.arangodbStrings.ERROR_FILE_EXISTS = "ERROR_FILE_EXISTS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_FILE_EXISTS]
  
  @scala.inline
  def ERROR_FILE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_FILE_NOT_FOUND = "ERROR_FILE_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_FILE_NOT_FOUND]
  
  @scala.inline
  def ERROR_FORBIDDEN: typings.arangodb.arangodbStrings.ERROR_FORBIDDEN = "ERROR_FORBIDDEN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_FORBIDDEN]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_EDGE: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE = "ERROR_GRAPH_COULD_NOT_CHANGE_EDGE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX = "ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_EDGE: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_EDGE = "ERROR_GRAPH_COULD_NOT_CREATE_EDGE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_EDGE]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_GRAPH: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH = "ERROR_GRAPH_COULD_NOT_CREATE_GRAPH".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_VERTEX: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX = "ERROR_GRAPH_COULD_NOT_CREATE_VERTEX".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX]
  
  @scala.inline
  def ERROR_GRAPH_EMPTY: typings.arangodb.arangodbStrings.ERROR_GRAPH_EMPTY = "ERROR_GRAPH_EMPTY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_EMPTY]
  
  @scala.inline
  def ERROR_GRAPH_INVALID_EDGE: typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_EDGE = "ERROR_GRAPH_INVALID_EDGE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_EDGE]
  
  @scala.inline
  def ERROR_GRAPH_INVALID_FILTER_RESULT: typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_FILTER_RESULT = "ERROR_GRAPH_INVALID_FILTER_RESULT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_FILTER_RESULT]
  
  @scala.inline
  def ERROR_GRAPH_INVALID_GRAPH: typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_GRAPH = "ERROR_GRAPH_INVALID_GRAPH".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_GRAPH]
  
  @scala.inline
  def ERROR_GRAPH_INVALID_VERTEX: typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_VERTEX = "ERROR_GRAPH_INVALID_VERTEX".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_VERTEX]
  
  @scala.inline
  def ERROR_GRAPH_TOO_MANY_ITERATIONS: typings.arangodb.arangodbStrings.ERROR_GRAPH_TOO_MANY_ITERATIONS = "ERROR_GRAPH_TOO_MANY_ITERATIONS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_GRAPH_TOO_MANY_ITERATIONS]
  
  @scala.inline
  def ERROR_HTTP_BAD_PARAMETER: typings.arangodb.arangodbStrings.ERROR_HTTP_BAD_PARAMETER = "ERROR_HTTP_BAD_PARAMETER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_BAD_PARAMETER]
  
  @scala.inline
  def ERROR_HTTP_CORRUPTED_JSON: typings.arangodb.arangodbStrings.ERROR_HTTP_CORRUPTED_JSON = "ERROR_HTTP_CORRUPTED_JSON".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_CORRUPTED_JSON]
  
  @scala.inline
  def ERROR_HTTP_FORBIDDEN: typings.arangodb.arangodbStrings.ERROR_HTTP_FORBIDDEN = "ERROR_HTTP_FORBIDDEN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_FORBIDDEN]
  
  @scala.inline
  def ERROR_HTTP_GATEWAY_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_HTTP_GATEWAY_TIMEOUT = "ERROR_HTTP_GATEWAY_TIMEOUT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_GATEWAY_TIMEOUT]
  
  @scala.inline
  def ERROR_HTTP_METHOD_NOT_ALLOWED: typings.arangodb.arangodbStrings.ERROR_HTTP_METHOD_NOT_ALLOWED = "ERROR_HTTP_METHOD_NOT_ALLOWED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_METHOD_NOT_ALLOWED]
  
  @scala.inline
  def ERROR_HTTP_NOT_ACCEPTABLE: typings.arangodb.arangodbStrings.ERROR_HTTP_NOT_ACCEPTABLE = "ERROR_HTTP_NOT_ACCEPTABLE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_NOT_ACCEPTABLE]
  
  @scala.inline
  def ERROR_HTTP_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_HTTP_NOT_FOUND = "ERROR_HTTP_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_NOT_FOUND]
  
  @scala.inline
  def ERROR_HTTP_PRECONDITION_FAILED: typings.arangodb.arangodbStrings.ERROR_HTTP_PRECONDITION_FAILED = "ERROR_HTTP_PRECONDITION_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_PRECONDITION_FAILED]
  
  @scala.inline
  def ERROR_HTTP_SERVER_ERROR: typings.arangodb.arangodbStrings.ERROR_HTTP_SERVER_ERROR = "ERROR_HTTP_SERVER_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_SERVER_ERROR]
  
  @scala.inline
  def ERROR_HTTP_SERVICE_UNAVAILABLE: typings.arangodb.arangodbStrings.ERROR_HTTP_SERVICE_UNAVAILABLE = "ERROR_HTTP_SERVICE_UNAVAILABLE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_SERVICE_UNAVAILABLE]
  
  @scala.inline
  def ERROR_HTTP_SUPERFLUOUS_SUFFICES: typings.arangodb.arangodbStrings.ERROR_HTTP_SUPERFLUOUS_SUFFICES = "ERROR_HTTP_SUPERFLUOUS_SUFFICES".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_SUPERFLUOUS_SUFFICES]
  
  @scala.inline
  def ERROR_HTTP_UNAUTHORIZED: typings.arangodb.arangodbStrings.ERROR_HTTP_UNAUTHORIZED = "ERROR_HTTP_UNAUTHORIZED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_HTTP_UNAUTHORIZED]
  
  @scala.inline
  def ERROR_ILLEGAL_NUMBER: typings.arangodb.arangodbStrings.ERROR_ILLEGAL_NUMBER = "ERROR_ILLEGAL_NUMBER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ILLEGAL_NUMBER]
  
  @scala.inline
  def ERROR_ILLEGAL_OPTION: typings.arangodb.arangodbStrings.ERROR_ILLEGAL_OPTION = "ERROR_ILLEGAL_OPTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ILLEGAL_OPTION]
  
  @scala.inline
  def ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE: typings.arangodb.arangodbStrings.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE = "ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE]
  
  @scala.inline
  def ERROR_INTERNAL: typings.arangodb.arangodbStrings.ERROR_INTERNAL = "ERROR_INTERNAL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_INTERNAL]
  
  @scala.inline
  def ERROR_INVALID_FOXX_OPTIONS: typings.arangodb.arangodbStrings.ERROR_INVALID_FOXX_OPTIONS = "ERROR_INVALID_FOXX_OPTIONS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_INVALID_FOXX_OPTIONS]
  
  @scala.inline
  def ERROR_INVALID_MOUNTPOINT: typings.arangodb.arangodbStrings.ERROR_INVALID_MOUNTPOINT = "ERROR_INVALID_MOUNTPOINT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_INVALID_MOUNTPOINT]
  
  @scala.inline
  def ERROR_INVALID_SERVICE_MANIFEST: typings.arangodb.arangodbStrings.ERROR_INVALID_SERVICE_MANIFEST = "ERROR_INVALID_SERVICE_MANIFEST".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_INVALID_SERVICE_MANIFEST]
  
  @scala.inline
  def ERROR_IP_ADDRESS_INVALID: typings.arangodb.arangodbStrings.ERROR_IP_ADDRESS_INVALID = "ERROR_IP_ADDRESS_INVALID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_IP_ADDRESS_INVALID]
  
  @scala.inline
  def ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE: typings.arangodb.arangodbStrings.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE = "ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_BIND: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_BIND = "ERROR_LDAP_CANNOT_BIND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_BIND]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_INIT: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_INIT = "ERROR_LDAP_CANNOT_INIT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_INIT]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_SEARCH: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SEARCH = "ERROR_LDAP_CANNOT_SEARCH".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SEARCH]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_SET_OPTION: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SET_OPTION = "ERROR_LDAP_CANNOT_SET_OPTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SET_OPTION]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_START_TLS: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_START_TLS = "ERROR_LDAP_CANNOT_START_TLS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_START_TLS]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_UNBIND: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_UNBIND = "ERROR_LDAP_CANNOT_UNBIND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_UNBIND]
  
  @scala.inline
  def ERROR_LDAP_FOUND_NO_OBJECTS: typings.arangodb.arangodbStrings.ERROR_LDAP_FOUND_NO_OBJECTS = "ERROR_LDAP_FOUND_NO_OBJECTS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_FOUND_NO_OBJECTS]
  
  @scala.inline
  def ERROR_LDAP_INVALID_MODE: typings.arangodb.arangodbStrings.ERROR_LDAP_INVALID_MODE = "ERROR_LDAP_INVALID_MODE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_INVALID_MODE]
  
  @scala.inline
  def ERROR_LDAP_NOT_ONE_USER_FOUND: typings.arangodb.arangodbStrings.ERROR_LDAP_NOT_ONE_USER_FOUND = "ERROR_LDAP_NOT_ONE_USER_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_NOT_ONE_USER_FOUND]
  
  @scala.inline
  def ERROR_LDAP_USER_NOT_IDENTIFIED: typings.arangodb.arangodbStrings.ERROR_LDAP_USER_NOT_IDENTIFIED = "ERROR_LDAP_USER_NOT_IDENTIFIED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LDAP_USER_NOT_IDENTIFIED]
  
  @scala.inline
  def ERROR_LOCKED: typings.arangodb.arangodbStrings.ERROR_LOCKED = "ERROR_LOCKED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LOCKED]
  
  @scala.inline
  def ERROR_LOCK_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_LOCK_TIMEOUT = "ERROR_LOCK_TIMEOUT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_LOCK_TIMEOUT]
  
  @scala.inline
  def ERROR_MALFORMED_MANIFEST_FILE: typings.arangodb.arangodbStrings.ERROR_MALFORMED_MANIFEST_FILE = "ERROR_MALFORMED_MANIFEST_FILE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_MALFORMED_MANIFEST_FILE]
  
  @scala.inline
  def ERROR_MODULE_FAILURE: typings.arangodb.arangodbStrings.ERROR_MODULE_FAILURE = "ERROR_MODULE_FAILURE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_MODULE_FAILURE]
  
  @scala.inline
  def ERROR_MODULE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_MODULE_NOT_FOUND = "ERROR_MODULE_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_MODULE_NOT_FOUND]
  
  @scala.inline
  def ERROR_MODULE_SYNTAX_ERROR: typings.arangodb.arangodbStrings.ERROR_MODULE_SYNTAX_ERROR = "ERROR_MODULE_SYNTAX_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_MODULE_SYNTAX_ERROR]
  
  @scala.inline
  def ERROR_NOT_IMPLEMENTED: typings.arangodb.arangodbStrings.ERROR_NOT_IMPLEMENTED = "ERROR_NOT_IMPLEMENTED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_NOT_IMPLEMENTED]
  
  @scala.inline
  def ERROR_NO_ERROR: typings.arangodb.arangodbStrings.ERROR_NO_ERROR = "ERROR_NO_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_NO_ERROR]
  
  @scala.inline
  def ERROR_NO_SMART_COLLECTION: typings.arangodb.arangodbStrings.ERROR_NO_SMART_COLLECTION = "ERROR_NO_SMART_COLLECTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_NO_SMART_COLLECTION]
  
  @scala.inline
  def ERROR_NO_SMART_GRAPH_ATTRIBUTE: typings.arangodb.arangodbStrings.ERROR_NO_SMART_GRAPH_ATTRIBUTE = "ERROR_NO_SMART_GRAPH_ATTRIBUTE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_NO_SMART_GRAPH_ATTRIBUTE]
  
  @scala.inline
  def ERROR_NUMERIC_OVERFLOW: typings.arangodb.arangodbStrings.ERROR_NUMERIC_OVERFLOW = "ERROR_NUMERIC_OVERFLOW".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_NUMERIC_OVERFLOW]
  
  @scala.inline
  def ERROR_ONLY_ENTERPRISE: typings.arangodb.arangodbStrings.ERROR_ONLY_ENTERPRISE = "ERROR_ONLY_ENTERPRISE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_ONLY_ENTERPRISE]
  
  @scala.inline
  def ERROR_OUT_OF_MEMORY: typings.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY = "ERROR_OUT_OF_MEMORY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY]
  
  @scala.inline
  def ERROR_OUT_OF_MEMORY_MMAP: typings.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY_MMAP = "ERROR_OUT_OF_MEMORY_MMAP".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY_MMAP]
  
  @scala.inline
  def ERROR_QUERY_ACCESS_AFTER_MODIFICATION: typings.arangodb.arangodbStrings.ERROR_QUERY_ACCESS_AFTER_MODIFICATION = "ERROR_QUERY_ACCESS_AFTER_MODIFICATION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_ACCESS_AFTER_MODIFICATION]
  
  @scala.inline
  def ERROR_QUERY_ARRAY_EXPECTED: typings.arangodb.arangodbStrings.ERROR_QUERY_ARRAY_EXPECTED = "ERROR_QUERY_ARRAY_EXPECTED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_ARRAY_EXPECTED]
  
  @scala.inline
  def ERROR_QUERY_BAD_JSON_PLAN: typings.arangodb.arangodbStrings.ERROR_QUERY_BAD_JSON_PLAN = "ERROR_QUERY_BAD_JSON_PLAN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_BAD_JSON_PLAN]
  
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETERS_INVALID: typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETERS_INVALID = "ERROR_QUERY_BIND_PARAMETERS_INVALID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETERS_INVALID]
  
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_MISSING: typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_MISSING = "ERROR_QUERY_BIND_PARAMETER_MISSING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_MISSING]
  
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_TYPE: typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_TYPE = "ERROR_QUERY_BIND_PARAMETER_TYPE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_TYPE]
  
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_UNDECLARED: typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_UNDECLARED = "ERROR_QUERY_BIND_PARAMETER_UNDECLARED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_UNDECLARED]
  
  @scala.inline
  def ERROR_QUERY_COLLECTION_LOCK_FAILED: typings.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_LOCK_FAILED = "ERROR_QUERY_COLLECTION_LOCK_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_LOCK_FAILED]
  
  @scala.inline
  def ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION: typings.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION = "ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION]
  
  @scala.inline
  def ERROR_QUERY_COMPILE_TIME_OPTIONS: typings.arangodb.arangodbStrings.ERROR_QUERY_COMPILE_TIME_OPTIONS = "ERROR_QUERY_COMPILE_TIME_OPTIONS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_COMPILE_TIME_OPTIONS]
  
  @scala.inline
  def ERROR_QUERY_DISALLOWED_DYNAMIC_CALL: typings.arangodb.arangodbStrings.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL = "ERROR_QUERY_DISALLOWED_DYNAMIC_CALL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL]
  
  @scala.inline
  def ERROR_QUERY_DIVISION_BY_ZERO: typings.arangodb.arangodbStrings.ERROR_QUERY_DIVISION_BY_ZERO = "ERROR_QUERY_DIVISION_BY_ZERO".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_DIVISION_BY_ZERO]
  
  @scala.inline
  def ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED: typings.arangodb.arangodbStrings.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED = "ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED]
  
  @scala.inline
  def ERROR_QUERY_EMPTY: typings.arangodb.arangodbStrings.ERROR_QUERY_EMPTY = "ERROR_QUERY_EMPTY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_EMPTY]
  
  @scala.inline
  def ERROR_QUERY_EXCEPTION_OPTIONS: typings.arangodb.arangodbStrings.ERROR_QUERY_EXCEPTION_OPTIONS = "ERROR_QUERY_EXCEPTION_OPTIONS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_EXCEPTION_OPTIONS]
  
  @scala.inline
  def ERROR_QUERY_FAIL_CALLED: typings.arangodb.arangodbStrings.ERROR_QUERY_FAIL_CALLED = "ERROR_QUERY_FAIL_CALLED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FAIL_CALLED]
  
  @scala.inline
  def ERROR_QUERY_FULLTEXT_INDEX_MISSING: typings.arangodb.arangodbStrings.ERROR_QUERY_FULLTEXT_INDEX_MISSING = "ERROR_QUERY_FULLTEXT_INDEX_MISSING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FULLTEXT_INDEX_MISSING]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH = "ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH = "ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_CODE: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_CODE = "ERROR_QUERY_FUNCTION_INVALID_CODE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_CODE]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_NAME: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_NAME = "ERROR_QUERY_FUNCTION_INVALID_NAME".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_NAME]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_NAME_UNKNOWN: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NAME_UNKNOWN = "ERROR_QUERY_FUNCTION_NAME_UNKNOWN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NAME_UNKNOWN]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NOT_FOUND = "ERROR_QUERY_FUNCTION_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NOT_FOUND]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_RUNTIME_ERROR: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_RUNTIME_ERROR = "ERROR_QUERY_FUNCTION_RUNTIME_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_RUNTIME_ERROR]
  
  @scala.inline
  def ERROR_QUERY_GEO_INDEX_MISSING: typings.arangodb.arangodbStrings.ERROR_QUERY_GEO_INDEX_MISSING = "ERROR_QUERY_GEO_INDEX_MISSING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_GEO_INDEX_MISSING]
  
  @scala.inline
  def ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION = "ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION]
  
  @scala.inline
  def ERROR_QUERY_INVALID_ARITHMETIC_VALUE: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_ARITHMETIC_VALUE = "ERROR_QUERY_INVALID_ARITHMETIC_VALUE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_ARITHMETIC_VALUE]
  
  @scala.inline
  def ERROR_QUERY_INVALID_DATE_VALUE: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_DATE_VALUE = "ERROR_QUERY_INVALID_DATE_VALUE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_DATE_VALUE]
  
  @scala.inline
  def ERROR_QUERY_INVALID_LOGICAL_VALUE: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_LOGICAL_VALUE = "ERROR_QUERY_INVALID_LOGICAL_VALUE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_LOGICAL_VALUE]
  
  @scala.inline
  def ERROR_QUERY_INVALID_REGEX: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_REGEX = "ERROR_QUERY_INVALID_REGEX".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_REGEX]
  
  @scala.inline
  def ERROR_QUERY_IN_USE: typings.arangodb.arangodbStrings.ERROR_QUERY_IN_USE = "ERROR_QUERY_IN_USE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_IN_USE]
  
  @scala.inline
  def ERROR_QUERY_KILLED: typings.arangodb.arangodbStrings.ERROR_QUERY_KILLED = "ERROR_QUERY_KILLED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_KILLED]
  
  @scala.inline
  def ERROR_QUERY_MULTI_MODIFY: typings.arangodb.arangodbStrings.ERROR_QUERY_MULTI_MODIFY = "ERROR_QUERY_MULTI_MODIFY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_MULTI_MODIFY]
  
  @scala.inline
  def ERROR_QUERY_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_QUERY_NOT_FOUND = "ERROR_QUERY_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_NOT_FOUND]
  
  @scala.inline
  def ERROR_QUERY_NUMBER_OUT_OF_RANGE: typings.arangodb.arangodbStrings.ERROR_QUERY_NUMBER_OUT_OF_RANGE = "ERROR_QUERY_NUMBER_OUT_OF_RANGE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_NUMBER_OUT_OF_RANGE]
  
  @scala.inline
  def ERROR_QUERY_PARSE: typings.arangodb.arangodbStrings.ERROR_QUERY_PARSE = "ERROR_QUERY_PARSE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_PARSE]
  
  @scala.inline
  def ERROR_QUERY_SCRIPT: typings.arangodb.arangodbStrings.ERROR_QUERY_SCRIPT = "ERROR_QUERY_SCRIPT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_SCRIPT]
  
  @scala.inline
  def ERROR_QUERY_TOO_MANY_COLLECTIONS: typings.arangodb.arangodbStrings.ERROR_QUERY_TOO_MANY_COLLECTIONS = "ERROR_QUERY_TOO_MANY_COLLECTIONS".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_TOO_MANY_COLLECTIONS]
  
  @scala.inline
  def ERROR_QUERY_USER_ASSERT: typings.arangodb.arangodbStrings.ERROR_QUERY_USER_ASSERT = "ERROR_QUERY_USER_ASSERT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_USER_ASSERT]
  
  @scala.inline
  def ERROR_QUERY_USER_WARN: typings.arangodb.arangodbStrings.ERROR_QUERY_USER_WARN = "ERROR_QUERY_USER_WARN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_USER_WARN]
  
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_INVALID: typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_INVALID = "ERROR_QUERY_VARIABLE_NAME_INVALID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_INVALID]
  
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_UNKNOWN: typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_UNKNOWN = "ERROR_QUERY_VARIABLE_NAME_UNKNOWN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_UNKNOWN]
  
  @scala.inline
  def ERROR_QUERY_VARIABLE_REDECLARED: typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_REDECLARED = "ERROR_QUERY_VARIABLE_REDECLARED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_REDECLARED]
  
  @scala.inline
  def ERROR_QUEUE_FULL: typings.arangodb.arangodbStrings.ERROR_QUEUE_FULL = "ERROR_QUEUE_FULL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUEUE_FULL]
  
  @scala.inline
  def ERROR_QUEUE_UNKNOWN: typings.arangodb.arangodbStrings.ERROR_QUEUE_UNKNOWN = "ERROR_QUEUE_UNKNOWN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_QUEUE_UNKNOWN]
  
  @scala.inline
  def ERROR_REPLICATION_APPLIER_STOPPED: typings.arangodb.arangodbStrings.ERROR_REPLICATION_APPLIER_STOPPED = "ERROR_REPLICATION_APPLIER_STOPPED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_APPLIER_STOPPED]
  
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION: typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION = "ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION]
  
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_STATE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_STATE = "ERROR_REPLICATION_INVALID_APPLIER_STATE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_STATE]
  
  @scala.inline
  def ERROR_REPLICATION_INVALID_RESPONSE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_RESPONSE = "ERROR_REPLICATION_INVALID_RESPONSE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_RESPONSE]
  
  @scala.inline
  def ERROR_REPLICATION_LOOP: typings.arangodb.arangodbStrings.ERROR_REPLICATION_LOOP = "ERROR_REPLICATION_LOOP".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_LOOP]
  
  @scala.inline
  def ERROR_REPLICATION_MASTER_CHANGE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_CHANGE = "ERROR_REPLICATION_MASTER_CHANGE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_CHANGE]
  
  @scala.inline
  def ERROR_REPLICATION_MASTER_ERROR: typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_ERROR = "ERROR_REPLICATION_MASTER_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_ERROR]
  
  @scala.inline
  def ERROR_REPLICATION_MASTER_INCOMPATIBLE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_INCOMPATIBLE = "ERROR_REPLICATION_MASTER_INCOMPATIBLE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_INCOMPATIBLE]
  
  @scala.inline
  def ERROR_REPLICATION_NO_RESPONSE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_NO_RESPONSE = "ERROR_REPLICATION_NO_RESPONSE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_NO_RESPONSE]
  
  @scala.inline
  def ERROR_REPLICATION_NO_START_TICK: typings.arangodb.arangodbStrings.ERROR_REPLICATION_NO_START_TICK = "ERROR_REPLICATION_NO_START_TICK".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_NO_START_TICK]
  
  @scala.inline
  def ERROR_REPLICATION_RUNNING: typings.arangodb.arangodbStrings.ERROR_REPLICATION_RUNNING = "ERROR_REPLICATION_RUNNING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_RUNNING]
  
  @scala.inline
  def ERROR_REPLICATION_SHARD_NONEMPTY: typings.arangodb.arangodbStrings.ERROR_REPLICATION_SHARD_NONEMPTY = "ERROR_REPLICATION_SHARD_NONEMPTY".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_SHARD_NONEMPTY]
  
  @scala.inline
  def ERROR_REPLICATION_START_TICK_NOT_PRESENT: typings.arangodb.arangodbStrings.ERROR_REPLICATION_START_TICK_NOT_PRESENT = "ERROR_REPLICATION_START_TICK_NOT_PRESENT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_START_TICK_NOT_PRESENT]
  
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_MARKER: typings.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_MARKER = "ERROR_REPLICATION_UNEXPECTED_MARKER".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_MARKER]
  
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_TRANSACTION: typings.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_TRANSACTION = "ERROR_REPLICATION_UNEXPECTED_TRANSACTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_TRANSACTION]
  
  @scala.inline
  def ERROR_REPLICATION_WRONG_CHECKSUM: typings.arangodb.arangodbStrings.ERROR_REPLICATION_WRONG_CHECKSUM = "ERROR_REPLICATION_WRONG_CHECKSUM".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REPLICATION_WRONG_CHECKSUM]
  
  @scala.inline
  def ERROR_REQUEST_CANCELED: typings.arangodb.arangodbStrings.ERROR_REQUEST_CANCELED = "ERROR_REQUEST_CANCELED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_REQUEST_CANCELED]
  
  @scala.inline
  def ERROR_RESOURCE_LIMIT: typings.arangodb.arangodbStrings.ERROR_RESOURCE_LIMIT = "ERROR_RESOURCE_LIMIT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_RESOURCE_LIMIT]
  
  @scala.inline
  def ERROR_SERVICE_DOWNLOAD_FAILED: typings.arangodb.arangodbStrings.ERROR_SERVICE_DOWNLOAD_FAILED = "ERROR_SERVICE_DOWNLOAD_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_DOWNLOAD_FAILED]
  
  @scala.inline
  def ERROR_SERVICE_FILES_MISSING: typings.arangodb.arangodbStrings.ERROR_SERVICE_FILES_MISSING = "ERROR_SERVICE_FILES_MISSING".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_FILES_MISSING]
  
  @scala.inline
  def ERROR_SERVICE_FILES_OUTDATED: typings.arangodb.arangodbStrings.ERROR_SERVICE_FILES_OUTDATED = "ERROR_SERVICE_FILES_OUTDATED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_FILES_OUTDATED]
  
  @scala.inline
  def ERROR_SERVICE_INVALID_MOUNT: typings.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_MOUNT = "ERROR_SERVICE_INVALID_MOUNT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_MOUNT]
  
  @scala.inline
  def ERROR_SERVICE_INVALID_NAME: typings.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_NAME = "ERROR_SERVICE_INVALID_NAME".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_NAME]
  
  @scala.inline
  def ERROR_SERVICE_MANIFEST_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_SERVICE_MANIFEST_NOT_FOUND = "ERROR_SERVICE_MANIFEST_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_MANIFEST_NOT_FOUND]
  
  @scala.inline
  def ERROR_SERVICE_MOUNTPOINT_CONFLICT: typings.arangodb.arangodbStrings.ERROR_SERVICE_MOUNTPOINT_CONFLICT = "ERROR_SERVICE_MOUNTPOINT_CONFLICT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_MOUNTPOINT_CONFLICT]
  
  @scala.inline
  def ERROR_SERVICE_NEEDS_CONFIGURATION: typings.arangodb.arangodbStrings.ERROR_SERVICE_NEEDS_CONFIGURATION = "ERROR_SERVICE_NEEDS_CONFIGURATION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_NEEDS_CONFIGURATION]
  
  @scala.inline
  def ERROR_SERVICE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_SERVICE_NOT_FOUND = "ERROR_SERVICE_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_NOT_FOUND]
  
  @scala.inline
  def ERROR_SERVICE_OPTIONS_MALFORMED: typings.arangodb.arangodbStrings.ERROR_SERVICE_OPTIONS_MALFORMED = "ERROR_SERVICE_OPTIONS_MALFORMED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_OPTIONS_MALFORMED]
  
  @scala.inline
  def ERROR_SERVICE_SOURCE_ERROR: typings.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_ERROR = "ERROR_SERVICE_SOURCE_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_ERROR]
  
  @scala.inline
  def ERROR_SERVICE_SOURCE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_NOT_FOUND = "ERROR_SERVICE_SOURCE_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_NOT_FOUND]
  
  @scala.inline
  def ERROR_SERVICE_UNKNOWN_SCRIPT: typings.arangodb.arangodbStrings.ERROR_SERVICE_UNKNOWN_SCRIPT = "ERROR_SERVICE_UNKNOWN_SCRIPT".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_UNKNOWN_SCRIPT]
  
  @scala.inline
  def ERROR_SERVICE_UPLOAD_FAILED: typings.arangodb.arangodbStrings.ERROR_SERVICE_UPLOAD_FAILED = "ERROR_SERVICE_UPLOAD_FAILED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SERVICE_UPLOAD_FAILED]
  
  @scala.inline
  def ERROR_SESSION_EXPIRED: typings.arangodb.arangodbStrings.ERROR_SESSION_EXPIRED = "ERROR_SESSION_EXPIRED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SESSION_EXPIRED]
  
  @scala.inline
  def ERROR_SESSION_UNKNOWN: typings.arangodb.arangodbStrings.ERROR_SESSION_UNKNOWN = "ERROR_SESSION_UNKNOWN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SESSION_UNKNOWN]
  
  @scala.inline
  def ERROR_SHUTTING_DOWN: typings.arangodb.arangodbStrings.ERROR_SHUTTING_DOWN = "ERROR_SHUTTING_DOWN".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SHUTTING_DOWN]
  
  @scala.inline
  def ERROR_SUPERVISION_GENERAL_FAILURE: typings.arangodb.arangodbStrings.ERROR_SUPERVISION_GENERAL_FAILURE = "ERROR_SUPERVISION_GENERAL_FAILURE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SUPERVISION_GENERAL_FAILURE]
  
  @scala.inline
  def ERROR_SYS_ERROR: typings.arangodb.arangodbStrings.ERROR_SYS_ERROR = "ERROR_SYS_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_SYS_ERROR]
  
  @scala.inline
  def ERROR_TASK_DUPLICATE_ID: typings.arangodb.arangodbStrings.ERROR_TASK_DUPLICATE_ID = "ERROR_TASK_DUPLICATE_ID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TASK_DUPLICATE_ID]
  
  @scala.inline
  def ERROR_TASK_INVALID_ID: typings.arangodb.arangodbStrings.ERROR_TASK_INVALID_ID = "ERROR_TASK_INVALID_ID".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TASK_INVALID_ID]
  
  @scala.inline
  def ERROR_TASK_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_TASK_NOT_FOUND = "ERROR_TASK_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TASK_NOT_FOUND]
  
  @scala.inline
  def ERROR_TRANSACTION_ABORTED: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_ABORTED = "ERROR_TRANSACTION_ABORTED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TRANSACTION_ABORTED]
  
  @scala.inline
  def ERROR_TRANSACTION_DISALLOWED_OPERATION: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_DISALLOWED_OPERATION = "ERROR_TRANSACTION_DISALLOWED_OPERATION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TRANSACTION_DISALLOWED_OPERATION]
  
  @scala.inline
  def ERROR_TRANSACTION_INTERNAL: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_INTERNAL = "ERROR_TRANSACTION_INTERNAL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TRANSACTION_INTERNAL]
  
  @scala.inline
  def ERROR_TRANSACTION_NESTED: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_NESTED = "ERROR_TRANSACTION_NESTED".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TRANSACTION_NESTED]
  
  @scala.inline
  def ERROR_TRANSACTION_UNREGISTERED_COLLECTION: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_UNREGISTERED_COLLECTION = "ERROR_TRANSACTION_UNREGISTERED_COLLECTION".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TRANSACTION_UNREGISTERED_COLLECTION]
  
  @scala.inline
  def ERROR_TYPE_ERROR: typings.arangodb.arangodbStrings.ERROR_TYPE_ERROR = "ERROR_TYPE_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_TYPE_ERROR]
  
  @scala.inline
  def ERROR_USER_CHANGE_PASSWORD: typings.arangodb.arangodbStrings.ERROR_USER_CHANGE_PASSWORD = "ERROR_USER_CHANGE_PASSWORD".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_USER_CHANGE_PASSWORD]
  
  @scala.inline
  def ERROR_USER_DUPLICATE: typings.arangodb.arangodbStrings.ERROR_USER_DUPLICATE = "ERROR_USER_DUPLICATE".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_USER_DUPLICATE]
  
  @scala.inline
  def ERROR_USER_EXTERNAL: typings.arangodb.arangodbStrings.ERROR_USER_EXTERNAL = "ERROR_USER_EXTERNAL".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_USER_EXTERNAL]
  
  @scala.inline
  def ERROR_USER_INVALID_NAME: typings.arangodb.arangodbStrings.ERROR_USER_INVALID_NAME = "ERROR_USER_INVALID_NAME".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_USER_INVALID_NAME]
  
  @scala.inline
  def ERROR_USER_INVALID_PASSWORD: typings.arangodb.arangodbStrings.ERROR_USER_INVALID_PASSWORD = "ERROR_USER_INVALID_PASSWORD".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_USER_INVALID_PASSWORD]
  
  @scala.inline
  def ERROR_USER_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_USER_NOT_FOUND = "ERROR_USER_NOT_FOUND".asInstanceOf[typings.arangodb.arangodbStrings.ERROR_USER_NOT_FOUND]
  
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_CONNECT: typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_CONNECT = "SIMPLE_CLIENT_COULD_NOT_CONNECT".asInstanceOf[typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_CONNECT]
  
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_READ: typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_READ = "SIMPLE_CLIENT_COULD_NOT_READ".asInstanceOf[typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_READ]
  
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_WRITE: typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_WRITE = "SIMPLE_CLIENT_COULD_NOT_WRITE".asInstanceOf[typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_WRITE]
  
  @scala.inline
  def SIMPLE_CLIENT_UNKNOWN_ERROR: typings.arangodb.arangodbStrings.SIMPLE_CLIENT_UNKNOWN_ERROR = "SIMPLE_CLIENT_UNKNOWN_ERROR".asInstanceOf[typings.arangodb.arangodbStrings.SIMPLE_CLIENT_UNKNOWN_ERROR]
}
