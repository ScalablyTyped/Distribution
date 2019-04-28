package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object arangodbLibStrings {
  @js.native
  sealed trait `(unused)`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait COMMUNICATOR_DISABLED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait COMMUNICATOR_REQUEST_ABORTED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait DELETE
    extends arangodbLib.ArangoDBNs.HttpMethod
  
  @js.native
  sealed trait Document extends js.Object
  
  @js.native
  sealed trait DocumentData extends js.Object
  
  @js.native
  sealed trait ERROR_AGENCY_CANNOT_REBUILD_DBS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INFORM_MUST_BE_OBJECT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INFORM_MUST_CONTAIN_ID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_AGENCY_INQUIRY_SYNTAX
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_BUSY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_COLLECTION_NOT_LOADED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_COLLECTION_NOT_UNLOADED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_COLLECTION_PARAMETER_MISSING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_COLLECTION_TYPE_INVALID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_COLLECTION_TYPE_MISMATCH
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_CONFLICT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_CORRUPTED_COLLECTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_CORRUPTED_DATAFILE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_CROSS_COLLECTION_REQUEST
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATABASE_NAME_INVALID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATABASE_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATADIR_INVALID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATADIR_LOCKED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATADIR_NOT_WRITABLE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATADIR_UNLOCKABLE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATAFILE_ALREADY_EXISTS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATAFILE_EMPTY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATAFILE_FULL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATAFILE_SEALED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATAFILE_UNREADABLE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DATA_SOURCE_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_HANDLE_BAD
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_KEY_BAD
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_KEY_MISSING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_REV_BAD
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_TOO_LARGE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DOCUMENT_TYPE_INVALID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DUPLICATE_IDENTIFIER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_DUPLICATE_NAME
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_EMPTY_DATADIR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_ENDPOINT_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_FILESYSTEM_FULL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_ICU_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_ILLEGAL_NAME
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_ILLEGAL_PARAMETER_FILE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_ILLEGAL_STATE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_INDEX_CREATION_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_INDEX_HANDLE_BAD
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_INDEX_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_INVALID_KEY_GENERATOR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_IO_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_MERGE_IN_PROGRESS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_MMAP_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_MSYNC_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_NO_INDEX
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_NO_JOURNAL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_OUT_OF_KEYS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_READ_ONLY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_RECOVERY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_SYNC_TIMEOUT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_TRY_AGAIN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_USE_SYSTEM_DATABASE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_VALIDATION_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_BAD_PARAMETER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CANNOT_CREATE_DIRECTORY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CANNOT_CREATE_TEMP_FILE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CANNOT_DROP_SMART_COLLECTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CANNOT_OVERWRITE_FILE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CANNOT_READ_FILE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CANNOT_WRITE_FILE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_AQL_COMMUNICATION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_BACKEND_UNAVAILABLE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COLLECTION_ID_EXISTS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_CONNECTION_LOST
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_DETERMINE_ID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_LOCK_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_INSUFFICIENT_DBSERVERS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_NOT_LEADER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_NO_AGENCY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_NO_COORDINATOR_HEADER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_ONLY_ON_COORDINATOR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_ONLY_ON_DBSERVER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_READING_PLAN_AGENCY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_SHARD_GONE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_SHARD_LEADER_RESIGNED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_TIMEOUT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CLUSTER_UNSUPPORTED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CORRUPTED_CSV
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CURSOR_BUSY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_CURSOR_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_DEADLOCK
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_DEAD_PID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_DEBUG
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_DISPATCHER_IS_STOPPING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_FILE_EXISTS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_FILE_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_FORBIDDEN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_COULD_NOT_CHANGE_EDGE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_COULD_NOT_CREATE_EDGE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_COULD_NOT_CREATE_GRAPH
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_COULD_NOT_CREATE_VERTEX
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_EMPTY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_INVALID_EDGE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_INVALID_FILTER_RESULT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_INVALID_GRAPH
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_INVALID_VERTEX
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_GRAPH_TOO_MANY_ITERATIONS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_BAD_PARAMETER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_CORRUPTED_JSON
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_FORBIDDEN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_GATEWAY_TIMEOUT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_METHOD_NOT_ALLOWED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_NOT_ACCEPTABLE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_PRECONDITION_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_SERVER_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_SERVICE_UNAVAILABLE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_SUPERFLUOUS_SUFFICES
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_HTTP_UNAUTHORIZED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ILLEGAL_NUMBER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ILLEGAL_OPTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_INTERNAL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_INVALID_FOXX_OPTIONS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_INVALID_MOUNTPOINT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_INVALID_SERVICE_MANIFEST
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_IP_ADDRESS_INVALID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_CANNOT_BIND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_CANNOT_INIT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_CANNOT_SEARCH
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_CANNOT_SET_OPTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_CANNOT_START_TLS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_CANNOT_UNBIND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_FOUND_NO_OBJECTS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_INVALID_MODE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_NOT_ONE_USER_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LDAP_USER_NOT_IDENTIFIED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LOCKED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_LOCK_TIMEOUT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_MALFORMED_MANIFEST_FILE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_MODULE_FAILURE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_MODULE_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_MODULE_SYNTAX_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_NOT_IMPLEMENTED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_NO_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_NO_SMART_COLLECTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_NO_SMART_GRAPH_ATTRIBUTE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_NUMERIC_OVERFLOW
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_ONLY_ENTERPRISE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_OUT_OF_MEMORY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_OUT_OF_MEMORY_MMAP
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_ACCESS_AFTER_MODIFICATION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_ARRAY_EXPECTED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_BAD_JSON_PLAN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_BIND_PARAMETERS_INVALID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_BIND_PARAMETER_MISSING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_BIND_PARAMETER_TYPE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_BIND_PARAMETER_UNDECLARED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_COLLECTION_LOCK_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_COMPILE_TIME_OPTIONS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_DISALLOWED_DYNAMIC_CALL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_DIVISION_BY_ZERO
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_EMPTY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_EXCEPTION_OPTIONS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FAIL_CALLED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FULLTEXT_INDEX_MISSING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FUNCTION_INVALID_CODE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FUNCTION_INVALID_NAME
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FUNCTION_NAME_UNKNOWN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FUNCTION_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_FUNCTION_RUNTIME_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_GEO_INDEX_MISSING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_INVALID_ARITHMETIC_VALUE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_INVALID_DATE_VALUE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_INVALID_LOGICAL_VALUE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_INVALID_REGEX
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_IN_USE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_KILLED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_MULTI_MODIFY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_NUMBER_OUT_OF_RANGE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_PARSE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_SCRIPT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_TOO_MANY_COLLECTIONS
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_USER_ASSERT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_USER_WARN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_VARIABLE_NAME_INVALID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_VARIABLE_NAME_UNKNOWN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUERY_VARIABLE_REDECLARED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUEUE_FULL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_QUEUE_UNKNOWN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_APPLIER_STOPPED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_INVALID_APPLIER_STATE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_INVALID_RESPONSE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_LOOP
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_MASTER_CHANGE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_MASTER_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_MASTER_INCOMPATIBLE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_NO_RESPONSE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_NO_START_TICK
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_RUNNING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_SHARD_NONEMPTY
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_START_TICK_NOT_PRESENT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_UNEXPECTED_MARKER
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_UNEXPECTED_TRANSACTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REPLICATION_WRONG_CHECKSUM
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_REQUEST_CANCELED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_RESOURCE_LIMIT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_DOWNLOAD_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_FILES_MISSING
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_FILES_OUTDATED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_INVALID_MOUNT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_INVALID_NAME
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_MANIFEST_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_MOUNTPOINT_CONFLICT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_NEEDS_CONFIGURATION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_OPTIONS_MALFORMED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_SOURCE_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_SOURCE_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_UNKNOWN_SCRIPT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SERVICE_UPLOAD_FAILED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SESSION_EXPIRED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SESSION_UNKNOWN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SHUTTING_DOWN
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SUPERVISION_GENERAL_FAILURE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_SYS_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TASK_DUPLICATE_ID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TASK_INVALID_ID
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TASK_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TRANSACTION_ABORTED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TRANSACTION_DISALLOWED_OPERATION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TRANSACTION_INTERNAL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TRANSACTION_NESTED
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TRANSACTION_UNREGISTERED_COLLECTION
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_TYPE_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_USER_CHANGE_PASSWORD
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_USER_DUPLICATE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_USER_EXTERNAL
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_USER_INVALID_NAME
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_USER_INVALID_PASSWORD
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait ERROR_USER_NOT_FOUND
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait GET
    extends arangodbLib.ArangoDBNs.HttpMethod
  
  @js.native
  sealed trait HEAD
    extends arangodbLib.ArangoDBNs.HttpMethod
  
  @js.native
  sealed trait `HMAC-SHA1` extends js.Object
  
  @js.native
  sealed trait HS256
    extends arangodbLib.ArangoDBNs.JwtAlgorithm
  
  @js.native
  sealed trait HS384
    extends arangodbLib.ArangoDBNs.JwtAlgorithm
  
  @js.native
  sealed trait HS512
    extends arangodbLib.ArangoDBNs.JwtAlgorithm
  
  @js.native
  sealed trait OPTIONS
    extends arangodbLib.ArangoDBNs.HttpMethod
  
  @js.native
  sealed trait PATCH
    extends arangodbLib.ArangoDBNs.HttpMethod
  
  @js.native
  sealed trait PLAINTEXT extends js.Object
  
  @js.native
  sealed trait POST
    extends arangodbLib.ArangoDBNs.HttpMethod
  
  @js.native
  sealed trait PUT
    extends arangodbLib.ArangoDBNs.HttpMethod
  
  @js.native
  sealed trait SIMPLE_CLIENT_COULD_NOT_CONNECT
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait SIMPLE_CLIENT_COULD_NOT_READ
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait SIMPLE_CLIENT_COULD_NOT_WRITE
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait SIMPLE_CLIENT_UNKNOWN_ERROR
    extends arangodbLib.ArangoDBNs.ErrorName
  
  @js.native
  sealed trait accepted
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `already reported`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait any
    extends arangodbLib.ArangoDBNs.EdgeDirection
  
  @js.native
  sealed trait `application/json` extends js.Object
  
  @js.native
  sealed trait arangosearch extends js.Object
  
  @js.native
  sealed trait autoincrement
    extends arangodbLib.ArangoDBNs.KeyGeneratorType
  
  @js.native
  sealed trait `bad gateway`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `bad request`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `bandwidth limit exceeded`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait bool
    extends arangodbLib.FoxxNs.ConfigurationType
  
  @js.native
  sealed trait boolean
    extends arangodbLib.FoxxNs.ConfigurationType
  
  @js.native
  sealed trait bytes
    extends arangodbLib.ArangoDBNs.ArangoSearchViewConsolidationType
  
  @js.native
  sealed trait bytes_accum
    extends arangodbLib.ArangoDBNs.ArangoSearchViewConsolidationType
  
  @js.native
  sealed trait conflict
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait continue
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait cookie extends js.Object
  
  @js.native
  sealed trait count
    extends arangodbLib.ArangoDBNs.ArangoSearchViewConsolidationType
  
  @js.native
  sealed trait created
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `expectation failed`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `failed dependency`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait fill
    extends arangodbLib.ArangoDBNs.ArangoSearchViewConsolidationType
  
  @js.native
  sealed trait forbidden
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait found
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait fulltext
    extends arangodbLib.ArangoDBNs.IndexType
  
  @js.native
  sealed trait `gateway timeout`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait geo
    extends arangodbLib.ArangoDBNs.IndexType
  
  @js.native
  sealed trait gone
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait hash
    extends arangodbLib.ArangoDBNs.IndexType
  
  @js.native
  sealed trait header extends js.Object
  
  @js.native
  sealed trait `http version not supported`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `i_quotem a teapot`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait id extends js.Object
  
  @js.native
  sealed trait `im used`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait inbound
    extends arangodbLib.ArangoDBNs.EdgeDirection
  
  @js.native
  sealed trait `insufficient storage`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait int
    extends arangodbLib.FoxxNs.ConfigurationType
  
  @js.native
  sealed trait integer
    extends arangodbLib.FoxxNs.ConfigurationType
  
  @js.native
  sealed trait `internal server error`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait json
    extends arangodbLib.FoxxNs.ConfigurationType
  
  @js.native
  sealed trait `length required`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait locked
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `loop detected`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait md5
    extends arangodbLib.ArangoDBNs.HashAlgorithm
  
  @js.native
  sealed trait `method not allowed`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `misdirected request`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait mmfiles
    extends arangodbLib.ArangoDBNs.EngineType
  
  @js.native
  sealed trait `moved permanently`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `multi-status`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `multiple choices`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `network authentication required`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `no content`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `non-authoritative information`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait `not acceptable`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `not extended`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `not found`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `not implemented`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `not modified`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait number
    extends arangodbLib.FoxxNs.ConfigurationType
  
  @js.native
  sealed trait ok
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait outbound
    extends arangodbLib.ArangoDBNs.EdgeDirection
  
  @js.native
  sealed trait `partial content`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait password
    extends arangodbLib.FoxxNs.ConfigurationType
  
  @js.native
  sealed trait `payload too large`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `payment required`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `permanent redirect`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `precondition failed`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `precondition required`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait processing
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `proxy authentication required`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `range not satisfiable`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `request header fields too large`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `request timeout`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `reset content`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait rocksdb
    extends arangodbLib.ArangoDBNs.EngineType
  
  @js.native
  sealed trait `see other`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `service unavailable`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait sha1
    extends arangodbLib.ArangoDBNs.HashAlgorithm
  
  @js.native
  sealed trait sha224
    extends arangodbLib.ArangoDBNs.HashAlgorithm
  
  @js.native
  sealed trait sha256
    extends arangodbLib.ArangoDBNs.HashAlgorithm
  
  @js.native
  sealed trait sha384
    extends arangodbLib.ArangoDBNs.HashAlgorithm
  
  @js.native
  sealed trait sha512
    extends arangodbLib.ArangoDBNs.HashAlgorithm
  
  @js.native
  sealed trait skiplist
    extends arangodbLib.ArangoDBNs.IndexType
  
  @js.native
  sealed trait string
    extends arangodbLib.FoxxNs.ConfigurationType
  
  @js.native
  sealed trait `switching protocols`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `temporary redirect`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `too many requests`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait traditional
    extends arangodbLib.ArangoDBNs.KeyGeneratorType
  
  @js.native
  sealed trait unauthorized
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `unavailable for legal reasons`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `unordered collection`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `unprocessable entity`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `unsupported media type`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `upgrade required`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `uri too long`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `use proxy`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @js.native
  sealed trait `variant also negotiates`
    extends arangodbLib.ArangoDBNs.HttpStatus
  
  @scala.inline
  def `(unused)`: `(unused)` = "(unused)".asInstanceOf[`(unused)`]
  @scala.inline
  def COMMUNICATOR_DISABLED: COMMUNICATOR_DISABLED = "COMMUNICATOR_DISABLED".asInstanceOf[COMMUNICATOR_DISABLED]
  @scala.inline
  def COMMUNICATOR_REQUEST_ABORTED: COMMUNICATOR_REQUEST_ABORTED = "COMMUNICATOR_REQUEST_ABORTED".asInstanceOf[COMMUNICATOR_REQUEST_ABORTED]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def Document: Document = "Document".asInstanceOf[Document]
  @scala.inline
  def DocumentData: DocumentData = "DocumentData".asInstanceOf[DocumentData]
  @scala.inline
  def ERROR_AGENCY_CANNOT_REBUILD_DBS: ERROR_AGENCY_CANNOT_REBUILD_DBS = "ERROR_AGENCY_CANNOT_REBUILD_DBS".asInstanceOf[ERROR_AGENCY_CANNOT_REBUILD_DBS]
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_BE_OBJECT: ERROR_AGENCY_INFORM_MUST_BE_OBJECT = "ERROR_AGENCY_INFORM_MUST_BE_OBJECT".asInstanceOf[ERROR_AGENCY_INFORM_MUST_BE_OBJECT]
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE: ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE = "ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE".asInstanceOf[ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE]
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ID: ERROR_AGENCY_INFORM_MUST_CONTAIN_ID = "ERROR_AGENCY_INFORM_MUST_CONTAIN_ID".asInstanceOf[ERROR_AGENCY_INFORM_MUST_CONTAIN_ID]
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING: ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING = "ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING".asInstanceOf[ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING]
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING: ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING = "ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING".asInstanceOf[ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING]
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL: ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL = "ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL".asInstanceOf[ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL]
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM: ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM = "ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM".asInstanceOf[ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM]
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT: ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT = "ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT".asInstanceOf[ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT]
  @scala.inline
  def ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING: ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING = "ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING".asInstanceOf[ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING]
  @scala.inline
  def ERROR_AGENCY_INQUIRY_SYNTAX: ERROR_AGENCY_INQUIRY_SYNTAX = "ERROR_AGENCY_INQUIRY_SYNTAX".asInstanceOf[ERROR_AGENCY_INQUIRY_SYNTAX]
  @scala.inline
  def ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED: ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED = "ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED".asInstanceOf[ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED]
  @scala.inline
  def ERROR_ARANGO_BUSY: ERROR_ARANGO_BUSY = "ERROR_ARANGO_BUSY".asInstanceOf[ERROR_ARANGO_BUSY]
  @scala.inline
  def ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS: ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS = "ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS".asInstanceOf[ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS]
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_LOADED: ERROR_ARANGO_COLLECTION_NOT_LOADED = "ERROR_ARANGO_COLLECTION_NOT_LOADED".asInstanceOf[ERROR_ARANGO_COLLECTION_NOT_LOADED]
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_UNLOADED: ERROR_ARANGO_COLLECTION_NOT_UNLOADED = "ERROR_ARANGO_COLLECTION_NOT_UNLOADED".asInstanceOf[ERROR_ARANGO_COLLECTION_NOT_UNLOADED]
  @scala.inline
  def ERROR_ARANGO_COLLECTION_PARAMETER_MISSING: ERROR_ARANGO_COLLECTION_PARAMETER_MISSING = "ERROR_ARANGO_COLLECTION_PARAMETER_MISSING".asInstanceOf[ERROR_ARANGO_COLLECTION_PARAMETER_MISSING]
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_INVALID: ERROR_ARANGO_COLLECTION_TYPE_INVALID = "ERROR_ARANGO_COLLECTION_TYPE_INVALID".asInstanceOf[ERROR_ARANGO_COLLECTION_TYPE_INVALID]
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_MISMATCH: ERROR_ARANGO_COLLECTION_TYPE_MISMATCH = "ERROR_ARANGO_COLLECTION_TYPE_MISMATCH".asInstanceOf[ERROR_ARANGO_COLLECTION_TYPE_MISMATCH]
  @scala.inline
  def ERROR_ARANGO_CONFLICT: ERROR_ARANGO_CONFLICT = "ERROR_ARANGO_CONFLICT".asInstanceOf[ERROR_ARANGO_CONFLICT]
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_COLLECTION: ERROR_ARANGO_CORRUPTED_COLLECTION = "ERROR_ARANGO_CORRUPTED_COLLECTION".asInstanceOf[ERROR_ARANGO_CORRUPTED_COLLECTION]
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_DATAFILE: ERROR_ARANGO_CORRUPTED_DATAFILE = "ERROR_ARANGO_CORRUPTED_DATAFILE".asInstanceOf[ERROR_ARANGO_CORRUPTED_DATAFILE]
  @scala.inline
  def ERROR_ARANGO_CROSS_COLLECTION_REQUEST: ERROR_ARANGO_CROSS_COLLECTION_REQUEST = "ERROR_ARANGO_CROSS_COLLECTION_REQUEST".asInstanceOf[ERROR_ARANGO_CROSS_COLLECTION_REQUEST]
  @scala.inline
  def ERROR_ARANGO_DATABASE_NAME_INVALID: ERROR_ARANGO_DATABASE_NAME_INVALID = "ERROR_ARANGO_DATABASE_NAME_INVALID".asInstanceOf[ERROR_ARANGO_DATABASE_NAME_INVALID]
  @scala.inline
  def ERROR_ARANGO_DATABASE_NOT_FOUND: ERROR_ARANGO_DATABASE_NOT_FOUND = "ERROR_ARANGO_DATABASE_NOT_FOUND".asInstanceOf[ERROR_ARANGO_DATABASE_NOT_FOUND]
  @scala.inline
  def ERROR_ARANGO_DATADIR_INVALID: ERROR_ARANGO_DATADIR_INVALID = "ERROR_ARANGO_DATADIR_INVALID".asInstanceOf[ERROR_ARANGO_DATADIR_INVALID]
  @scala.inline
  def ERROR_ARANGO_DATADIR_LOCKED: ERROR_ARANGO_DATADIR_LOCKED = "ERROR_ARANGO_DATADIR_LOCKED".asInstanceOf[ERROR_ARANGO_DATADIR_LOCKED]
  @scala.inline
  def ERROR_ARANGO_DATADIR_NOT_WRITABLE: ERROR_ARANGO_DATADIR_NOT_WRITABLE = "ERROR_ARANGO_DATADIR_NOT_WRITABLE".asInstanceOf[ERROR_ARANGO_DATADIR_NOT_WRITABLE]
  @scala.inline
  def ERROR_ARANGO_DATADIR_UNLOCKABLE: ERROR_ARANGO_DATADIR_UNLOCKABLE = "ERROR_ARANGO_DATADIR_UNLOCKABLE".asInstanceOf[ERROR_ARANGO_DATADIR_UNLOCKABLE]
  @scala.inline
  def ERROR_ARANGO_DATAFILE_ALREADY_EXISTS: ERROR_ARANGO_DATAFILE_ALREADY_EXISTS = "ERROR_ARANGO_DATAFILE_ALREADY_EXISTS".asInstanceOf[ERROR_ARANGO_DATAFILE_ALREADY_EXISTS]
  @scala.inline
  def ERROR_ARANGO_DATAFILE_EMPTY: ERROR_ARANGO_DATAFILE_EMPTY = "ERROR_ARANGO_DATAFILE_EMPTY".asInstanceOf[ERROR_ARANGO_DATAFILE_EMPTY]
  @scala.inline
  def ERROR_ARANGO_DATAFILE_FULL: ERROR_ARANGO_DATAFILE_FULL = "ERROR_ARANGO_DATAFILE_FULL".asInstanceOf[ERROR_ARANGO_DATAFILE_FULL]
  @scala.inline
  def ERROR_ARANGO_DATAFILE_SEALED: ERROR_ARANGO_DATAFILE_SEALED = "ERROR_ARANGO_DATAFILE_SEALED".asInstanceOf[ERROR_ARANGO_DATAFILE_SEALED]
  @scala.inline
  def ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND: ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND = "ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND".asInstanceOf[ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND]
  @scala.inline
  def ERROR_ARANGO_DATAFILE_UNREADABLE: ERROR_ARANGO_DATAFILE_UNREADABLE = "ERROR_ARANGO_DATAFILE_UNREADABLE".asInstanceOf[ERROR_ARANGO_DATAFILE_UNREADABLE]
  @scala.inline
  def ERROR_ARANGO_DATA_SOURCE_NOT_FOUND: ERROR_ARANGO_DATA_SOURCE_NOT_FOUND = "ERROR_ARANGO_DATA_SOURCE_NOT_FOUND".asInstanceOf[ERROR_ARANGO_DATA_SOURCE_NOT_FOUND]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_HANDLE_BAD: ERROR_ARANGO_DOCUMENT_HANDLE_BAD = "ERROR_ARANGO_DOCUMENT_HANDLE_BAD".asInstanceOf[ERROR_ARANGO_DOCUMENT_HANDLE_BAD]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_BAD: ERROR_ARANGO_DOCUMENT_KEY_BAD = "ERROR_ARANGO_DOCUMENT_KEY_BAD".asInstanceOf[ERROR_ARANGO_DOCUMENT_KEY_BAD]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_MISSING: ERROR_ARANGO_DOCUMENT_KEY_MISSING = "ERROR_ARANGO_DOCUMENT_KEY_MISSING".asInstanceOf[ERROR_ARANGO_DOCUMENT_KEY_MISSING]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED: ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED = "ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED".asInstanceOf[ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND: ERROR_ARANGO_DOCUMENT_NOT_FOUND = "ERROR_ARANGO_DOCUMENT_NOT_FOUND".asInstanceOf[ERROR_ARANGO_DOCUMENT_NOT_FOUND]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED: ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED = "ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED".asInstanceOf[ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_REV_BAD: ERROR_ARANGO_DOCUMENT_REV_BAD = "ERROR_ARANGO_DOCUMENT_REV_BAD".asInstanceOf[ERROR_ARANGO_DOCUMENT_REV_BAD]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TOO_LARGE: ERROR_ARANGO_DOCUMENT_TOO_LARGE = "ERROR_ARANGO_DOCUMENT_TOO_LARGE".asInstanceOf[ERROR_ARANGO_DOCUMENT_TOO_LARGE]
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TYPE_INVALID: ERROR_ARANGO_DOCUMENT_TYPE_INVALID = "ERROR_ARANGO_DOCUMENT_TYPE_INVALID".asInstanceOf[ERROR_ARANGO_DOCUMENT_TYPE_INVALID]
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_IDENTIFIER: ERROR_ARANGO_DUPLICATE_IDENTIFIER = "ERROR_ARANGO_DUPLICATE_IDENTIFIER".asInstanceOf[ERROR_ARANGO_DUPLICATE_IDENTIFIER]
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_NAME: ERROR_ARANGO_DUPLICATE_NAME = "ERROR_ARANGO_DUPLICATE_NAME".asInstanceOf[ERROR_ARANGO_DUPLICATE_NAME]
  @scala.inline
  def ERROR_ARANGO_EMPTY_DATADIR: ERROR_ARANGO_EMPTY_DATADIR = "ERROR_ARANGO_EMPTY_DATADIR".asInstanceOf[ERROR_ARANGO_EMPTY_DATADIR]
  @scala.inline
  def ERROR_ARANGO_ENDPOINT_NOT_FOUND: ERROR_ARANGO_ENDPOINT_NOT_FOUND = "ERROR_ARANGO_ENDPOINT_NOT_FOUND".asInstanceOf[ERROR_ARANGO_ENDPOINT_NOT_FOUND]
  @scala.inline
  def ERROR_ARANGO_FILESYSTEM_FULL: ERROR_ARANGO_FILESYSTEM_FULL = "ERROR_ARANGO_FILESYSTEM_FULL".asInstanceOf[ERROR_ARANGO_FILESYSTEM_FULL]
  @scala.inline
  def ERROR_ARANGO_ICU_ERROR: ERROR_ARANGO_ICU_ERROR = "ERROR_ARANGO_ICU_ERROR".asInstanceOf[ERROR_ARANGO_ICU_ERROR]
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_NAME: ERROR_ARANGO_ILLEGAL_NAME = "ERROR_ARANGO_ILLEGAL_NAME".asInstanceOf[ERROR_ARANGO_ILLEGAL_NAME]
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_PARAMETER_FILE: ERROR_ARANGO_ILLEGAL_PARAMETER_FILE = "ERROR_ARANGO_ILLEGAL_PARAMETER_FILE".asInstanceOf[ERROR_ARANGO_ILLEGAL_PARAMETER_FILE]
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_STATE: ERROR_ARANGO_ILLEGAL_STATE = "ERROR_ARANGO_ILLEGAL_STATE".asInstanceOf[ERROR_ARANGO_ILLEGAL_STATE]
  @scala.inline
  def ERROR_ARANGO_INDEX_CREATION_FAILED: ERROR_ARANGO_INDEX_CREATION_FAILED = "ERROR_ARANGO_INDEX_CREATION_FAILED".asInstanceOf[ERROR_ARANGO_INDEX_CREATION_FAILED]
  @scala.inline
  def ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING: ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING = "ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING".asInstanceOf[ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING]
  @scala.inline
  def ERROR_ARANGO_INDEX_HANDLE_BAD: ERROR_ARANGO_INDEX_HANDLE_BAD = "ERROR_ARANGO_INDEX_HANDLE_BAD".asInstanceOf[ERROR_ARANGO_INDEX_HANDLE_BAD]
  @scala.inline
  def ERROR_ARANGO_INDEX_NOT_FOUND: ERROR_ARANGO_INDEX_NOT_FOUND = "ERROR_ARANGO_INDEX_NOT_FOUND".asInstanceOf[ERROR_ARANGO_INDEX_NOT_FOUND]
  @scala.inline
  def ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE: ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE = "ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE".asInstanceOf[ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE]
  @scala.inline
  def ERROR_ARANGO_INVALID_KEY_GENERATOR: ERROR_ARANGO_INVALID_KEY_GENERATOR = "ERROR_ARANGO_INVALID_KEY_GENERATOR".asInstanceOf[ERROR_ARANGO_INVALID_KEY_GENERATOR]
  @scala.inline
  def ERROR_ARANGO_IO_ERROR: ERROR_ARANGO_IO_ERROR = "ERROR_ARANGO_IO_ERROR".asInstanceOf[ERROR_ARANGO_IO_ERROR]
  @scala.inline
  def ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL: ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL = "ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL".asInstanceOf[ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL]
  @scala.inline
  def ERROR_ARANGO_MERGE_IN_PROGRESS: ERROR_ARANGO_MERGE_IN_PROGRESS = "ERROR_ARANGO_MERGE_IN_PROGRESS".asInstanceOf[ERROR_ARANGO_MERGE_IN_PROGRESS]
  @scala.inline
  def ERROR_ARANGO_MMAP_FAILED: ERROR_ARANGO_MMAP_FAILED = "ERROR_ARANGO_MMAP_FAILED".asInstanceOf[ERROR_ARANGO_MMAP_FAILED]
  @scala.inline
  def ERROR_ARANGO_MSYNC_FAILED: ERROR_ARANGO_MSYNC_FAILED = "ERROR_ARANGO_MSYNC_FAILED".asInstanceOf[ERROR_ARANGO_MSYNC_FAILED]
  @scala.inline
  def ERROR_ARANGO_NO_INDEX: ERROR_ARANGO_NO_INDEX = "ERROR_ARANGO_NO_INDEX".asInstanceOf[ERROR_ARANGO_NO_INDEX]
  @scala.inline
  def ERROR_ARANGO_NO_JOURNAL: ERROR_ARANGO_NO_JOURNAL = "ERROR_ARANGO_NO_JOURNAL".asInstanceOf[ERROR_ARANGO_NO_JOURNAL]
  @scala.inline
  def ERROR_ARANGO_OUT_OF_KEYS: ERROR_ARANGO_OUT_OF_KEYS = "ERROR_ARANGO_OUT_OF_KEYS".asInstanceOf[ERROR_ARANGO_OUT_OF_KEYS]
  @scala.inline
  def ERROR_ARANGO_READ_ONLY: ERROR_ARANGO_READ_ONLY = "ERROR_ARANGO_READ_ONLY".asInstanceOf[ERROR_ARANGO_READ_ONLY]
  @scala.inline
  def ERROR_ARANGO_RECOVERY: ERROR_ARANGO_RECOVERY = "ERROR_ARANGO_RECOVERY".asInstanceOf[ERROR_ARANGO_RECOVERY]
  @scala.inline
  def ERROR_ARANGO_SYNC_TIMEOUT: ERROR_ARANGO_SYNC_TIMEOUT = "ERROR_ARANGO_SYNC_TIMEOUT".asInstanceOf[ERROR_ARANGO_SYNC_TIMEOUT]
  @scala.inline
  def ERROR_ARANGO_TRY_AGAIN: ERROR_ARANGO_TRY_AGAIN = "ERROR_ARANGO_TRY_AGAIN".asInstanceOf[ERROR_ARANGO_TRY_AGAIN]
  @scala.inline
  def ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED: ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED = "ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED".asInstanceOf[ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED]
  @scala.inline
  def ERROR_ARANGO_USE_SYSTEM_DATABASE: ERROR_ARANGO_USE_SYSTEM_DATABASE = "ERROR_ARANGO_USE_SYSTEM_DATABASE".asInstanceOf[ERROR_ARANGO_USE_SYSTEM_DATABASE]
  @scala.inline
  def ERROR_ARANGO_VALIDATION_FAILED: ERROR_ARANGO_VALIDATION_FAILED = "ERROR_ARANGO_VALIDATION_FAILED".asInstanceOf[ERROR_ARANGO_VALIDATION_FAILED]
  @scala.inline
  def ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT: ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT = "ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT".asInstanceOf[ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT]
  @scala.inline
  def ERROR_BAD_PARAMETER: ERROR_BAD_PARAMETER = "ERROR_BAD_PARAMETER".asInstanceOf[ERROR_BAD_PARAMETER]
  @scala.inline
  def ERROR_CANNOT_CREATE_DIRECTORY: ERROR_CANNOT_CREATE_DIRECTORY = "ERROR_CANNOT_CREATE_DIRECTORY".asInstanceOf[ERROR_CANNOT_CREATE_DIRECTORY]
  @scala.inline
  def ERROR_CANNOT_CREATE_TEMP_FILE: ERROR_CANNOT_CREATE_TEMP_FILE = "ERROR_CANNOT_CREATE_TEMP_FILE".asInstanceOf[ERROR_CANNOT_CREATE_TEMP_FILE]
  @scala.inline
  def ERROR_CANNOT_DROP_SMART_COLLECTION: ERROR_CANNOT_DROP_SMART_COLLECTION = "ERROR_CANNOT_DROP_SMART_COLLECTION".asInstanceOf[ERROR_CANNOT_DROP_SMART_COLLECTION]
  @scala.inline
  def ERROR_CANNOT_OVERWRITE_FILE: ERROR_CANNOT_OVERWRITE_FILE = "ERROR_CANNOT_OVERWRITE_FILE".asInstanceOf[ERROR_CANNOT_OVERWRITE_FILE]
  @scala.inline
  def ERROR_CANNOT_READ_FILE: ERROR_CANNOT_READ_FILE = "ERROR_CANNOT_READ_FILE".asInstanceOf[ERROR_CANNOT_READ_FILE]
  @scala.inline
  def ERROR_CANNOT_WRITE_FILE: ERROR_CANNOT_WRITE_FILE = "ERROR_CANNOT_WRITE_FILE".asInstanceOf[ERROR_CANNOT_WRITE_FILE]
  @scala.inline
  def ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED: ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED = "ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED".asInstanceOf[ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED]
  @scala.inline
  def ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID: ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID = "ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID".asInstanceOf[ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID]
  @scala.inline
  def ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC: ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC = "ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC".asInstanceOf[ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC]
  @scala.inline
  def ERROR_CLUSTER_AQL_COMMUNICATION: ERROR_CLUSTER_AQL_COMMUNICATION = "ERROR_CLUSTER_AQL_COMMUNICATION".asInstanceOf[ERROR_CLUSTER_AQL_COMMUNICATION]
  @scala.inline
  def ERROR_CLUSTER_BACKEND_UNAVAILABLE: ERROR_CLUSTER_BACKEND_UNAVAILABLE = "ERROR_CLUSTER_BACKEND_UNAVAILABLE".asInstanceOf[ERROR_CLUSTER_BACKEND_UNAVAILABLE]
  @scala.inline
  def ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE: ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE".asInstanceOf[ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE]
  @scala.inline
  def ERROR_CLUSTER_COLLECTION_ID_EXISTS: ERROR_CLUSTER_COLLECTION_ID_EXISTS = "ERROR_CLUSTER_COLLECTION_ID_EXISTS".asInstanceOf[ERROR_CLUSTER_COLLECTION_ID_EXISTS]
  @scala.inline
  def ERROR_CLUSTER_CONNECTION_LOST: ERROR_CLUSTER_CONNECTION_LOST = "ERROR_CLUSTER_CONNECTION_LOST".asInstanceOf[ERROR_CLUSTER_CONNECTION_LOST]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION: ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION = "ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION".asInstanceOf[ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN: ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN".asInstanceOf[ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE: ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE = "ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE".asInstanceOf[ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN: ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN".asInstanceOf[ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN: ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN".asInstanceOf[ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN: ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN".asInstanceOf[ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DETERMINE_ID: ERROR_CLUSTER_COULD_NOT_DETERMINE_ID = "ERROR_CLUSTER_COULD_NOT_DETERMINE_ID".asInstanceOf[ERROR_CLUSTER_COULD_NOT_DETERMINE_ID]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER: ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER = "ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER".asInstanceOf[ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN: ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN".asInstanceOf[ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_LOCK_PLAN: ERROR_CLUSTER_COULD_NOT_LOCK_PLAN = "ERROR_CLUSTER_COULD_NOT_LOCK_PLAN".asInstanceOf[ERROR_CLUSTER_COULD_NOT_LOCK_PLAN]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION: ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION = "ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION".asInstanceOf[ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT: ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT = "ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT".asInstanceOf[ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN: ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN".asInstanceOf[ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT: ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT = "ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT".asInstanceOf[ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN: ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN".asInstanceOf[ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN]
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION: ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION = "ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION".asInstanceOf[ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION]
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS: ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS = "ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS".asInstanceOf[ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS]
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR: ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR = "ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR".asInstanceOf[ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR]
  @scala.inline
  def ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS: ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS = "ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS".asInstanceOf[ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS]
  @scala.inline
  def ERROR_CLUSTER_INSUFFICIENT_DBSERVERS: ERROR_CLUSTER_INSUFFICIENT_DBSERVERS = "ERROR_CLUSTER_INSUFFICIENT_DBSERVERS".asInstanceOf[ERROR_CLUSTER_INSUFFICIENT_DBSERVERS]
  @scala.inline
  def ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING: ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING = "ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING".asInstanceOf[ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING]
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES: ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES = "ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES".asInstanceOf[ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES]
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE: ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE".asInstanceOf[ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE]
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY: ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY = "ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY".asInstanceOf[ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY]
  @scala.inline
  def ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN: ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN = "ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN".asInstanceOf[ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN]
  @scala.inline
  def ERROR_CLUSTER_NOT_LEADER: ERROR_CLUSTER_NOT_LEADER = "ERROR_CLUSTER_NOT_LEADER".asInstanceOf[ERROR_CLUSTER_NOT_LEADER]
  @scala.inline
  def ERROR_CLUSTER_NO_AGENCY: ERROR_CLUSTER_NO_AGENCY = "ERROR_CLUSTER_NO_AGENCY".asInstanceOf[ERROR_CLUSTER_NO_AGENCY]
  @scala.inline
  def ERROR_CLUSTER_NO_COORDINATOR_HEADER: ERROR_CLUSTER_NO_COORDINATOR_HEADER = "ERROR_CLUSTER_NO_COORDINATOR_HEADER".asInstanceOf[ERROR_CLUSTER_NO_COORDINATOR_HEADER]
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_COORDINATOR: ERROR_CLUSTER_ONLY_ON_COORDINATOR = "ERROR_CLUSTER_ONLY_ON_COORDINATOR".asInstanceOf[ERROR_CLUSTER_ONLY_ON_COORDINATOR]
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_DBSERVER: ERROR_CLUSTER_ONLY_ON_DBSERVER = "ERROR_CLUSTER_ONLY_ON_DBSERVER".asInstanceOf[ERROR_CLUSTER_ONLY_ON_DBSERVER]
  @scala.inline
  def ERROR_CLUSTER_READING_PLAN_AGENCY: ERROR_CLUSTER_READING_PLAN_AGENCY = "ERROR_CLUSTER_READING_PLAN_AGENCY".asInstanceOf[ERROR_CLUSTER_READING_PLAN_AGENCY]
  @scala.inline
  def ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION: ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION = "ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION".asInstanceOf[ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION]
  @scala.inline
  def ERROR_CLUSTER_SHARD_GONE: ERROR_CLUSTER_SHARD_GONE = "ERROR_CLUSTER_SHARD_GONE".asInstanceOf[ERROR_CLUSTER_SHARD_GONE]
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION: ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION = "ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION".asInstanceOf[ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION]
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_RESIGNED: ERROR_CLUSTER_SHARD_LEADER_RESIGNED = "ERROR_CLUSTER_SHARD_LEADER_RESIGNED".asInstanceOf[ERROR_CLUSTER_SHARD_LEADER_RESIGNED]
  @scala.inline
  def ERROR_CLUSTER_TIMEOUT: ERROR_CLUSTER_TIMEOUT = "ERROR_CLUSTER_TIMEOUT".asInstanceOf[ERROR_CLUSTER_TIMEOUT]
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT: ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT = "ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT".asInstanceOf[ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT]
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE: ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE".asInstanceOf[ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE]
  @scala.inline
  def ERROR_CLUSTER_UNSUPPORTED: ERROR_CLUSTER_UNSUPPORTED = "ERROR_CLUSTER_UNSUPPORTED".asInstanceOf[ERROR_CLUSTER_UNSUPPORTED]
  @scala.inline
  def ERROR_CORRUPTED_CSV: ERROR_CORRUPTED_CSV = "ERROR_CORRUPTED_CSV".asInstanceOf[ERROR_CORRUPTED_CSV]
  @scala.inline
  def ERROR_CURSOR_BUSY: ERROR_CURSOR_BUSY = "ERROR_CURSOR_BUSY".asInstanceOf[ERROR_CURSOR_BUSY]
  @scala.inline
  def ERROR_CURSOR_NOT_FOUND: ERROR_CURSOR_NOT_FOUND = "ERROR_CURSOR_NOT_FOUND".asInstanceOf[ERROR_CURSOR_NOT_FOUND]
  @scala.inline
  def ERROR_DEADLOCK: ERROR_DEADLOCK = "ERROR_DEADLOCK".asInstanceOf[ERROR_DEADLOCK]
  @scala.inline
  def ERROR_DEAD_PID: ERROR_DEAD_PID = "ERROR_DEAD_PID".asInstanceOf[ERROR_DEAD_PID]
  @scala.inline
  def ERROR_DEBUG: ERROR_DEBUG = "ERROR_DEBUG".asInstanceOf[ERROR_DEBUG]
  @scala.inline
  def ERROR_DISPATCHER_IS_STOPPING: ERROR_DISPATCHER_IS_STOPPING = "ERROR_DISPATCHER_IS_STOPPING".asInstanceOf[ERROR_DISPATCHER_IS_STOPPING]
  @scala.inline
  def ERROR_FAILED: ERROR_FAILED = "ERROR_FAILED".asInstanceOf[ERROR_FAILED]
  @scala.inline
  def ERROR_FILE_EXISTS: ERROR_FILE_EXISTS = "ERROR_FILE_EXISTS".asInstanceOf[ERROR_FILE_EXISTS]
  @scala.inline
  def ERROR_FILE_NOT_FOUND: ERROR_FILE_NOT_FOUND = "ERROR_FILE_NOT_FOUND".asInstanceOf[ERROR_FILE_NOT_FOUND]
  @scala.inline
  def ERROR_FORBIDDEN: ERROR_FORBIDDEN = "ERROR_FORBIDDEN".asInstanceOf[ERROR_FORBIDDEN]
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_EDGE: ERROR_GRAPH_COULD_NOT_CHANGE_EDGE = "ERROR_GRAPH_COULD_NOT_CHANGE_EDGE".asInstanceOf[ERROR_GRAPH_COULD_NOT_CHANGE_EDGE]
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX: ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX = "ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX".asInstanceOf[ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX]
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_EDGE: ERROR_GRAPH_COULD_NOT_CREATE_EDGE = "ERROR_GRAPH_COULD_NOT_CREATE_EDGE".asInstanceOf[ERROR_GRAPH_COULD_NOT_CREATE_EDGE]
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_GRAPH: ERROR_GRAPH_COULD_NOT_CREATE_GRAPH = "ERROR_GRAPH_COULD_NOT_CREATE_GRAPH".asInstanceOf[ERROR_GRAPH_COULD_NOT_CREATE_GRAPH]
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_VERTEX: ERROR_GRAPH_COULD_NOT_CREATE_VERTEX = "ERROR_GRAPH_COULD_NOT_CREATE_VERTEX".asInstanceOf[ERROR_GRAPH_COULD_NOT_CREATE_VERTEX]
  @scala.inline
  def ERROR_GRAPH_EMPTY: ERROR_GRAPH_EMPTY = "ERROR_GRAPH_EMPTY".asInstanceOf[ERROR_GRAPH_EMPTY]
  @scala.inline
  def ERROR_GRAPH_INVALID_EDGE: ERROR_GRAPH_INVALID_EDGE = "ERROR_GRAPH_INVALID_EDGE".asInstanceOf[ERROR_GRAPH_INVALID_EDGE]
  @scala.inline
  def ERROR_GRAPH_INVALID_FILTER_RESULT: ERROR_GRAPH_INVALID_FILTER_RESULT = "ERROR_GRAPH_INVALID_FILTER_RESULT".asInstanceOf[ERROR_GRAPH_INVALID_FILTER_RESULT]
  @scala.inline
  def ERROR_GRAPH_INVALID_GRAPH: ERROR_GRAPH_INVALID_GRAPH = "ERROR_GRAPH_INVALID_GRAPH".asInstanceOf[ERROR_GRAPH_INVALID_GRAPH]
  @scala.inline
  def ERROR_GRAPH_INVALID_VERTEX: ERROR_GRAPH_INVALID_VERTEX = "ERROR_GRAPH_INVALID_VERTEX".asInstanceOf[ERROR_GRAPH_INVALID_VERTEX]
  @scala.inline
  def ERROR_GRAPH_TOO_MANY_ITERATIONS: ERROR_GRAPH_TOO_MANY_ITERATIONS = "ERROR_GRAPH_TOO_MANY_ITERATIONS".asInstanceOf[ERROR_GRAPH_TOO_MANY_ITERATIONS]
  @scala.inline
  def ERROR_HTTP_BAD_PARAMETER: ERROR_HTTP_BAD_PARAMETER = "ERROR_HTTP_BAD_PARAMETER".asInstanceOf[ERROR_HTTP_BAD_PARAMETER]
  @scala.inline
  def ERROR_HTTP_CORRUPTED_JSON: ERROR_HTTP_CORRUPTED_JSON = "ERROR_HTTP_CORRUPTED_JSON".asInstanceOf[ERROR_HTTP_CORRUPTED_JSON]
  @scala.inline
  def ERROR_HTTP_FORBIDDEN: ERROR_HTTP_FORBIDDEN = "ERROR_HTTP_FORBIDDEN".asInstanceOf[ERROR_HTTP_FORBIDDEN]
  @scala.inline
  def ERROR_HTTP_GATEWAY_TIMEOUT: ERROR_HTTP_GATEWAY_TIMEOUT = "ERROR_HTTP_GATEWAY_TIMEOUT".asInstanceOf[ERROR_HTTP_GATEWAY_TIMEOUT]
  @scala.inline
  def ERROR_HTTP_METHOD_NOT_ALLOWED: ERROR_HTTP_METHOD_NOT_ALLOWED = "ERROR_HTTP_METHOD_NOT_ALLOWED".asInstanceOf[ERROR_HTTP_METHOD_NOT_ALLOWED]
  @scala.inline
  def ERROR_HTTP_NOT_ACCEPTABLE: ERROR_HTTP_NOT_ACCEPTABLE = "ERROR_HTTP_NOT_ACCEPTABLE".asInstanceOf[ERROR_HTTP_NOT_ACCEPTABLE]
  @scala.inline
  def ERROR_HTTP_NOT_FOUND: ERROR_HTTP_NOT_FOUND = "ERROR_HTTP_NOT_FOUND".asInstanceOf[ERROR_HTTP_NOT_FOUND]
  @scala.inline
  def ERROR_HTTP_PRECONDITION_FAILED: ERROR_HTTP_PRECONDITION_FAILED = "ERROR_HTTP_PRECONDITION_FAILED".asInstanceOf[ERROR_HTTP_PRECONDITION_FAILED]
  @scala.inline
  def ERROR_HTTP_SERVER_ERROR: ERROR_HTTP_SERVER_ERROR = "ERROR_HTTP_SERVER_ERROR".asInstanceOf[ERROR_HTTP_SERVER_ERROR]
  @scala.inline
  def ERROR_HTTP_SERVICE_UNAVAILABLE: ERROR_HTTP_SERVICE_UNAVAILABLE = "ERROR_HTTP_SERVICE_UNAVAILABLE".asInstanceOf[ERROR_HTTP_SERVICE_UNAVAILABLE]
  @scala.inline
  def ERROR_HTTP_SUPERFLUOUS_SUFFICES: ERROR_HTTP_SUPERFLUOUS_SUFFICES = "ERROR_HTTP_SUPERFLUOUS_SUFFICES".asInstanceOf[ERROR_HTTP_SUPERFLUOUS_SUFFICES]
  @scala.inline
  def ERROR_HTTP_UNAUTHORIZED: ERROR_HTTP_UNAUTHORIZED = "ERROR_HTTP_UNAUTHORIZED".asInstanceOf[ERROR_HTTP_UNAUTHORIZED]
  @scala.inline
  def ERROR_ILLEGAL_NUMBER: ERROR_ILLEGAL_NUMBER = "ERROR_ILLEGAL_NUMBER".asInstanceOf[ERROR_ILLEGAL_NUMBER]
  @scala.inline
  def ERROR_ILLEGAL_OPTION: ERROR_ILLEGAL_OPTION = "ERROR_ILLEGAL_OPTION".asInstanceOf[ERROR_ILLEGAL_OPTION]
  @scala.inline
  def ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE: ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE = "ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE".asInstanceOf[ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE]
  @scala.inline
  def ERROR_INTERNAL: ERROR_INTERNAL = "ERROR_INTERNAL".asInstanceOf[ERROR_INTERNAL]
  @scala.inline
  def ERROR_INVALID_FOXX_OPTIONS: ERROR_INVALID_FOXX_OPTIONS = "ERROR_INVALID_FOXX_OPTIONS".asInstanceOf[ERROR_INVALID_FOXX_OPTIONS]
  @scala.inline
  def ERROR_INVALID_MOUNTPOINT: ERROR_INVALID_MOUNTPOINT = "ERROR_INVALID_MOUNTPOINT".asInstanceOf[ERROR_INVALID_MOUNTPOINT]
  @scala.inline
  def ERROR_INVALID_SERVICE_MANIFEST: ERROR_INVALID_SERVICE_MANIFEST = "ERROR_INVALID_SERVICE_MANIFEST".asInstanceOf[ERROR_INVALID_SERVICE_MANIFEST]
  @scala.inline
  def ERROR_IP_ADDRESS_INVALID: ERROR_IP_ADDRESS_INVALID = "ERROR_IP_ADDRESS_INVALID".asInstanceOf[ERROR_IP_ADDRESS_INVALID]
  @scala.inline
  def ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE: ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE = "ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE".asInstanceOf[ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE]
  @scala.inline
  def ERROR_LDAP_CANNOT_BIND: ERROR_LDAP_CANNOT_BIND = "ERROR_LDAP_CANNOT_BIND".asInstanceOf[ERROR_LDAP_CANNOT_BIND]
  @scala.inline
  def ERROR_LDAP_CANNOT_INIT: ERROR_LDAP_CANNOT_INIT = "ERROR_LDAP_CANNOT_INIT".asInstanceOf[ERROR_LDAP_CANNOT_INIT]
  @scala.inline
  def ERROR_LDAP_CANNOT_SEARCH: ERROR_LDAP_CANNOT_SEARCH = "ERROR_LDAP_CANNOT_SEARCH".asInstanceOf[ERROR_LDAP_CANNOT_SEARCH]
  @scala.inline
  def ERROR_LDAP_CANNOT_SET_OPTION: ERROR_LDAP_CANNOT_SET_OPTION = "ERROR_LDAP_CANNOT_SET_OPTION".asInstanceOf[ERROR_LDAP_CANNOT_SET_OPTION]
  @scala.inline
  def ERROR_LDAP_CANNOT_START_TLS: ERROR_LDAP_CANNOT_START_TLS = "ERROR_LDAP_CANNOT_START_TLS".asInstanceOf[ERROR_LDAP_CANNOT_START_TLS]
  @scala.inline
  def ERROR_LDAP_CANNOT_UNBIND: ERROR_LDAP_CANNOT_UNBIND = "ERROR_LDAP_CANNOT_UNBIND".asInstanceOf[ERROR_LDAP_CANNOT_UNBIND]
  @scala.inline
  def ERROR_LDAP_FOUND_NO_OBJECTS: ERROR_LDAP_FOUND_NO_OBJECTS = "ERROR_LDAP_FOUND_NO_OBJECTS".asInstanceOf[ERROR_LDAP_FOUND_NO_OBJECTS]
  @scala.inline
  def ERROR_LDAP_INVALID_MODE: ERROR_LDAP_INVALID_MODE = "ERROR_LDAP_INVALID_MODE".asInstanceOf[ERROR_LDAP_INVALID_MODE]
  @scala.inline
  def ERROR_LDAP_NOT_ONE_USER_FOUND: ERROR_LDAP_NOT_ONE_USER_FOUND = "ERROR_LDAP_NOT_ONE_USER_FOUND".asInstanceOf[ERROR_LDAP_NOT_ONE_USER_FOUND]
  @scala.inline
  def ERROR_LDAP_USER_NOT_IDENTIFIED: ERROR_LDAP_USER_NOT_IDENTIFIED = "ERROR_LDAP_USER_NOT_IDENTIFIED".asInstanceOf[ERROR_LDAP_USER_NOT_IDENTIFIED]
  @scala.inline
  def ERROR_LOCKED: ERROR_LOCKED = "ERROR_LOCKED".asInstanceOf[ERROR_LOCKED]
  @scala.inline
  def ERROR_LOCK_TIMEOUT: ERROR_LOCK_TIMEOUT = "ERROR_LOCK_TIMEOUT".asInstanceOf[ERROR_LOCK_TIMEOUT]
  @scala.inline
  def ERROR_MALFORMED_MANIFEST_FILE: ERROR_MALFORMED_MANIFEST_FILE = "ERROR_MALFORMED_MANIFEST_FILE".asInstanceOf[ERROR_MALFORMED_MANIFEST_FILE]
  @scala.inline
  def ERROR_MODULE_FAILURE: ERROR_MODULE_FAILURE = "ERROR_MODULE_FAILURE".asInstanceOf[ERROR_MODULE_FAILURE]
  @scala.inline
  def ERROR_MODULE_NOT_FOUND: ERROR_MODULE_NOT_FOUND = "ERROR_MODULE_NOT_FOUND".asInstanceOf[ERROR_MODULE_NOT_FOUND]
  @scala.inline
  def ERROR_MODULE_SYNTAX_ERROR: ERROR_MODULE_SYNTAX_ERROR = "ERROR_MODULE_SYNTAX_ERROR".asInstanceOf[ERROR_MODULE_SYNTAX_ERROR]
  @scala.inline
  def ERROR_NOT_IMPLEMENTED: ERROR_NOT_IMPLEMENTED = "ERROR_NOT_IMPLEMENTED".asInstanceOf[ERROR_NOT_IMPLEMENTED]
  @scala.inline
  def ERROR_NO_ERROR: ERROR_NO_ERROR = "ERROR_NO_ERROR".asInstanceOf[ERROR_NO_ERROR]
  @scala.inline
  def ERROR_NO_SMART_COLLECTION: ERROR_NO_SMART_COLLECTION = "ERROR_NO_SMART_COLLECTION".asInstanceOf[ERROR_NO_SMART_COLLECTION]
  @scala.inline
  def ERROR_NO_SMART_GRAPH_ATTRIBUTE: ERROR_NO_SMART_GRAPH_ATTRIBUTE = "ERROR_NO_SMART_GRAPH_ATTRIBUTE".asInstanceOf[ERROR_NO_SMART_GRAPH_ATTRIBUTE]
  @scala.inline
  def ERROR_NUMERIC_OVERFLOW: ERROR_NUMERIC_OVERFLOW = "ERROR_NUMERIC_OVERFLOW".asInstanceOf[ERROR_NUMERIC_OVERFLOW]
  @scala.inline
  def ERROR_ONLY_ENTERPRISE: ERROR_ONLY_ENTERPRISE = "ERROR_ONLY_ENTERPRISE".asInstanceOf[ERROR_ONLY_ENTERPRISE]
  @scala.inline
  def ERROR_OUT_OF_MEMORY: ERROR_OUT_OF_MEMORY = "ERROR_OUT_OF_MEMORY".asInstanceOf[ERROR_OUT_OF_MEMORY]
  @scala.inline
  def ERROR_OUT_OF_MEMORY_MMAP: ERROR_OUT_OF_MEMORY_MMAP = "ERROR_OUT_OF_MEMORY_MMAP".asInstanceOf[ERROR_OUT_OF_MEMORY_MMAP]
  @scala.inline
  def ERROR_QUERY_ACCESS_AFTER_MODIFICATION: ERROR_QUERY_ACCESS_AFTER_MODIFICATION = "ERROR_QUERY_ACCESS_AFTER_MODIFICATION".asInstanceOf[ERROR_QUERY_ACCESS_AFTER_MODIFICATION]
  @scala.inline
  def ERROR_QUERY_ARRAY_EXPECTED: ERROR_QUERY_ARRAY_EXPECTED = "ERROR_QUERY_ARRAY_EXPECTED".asInstanceOf[ERROR_QUERY_ARRAY_EXPECTED]
  @scala.inline
  def ERROR_QUERY_BAD_JSON_PLAN: ERROR_QUERY_BAD_JSON_PLAN = "ERROR_QUERY_BAD_JSON_PLAN".asInstanceOf[ERROR_QUERY_BAD_JSON_PLAN]
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETERS_INVALID: ERROR_QUERY_BIND_PARAMETERS_INVALID = "ERROR_QUERY_BIND_PARAMETERS_INVALID".asInstanceOf[ERROR_QUERY_BIND_PARAMETERS_INVALID]
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_MISSING: ERROR_QUERY_BIND_PARAMETER_MISSING = "ERROR_QUERY_BIND_PARAMETER_MISSING".asInstanceOf[ERROR_QUERY_BIND_PARAMETER_MISSING]
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_TYPE: ERROR_QUERY_BIND_PARAMETER_TYPE = "ERROR_QUERY_BIND_PARAMETER_TYPE".asInstanceOf[ERROR_QUERY_BIND_PARAMETER_TYPE]
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_UNDECLARED: ERROR_QUERY_BIND_PARAMETER_UNDECLARED = "ERROR_QUERY_BIND_PARAMETER_UNDECLARED".asInstanceOf[ERROR_QUERY_BIND_PARAMETER_UNDECLARED]
  @scala.inline
  def ERROR_QUERY_COLLECTION_LOCK_FAILED: ERROR_QUERY_COLLECTION_LOCK_FAILED = "ERROR_QUERY_COLLECTION_LOCK_FAILED".asInstanceOf[ERROR_QUERY_COLLECTION_LOCK_FAILED]
  @scala.inline
  def ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION: ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION = "ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION".asInstanceOf[ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION]
  @scala.inline
  def ERROR_QUERY_COMPILE_TIME_OPTIONS: ERROR_QUERY_COMPILE_TIME_OPTIONS = "ERROR_QUERY_COMPILE_TIME_OPTIONS".asInstanceOf[ERROR_QUERY_COMPILE_TIME_OPTIONS]
  @scala.inline
  def ERROR_QUERY_DISALLOWED_DYNAMIC_CALL: ERROR_QUERY_DISALLOWED_DYNAMIC_CALL = "ERROR_QUERY_DISALLOWED_DYNAMIC_CALL".asInstanceOf[ERROR_QUERY_DISALLOWED_DYNAMIC_CALL]
  @scala.inline
  def ERROR_QUERY_DIVISION_BY_ZERO: ERROR_QUERY_DIVISION_BY_ZERO = "ERROR_QUERY_DIVISION_BY_ZERO".asInstanceOf[ERROR_QUERY_DIVISION_BY_ZERO]
  @scala.inline
  def ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED: ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED = "ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED".asInstanceOf[ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED]
  @scala.inline
  def ERROR_QUERY_EMPTY: ERROR_QUERY_EMPTY = "ERROR_QUERY_EMPTY".asInstanceOf[ERROR_QUERY_EMPTY]
  @scala.inline
  def ERROR_QUERY_EXCEPTION_OPTIONS: ERROR_QUERY_EXCEPTION_OPTIONS = "ERROR_QUERY_EXCEPTION_OPTIONS".asInstanceOf[ERROR_QUERY_EXCEPTION_OPTIONS]
  @scala.inline
  def ERROR_QUERY_FAIL_CALLED: ERROR_QUERY_FAIL_CALLED = "ERROR_QUERY_FAIL_CALLED".asInstanceOf[ERROR_QUERY_FAIL_CALLED]
  @scala.inline
  def ERROR_QUERY_FULLTEXT_INDEX_MISSING: ERROR_QUERY_FULLTEXT_INDEX_MISSING = "ERROR_QUERY_FULLTEXT_INDEX_MISSING".asInstanceOf[ERROR_QUERY_FULLTEXT_INDEX_MISSING]
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH: ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH = "ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH".asInstanceOf[ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH]
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH: ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH = "ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH".asInstanceOf[ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH]
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_CODE: ERROR_QUERY_FUNCTION_INVALID_CODE = "ERROR_QUERY_FUNCTION_INVALID_CODE".asInstanceOf[ERROR_QUERY_FUNCTION_INVALID_CODE]
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_NAME: ERROR_QUERY_FUNCTION_INVALID_NAME = "ERROR_QUERY_FUNCTION_INVALID_NAME".asInstanceOf[ERROR_QUERY_FUNCTION_INVALID_NAME]
  @scala.inline
  def ERROR_QUERY_FUNCTION_NAME_UNKNOWN: ERROR_QUERY_FUNCTION_NAME_UNKNOWN = "ERROR_QUERY_FUNCTION_NAME_UNKNOWN".asInstanceOf[ERROR_QUERY_FUNCTION_NAME_UNKNOWN]
  @scala.inline
  def ERROR_QUERY_FUNCTION_NOT_FOUND: ERROR_QUERY_FUNCTION_NOT_FOUND = "ERROR_QUERY_FUNCTION_NOT_FOUND".asInstanceOf[ERROR_QUERY_FUNCTION_NOT_FOUND]
  @scala.inline
  def ERROR_QUERY_FUNCTION_RUNTIME_ERROR: ERROR_QUERY_FUNCTION_RUNTIME_ERROR = "ERROR_QUERY_FUNCTION_RUNTIME_ERROR".asInstanceOf[ERROR_QUERY_FUNCTION_RUNTIME_ERROR]
  @scala.inline
  def ERROR_QUERY_GEO_INDEX_MISSING: ERROR_QUERY_GEO_INDEX_MISSING = "ERROR_QUERY_GEO_INDEX_MISSING".asInstanceOf[ERROR_QUERY_GEO_INDEX_MISSING]
  @scala.inline
  def ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION: ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION = "ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION".asInstanceOf[ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION]
  @scala.inline
  def ERROR_QUERY_INVALID_ARITHMETIC_VALUE: ERROR_QUERY_INVALID_ARITHMETIC_VALUE = "ERROR_QUERY_INVALID_ARITHMETIC_VALUE".asInstanceOf[ERROR_QUERY_INVALID_ARITHMETIC_VALUE]
  @scala.inline
  def ERROR_QUERY_INVALID_DATE_VALUE: ERROR_QUERY_INVALID_DATE_VALUE = "ERROR_QUERY_INVALID_DATE_VALUE".asInstanceOf[ERROR_QUERY_INVALID_DATE_VALUE]
  @scala.inline
  def ERROR_QUERY_INVALID_LOGICAL_VALUE: ERROR_QUERY_INVALID_LOGICAL_VALUE = "ERROR_QUERY_INVALID_LOGICAL_VALUE".asInstanceOf[ERROR_QUERY_INVALID_LOGICAL_VALUE]
  @scala.inline
  def ERROR_QUERY_INVALID_REGEX: ERROR_QUERY_INVALID_REGEX = "ERROR_QUERY_INVALID_REGEX".asInstanceOf[ERROR_QUERY_INVALID_REGEX]
  @scala.inline
  def ERROR_QUERY_IN_USE: ERROR_QUERY_IN_USE = "ERROR_QUERY_IN_USE".asInstanceOf[ERROR_QUERY_IN_USE]
  @scala.inline
  def ERROR_QUERY_KILLED: ERROR_QUERY_KILLED = "ERROR_QUERY_KILLED".asInstanceOf[ERROR_QUERY_KILLED]
  @scala.inline
  def ERROR_QUERY_MULTI_MODIFY: ERROR_QUERY_MULTI_MODIFY = "ERROR_QUERY_MULTI_MODIFY".asInstanceOf[ERROR_QUERY_MULTI_MODIFY]
  @scala.inline
  def ERROR_QUERY_NOT_FOUND: ERROR_QUERY_NOT_FOUND = "ERROR_QUERY_NOT_FOUND".asInstanceOf[ERROR_QUERY_NOT_FOUND]
  @scala.inline
  def ERROR_QUERY_NUMBER_OUT_OF_RANGE: ERROR_QUERY_NUMBER_OUT_OF_RANGE = "ERROR_QUERY_NUMBER_OUT_OF_RANGE".asInstanceOf[ERROR_QUERY_NUMBER_OUT_OF_RANGE]
  @scala.inline
  def ERROR_QUERY_PARSE: ERROR_QUERY_PARSE = "ERROR_QUERY_PARSE".asInstanceOf[ERROR_QUERY_PARSE]
  @scala.inline
  def ERROR_QUERY_SCRIPT: ERROR_QUERY_SCRIPT = "ERROR_QUERY_SCRIPT".asInstanceOf[ERROR_QUERY_SCRIPT]
  @scala.inline
  def ERROR_QUERY_TOO_MANY_COLLECTIONS: ERROR_QUERY_TOO_MANY_COLLECTIONS = "ERROR_QUERY_TOO_MANY_COLLECTIONS".asInstanceOf[ERROR_QUERY_TOO_MANY_COLLECTIONS]
  @scala.inline
  def ERROR_QUERY_USER_ASSERT: ERROR_QUERY_USER_ASSERT = "ERROR_QUERY_USER_ASSERT".asInstanceOf[ERROR_QUERY_USER_ASSERT]
  @scala.inline
  def ERROR_QUERY_USER_WARN: ERROR_QUERY_USER_WARN = "ERROR_QUERY_USER_WARN".asInstanceOf[ERROR_QUERY_USER_WARN]
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_INVALID: ERROR_QUERY_VARIABLE_NAME_INVALID = "ERROR_QUERY_VARIABLE_NAME_INVALID".asInstanceOf[ERROR_QUERY_VARIABLE_NAME_INVALID]
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_UNKNOWN: ERROR_QUERY_VARIABLE_NAME_UNKNOWN = "ERROR_QUERY_VARIABLE_NAME_UNKNOWN".asInstanceOf[ERROR_QUERY_VARIABLE_NAME_UNKNOWN]
  @scala.inline
  def ERROR_QUERY_VARIABLE_REDECLARED: ERROR_QUERY_VARIABLE_REDECLARED = "ERROR_QUERY_VARIABLE_REDECLARED".asInstanceOf[ERROR_QUERY_VARIABLE_REDECLARED]
  @scala.inline
  def ERROR_QUEUE_FULL: ERROR_QUEUE_FULL = "ERROR_QUEUE_FULL".asInstanceOf[ERROR_QUEUE_FULL]
  @scala.inline
  def ERROR_QUEUE_UNKNOWN: ERROR_QUEUE_UNKNOWN = "ERROR_QUEUE_UNKNOWN".asInstanceOf[ERROR_QUEUE_UNKNOWN]
  @scala.inline
  def ERROR_REPLICATION_APPLIER_STOPPED: ERROR_REPLICATION_APPLIER_STOPPED = "ERROR_REPLICATION_APPLIER_STOPPED".asInstanceOf[ERROR_REPLICATION_APPLIER_STOPPED]
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION: ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION = "ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION".asInstanceOf[ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION]
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_STATE: ERROR_REPLICATION_INVALID_APPLIER_STATE = "ERROR_REPLICATION_INVALID_APPLIER_STATE".asInstanceOf[ERROR_REPLICATION_INVALID_APPLIER_STATE]
  @scala.inline
  def ERROR_REPLICATION_INVALID_RESPONSE: ERROR_REPLICATION_INVALID_RESPONSE = "ERROR_REPLICATION_INVALID_RESPONSE".asInstanceOf[ERROR_REPLICATION_INVALID_RESPONSE]
  @scala.inline
  def ERROR_REPLICATION_LOOP: ERROR_REPLICATION_LOOP = "ERROR_REPLICATION_LOOP".asInstanceOf[ERROR_REPLICATION_LOOP]
  @scala.inline
  def ERROR_REPLICATION_MASTER_CHANGE: ERROR_REPLICATION_MASTER_CHANGE = "ERROR_REPLICATION_MASTER_CHANGE".asInstanceOf[ERROR_REPLICATION_MASTER_CHANGE]
  @scala.inline
  def ERROR_REPLICATION_MASTER_ERROR: ERROR_REPLICATION_MASTER_ERROR = "ERROR_REPLICATION_MASTER_ERROR".asInstanceOf[ERROR_REPLICATION_MASTER_ERROR]
  @scala.inline
  def ERROR_REPLICATION_MASTER_INCOMPATIBLE: ERROR_REPLICATION_MASTER_INCOMPATIBLE = "ERROR_REPLICATION_MASTER_INCOMPATIBLE".asInstanceOf[ERROR_REPLICATION_MASTER_INCOMPATIBLE]
  @scala.inline
  def ERROR_REPLICATION_NO_RESPONSE: ERROR_REPLICATION_NO_RESPONSE = "ERROR_REPLICATION_NO_RESPONSE".asInstanceOf[ERROR_REPLICATION_NO_RESPONSE]
  @scala.inline
  def ERROR_REPLICATION_NO_START_TICK: ERROR_REPLICATION_NO_START_TICK = "ERROR_REPLICATION_NO_START_TICK".asInstanceOf[ERROR_REPLICATION_NO_START_TICK]
  @scala.inline
  def ERROR_REPLICATION_RUNNING: ERROR_REPLICATION_RUNNING = "ERROR_REPLICATION_RUNNING".asInstanceOf[ERROR_REPLICATION_RUNNING]
  @scala.inline
  def ERROR_REPLICATION_SHARD_NONEMPTY: ERROR_REPLICATION_SHARD_NONEMPTY = "ERROR_REPLICATION_SHARD_NONEMPTY".asInstanceOf[ERROR_REPLICATION_SHARD_NONEMPTY]
  @scala.inline
  def ERROR_REPLICATION_START_TICK_NOT_PRESENT: ERROR_REPLICATION_START_TICK_NOT_PRESENT = "ERROR_REPLICATION_START_TICK_NOT_PRESENT".asInstanceOf[ERROR_REPLICATION_START_TICK_NOT_PRESENT]
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_MARKER: ERROR_REPLICATION_UNEXPECTED_MARKER = "ERROR_REPLICATION_UNEXPECTED_MARKER".asInstanceOf[ERROR_REPLICATION_UNEXPECTED_MARKER]
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_TRANSACTION: ERROR_REPLICATION_UNEXPECTED_TRANSACTION = "ERROR_REPLICATION_UNEXPECTED_TRANSACTION".asInstanceOf[ERROR_REPLICATION_UNEXPECTED_TRANSACTION]
  @scala.inline
  def ERROR_REPLICATION_WRONG_CHECKSUM: ERROR_REPLICATION_WRONG_CHECKSUM = "ERROR_REPLICATION_WRONG_CHECKSUM".asInstanceOf[ERROR_REPLICATION_WRONG_CHECKSUM]
  @scala.inline
  def ERROR_REQUEST_CANCELED: ERROR_REQUEST_CANCELED = "ERROR_REQUEST_CANCELED".asInstanceOf[ERROR_REQUEST_CANCELED]
  @scala.inline
  def ERROR_RESOURCE_LIMIT: ERROR_RESOURCE_LIMIT = "ERROR_RESOURCE_LIMIT".asInstanceOf[ERROR_RESOURCE_LIMIT]
  @scala.inline
  def ERROR_SERVICE_DOWNLOAD_FAILED: ERROR_SERVICE_DOWNLOAD_FAILED = "ERROR_SERVICE_DOWNLOAD_FAILED".asInstanceOf[ERROR_SERVICE_DOWNLOAD_FAILED]
  @scala.inline
  def ERROR_SERVICE_FILES_MISSING: ERROR_SERVICE_FILES_MISSING = "ERROR_SERVICE_FILES_MISSING".asInstanceOf[ERROR_SERVICE_FILES_MISSING]
  @scala.inline
  def ERROR_SERVICE_FILES_OUTDATED: ERROR_SERVICE_FILES_OUTDATED = "ERROR_SERVICE_FILES_OUTDATED".asInstanceOf[ERROR_SERVICE_FILES_OUTDATED]
  @scala.inline
  def ERROR_SERVICE_INVALID_MOUNT: ERROR_SERVICE_INVALID_MOUNT = "ERROR_SERVICE_INVALID_MOUNT".asInstanceOf[ERROR_SERVICE_INVALID_MOUNT]
  @scala.inline
  def ERROR_SERVICE_INVALID_NAME: ERROR_SERVICE_INVALID_NAME = "ERROR_SERVICE_INVALID_NAME".asInstanceOf[ERROR_SERVICE_INVALID_NAME]
  @scala.inline
  def ERROR_SERVICE_MANIFEST_NOT_FOUND: ERROR_SERVICE_MANIFEST_NOT_FOUND = "ERROR_SERVICE_MANIFEST_NOT_FOUND".asInstanceOf[ERROR_SERVICE_MANIFEST_NOT_FOUND]
  @scala.inline
  def ERROR_SERVICE_MOUNTPOINT_CONFLICT: ERROR_SERVICE_MOUNTPOINT_CONFLICT = "ERROR_SERVICE_MOUNTPOINT_CONFLICT".asInstanceOf[ERROR_SERVICE_MOUNTPOINT_CONFLICT]
  @scala.inline
  def ERROR_SERVICE_NEEDS_CONFIGURATION: ERROR_SERVICE_NEEDS_CONFIGURATION = "ERROR_SERVICE_NEEDS_CONFIGURATION".asInstanceOf[ERROR_SERVICE_NEEDS_CONFIGURATION]
  @scala.inline
  def ERROR_SERVICE_NOT_FOUND: ERROR_SERVICE_NOT_FOUND = "ERROR_SERVICE_NOT_FOUND".asInstanceOf[ERROR_SERVICE_NOT_FOUND]
  @scala.inline
  def ERROR_SERVICE_OPTIONS_MALFORMED: ERROR_SERVICE_OPTIONS_MALFORMED = "ERROR_SERVICE_OPTIONS_MALFORMED".asInstanceOf[ERROR_SERVICE_OPTIONS_MALFORMED]
  @scala.inline
  def ERROR_SERVICE_SOURCE_ERROR: ERROR_SERVICE_SOURCE_ERROR = "ERROR_SERVICE_SOURCE_ERROR".asInstanceOf[ERROR_SERVICE_SOURCE_ERROR]
  @scala.inline
  def ERROR_SERVICE_SOURCE_NOT_FOUND: ERROR_SERVICE_SOURCE_NOT_FOUND = "ERROR_SERVICE_SOURCE_NOT_FOUND".asInstanceOf[ERROR_SERVICE_SOURCE_NOT_FOUND]
  @scala.inline
  def ERROR_SERVICE_UNKNOWN_SCRIPT: ERROR_SERVICE_UNKNOWN_SCRIPT = "ERROR_SERVICE_UNKNOWN_SCRIPT".asInstanceOf[ERROR_SERVICE_UNKNOWN_SCRIPT]
  @scala.inline
  def ERROR_SERVICE_UPLOAD_FAILED: ERROR_SERVICE_UPLOAD_FAILED = "ERROR_SERVICE_UPLOAD_FAILED".asInstanceOf[ERROR_SERVICE_UPLOAD_FAILED]
  @scala.inline
  def ERROR_SESSION_EXPIRED: ERROR_SESSION_EXPIRED = "ERROR_SESSION_EXPIRED".asInstanceOf[ERROR_SESSION_EXPIRED]
  @scala.inline
  def ERROR_SESSION_UNKNOWN: ERROR_SESSION_UNKNOWN = "ERROR_SESSION_UNKNOWN".asInstanceOf[ERROR_SESSION_UNKNOWN]
  @scala.inline
  def ERROR_SHUTTING_DOWN: ERROR_SHUTTING_DOWN = "ERROR_SHUTTING_DOWN".asInstanceOf[ERROR_SHUTTING_DOWN]
  @scala.inline
  def ERROR_SUPERVISION_GENERAL_FAILURE: ERROR_SUPERVISION_GENERAL_FAILURE = "ERROR_SUPERVISION_GENERAL_FAILURE".asInstanceOf[ERROR_SUPERVISION_GENERAL_FAILURE]
  @scala.inline
  def ERROR_SYS_ERROR: ERROR_SYS_ERROR = "ERROR_SYS_ERROR".asInstanceOf[ERROR_SYS_ERROR]
  @scala.inline
  def ERROR_TASK_DUPLICATE_ID: ERROR_TASK_DUPLICATE_ID = "ERROR_TASK_DUPLICATE_ID".asInstanceOf[ERROR_TASK_DUPLICATE_ID]
  @scala.inline
  def ERROR_TASK_INVALID_ID: ERROR_TASK_INVALID_ID = "ERROR_TASK_INVALID_ID".asInstanceOf[ERROR_TASK_INVALID_ID]
  @scala.inline
  def ERROR_TASK_NOT_FOUND: ERROR_TASK_NOT_FOUND = "ERROR_TASK_NOT_FOUND".asInstanceOf[ERROR_TASK_NOT_FOUND]
  @scala.inline
  def ERROR_TRANSACTION_ABORTED: ERROR_TRANSACTION_ABORTED = "ERROR_TRANSACTION_ABORTED".asInstanceOf[ERROR_TRANSACTION_ABORTED]
  @scala.inline
  def ERROR_TRANSACTION_DISALLOWED_OPERATION: ERROR_TRANSACTION_DISALLOWED_OPERATION = "ERROR_TRANSACTION_DISALLOWED_OPERATION".asInstanceOf[ERROR_TRANSACTION_DISALLOWED_OPERATION]
  @scala.inline
  def ERROR_TRANSACTION_INTERNAL: ERROR_TRANSACTION_INTERNAL = "ERROR_TRANSACTION_INTERNAL".asInstanceOf[ERROR_TRANSACTION_INTERNAL]
  @scala.inline
  def ERROR_TRANSACTION_NESTED: ERROR_TRANSACTION_NESTED = "ERROR_TRANSACTION_NESTED".asInstanceOf[ERROR_TRANSACTION_NESTED]
  @scala.inline
  def ERROR_TRANSACTION_UNREGISTERED_COLLECTION: ERROR_TRANSACTION_UNREGISTERED_COLLECTION = "ERROR_TRANSACTION_UNREGISTERED_COLLECTION".asInstanceOf[ERROR_TRANSACTION_UNREGISTERED_COLLECTION]
  @scala.inline
  def ERROR_TYPE_ERROR: ERROR_TYPE_ERROR = "ERROR_TYPE_ERROR".asInstanceOf[ERROR_TYPE_ERROR]
  @scala.inline
  def ERROR_USER_CHANGE_PASSWORD: ERROR_USER_CHANGE_PASSWORD = "ERROR_USER_CHANGE_PASSWORD".asInstanceOf[ERROR_USER_CHANGE_PASSWORD]
  @scala.inline
  def ERROR_USER_DUPLICATE: ERROR_USER_DUPLICATE = "ERROR_USER_DUPLICATE".asInstanceOf[ERROR_USER_DUPLICATE]
  @scala.inline
  def ERROR_USER_EXTERNAL: ERROR_USER_EXTERNAL = "ERROR_USER_EXTERNAL".asInstanceOf[ERROR_USER_EXTERNAL]
  @scala.inline
  def ERROR_USER_INVALID_NAME: ERROR_USER_INVALID_NAME = "ERROR_USER_INVALID_NAME".asInstanceOf[ERROR_USER_INVALID_NAME]
  @scala.inline
  def ERROR_USER_INVALID_PASSWORD: ERROR_USER_INVALID_PASSWORD = "ERROR_USER_INVALID_PASSWORD".asInstanceOf[ERROR_USER_INVALID_PASSWORD]
  @scala.inline
  def ERROR_USER_NOT_FOUND: ERROR_USER_NOT_FOUND = "ERROR_USER_NOT_FOUND".asInstanceOf[ERROR_USER_NOT_FOUND]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def `HMAC-SHA1`: `HMAC-SHA1` = "HMAC-SHA1".asInstanceOf[`HMAC-SHA1`]
  @scala.inline
  def HS256: HS256 = "HS256".asInstanceOf[HS256]
  @scala.inline
  def HS384: HS384 = "HS384".asInstanceOf[HS384]
  @scala.inline
  def HS512: HS512 = "HS512".asInstanceOf[HS512]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def PLAINTEXT: PLAINTEXT = "PLAINTEXT".asInstanceOf[PLAINTEXT]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_CONNECT: SIMPLE_CLIENT_COULD_NOT_CONNECT = "SIMPLE_CLIENT_COULD_NOT_CONNECT".asInstanceOf[SIMPLE_CLIENT_COULD_NOT_CONNECT]
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_READ: SIMPLE_CLIENT_COULD_NOT_READ = "SIMPLE_CLIENT_COULD_NOT_READ".asInstanceOf[SIMPLE_CLIENT_COULD_NOT_READ]
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_WRITE: SIMPLE_CLIENT_COULD_NOT_WRITE = "SIMPLE_CLIENT_COULD_NOT_WRITE".asInstanceOf[SIMPLE_CLIENT_COULD_NOT_WRITE]
  @scala.inline
  def SIMPLE_CLIENT_UNKNOWN_ERROR: SIMPLE_CLIENT_UNKNOWN_ERROR = "SIMPLE_CLIENT_UNKNOWN_ERROR".asInstanceOf[SIMPLE_CLIENT_UNKNOWN_ERROR]
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  @scala.inline
  def `already reported`: `already reported` = "already reported".asInstanceOf[`already reported`]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def `application/json`: `application/json` = "application/json".asInstanceOf[`application/json`]
  @scala.inline
  def arangosearch: arangosearch = "arangosearch".asInstanceOf[arangosearch]
  @scala.inline
  def autoincrement: autoincrement = "autoincrement".asInstanceOf[autoincrement]
  @scala.inline
  def `bad gateway`: `bad gateway` = "bad gateway".asInstanceOf[`bad gateway`]
  @scala.inline
  def `bad request`: `bad request` = "bad request".asInstanceOf[`bad request`]
  @scala.inline
  def `bandwidth limit exceeded`: `bandwidth limit exceeded` = "bandwidth limit exceeded".asInstanceOf[`bandwidth limit exceeded`]
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def bytes: bytes = "bytes".asInstanceOf[bytes]
  @scala.inline
  def bytes_accum: bytes_accum = "bytes_accum".asInstanceOf[bytes_accum]
  @scala.inline
  def conflict: conflict = "conflict".asInstanceOf[conflict]
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  @scala.inline
  def cookie: cookie = "cookie".asInstanceOf[cookie]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  @scala.inline
  def `expectation failed`: `expectation failed` = "expectation failed".asInstanceOf[`expectation failed`]
  @scala.inline
  def `failed dependency`: `failed dependency` = "failed dependency".asInstanceOf[`failed dependency`]
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  @scala.inline
  def forbidden: forbidden = "forbidden".asInstanceOf[forbidden]
  @scala.inline
  def found: found = "found".asInstanceOf[found]
  @scala.inline
  def fulltext: fulltext = "fulltext".asInstanceOf[fulltext]
  @scala.inline
  def `gateway timeout`: `gateway timeout` = "gateway timeout".asInstanceOf[`gateway timeout`]
  @scala.inline
  def geo: geo = "geo".asInstanceOf[geo]
  @scala.inline
  def gone: gone = "gone".asInstanceOf[gone]
  @scala.inline
  def hash: hash = "hash".asInstanceOf[hash]
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  @scala.inline
  def `http version not supported`: `http version not supported` = "http version not supported".asInstanceOf[`http version not supported`]
  @scala.inline
  def `i_quotem a teapot`: `i_quotem a teapot` = "i'm a teapot".asInstanceOf[`i_quotem a teapot`]
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  @scala.inline
  def `im used`: `im used` = "im used".asInstanceOf[`im used`]
  @scala.inline
  def inbound: inbound = "inbound".asInstanceOf[inbound]
  @scala.inline
  def `insufficient storage`: `insufficient storage` = "insufficient storage".asInstanceOf[`insufficient storage`]
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def `internal server error`: `internal server error` = "internal server error".asInstanceOf[`internal server error`]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def `length required`: `length required` = "length required".asInstanceOf[`length required`]
  @scala.inline
  def locked: locked = "locked".asInstanceOf[locked]
  @scala.inline
  def `loop detected`: `loop detected` = "loop detected".asInstanceOf[`loop detected`]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def `method not allowed`: `method not allowed` = "method not allowed".asInstanceOf[`method not allowed`]
  @scala.inline
  def `misdirected request`: `misdirected request` = "misdirected request".asInstanceOf[`misdirected request`]
  @scala.inline
  def mmfiles: mmfiles = "mmfiles".asInstanceOf[mmfiles]
  @scala.inline
  def `moved permanently`: `moved permanently` = "moved permanently".asInstanceOf[`moved permanently`]
  @scala.inline
  def `multi-status`: `multi-status` = "multi-status".asInstanceOf[`multi-status`]
  @scala.inline
  def `multiple choices`: `multiple choices` = "multiple choices".asInstanceOf[`multiple choices`]
  @scala.inline
  def `network authentication required`: `network authentication required` = "network authentication required".asInstanceOf[`network authentication required`]
  @scala.inline
  def `no content`: `no content` = "no content".asInstanceOf[`no content`]
  @scala.inline
  def `non-authoritative information`: `non-authoritative information` = "non-authoritative information".asInstanceOf[`non-authoritative information`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `not acceptable`: `not acceptable` = "not acceptable".asInstanceOf[`not acceptable`]
  @scala.inline
  def `not extended`: `not extended` = "not extended".asInstanceOf[`not extended`]
  @scala.inline
  def `not found`: `not found` = "not found".asInstanceOf[`not found`]
  @scala.inline
  def `not implemented`: `not implemented` = "not implemented".asInstanceOf[`not implemented`]
  @scala.inline
  def `not modified`: `not modified` = "not modified".asInstanceOf[`not modified`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  @scala.inline
  def outbound: outbound = "outbound".asInstanceOf[outbound]
  @scala.inline
  def `partial content`: `partial content` = "partial content".asInstanceOf[`partial content`]
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  @scala.inline
  def `payload too large`: `payload too large` = "payload too large".asInstanceOf[`payload too large`]
  @scala.inline
  def `payment required`: `payment required` = "payment required".asInstanceOf[`payment required`]
  @scala.inline
  def `permanent redirect`: `permanent redirect` = "permanent redirect".asInstanceOf[`permanent redirect`]
  @scala.inline
  def `precondition failed`: `precondition failed` = "precondition failed".asInstanceOf[`precondition failed`]
  @scala.inline
  def `precondition required`: `precondition required` = "precondition required".asInstanceOf[`precondition required`]
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  @scala.inline
  def `proxy authentication required`: `proxy authentication required` = "proxy authentication required".asInstanceOf[`proxy authentication required`]
  @scala.inline
  def `range not satisfiable`: `range not satisfiable` = "range not satisfiable".asInstanceOf[`range not satisfiable`]
  @scala.inline
  def `request header fields too large`: `request header fields too large` = "request header fields too large".asInstanceOf[`request header fields too large`]
  @scala.inline
  def `request timeout`: `request timeout` = "request timeout".asInstanceOf[`request timeout`]
  @scala.inline
  def `reset content`: `reset content` = "reset content".asInstanceOf[`reset content`]
  @scala.inline
  def rocksdb: rocksdb = "rocksdb".asInstanceOf[rocksdb]
  @scala.inline
  def `see other`: `see other` = "see other".asInstanceOf[`see other`]
  @scala.inline
  def `service unavailable`: `service unavailable` = "service unavailable".asInstanceOf[`service unavailable`]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha224: sha224 = "sha224".asInstanceOf[sha224]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  @scala.inline
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  @scala.inline
  def skiplist: skiplist = "skiplist".asInstanceOf[skiplist]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def `switching protocols`: `switching protocols` = "switching protocols".asInstanceOf[`switching protocols`]
  @scala.inline
  def `temporary redirect`: `temporary redirect` = "temporary redirect".asInstanceOf[`temporary redirect`]
  @scala.inline
  def `too many requests`: `too many requests` = "too many requests".asInstanceOf[`too many requests`]
  @scala.inline
  def traditional: traditional = "traditional".asInstanceOf[traditional]
  @scala.inline
  def unauthorized: unauthorized = "unauthorized".asInstanceOf[unauthorized]
  @scala.inline
  def `unavailable for legal reasons`: `unavailable for legal reasons` = "unavailable for legal reasons".asInstanceOf[`unavailable for legal reasons`]
  @scala.inline
  def `unordered collection`: `unordered collection` = "unordered collection".asInstanceOf[`unordered collection`]
  @scala.inline
  def `unprocessable entity`: `unprocessable entity` = "unprocessable entity".asInstanceOf[`unprocessable entity`]
  @scala.inline
  def `unsupported media type`: `unsupported media type` = "unsupported media type".asInstanceOf[`unsupported media type`]
  @scala.inline
  def `upgrade required`: `upgrade required` = "upgrade required".asInstanceOf[`upgrade required`]
  @scala.inline
  def `uri too long`: `uri too long` = "uri too long".asInstanceOf[`uri too long`]
  @scala.inline
  def `use proxy`: `use proxy` = "use proxy".asInstanceOf[`use proxy`]
  @scala.inline
  def `variant also negotiates`: `variant also negotiates` = "variant also negotiates".asInstanceOf[`variant also negotiates`]
}

