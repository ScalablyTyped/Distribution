package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait ErrorName extends js.Object

object ErrorName {
  @scala.inline
  def COMMUNICATOR_DISABLED: typings.arangodb.arangodbStrings.COMMUNICATOR_DISABLED = this.cast("COMMUNICATOR_DISABLED")
  @scala.inline
  def COMMUNICATOR_REQUEST_ABORTED: typings.arangodb.arangodbStrings.COMMUNICATOR_REQUEST_ABORTED = this.cast("COMMUNICATOR_REQUEST_ABORTED")
  @scala.inline
  def ERROR_AGENCY_CANNOT_REBUILD_DBS: typings.arangodb.arangodbStrings.ERROR_AGENCY_CANNOT_REBUILD_DBS = this.cast("ERROR_AGENCY_CANNOT_REBUILD_DBS")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_BE_OBJECT: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_BE_OBJECT = this.cast("ERROR_AGENCY_INFORM_MUST_BE_OBJECT")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ID: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_ID")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT: typings.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT")
  @scala.inline
  def ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING: typings.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING = this.cast("ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING")
  @scala.inline
  def ERROR_AGENCY_INQUIRY_SYNTAX: typings.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRY_SYNTAX = this.cast("ERROR_AGENCY_INQUIRY_SYNTAX")
  @scala.inline
  def ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED = this.cast("ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED")
  @scala.inline
  def ERROR_ARANGO_BUSY: typings.arangodb.arangodbStrings.ERROR_ARANGO_BUSY = this.cast("ERROR_ARANGO_BUSY")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS = this.cast("ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_LOADED: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_LOADED = this.cast("ERROR_ARANGO_COLLECTION_NOT_LOADED")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_UNLOADED: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_UNLOADED = this.cast("ERROR_ARANGO_COLLECTION_NOT_UNLOADED")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_PARAMETER_MISSING: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING = this.cast("ERROR_ARANGO_COLLECTION_PARAMETER_MISSING")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_INVALID: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_INVALID = this.cast("ERROR_ARANGO_COLLECTION_TYPE_INVALID")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_MISMATCH: typings.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH = this.cast("ERROR_ARANGO_COLLECTION_TYPE_MISMATCH")
  @scala.inline
  def ERROR_ARANGO_CONFLICT: typings.arangodb.arangodbStrings.ERROR_ARANGO_CONFLICT = this.cast("ERROR_ARANGO_CONFLICT")
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_COLLECTION: typings.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_COLLECTION = this.cast("ERROR_ARANGO_CORRUPTED_COLLECTION")
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_DATAFILE: typings.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_DATAFILE = this.cast("ERROR_ARANGO_CORRUPTED_DATAFILE")
  @scala.inline
  def ERROR_ARANGO_CROSS_COLLECTION_REQUEST: typings.arangodb.arangodbStrings.ERROR_ARANGO_CROSS_COLLECTION_REQUEST = this.cast("ERROR_ARANGO_CROSS_COLLECTION_REQUEST")
  @scala.inline
  def ERROR_ARANGO_DATABASE_NAME_INVALID: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NAME_INVALID = this.cast("ERROR_ARANGO_DATABASE_NAME_INVALID")
  @scala.inline
  def ERROR_ARANGO_DATABASE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NOT_FOUND = this.cast("ERROR_ARANGO_DATABASE_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_DATADIR_INVALID: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_INVALID = this.cast("ERROR_ARANGO_DATADIR_INVALID")
  @scala.inline
  def ERROR_ARANGO_DATADIR_LOCKED: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_LOCKED = this.cast("ERROR_ARANGO_DATADIR_LOCKED")
  @scala.inline
  def ERROR_ARANGO_DATADIR_NOT_WRITABLE: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_NOT_WRITABLE = this.cast("ERROR_ARANGO_DATADIR_NOT_WRITABLE")
  @scala.inline
  def ERROR_ARANGO_DATADIR_UNLOCKABLE: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_UNLOCKABLE = this.cast("ERROR_ARANGO_DATADIR_UNLOCKABLE")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_ALREADY_EXISTS: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS = this.cast("ERROR_ARANGO_DATAFILE_ALREADY_EXISTS")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_EMPTY: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_EMPTY = this.cast("ERROR_ARANGO_DATAFILE_EMPTY")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_FULL: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_FULL = this.cast("ERROR_ARANGO_DATAFILE_FULL")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_SEALED: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_SEALED = this.cast("ERROR_ARANGO_DATAFILE_SEALED")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND = this.cast("ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_UNREADABLE: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_UNREADABLE = this.cast("ERROR_ARANGO_DATAFILE_UNREADABLE")
  @scala.inline
  def ERROR_ARANGO_DATA_SOURCE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND = this.cast("ERROR_ARANGO_DATA_SOURCE_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_HANDLE_BAD: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_HANDLE_BAD = this.cast("ERROR_ARANGO_DOCUMENT_HANDLE_BAD")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_BAD: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_BAD = this.cast("ERROR_ARANGO_DOCUMENT_KEY_BAD")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_MISSING: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_MISSING = this.cast("ERROR_ARANGO_DOCUMENT_KEY_MISSING")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED = this.cast("ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND = this.cast("ERROR_ARANGO_DOCUMENT_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED = this.cast("ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_REV_BAD: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_REV_BAD = this.cast("ERROR_ARANGO_DOCUMENT_REV_BAD")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TOO_LARGE: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TOO_LARGE = this.cast("ERROR_ARANGO_DOCUMENT_TOO_LARGE")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TYPE_INVALID: typings.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TYPE_INVALID = this.cast("ERROR_ARANGO_DOCUMENT_TYPE_INVALID")
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_IDENTIFIER: typings.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_IDENTIFIER = this.cast("ERROR_ARANGO_DUPLICATE_IDENTIFIER")
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_NAME: typings.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_NAME = this.cast("ERROR_ARANGO_DUPLICATE_NAME")
  @scala.inline
  def ERROR_ARANGO_EMPTY_DATADIR: typings.arangodb.arangodbStrings.ERROR_ARANGO_EMPTY_DATADIR = this.cast("ERROR_ARANGO_EMPTY_DATADIR")
  @scala.inline
  def ERROR_ARANGO_ENDPOINT_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_ENDPOINT_NOT_FOUND = this.cast("ERROR_ARANGO_ENDPOINT_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_FILESYSTEM_FULL: typings.arangodb.arangodbStrings.ERROR_ARANGO_FILESYSTEM_FULL = this.cast("ERROR_ARANGO_FILESYSTEM_FULL")
  @scala.inline
  def ERROR_ARANGO_ICU_ERROR: typings.arangodb.arangodbStrings.ERROR_ARANGO_ICU_ERROR = this.cast("ERROR_ARANGO_ICU_ERROR")
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_NAME: typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_NAME = this.cast("ERROR_ARANGO_ILLEGAL_NAME")
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_PARAMETER_FILE: typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE = this.cast("ERROR_ARANGO_ILLEGAL_PARAMETER_FILE")
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_STATE: typings.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_STATE = this.cast("ERROR_ARANGO_ILLEGAL_STATE")
  @scala.inline
  def ERROR_ARANGO_INDEX_CREATION_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_CREATION_FAILED = this.cast("ERROR_ARANGO_INDEX_CREATION_FAILED")
  @scala.inline
  def ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING: typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING = this.cast("ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING")
  @scala.inline
  def ERROR_ARANGO_INDEX_HANDLE_BAD: typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_HANDLE_BAD = this.cast("ERROR_ARANGO_INDEX_HANDLE_BAD")
  @scala.inline
  def ERROR_ARANGO_INDEX_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_NOT_FOUND = this.cast("ERROR_ARANGO_INDEX_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE: typings.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE = this.cast("ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE")
  @scala.inline
  def ERROR_ARANGO_INVALID_KEY_GENERATOR: typings.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_KEY_GENERATOR = this.cast("ERROR_ARANGO_INVALID_KEY_GENERATOR")
  @scala.inline
  def ERROR_ARANGO_IO_ERROR: typings.arangodb.arangodbStrings.ERROR_ARANGO_IO_ERROR = this.cast("ERROR_ARANGO_IO_ERROR")
  @scala.inline
  def ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL: typings.arangodb.arangodbStrings.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL = this.cast("ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL")
  @scala.inline
  def ERROR_ARANGO_MERGE_IN_PROGRESS: typings.arangodb.arangodbStrings.ERROR_ARANGO_MERGE_IN_PROGRESS = this.cast("ERROR_ARANGO_MERGE_IN_PROGRESS")
  @scala.inline
  def ERROR_ARANGO_MMAP_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_MMAP_FAILED = this.cast("ERROR_ARANGO_MMAP_FAILED")
  @scala.inline
  def ERROR_ARANGO_MSYNC_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_MSYNC_FAILED = this.cast("ERROR_ARANGO_MSYNC_FAILED")
  @scala.inline
  def ERROR_ARANGO_NO_INDEX: typings.arangodb.arangodbStrings.ERROR_ARANGO_NO_INDEX = this.cast("ERROR_ARANGO_NO_INDEX")
  @scala.inline
  def ERROR_ARANGO_NO_JOURNAL: typings.arangodb.arangodbStrings.ERROR_ARANGO_NO_JOURNAL = this.cast("ERROR_ARANGO_NO_JOURNAL")
  @scala.inline
  def ERROR_ARANGO_OUT_OF_KEYS: typings.arangodb.arangodbStrings.ERROR_ARANGO_OUT_OF_KEYS = this.cast("ERROR_ARANGO_OUT_OF_KEYS")
  @scala.inline
  def ERROR_ARANGO_READ_ONLY: typings.arangodb.arangodbStrings.ERROR_ARANGO_READ_ONLY = this.cast("ERROR_ARANGO_READ_ONLY")
  @scala.inline
  def ERROR_ARANGO_RECOVERY: typings.arangodb.arangodbStrings.ERROR_ARANGO_RECOVERY = this.cast("ERROR_ARANGO_RECOVERY")
  @scala.inline
  def ERROR_ARANGO_SYNC_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_ARANGO_SYNC_TIMEOUT = this.cast("ERROR_ARANGO_SYNC_TIMEOUT")
  @scala.inline
  def ERROR_ARANGO_TRY_AGAIN: typings.arangodb.arangodbStrings.ERROR_ARANGO_TRY_AGAIN = this.cast("ERROR_ARANGO_TRY_AGAIN")
  @scala.inline
  def ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED: typings.arangodb.arangodbStrings.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED = this.cast("ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED")
  @scala.inline
  def ERROR_ARANGO_USE_SYSTEM_DATABASE: typings.arangodb.arangodbStrings.ERROR_ARANGO_USE_SYSTEM_DATABASE = this.cast("ERROR_ARANGO_USE_SYSTEM_DATABASE")
  @scala.inline
  def ERROR_ARANGO_VALIDATION_FAILED: typings.arangodb.arangodbStrings.ERROR_ARANGO_VALIDATION_FAILED = this.cast("ERROR_ARANGO_VALIDATION_FAILED")
  @scala.inline
  def ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT = this.cast("ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT")
  @scala.inline
  def ERROR_BAD_PARAMETER: typings.arangodb.arangodbStrings.ERROR_BAD_PARAMETER = this.cast("ERROR_BAD_PARAMETER")
  @scala.inline
  def ERROR_CANNOT_CREATE_DIRECTORY: typings.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_DIRECTORY = this.cast("ERROR_CANNOT_CREATE_DIRECTORY")
  @scala.inline
  def ERROR_CANNOT_CREATE_TEMP_FILE: typings.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_TEMP_FILE = this.cast("ERROR_CANNOT_CREATE_TEMP_FILE")
  @scala.inline
  def ERROR_CANNOT_DROP_SMART_COLLECTION: typings.arangodb.arangodbStrings.ERROR_CANNOT_DROP_SMART_COLLECTION = this.cast("ERROR_CANNOT_DROP_SMART_COLLECTION")
  @scala.inline
  def ERROR_CANNOT_OVERWRITE_FILE: typings.arangodb.arangodbStrings.ERROR_CANNOT_OVERWRITE_FILE = this.cast("ERROR_CANNOT_OVERWRITE_FILE")
  @scala.inline
  def ERROR_CANNOT_READ_FILE: typings.arangodb.arangodbStrings.ERROR_CANNOT_READ_FILE = this.cast("ERROR_CANNOT_READ_FILE")
  @scala.inline
  def ERROR_CANNOT_WRITE_FILE: typings.arangodb.arangodbStrings.ERROR_CANNOT_WRITE_FILE = this.cast("ERROR_CANNOT_WRITE_FILE")
  @scala.inline
  def ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED: typings.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED = this.cast("ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED")
  @scala.inline
  def ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID: typings.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID = this.cast("ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID")
  @scala.inline
  def ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC: typings.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC = this.cast("ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC")
  @scala.inline
  def ERROR_CLUSTER_AQL_COMMUNICATION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COMMUNICATION = this.cast("ERROR_CLUSTER_AQL_COMMUNICATION")
  @scala.inline
  def ERROR_CLUSTER_BACKEND_UNAVAILABLE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_BACKEND_UNAVAILABLE = this.cast("ERROR_CLUSTER_BACKEND_UNAVAILABLE")
  @scala.inline
  def ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE = this.cast("ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE")
  @scala.inline
  def ERROR_CLUSTER_COLLECTION_ID_EXISTS: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COLLECTION_ID_EXISTS = this.cast("ERROR_CLUSTER_COLLECTION_ID_EXISTS")
  @scala.inline
  def ERROR_CLUSTER_CONNECTION_LOST: typings.arangodb.arangodbStrings.ERROR_CLUSTER_CONNECTION_LOST = this.cast("ERROR_CLUSTER_CONNECTION_LOST")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DETERMINE_ID: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID = this.cast("ERROR_CLUSTER_COULD_NOT_DETERMINE_ID")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER = this.cast("ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_LOCK_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_LOCK_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION = this.cast("ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT = this.cast("ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT = this.cast("ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION = this.cast("ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION")
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS: typings.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS = this.cast("ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS")
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR: typings.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR = this.cast("ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR")
  @scala.inline
  def ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS: typings.arangodb.arangodbStrings.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS = this.cast("ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS")
  @scala.inline
  def ERROR_CLUSTER_INSUFFICIENT_DBSERVERS: typings.arangodb.arangodbStrings.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS = this.cast("ERROR_CLUSTER_INSUFFICIENT_DBSERVERS")
  @scala.inline
  def ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING: typings.arangodb.arangodbStrings.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING = this.cast("ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING")
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES: typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES = this.cast("ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES")
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE = this.cast("ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE")
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY: typings.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY = this.cast("ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY")
  @scala.inline
  def ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN: typings.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN = this.cast("ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN")
  @scala.inline
  def ERROR_CLUSTER_NOT_LEADER: typings.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_LEADER = this.cast("ERROR_CLUSTER_NOT_LEADER")
  @scala.inline
  def ERROR_CLUSTER_NO_AGENCY: typings.arangodb.arangodbStrings.ERROR_CLUSTER_NO_AGENCY = this.cast("ERROR_CLUSTER_NO_AGENCY")
  @scala.inline
  def ERROR_CLUSTER_NO_COORDINATOR_HEADER: typings.arangodb.arangodbStrings.ERROR_CLUSTER_NO_COORDINATOR_HEADER = this.cast("ERROR_CLUSTER_NO_COORDINATOR_HEADER")
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_COORDINATOR: typings.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_COORDINATOR = this.cast("ERROR_CLUSTER_ONLY_ON_COORDINATOR")
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_DBSERVER: typings.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_DBSERVER = this.cast("ERROR_CLUSTER_ONLY_ON_DBSERVER")
  @scala.inline
  def ERROR_CLUSTER_READING_PLAN_AGENCY: typings.arangodb.arangodbStrings.ERROR_CLUSTER_READING_PLAN_AGENCY = this.cast("ERROR_CLUSTER_READING_PLAN_AGENCY")
  @scala.inline
  def ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION = this.cast("ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION")
  @scala.inline
  def ERROR_CLUSTER_SHARD_GONE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_GONE = this.cast("ERROR_CLUSTER_SHARD_GONE")
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION: typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION = this.cast("ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION")
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_RESIGNED: typings.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_RESIGNED = this.cast("ERROR_CLUSTER_SHARD_LEADER_RESIGNED")
  @scala.inline
  def ERROR_CLUSTER_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_CLUSTER_TIMEOUT = this.cast("ERROR_CLUSTER_TIMEOUT")
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT: typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT = this.cast("ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT")
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE: typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE = this.cast("ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE")
  @scala.inline
  def ERROR_CLUSTER_UNSUPPORTED: typings.arangodb.arangodbStrings.ERROR_CLUSTER_UNSUPPORTED = this.cast("ERROR_CLUSTER_UNSUPPORTED")
  @scala.inline
  def ERROR_CORRUPTED_CSV: typings.arangodb.arangodbStrings.ERROR_CORRUPTED_CSV = this.cast("ERROR_CORRUPTED_CSV")
  @scala.inline
  def ERROR_CURSOR_BUSY: typings.arangodb.arangodbStrings.ERROR_CURSOR_BUSY = this.cast("ERROR_CURSOR_BUSY")
  @scala.inline
  def ERROR_CURSOR_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_CURSOR_NOT_FOUND = this.cast("ERROR_CURSOR_NOT_FOUND")
  @scala.inline
  def ERROR_DEADLOCK: typings.arangodb.arangodbStrings.ERROR_DEADLOCK = this.cast("ERROR_DEADLOCK")
  @scala.inline
  def ERROR_DEAD_PID: typings.arangodb.arangodbStrings.ERROR_DEAD_PID = this.cast("ERROR_DEAD_PID")
  @scala.inline
  def ERROR_DEBUG: typings.arangodb.arangodbStrings.ERROR_DEBUG = this.cast("ERROR_DEBUG")
  @scala.inline
  def ERROR_DISPATCHER_IS_STOPPING: typings.arangodb.arangodbStrings.ERROR_DISPATCHER_IS_STOPPING = this.cast("ERROR_DISPATCHER_IS_STOPPING")
  @scala.inline
  def ERROR_FAILED: typings.arangodb.arangodbStrings.ERROR_FAILED = this.cast("ERROR_FAILED")
  @scala.inline
  def ERROR_FILE_EXISTS: typings.arangodb.arangodbStrings.ERROR_FILE_EXISTS = this.cast("ERROR_FILE_EXISTS")
  @scala.inline
  def ERROR_FILE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_FILE_NOT_FOUND = this.cast("ERROR_FILE_NOT_FOUND")
  @scala.inline
  def ERROR_FORBIDDEN: typings.arangodb.arangodbStrings.ERROR_FORBIDDEN = this.cast("ERROR_FORBIDDEN")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_EDGE: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE = this.cast("ERROR_GRAPH_COULD_NOT_CHANGE_EDGE")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX = this.cast("ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_EDGE: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_EDGE = this.cast("ERROR_GRAPH_COULD_NOT_CREATE_EDGE")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_GRAPH: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH = this.cast("ERROR_GRAPH_COULD_NOT_CREATE_GRAPH")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_VERTEX: typings.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX = this.cast("ERROR_GRAPH_COULD_NOT_CREATE_VERTEX")
  @scala.inline
  def ERROR_GRAPH_EMPTY: typings.arangodb.arangodbStrings.ERROR_GRAPH_EMPTY = this.cast("ERROR_GRAPH_EMPTY")
  @scala.inline
  def ERROR_GRAPH_INVALID_EDGE: typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_EDGE = this.cast("ERROR_GRAPH_INVALID_EDGE")
  @scala.inline
  def ERROR_GRAPH_INVALID_FILTER_RESULT: typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_FILTER_RESULT = this.cast("ERROR_GRAPH_INVALID_FILTER_RESULT")
  @scala.inline
  def ERROR_GRAPH_INVALID_GRAPH: typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_GRAPH = this.cast("ERROR_GRAPH_INVALID_GRAPH")
  @scala.inline
  def ERROR_GRAPH_INVALID_VERTEX: typings.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_VERTEX = this.cast("ERROR_GRAPH_INVALID_VERTEX")
  @scala.inline
  def ERROR_GRAPH_TOO_MANY_ITERATIONS: typings.arangodb.arangodbStrings.ERROR_GRAPH_TOO_MANY_ITERATIONS = this.cast("ERROR_GRAPH_TOO_MANY_ITERATIONS")
  @scala.inline
  def ERROR_HTTP_BAD_PARAMETER: typings.arangodb.arangodbStrings.ERROR_HTTP_BAD_PARAMETER = this.cast("ERROR_HTTP_BAD_PARAMETER")
  @scala.inline
  def ERROR_HTTP_CORRUPTED_JSON: typings.arangodb.arangodbStrings.ERROR_HTTP_CORRUPTED_JSON = this.cast("ERROR_HTTP_CORRUPTED_JSON")
  @scala.inline
  def ERROR_HTTP_FORBIDDEN: typings.arangodb.arangodbStrings.ERROR_HTTP_FORBIDDEN = this.cast("ERROR_HTTP_FORBIDDEN")
  @scala.inline
  def ERROR_HTTP_GATEWAY_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_HTTP_GATEWAY_TIMEOUT = this.cast("ERROR_HTTP_GATEWAY_TIMEOUT")
  @scala.inline
  def ERROR_HTTP_METHOD_NOT_ALLOWED: typings.arangodb.arangodbStrings.ERROR_HTTP_METHOD_NOT_ALLOWED = this.cast("ERROR_HTTP_METHOD_NOT_ALLOWED")
  @scala.inline
  def ERROR_HTTP_NOT_ACCEPTABLE: typings.arangodb.arangodbStrings.ERROR_HTTP_NOT_ACCEPTABLE = this.cast("ERROR_HTTP_NOT_ACCEPTABLE")
  @scala.inline
  def ERROR_HTTP_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_HTTP_NOT_FOUND = this.cast("ERROR_HTTP_NOT_FOUND")
  @scala.inline
  def ERROR_HTTP_PRECONDITION_FAILED: typings.arangodb.arangodbStrings.ERROR_HTTP_PRECONDITION_FAILED = this.cast("ERROR_HTTP_PRECONDITION_FAILED")
  @scala.inline
  def ERROR_HTTP_SERVER_ERROR: typings.arangodb.arangodbStrings.ERROR_HTTP_SERVER_ERROR = this.cast("ERROR_HTTP_SERVER_ERROR")
  @scala.inline
  def ERROR_HTTP_SERVICE_UNAVAILABLE: typings.arangodb.arangodbStrings.ERROR_HTTP_SERVICE_UNAVAILABLE = this.cast("ERROR_HTTP_SERVICE_UNAVAILABLE")
  @scala.inline
  def ERROR_HTTP_SUPERFLUOUS_SUFFICES: typings.arangodb.arangodbStrings.ERROR_HTTP_SUPERFLUOUS_SUFFICES = this.cast("ERROR_HTTP_SUPERFLUOUS_SUFFICES")
  @scala.inline
  def ERROR_HTTP_UNAUTHORIZED: typings.arangodb.arangodbStrings.ERROR_HTTP_UNAUTHORIZED = this.cast("ERROR_HTTP_UNAUTHORIZED")
  @scala.inline
  def ERROR_ILLEGAL_NUMBER: typings.arangodb.arangodbStrings.ERROR_ILLEGAL_NUMBER = this.cast("ERROR_ILLEGAL_NUMBER")
  @scala.inline
  def ERROR_ILLEGAL_OPTION: typings.arangodb.arangodbStrings.ERROR_ILLEGAL_OPTION = this.cast("ERROR_ILLEGAL_OPTION")
  @scala.inline
  def ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE: typings.arangodb.arangodbStrings.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE = this.cast("ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE")
  @scala.inline
  def ERROR_INTERNAL: typings.arangodb.arangodbStrings.ERROR_INTERNAL = this.cast("ERROR_INTERNAL")
  @scala.inline
  def ERROR_INVALID_FOXX_OPTIONS: typings.arangodb.arangodbStrings.ERROR_INVALID_FOXX_OPTIONS = this.cast("ERROR_INVALID_FOXX_OPTIONS")
  @scala.inline
  def ERROR_INVALID_MOUNTPOINT: typings.arangodb.arangodbStrings.ERROR_INVALID_MOUNTPOINT = this.cast("ERROR_INVALID_MOUNTPOINT")
  @scala.inline
  def ERROR_INVALID_SERVICE_MANIFEST: typings.arangodb.arangodbStrings.ERROR_INVALID_SERVICE_MANIFEST = this.cast("ERROR_INVALID_SERVICE_MANIFEST")
  @scala.inline
  def ERROR_IP_ADDRESS_INVALID: typings.arangodb.arangodbStrings.ERROR_IP_ADDRESS_INVALID = this.cast("ERROR_IP_ADDRESS_INVALID")
  @scala.inline
  def ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE: typings.arangodb.arangodbStrings.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE = this.cast("ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE")
  @scala.inline
  def ERROR_LDAP_CANNOT_BIND: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_BIND = this.cast("ERROR_LDAP_CANNOT_BIND")
  @scala.inline
  def ERROR_LDAP_CANNOT_INIT: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_INIT = this.cast("ERROR_LDAP_CANNOT_INIT")
  @scala.inline
  def ERROR_LDAP_CANNOT_SEARCH: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SEARCH = this.cast("ERROR_LDAP_CANNOT_SEARCH")
  @scala.inline
  def ERROR_LDAP_CANNOT_SET_OPTION: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SET_OPTION = this.cast("ERROR_LDAP_CANNOT_SET_OPTION")
  @scala.inline
  def ERROR_LDAP_CANNOT_START_TLS: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_START_TLS = this.cast("ERROR_LDAP_CANNOT_START_TLS")
  @scala.inline
  def ERROR_LDAP_CANNOT_UNBIND: typings.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_UNBIND = this.cast("ERROR_LDAP_CANNOT_UNBIND")
  @scala.inline
  def ERROR_LDAP_FOUND_NO_OBJECTS: typings.arangodb.arangodbStrings.ERROR_LDAP_FOUND_NO_OBJECTS = this.cast("ERROR_LDAP_FOUND_NO_OBJECTS")
  @scala.inline
  def ERROR_LDAP_INVALID_MODE: typings.arangodb.arangodbStrings.ERROR_LDAP_INVALID_MODE = this.cast("ERROR_LDAP_INVALID_MODE")
  @scala.inline
  def ERROR_LDAP_NOT_ONE_USER_FOUND: typings.arangodb.arangodbStrings.ERROR_LDAP_NOT_ONE_USER_FOUND = this.cast("ERROR_LDAP_NOT_ONE_USER_FOUND")
  @scala.inline
  def ERROR_LDAP_USER_NOT_IDENTIFIED: typings.arangodb.arangodbStrings.ERROR_LDAP_USER_NOT_IDENTIFIED = this.cast("ERROR_LDAP_USER_NOT_IDENTIFIED")
  @scala.inline
  def ERROR_LOCKED: typings.arangodb.arangodbStrings.ERROR_LOCKED = this.cast("ERROR_LOCKED")
  @scala.inline
  def ERROR_LOCK_TIMEOUT: typings.arangodb.arangodbStrings.ERROR_LOCK_TIMEOUT = this.cast("ERROR_LOCK_TIMEOUT")
  @scala.inline
  def ERROR_MALFORMED_MANIFEST_FILE: typings.arangodb.arangodbStrings.ERROR_MALFORMED_MANIFEST_FILE = this.cast("ERROR_MALFORMED_MANIFEST_FILE")
  @scala.inline
  def ERROR_MODULE_FAILURE: typings.arangodb.arangodbStrings.ERROR_MODULE_FAILURE = this.cast("ERROR_MODULE_FAILURE")
  @scala.inline
  def ERROR_MODULE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_MODULE_NOT_FOUND = this.cast("ERROR_MODULE_NOT_FOUND")
  @scala.inline
  def ERROR_MODULE_SYNTAX_ERROR: typings.arangodb.arangodbStrings.ERROR_MODULE_SYNTAX_ERROR = this.cast("ERROR_MODULE_SYNTAX_ERROR")
  @scala.inline
  def ERROR_NOT_IMPLEMENTED: typings.arangodb.arangodbStrings.ERROR_NOT_IMPLEMENTED = this.cast("ERROR_NOT_IMPLEMENTED")
  @scala.inline
  def ERROR_NO_ERROR: typings.arangodb.arangodbStrings.ERROR_NO_ERROR = this.cast("ERROR_NO_ERROR")
  @scala.inline
  def ERROR_NO_SMART_COLLECTION: typings.arangodb.arangodbStrings.ERROR_NO_SMART_COLLECTION = this.cast("ERROR_NO_SMART_COLLECTION")
  @scala.inline
  def ERROR_NO_SMART_GRAPH_ATTRIBUTE: typings.arangodb.arangodbStrings.ERROR_NO_SMART_GRAPH_ATTRIBUTE = this.cast("ERROR_NO_SMART_GRAPH_ATTRIBUTE")
  @scala.inline
  def ERROR_NUMERIC_OVERFLOW: typings.arangodb.arangodbStrings.ERROR_NUMERIC_OVERFLOW = this.cast("ERROR_NUMERIC_OVERFLOW")
  @scala.inline
  def ERROR_ONLY_ENTERPRISE: typings.arangodb.arangodbStrings.ERROR_ONLY_ENTERPRISE = this.cast("ERROR_ONLY_ENTERPRISE")
  @scala.inline
  def ERROR_OUT_OF_MEMORY: typings.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY = this.cast("ERROR_OUT_OF_MEMORY")
  @scala.inline
  def ERROR_OUT_OF_MEMORY_MMAP: typings.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY_MMAP = this.cast("ERROR_OUT_OF_MEMORY_MMAP")
  @scala.inline
  def ERROR_QUERY_ACCESS_AFTER_MODIFICATION: typings.arangodb.arangodbStrings.ERROR_QUERY_ACCESS_AFTER_MODIFICATION = this.cast("ERROR_QUERY_ACCESS_AFTER_MODIFICATION")
  @scala.inline
  def ERROR_QUERY_ARRAY_EXPECTED: typings.arangodb.arangodbStrings.ERROR_QUERY_ARRAY_EXPECTED = this.cast("ERROR_QUERY_ARRAY_EXPECTED")
  @scala.inline
  def ERROR_QUERY_BAD_JSON_PLAN: typings.arangodb.arangodbStrings.ERROR_QUERY_BAD_JSON_PLAN = this.cast("ERROR_QUERY_BAD_JSON_PLAN")
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETERS_INVALID: typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETERS_INVALID = this.cast("ERROR_QUERY_BIND_PARAMETERS_INVALID")
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_MISSING: typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_MISSING = this.cast("ERROR_QUERY_BIND_PARAMETER_MISSING")
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_TYPE: typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_TYPE = this.cast("ERROR_QUERY_BIND_PARAMETER_TYPE")
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_UNDECLARED: typings.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_UNDECLARED = this.cast("ERROR_QUERY_BIND_PARAMETER_UNDECLARED")
  @scala.inline
  def ERROR_QUERY_COLLECTION_LOCK_FAILED: typings.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_LOCK_FAILED = this.cast("ERROR_QUERY_COLLECTION_LOCK_FAILED")
  @scala.inline
  def ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION: typings.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION = this.cast("ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION")
  @scala.inline
  def ERROR_QUERY_COMPILE_TIME_OPTIONS: typings.arangodb.arangodbStrings.ERROR_QUERY_COMPILE_TIME_OPTIONS = this.cast("ERROR_QUERY_COMPILE_TIME_OPTIONS")
  @scala.inline
  def ERROR_QUERY_DISALLOWED_DYNAMIC_CALL: typings.arangodb.arangodbStrings.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL = this.cast("ERROR_QUERY_DISALLOWED_DYNAMIC_CALL")
  @scala.inline
  def ERROR_QUERY_DIVISION_BY_ZERO: typings.arangodb.arangodbStrings.ERROR_QUERY_DIVISION_BY_ZERO = this.cast("ERROR_QUERY_DIVISION_BY_ZERO")
  @scala.inline
  def ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED: typings.arangodb.arangodbStrings.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED = this.cast("ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED")
  @scala.inline
  def ERROR_QUERY_EMPTY: typings.arangodb.arangodbStrings.ERROR_QUERY_EMPTY = this.cast("ERROR_QUERY_EMPTY")
  @scala.inline
  def ERROR_QUERY_EXCEPTION_OPTIONS: typings.arangodb.arangodbStrings.ERROR_QUERY_EXCEPTION_OPTIONS = this.cast("ERROR_QUERY_EXCEPTION_OPTIONS")
  @scala.inline
  def ERROR_QUERY_FAIL_CALLED: typings.arangodb.arangodbStrings.ERROR_QUERY_FAIL_CALLED = this.cast("ERROR_QUERY_FAIL_CALLED")
  @scala.inline
  def ERROR_QUERY_FULLTEXT_INDEX_MISSING: typings.arangodb.arangodbStrings.ERROR_QUERY_FULLTEXT_INDEX_MISSING = this.cast("ERROR_QUERY_FULLTEXT_INDEX_MISSING")
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH = this.cast("ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH")
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH = this.cast("ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH")
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_CODE: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_CODE = this.cast("ERROR_QUERY_FUNCTION_INVALID_CODE")
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_NAME: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_NAME = this.cast("ERROR_QUERY_FUNCTION_INVALID_NAME")
  @scala.inline
  def ERROR_QUERY_FUNCTION_NAME_UNKNOWN: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NAME_UNKNOWN = this.cast("ERROR_QUERY_FUNCTION_NAME_UNKNOWN")
  @scala.inline
  def ERROR_QUERY_FUNCTION_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NOT_FOUND = this.cast("ERROR_QUERY_FUNCTION_NOT_FOUND")
  @scala.inline
  def ERROR_QUERY_FUNCTION_RUNTIME_ERROR: typings.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_RUNTIME_ERROR = this.cast("ERROR_QUERY_FUNCTION_RUNTIME_ERROR")
  @scala.inline
  def ERROR_QUERY_GEO_INDEX_MISSING: typings.arangodb.arangodbStrings.ERROR_QUERY_GEO_INDEX_MISSING = this.cast("ERROR_QUERY_GEO_INDEX_MISSING")
  @scala.inline
  def ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION = this.cast("ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION")
  @scala.inline
  def ERROR_QUERY_INVALID_ARITHMETIC_VALUE: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_ARITHMETIC_VALUE = this.cast("ERROR_QUERY_INVALID_ARITHMETIC_VALUE")
  @scala.inline
  def ERROR_QUERY_INVALID_DATE_VALUE: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_DATE_VALUE = this.cast("ERROR_QUERY_INVALID_DATE_VALUE")
  @scala.inline
  def ERROR_QUERY_INVALID_LOGICAL_VALUE: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_LOGICAL_VALUE = this.cast("ERROR_QUERY_INVALID_LOGICAL_VALUE")
  @scala.inline
  def ERROR_QUERY_INVALID_REGEX: typings.arangodb.arangodbStrings.ERROR_QUERY_INVALID_REGEX = this.cast("ERROR_QUERY_INVALID_REGEX")
  @scala.inline
  def ERROR_QUERY_IN_USE: typings.arangodb.arangodbStrings.ERROR_QUERY_IN_USE = this.cast("ERROR_QUERY_IN_USE")
  @scala.inline
  def ERROR_QUERY_KILLED: typings.arangodb.arangodbStrings.ERROR_QUERY_KILLED = this.cast("ERROR_QUERY_KILLED")
  @scala.inline
  def ERROR_QUERY_MULTI_MODIFY: typings.arangodb.arangodbStrings.ERROR_QUERY_MULTI_MODIFY = this.cast("ERROR_QUERY_MULTI_MODIFY")
  @scala.inline
  def ERROR_QUERY_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_QUERY_NOT_FOUND = this.cast("ERROR_QUERY_NOT_FOUND")
  @scala.inline
  def ERROR_QUERY_NUMBER_OUT_OF_RANGE: typings.arangodb.arangodbStrings.ERROR_QUERY_NUMBER_OUT_OF_RANGE = this.cast("ERROR_QUERY_NUMBER_OUT_OF_RANGE")
  @scala.inline
  def ERROR_QUERY_PARSE: typings.arangodb.arangodbStrings.ERROR_QUERY_PARSE = this.cast("ERROR_QUERY_PARSE")
  @scala.inline
  def ERROR_QUERY_SCRIPT: typings.arangodb.arangodbStrings.ERROR_QUERY_SCRIPT = this.cast("ERROR_QUERY_SCRIPT")
  @scala.inline
  def ERROR_QUERY_TOO_MANY_COLLECTIONS: typings.arangodb.arangodbStrings.ERROR_QUERY_TOO_MANY_COLLECTIONS = this.cast("ERROR_QUERY_TOO_MANY_COLLECTIONS")
  @scala.inline
  def ERROR_QUERY_USER_ASSERT: typings.arangodb.arangodbStrings.ERROR_QUERY_USER_ASSERT = this.cast("ERROR_QUERY_USER_ASSERT")
  @scala.inline
  def ERROR_QUERY_USER_WARN: typings.arangodb.arangodbStrings.ERROR_QUERY_USER_WARN = this.cast("ERROR_QUERY_USER_WARN")
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_INVALID: typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_INVALID = this.cast("ERROR_QUERY_VARIABLE_NAME_INVALID")
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_UNKNOWN: typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_UNKNOWN = this.cast("ERROR_QUERY_VARIABLE_NAME_UNKNOWN")
  @scala.inline
  def ERROR_QUERY_VARIABLE_REDECLARED: typings.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_REDECLARED = this.cast("ERROR_QUERY_VARIABLE_REDECLARED")
  @scala.inline
  def ERROR_QUEUE_FULL: typings.arangodb.arangodbStrings.ERROR_QUEUE_FULL = this.cast("ERROR_QUEUE_FULL")
  @scala.inline
  def ERROR_QUEUE_UNKNOWN: typings.arangodb.arangodbStrings.ERROR_QUEUE_UNKNOWN = this.cast("ERROR_QUEUE_UNKNOWN")
  @scala.inline
  def ERROR_REPLICATION_APPLIER_STOPPED: typings.arangodb.arangodbStrings.ERROR_REPLICATION_APPLIER_STOPPED = this.cast("ERROR_REPLICATION_APPLIER_STOPPED")
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION: typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION = this.cast("ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION")
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_STATE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_STATE = this.cast("ERROR_REPLICATION_INVALID_APPLIER_STATE")
  @scala.inline
  def ERROR_REPLICATION_INVALID_RESPONSE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_RESPONSE = this.cast("ERROR_REPLICATION_INVALID_RESPONSE")
  @scala.inline
  def ERROR_REPLICATION_LOOP: typings.arangodb.arangodbStrings.ERROR_REPLICATION_LOOP = this.cast("ERROR_REPLICATION_LOOP")
  @scala.inline
  def ERROR_REPLICATION_MASTER_CHANGE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_CHANGE = this.cast("ERROR_REPLICATION_MASTER_CHANGE")
  @scala.inline
  def ERROR_REPLICATION_MASTER_ERROR: typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_ERROR = this.cast("ERROR_REPLICATION_MASTER_ERROR")
  @scala.inline
  def ERROR_REPLICATION_MASTER_INCOMPATIBLE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_INCOMPATIBLE = this.cast("ERROR_REPLICATION_MASTER_INCOMPATIBLE")
  @scala.inline
  def ERROR_REPLICATION_NO_RESPONSE: typings.arangodb.arangodbStrings.ERROR_REPLICATION_NO_RESPONSE = this.cast("ERROR_REPLICATION_NO_RESPONSE")
  @scala.inline
  def ERROR_REPLICATION_NO_START_TICK: typings.arangodb.arangodbStrings.ERROR_REPLICATION_NO_START_TICK = this.cast("ERROR_REPLICATION_NO_START_TICK")
  @scala.inline
  def ERROR_REPLICATION_RUNNING: typings.arangodb.arangodbStrings.ERROR_REPLICATION_RUNNING = this.cast("ERROR_REPLICATION_RUNNING")
  @scala.inline
  def ERROR_REPLICATION_SHARD_NONEMPTY: typings.arangodb.arangodbStrings.ERROR_REPLICATION_SHARD_NONEMPTY = this.cast("ERROR_REPLICATION_SHARD_NONEMPTY")
  @scala.inline
  def ERROR_REPLICATION_START_TICK_NOT_PRESENT: typings.arangodb.arangodbStrings.ERROR_REPLICATION_START_TICK_NOT_PRESENT = this.cast("ERROR_REPLICATION_START_TICK_NOT_PRESENT")
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_MARKER: typings.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_MARKER = this.cast("ERROR_REPLICATION_UNEXPECTED_MARKER")
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_TRANSACTION: typings.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_TRANSACTION = this.cast("ERROR_REPLICATION_UNEXPECTED_TRANSACTION")
  @scala.inline
  def ERROR_REPLICATION_WRONG_CHECKSUM: typings.arangodb.arangodbStrings.ERROR_REPLICATION_WRONG_CHECKSUM = this.cast("ERROR_REPLICATION_WRONG_CHECKSUM")
  @scala.inline
  def ERROR_REQUEST_CANCELED: typings.arangodb.arangodbStrings.ERROR_REQUEST_CANCELED = this.cast("ERROR_REQUEST_CANCELED")
  @scala.inline
  def ERROR_RESOURCE_LIMIT: typings.arangodb.arangodbStrings.ERROR_RESOURCE_LIMIT = this.cast("ERROR_RESOURCE_LIMIT")
  @scala.inline
  def ERROR_SERVICE_DOWNLOAD_FAILED: typings.arangodb.arangodbStrings.ERROR_SERVICE_DOWNLOAD_FAILED = this.cast("ERROR_SERVICE_DOWNLOAD_FAILED")
  @scala.inline
  def ERROR_SERVICE_FILES_MISSING: typings.arangodb.arangodbStrings.ERROR_SERVICE_FILES_MISSING = this.cast("ERROR_SERVICE_FILES_MISSING")
  @scala.inline
  def ERROR_SERVICE_FILES_OUTDATED: typings.arangodb.arangodbStrings.ERROR_SERVICE_FILES_OUTDATED = this.cast("ERROR_SERVICE_FILES_OUTDATED")
  @scala.inline
  def ERROR_SERVICE_INVALID_MOUNT: typings.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_MOUNT = this.cast("ERROR_SERVICE_INVALID_MOUNT")
  @scala.inline
  def ERROR_SERVICE_INVALID_NAME: typings.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_NAME = this.cast("ERROR_SERVICE_INVALID_NAME")
  @scala.inline
  def ERROR_SERVICE_MANIFEST_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_SERVICE_MANIFEST_NOT_FOUND = this.cast("ERROR_SERVICE_MANIFEST_NOT_FOUND")
  @scala.inline
  def ERROR_SERVICE_MOUNTPOINT_CONFLICT: typings.arangodb.arangodbStrings.ERROR_SERVICE_MOUNTPOINT_CONFLICT = this.cast("ERROR_SERVICE_MOUNTPOINT_CONFLICT")
  @scala.inline
  def ERROR_SERVICE_NEEDS_CONFIGURATION: typings.arangodb.arangodbStrings.ERROR_SERVICE_NEEDS_CONFIGURATION = this.cast("ERROR_SERVICE_NEEDS_CONFIGURATION")
  @scala.inline
  def ERROR_SERVICE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_SERVICE_NOT_FOUND = this.cast("ERROR_SERVICE_NOT_FOUND")
  @scala.inline
  def ERROR_SERVICE_OPTIONS_MALFORMED: typings.arangodb.arangodbStrings.ERROR_SERVICE_OPTIONS_MALFORMED = this.cast("ERROR_SERVICE_OPTIONS_MALFORMED")
  @scala.inline
  def ERROR_SERVICE_SOURCE_ERROR: typings.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_ERROR = this.cast("ERROR_SERVICE_SOURCE_ERROR")
  @scala.inline
  def ERROR_SERVICE_SOURCE_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_NOT_FOUND = this.cast("ERROR_SERVICE_SOURCE_NOT_FOUND")
  @scala.inline
  def ERROR_SERVICE_UNKNOWN_SCRIPT: typings.arangodb.arangodbStrings.ERROR_SERVICE_UNKNOWN_SCRIPT = this.cast("ERROR_SERVICE_UNKNOWN_SCRIPT")
  @scala.inline
  def ERROR_SERVICE_UPLOAD_FAILED: typings.arangodb.arangodbStrings.ERROR_SERVICE_UPLOAD_FAILED = this.cast("ERROR_SERVICE_UPLOAD_FAILED")
  @scala.inline
  def ERROR_SESSION_EXPIRED: typings.arangodb.arangodbStrings.ERROR_SESSION_EXPIRED = this.cast("ERROR_SESSION_EXPIRED")
  @scala.inline
  def ERROR_SESSION_UNKNOWN: typings.arangodb.arangodbStrings.ERROR_SESSION_UNKNOWN = this.cast("ERROR_SESSION_UNKNOWN")
  @scala.inline
  def ERROR_SHUTTING_DOWN: typings.arangodb.arangodbStrings.ERROR_SHUTTING_DOWN = this.cast("ERROR_SHUTTING_DOWN")
  @scala.inline
  def ERROR_SUPERVISION_GENERAL_FAILURE: typings.arangodb.arangodbStrings.ERROR_SUPERVISION_GENERAL_FAILURE = this.cast("ERROR_SUPERVISION_GENERAL_FAILURE")
  @scala.inline
  def ERROR_SYS_ERROR: typings.arangodb.arangodbStrings.ERROR_SYS_ERROR = this.cast("ERROR_SYS_ERROR")
  @scala.inline
  def ERROR_TASK_DUPLICATE_ID: typings.arangodb.arangodbStrings.ERROR_TASK_DUPLICATE_ID = this.cast("ERROR_TASK_DUPLICATE_ID")
  @scala.inline
  def ERROR_TASK_INVALID_ID: typings.arangodb.arangodbStrings.ERROR_TASK_INVALID_ID = this.cast("ERROR_TASK_INVALID_ID")
  @scala.inline
  def ERROR_TASK_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_TASK_NOT_FOUND = this.cast("ERROR_TASK_NOT_FOUND")
  @scala.inline
  def ERROR_TRANSACTION_ABORTED: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_ABORTED = this.cast("ERROR_TRANSACTION_ABORTED")
  @scala.inline
  def ERROR_TRANSACTION_DISALLOWED_OPERATION: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_DISALLOWED_OPERATION = this.cast("ERROR_TRANSACTION_DISALLOWED_OPERATION")
  @scala.inline
  def ERROR_TRANSACTION_INTERNAL: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_INTERNAL = this.cast("ERROR_TRANSACTION_INTERNAL")
  @scala.inline
  def ERROR_TRANSACTION_NESTED: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_NESTED = this.cast("ERROR_TRANSACTION_NESTED")
  @scala.inline
  def ERROR_TRANSACTION_UNREGISTERED_COLLECTION: typings.arangodb.arangodbStrings.ERROR_TRANSACTION_UNREGISTERED_COLLECTION = this.cast("ERROR_TRANSACTION_UNREGISTERED_COLLECTION")
  @scala.inline
  def ERROR_TYPE_ERROR: typings.arangodb.arangodbStrings.ERROR_TYPE_ERROR = this.cast("ERROR_TYPE_ERROR")
  @scala.inline
  def ERROR_USER_CHANGE_PASSWORD: typings.arangodb.arangodbStrings.ERROR_USER_CHANGE_PASSWORD = this.cast("ERROR_USER_CHANGE_PASSWORD")
  @scala.inline
  def ERROR_USER_DUPLICATE: typings.arangodb.arangodbStrings.ERROR_USER_DUPLICATE = this.cast("ERROR_USER_DUPLICATE")
  @scala.inline
  def ERROR_USER_EXTERNAL: typings.arangodb.arangodbStrings.ERROR_USER_EXTERNAL = this.cast("ERROR_USER_EXTERNAL")
  @scala.inline
  def ERROR_USER_INVALID_NAME: typings.arangodb.arangodbStrings.ERROR_USER_INVALID_NAME = this.cast("ERROR_USER_INVALID_NAME")
  @scala.inline
  def ERROR_USER_INVALID_PASSWORD: typings.arangodb.arangodbStrings.ERROR_USER_INVALID_PASSWORD = this.cast("ERROR_USER_INVALID_PASSWORD")
  @scala.inline
  def ERROR_USER_NOT_FOUND: typings.arangodb.arangodbStrings.ERROR_USER_NOT_FOUND = this.cast("ERROR_USER_NOT_FOUND")
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_CONNECT: typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_CONNECT = this.cast("SIMPLE_CLIENT_COULD_NOT_CONNECT")
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_READ: typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_READ = this.cast("SIMPLE_CLIENT_COULD_NOT_READ")
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_WRITE: typings.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_WRITE = this.cast("SIMPLE_CLIENT_COULD_NOT_WRITE")
  @scala.inline
  def SIMPLE_CLIENT_UNKNOWN_ERROR: typings.arangodb.arangodbStrings.SIMPLE_CLIENT_UNKNOWN_ERROR = this.cast("SIMPLE_CLIENT_UNKNOWN_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

