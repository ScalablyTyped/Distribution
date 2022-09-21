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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@arangodb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object aql {
    
    inline def apply(strings: TemplateStringsArray, args: Any*): Query = ^.asInstanceOf[js.Dynamic].apply(List(strings.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query]
    
    @JSImport("@arangodb", "aql")
    @js.native
    val ^ : js.Any = js.native
    
    inline def join(values: js.Array[Any]): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(values.asInstanceOf[js.Any]).asInstanceOf[Query]
    inline def join(values: js.Array[Any], sep: String): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(values.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Query]
    
    inline def literal(value: Any): AqlLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[AqlLiteral]
  }
  
  /* Inlined arangodb.ArangoDB.Database & {[key: string] : arangodb.ArangoDB.Collection<any> | undefined} */
  object db {
    
    @JSImport("@arangodb", "db")
    @js.native
    val ^ : js.Any = js.native
    
    // Collection
    inline def collection(name: String): Collection[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_collection")(name.asInstanceOf[js.Any]).asInstanceOf[Collection[Any]]
    
    inline def collections(): js.Array[Collection[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_collections")().asInstanceOf[js.Array[Collection[Any]]]
    
    inline def create(name: String): Collection[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_create")(name.asInstanceOf[js.Any]).asInstanceOf[Collection[Any]]
    inline def create(name: String, properties: CreateCollectionOptions): Collection[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Collection[Any]]
    
    // Database
    inline def createDatabase(name: String): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("_createDatabase")(name.asInstanceOf[js.Any]).asInstanceOf[`true`]
    inline def createDatabase(name: String, options: scala.Nothing): `true` = (^.asInstanceOf[js.Dynamic].applyDynamic("_createDatabase")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[`true`]
    inline def createDatabase(name: String, options: scala.Nothing, users: js.Array[DatabaseUser]): `true` = (^.asInstanceOf[js.Dynamic].applyDynamic("_createDatabase")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], users.asInstanceOf[js.Any])).asInstanceOf[`true`]
    inline def createDatabase(name: String, options: Unit, users: js.Array[DatabaseUser]): `true` = (^.asInstanceOf[js.Dynamic].applyDynamic("_createDatabase")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], users.asInstanceOf[js.Any])).asInstanceOf[`true`]
    
    inline def createDocumentCollection(name: String): Collection[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_createDocumentCollection")(name.asInstanceOf[js.Any]).asInstanceOf[Collection[Any]]
    inline def createDocumentCollection(name: String, properties: CreateCollectionOptions): Collection[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_createDocumentCollection")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Collection[Any]]
    
    inline def createEdgeCollection(name: String): Collection[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_createEdgeCollection")(name.asInstanceOf[js.Any]).asInstanceOf[Collection[Any]]
    inline def createEdgeCollection(name: String, properties: CreateCollectionOptions): Collection[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_createEdgeCollection")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Collection[Any]]
    
    inline def createStatement(query: String): Statement[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_createStatement")(query.asInstanceOf[js.Any]).asInstanceOf[Statement[Any]]
    // AQL
    inline def createStatement(query: Query): Statement[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_createStatement")(query.asInstanceOf[js.Any]).asInstanceOf[Statement[Any]]
    
    inline def createView(name: String, `type`: ViewType, properties: ArangoSearchViewPropertiesOptions): ArangoSearchView = (^.asInstanceOf[js.Dynamic].applyDynamic("_createView")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[ArangoSearchView]
    
    inline def databases(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_databases")().asInstanceOf[js.Array[String]]
    
    // Document
    inline def document(name: String): Document[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_document")(name.asInstanceOf[js.Any]).asInstanceOf[Document[Any]]
    
    inline def drop(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drop")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def dropDatabase(name: String): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("_dropDatabase")(name.asInstanceOf[js.Any]).asInstanceOf[`true`]
    
    inline def dropIndex(index: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_dropIndex")(index.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def dropIndex(index: IndexLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_dropIndex")(index.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def dropView(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_dropView")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // Global
    inline def engine(): EngineType = ^.asInstanceOf[js.Dynamic].applyDynamic("_engine")().asInstanceOf[EngineType]
    
    inline def engineStats(): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_engineStats")().asInstanceOf[StringDictionary[Any]]
    
    inline def executeTransaction[T](transaction: Transaction[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("_executeTransaction")(transaction.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def exists(selector: String): DocumentMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("_exists")(selector.asInstanceOf[js.Any]).asInstanceOf[DocumentMetadata]
    inline def exists(selector: ObjectWithId): DocumentMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("_exists")(selector.asInstanceOf[js.Any]).asInstanceOf[DocumentMetadata]
    
    inline def explain(query: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_explain")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def explain(query: Query): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_explain")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // Properties
    inline def id(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_id")().asInstanceOf[String]
    
    // Indexes
    inline def index(index: String): Index[Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_index")(index.asInstanceOf[js.Any]).asInstanceOf[Index[Any] | Null]
    inline def index(index: IndexLike): Index[Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_index")(index.asInstanceOf[js.Any]).asInstanceOf[Index[Any] | Null]
    
    inline def isSystem(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isSystem")().asInstanceOf[Boolean]
    
    inline def name(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_name")().asInstanceOf[String]
    
    inline def parse(query: String): ParsedQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("_parse")(query.asInstanceOf[js.Any]).asInstanceOf[ParsedQuery]
    
    inline def path(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_path")().asInstanceOf[String]
    
    inline def query(query: String): Cursor[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_query")(query.asInstanceOf[js.Any]).asInstanceOf[Cursor[Any]]
    inline def query(query: String, bindVars: js.Object): Cursor[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_query")(query.asInstanceOf[js.Any], bindVars.asInstanceOf[js.Any])).asInstanceOf[Cursor[Any]]
    inline def query(query: String, bindVars: js.Object, options: QueryOptions): Cursor[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_query")(query.asInstanceOf[js.Any], bindVars.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cursor[Any]]
    inline def query(query: String, bindVars: Unit, options: QueryOptions): Cursor[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_query")(query.asInstanceOf[js.Any], bindVars.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cursor[Any]]
    inline def query(query: Query): Cursor[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_query")(query.asInstanceOf[js.Any]).asInstanceOf[Cursor[Any]]
    inline def query(query: Query, options: QueryOptions): Cursor[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_query")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cursor[Any]]
    
    inline def remove(selector: String): DocumentMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("_remove")(selector.asInstanceOf[js.Any]).asInstanceOf[DocumentMetadata]
    inline def remove(selector: ObjectWithId): DocumentMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("_remove")(selector.asInstanceOf[js.Any]).asInstanceOf[DocumentMetadata]
    
    inline def replace(selector: String, data: js.Object): DocumentMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("_replace")(selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DocumentMetadata]
    inline def replace(selector: ObjectWithId, data: js.Object): DocumentMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("_replace")(selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DocumentMetadata]
    
    inline def truncate(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_truncate")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def update(selector: String, data: js.Object): DocumentMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("_update")(selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DocumentMetadata]
    inline def update(selector: ObjectWithId, data: js.Object): DocumentMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("_update")(selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DocumentMetadata]
    
    inline def useDatabase(name: String): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("_useDatabase")(name.asInstanceOf[js.Any]).asInstanceOf[Database]
    
    inline def version(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_version")().asInstanceOf[String]
    
    // Views
    inline def view(name: String): ArangoSearchView | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_view")(name.asInstanceOf[js.Any]).asInstanceOf[ArangoSearchView | Null]
    
    inline def views(): js.Array[ArangoSearchView] = ^.asInstanceOf[js.Dynamic].applyDynamic("_views")().asInstanceOf[js.Array[ArangoSearchView]]
  }
  
  /* Inlined {[ Name in arangodb.ArangoDB.ErrorName ]: {  code :number,   message :string}} */
  object errors {
    
    @JSImport("@arangodb", "errors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@arangodb", "errors.COMMUNICATOR_DISABLED")
    @js.native
    def COMMUNICATOR_DISABLED: Code = js.native
    inline def COMMUNICATOR_DISABLED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMUNICATOR_DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.COMMUNICATOR_REQUEST_ABORTED")
    @js.native
    def COMMUNICATOR_REQUEST_ABORTED: Code = js.native
    inline def COMMUNICATOR_REQUEST_ABORTED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMUNICATOR_REQUEST_ABORTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_CANNOT_REBUILD_DBS")
    @js.native
    def ERROR_AGENCY_CANNOT_REBUILD_DBS: Code = js.native
    inline def ERROR_AGENCY_CANNOT_REBUILD_DBS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_CANNOT_REBUILD_DBS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INFORM_MUST_BE_OBJECT")
    @js.native
    def ERROR_AGENCY_INFORM_MUST_BE_OBJECT: Code = js.native
    inline def ERROR_AGENCY_INFORM_MUST_BE_OBJECT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INFORM_MUST_BE_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE")
    @js.native
    def ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE: Code = js.native
    inline def ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID")
    @js.native
    def ERROR_AGENCY_INFORM_MUST_CONTAIN_ID: Code = js.native
    inline def ERROR_AGENCY_INFORM_MUST_CONTAIN_ID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INFORM_MUST_CONTAIN_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING")
    @js.native
    def ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING: Code = js.native
    inline def ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING")
    @js.native
    def ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING: Code = js.native
    inline def ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL")
    @js.native
    def ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL: Code = js.native
    inline def ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM")
    @js.native
    def ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM: Code = js.native
    inline def ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT")
    @js.native
    def ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT: Code = js.native
    inline def ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING")
    @js.native
    def ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING: Code = js.native
    inline def ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_AGENCY_INQUIRY_SYNTAX")
    @js.native
    def ERROR_AGENCY_INQUIRY_SYNTAX: Code = js.native
    inline def ERROR_AGENCY_INQUIRY_SYNTAX_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_AGENCY_INQUIRY_SYNTAX")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED")
    @js.native
    def ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED: Code = js.native
    inline def ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_BUSY")
    @js.native
    def ERROR_ARANGO_BUSY: Code = js.native
    inline def ERROR_ARANGO_BUSY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_BUSY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS")
    @js.native
    def ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS: Code = js.native
    inline def ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_COLLECTION_NOT_LOADED")
    @js.native
    def ERROR_ARANGO_COLLECTION_NOT_LOADED: Code = js.native
    inline def ERROR_ARANGO_COLLECTION_NOT_LOADED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_COLLECTION_NOT_LOADED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_COLLECTION_NOT_UNLOADED")
    @js.native
    def ERROR_ARANGO_COLLECTION_NOT_UNLOADED: Code = js.native
    inline def ERROR_ARANGO_COLLECTION_NOT_UNLOADED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_COLLECTION_NOT_UNLOADED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING")
    @js.native
    def ERROR_ARANGO_COLLECTION_PARAMETER_MISSING: Code = js.native
    inline def ERROR_ARANGO_COLLECTION_PARAMETER_MISSING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_COLLECTION_PARAMETER_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_COLLECTION_TYPE_INVALID")
    @js.native
    def ERROR_ARANGO_COLLECTION_TYPE_INVALID: Code = js.native
    inline def ERROR_ARANGO_COLLECTION_TYPE_INVALID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_COLLECTION_TYPE_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH")
    @js.native
    def ERROR_ARANGO_COLLECTION_TYPE_MISMATCH: Code = js.native
    inline def ERROR_ARANGO_COLLECTION_TYPE_MISMATCH_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_COLLECTION_TYPE_MISMATCH")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_CONFLICT")
    @js.native
    def ERROR_ARANGO_CONFLICT: Code = js.native
    inline def ERROR_ARANGO_CONFLICT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_CONFLICT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_CORRUPTED_COLLECTION")
    @js.native
    def ERROR_ARANGO_CORRUPTED_COLLECTION: Code = js.native
    inline def ERROR_ARANGO_CORRUPTED_COLLECTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_CORRUPTED_COLLECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_CORRUPTED_DATAFILE")
    @js.native
    def ERROR_ARANGO_CORRUPTED_DATAFILE: Code = js.native
    inline def ERROR_ARANGO_CORRUPTED_DATAFILE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_CORRUPTED_DATAFILE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_CROSS_COLLECTION_REQUEST")
    @js.native
    def ERROR_ARANGO_CROSS_COLLECTION_REQUEST: Code = js.native
    inline def ERROR_ARANGO_CROSS_COLLECTION_REQUEST_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_CROSS_COLLECTION_REQUEST")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATABASE_NAME_INVALID")
    @js.native
    def ERROR_ARANGO_DATABASE_NAME_INVALID: Code = js.native
    inline def ERROR_ARANGO_DATABASE_NAME_INVALID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATABASE_NAME_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATABASE_NOT_FOUND")
    @js.native
    def ERROR_ARANGO_DATABASE_NOT_FOUND: Code = js.native
    inline def ERROR_ARANGO_DATABASE_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATABASE_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATADIR_INVALID")
    @js.native
    def ERROR_ARANGO_DATADIR_INVALID: Code = js.native
    inline def ERROR_ARANGO_DATADIR_INVALID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATADIR_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATADIR_LOCKED")
    @js.native
    def ERROR_ARANGO_DATADIR_LOCKED: Code = js.native
    inline def ERROR_ARANGO_DATADIR_LOCKED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATADIR_LOCKED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATADIR_NOT_WRITABLE")
    @js.native
    def ERROR_ARANGO_DATADIR_NOT_WRITABLE: Code = js.native
    inline def ERROR_ARANGO_DATADIR_NOT_WRITABLE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATADIR_NOT_WRITABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATADIR_UNLOCKABLE")
    @js.native
    def ERROR_ARANGO_DATADIR_UNLOCKABLE: Code = js.native
    inline def ERROR_ARANGO_DATADIR_UNLOCKABLE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATADIR_UNLOCKABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS")
    @js.native
    def ERROR_ARANGO_DATAFILE_ALREADY_EXISTS: Code = js.native
    inline def ERROR_ARANGO_DATAFILE_ALREADY_EXISTS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATAFILE_ALREADY_EXISTS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATAFILE_EMPTY")
    @js.native
    def ERROR_ARANGO_DATAFILE_EMPTY: Code = js.native
    inline def ERROR_ARANGO_DATAFILE_EMPTY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATAFILE_EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATAFILE_FULL")
    @js.native
    def ERROR_ARANGO_DATAFILE_FULL: Code = js.native
    inline def ERROR_ARANGO_DATAFILE_FULL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATAFILE_FULL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATAFILE_SEALED")
    @js.native
    def ERROR_ARANGO_DATAFILE_SEALED: Code = js.native
    inline def ERROR_ARANGO_DATAFILE_SEALED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATAFILE_SEALED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND")
    @js.native
    def ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND: Code = js.native
    inline def ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATAFILE_UNREADABLE")
    @js.native
    def ERROR_ARANGO_DATAFILE_UNREADABLE: Code = js.native
    inline def ERROR_ARANGO_DATAFILE_UNREADABLE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATAFILE_UNREADABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND")
    @js.native
    def ERROR_ARANGO_DATA_SOURCE_NOT_FOUND: Code = js.native
    inline def ERROR_ARANGO_DATA_SOURCE_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DATA_SOURCE_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_HANDLE_BAD")
    @js.native
    def ERROR_ARANGO_DOCUMENT_HANDLE_BAD: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_HANDLE_BAD_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_HANDLE_BAD")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_KEY_BAD")
    @js.native
    def ERROR_ARANGO_DOCUMENT_KEY_BAD: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_KEY_BAD_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_KEY_BAD")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_KEY_MISSING")
    @js.native
    def ERROR_ARANGO_DOCUMENT_KEY_MISSING: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_KEY_MISSING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_KEY_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED")
    @js.native
    def ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_NOT_FOUND")
    @js.native
    def ERROR_ARANGO_DOCUMENT_NOT_FOUND: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED")
    @js.native
    def ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_REV_BAD")
    @js.native
    def ERROR_ARANGO_DOCUMENT_REV_BAD: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_REV_BAD_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_REV_BAD")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_TOO_LARGE")
    @js.native
    def ERROR_ARANGO_DOCUMENT_TOO_LARGE: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_TOO_LARGE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_TOO_LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DOCUMENT_TYPE_INVALID")
    @js.native
    def ERROR_ARANGO_DOCUMENT_TYPE_INVALID: Code = js.native
    inline def ERROR_ARANGO_DOCUMENT_TYPE_INVALID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DOCUMENT_TYPE_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DUPLICATE_IDENTIFIER")
    @js.native
    def ERROR_ARANGO_DUPLICATE_IDENTIFIER: Code = js.native
    inline def ERROR_ARANGO_DUPLICATE_IDENTIFIER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DUPLICATE_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_DUPLICATE_NAME")
    @js.native
    def ERROR_ARANGO_DUPLICATE_NAME: Code = js.native
    inline def ERROR_ARANGO_DUPLICATE_NAME_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_DUPLICATE_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_EMPTY_DATADIR")
    @js.native
    def ERROR_ARANGO_EMPTY_DATADIR: Code = js.native
    inline def ERROR_ARANGO_EMPTY_DATADIR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_EMPTY_DATADIR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_ENDPOINT_NOT_FOUND")
    @js.native
    def ERROR_ARANGO_ENDPOINT_NOT_FOUND: Code = js.native
    inline def ERROR_ARANGO_ENDPOINT_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_ENDPOINT_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_FILESYSTEM_FULL")
    @js.native
    def ERROR_ARANGO_FILESYSTEM_FULL: Code = js.native
    inline def ERROR_ARANGO_FILESYSTEM_FULL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_FILESYSTEM_FULL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_ICU_ERROR")
    @js.native
    def ERROR_ARANGO_ICU_ERROR: Code = js.native
    inline def ERROR_ARANGO_ICU_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_ICU_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_ILLEGAL_NAME")
    @js.native
    def ERROR_ARANGO_ILLEGAL_NAME: Code = js.native
    inline def ERROR_ARANGO_ILLEGAL_NAME_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_ILLEGAL_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE")
    @js.native
    def ERROR_ARANGO_ILLEGAL_PARAMETER_FILE: Code = js.native
    inline def ERROR_ARANGO_ILLEGAL_PARAMETER_FILE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_ILLEGAL_PARAMETER_FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_ILLEGAL_STATE")
    @js.native
    def ERROR_ARANGO_ILLEGAL_STATE: Code = js.native
    inline def ERROR_ARANGO_ILLEGAL_STATE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_ILLEGAL_STATE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_INDEX_CREATION_FAILED")
    @js.native
    def ERROR_ARANGO_INDEX_CREATION_FAILED: Code = js.native
    inline def ERROR_ARANGO_INDEX_CREATION_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_INDEX_CREATION_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING")
    @js.native
    def ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING: Code = js.native
    inline def ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_INDEX_HANDLE_BAD")
    @js.native
    def ERROR_ARANGO_INDEX_HANDLE_BAD: Code = js.native
    inline def ERROR_ARANGO_INDEX_HANDLE_BAD_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_INDEX_HANDLE_BAD")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_INDEX_NOT_FOUND")
    @js.native
    def ERROR_ARANGO_INDEX_NOT_FOUND: Code = js.native
    inline def ERROR_ARANGO_INDEX_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_INDEX_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE")
    @js.native
    def ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE: Code = js.native
    inline def ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_INVALID_KEY_GENERATOR")
    @js.native
    def ERROR_ARANGO_INVALID_KEY_GENERATOR: Code = js.native
    inline def ERROR_ARANGO_INVALID_KEY_GENERATOR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_INVALID_KEY_GENERATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_IO_ERROR")
    @js.native
    def ERROR_ARANGO_IO_ERROR: Code = js.native
    inline def ERROR_ARANGO_IO_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_IO_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL")
    @js.native
    def ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL: Code = js.native
    inline def ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_MERGE_IN_PROGRESS")
    @js.native
    def ERROR_ARANGO_MERGE_IN_PROGRESS: Code = js.native
    inline def ERROR_ARANGO_MERGE_IN_PROGRESS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_MERGE_IN_PROGRESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_MMAP_FAILED")
    @js.native
    def ERROR_ARANGO_MMAP_FAILED: Code = js.native
    inline def ERROR_ARANGO_MMAP_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_MMAP_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_MSYNC_FAILED")
    @js.native
    def ERROR_ARANGO_MSYNC_FAILED: Code = js.native
    inline def ERROR_ARANGO_MSYNC_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_MSYNC_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_NO_INDEX")
    @js.native
    def ERROR_ARANGO_NO_INDEX: Code = js.native
    inline def ERROR_ARANGO_NO_INDEX_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_NO_INDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_NO_JOURNAL")
    @js.native
    def ERROR_ARANGO_NO_JOURNAL: Code = js.native
    inline def ERROR_ARANGO_NO_JOURNAL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_NO_JOURNAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_OUT_OF_KEYS")
    @js.native
    def ERROR_ARANGO_OUT_OF_KEYS: Code = js.native
    inline def ERROR_ARANGO_OUT_OF_KEYS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_OUT_OF_KEYS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_READ_ONLY")
    @js.native
    def ERROR_ARANGO_READ_ONLY: Code = js.native
    inline def ERROR_ARANGO_READ_ONLY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_READ_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_RECOVERY")
    @js.native
    def ERROR_ARANGO_RECOVERY: Code = js.native
    inline def ERROR_ARANGO_RECOVERY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_RECOVERY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_SYNC_TIMEOUT")
    @js.native
    def ERROR_ARANGO_SYNC_TIMEOUT: Code = js.native
    inline def ERROR_ARANGO_SYNC_TIMEOUT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_SYNC_TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_TRY_AGAIN")
    @js.native
    def ERROR_ARANGO_TRY_AGAIN: Code = js.native
    inline def ERROR_ARANGO_TRY_AGAIN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_TRY_AGAIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED")
    @js.native
    def ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED: Code = js.native
    inline def ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_USE_SYSTEM_DATABASE")
    @js.native
    def ERROR_ARANGO_USE_SYSTEM_DATABASE: Code = js.native
    inline def ERROR_ARANGO_USE_SYSTEM_DATABASE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_USE_SYSTEM_DATABASE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_VALIDATION_FAILED")
    @js.native
    def ERROR_ARANGO_VALIDATION_FAILED: Code = js.native
    inline def ERROR_ARANGO_VALIDATION_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_VALIDATION_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT")
    @js.native
    def ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT: Code = js.native
    inline def ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_BAD_PARAMETER")
    @js.native
    def ERROR_BAD_PARAMETER: Code = js.native
    inline def ERROR_BAD_PARAMETER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_BAD_PARAMETER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CANNOT_CREATE_DIRECTORY")
    @js.native
    def ERROR_CANNOT_CREATE_DIRECTORY: Code = js.native
    inline def ERROR_CANNOT_CREATE_DIRECTORY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CANNOT_CREATE_DIRECTORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CANNOT_CREATE_TEMP_FILE")
    @js.native
    def ERROR_CANNOT_CREATE_TEMP_FILE: Code = js.native
    inline def ERROR_CANNOT_CREATE_TEMP_FILE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CANNOT_CREATE_TEMP_FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CANNOT_DROP_SMART_COLLECTION")
    @js.native
    def ERROR_CANNOT_DROP_SMART_COLLECTION: Code = js.native
    inline def ERROR_CANNOT_DROP_SMART_COLLECTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CANNOT_DROP_SMART_COLLECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CANNOT_OVERWRITE_FILE")
    @js.native
    def ERROR_CANNOT_OVERWRITE_FILE: Code = js.native
    inline def ERROR_CANNOT_OVERWRITE_FILE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CANNOT_OVERWRITE_FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CANNOT_READ_FILE")
    @js.native
    def ERROR_CANNOT_READ_FILE: Code = js.native
    inline def ERROR_CANNOT_READ_FILE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CANNOT_READ_FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CANNOT_WRITE_FILE")
    @js.native
    def ERROR_CANNOT_WRITE_FILE: Code = js.native
    inline def ERROR_CANNOT_WRITE_FILE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CANNOT_WRITE_FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED")
    @js.native
    def ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED: Code = js.native
    inline def ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID")
    @js.native
    def ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID: Code = js.native
    inline def ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC")
    @js.native
    def ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC: Code = js.native
    inline def ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_AQL_COMMUNICATION")
    @js.native
    def ERROR_CLUSTER_AQL_COMMUNICATION: Code = js.native
    inline def ERROR_CLUSTER_AQL_COMMUNICATION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_AQL_COMMUNICATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_BACKEND_UNAVAILABLE")
    @js.native
    def ERROR_CLUSTER_BACKEND_UNAVAILABLE: Code = js.native
    inline def ERROR_CLUSTER_BACKEND_UNAVAILABLE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_BACKEND_UNAVAILABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE")
    @js.native
    def ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE: Code = js.native
    inline def ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COLLECTION_ID_EXISTS")
    @js.native
    def ERROR_CLUSTER_COLLECTION_ID_EXISTS: Code = js.native
    inline def ERROR_CLUSTER_COLLECTION_ID_EXISTS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COLLECTION_ID_EXISTS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_CONNECTION_LOST")
    @js.native
    def ERROR_CLUSTER_CONNECTION_LOST: Code = js.native
    inline def ERROR_CLUSTER_CONNECTION_LOST_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_CONNECTION_LOST")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_DETERMINE_ID: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_DETERMINE_ID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_DETERMINE_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_LOCK_PLAN: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_LOCK_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_LOCK_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION")
    @js.native
    def ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION: Code = js.native
    inline def ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS")
    @js.native
    def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS: Code = js.native
    inline def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR")
    @js.native
    def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR: Code = js.native
    inline def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS")
    @js.native
    def ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS: Code = js.native
    inline def ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS")
    @js.native
    def ERROR_CLUSTER_INSUFFICIENT_DBSERVERS: Code = js.native
    inline def ERROR_CLUSTER_INSUFFICIENT_DBSERVERS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_INSUFFICIENT_DBSERVERS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING")
    @js.native
    def ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING: Code = js.native
    inline def ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES")
    @js.native
    def ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES: Code = js.native
    inline def ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE")
    @js.native
    def ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE: Code = js.native
    inline def ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY")
    @js.native
    def ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY: Code = js.native
    inline def ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN")
    @js.native
    def ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN: Code = js.native
    inline def ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_NOT_LEADER")
    @js.native
    def ERROR_CLUSTER_NOT_LEADER: Code = js.native
    inline def ERROR_CLUSTER_NOT_LEADER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_NOT_LEADER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_NO_AGENCY")
    @js.native
    def ERROR_CLUSTER_NO_AGENCY: Code = js.native
    inline def ERROR_CLUSTER_NO_AGENCY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_NO_AGENCY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_NO_COORDINATOR_HEADER")
    @js.native
    def ERROR_CLUSTER_NO_COORDINATOR_HEADER: Code = js.native
    inline def ERROR_CLUSTER_NO_COORDINATOR_HEADER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_NO_COORDINATOR_HEADER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_ONLY_ON_COORDINATOR")
    @js.native
    def ERROR_CLUSTER_ONLY_ON_COORDINATOR: Code = js.native
    inline def ERROR_CLUSTER_ONLY_ON_COORDINATOR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_ONLY_ON_COORDINATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_ONLY_ON_DBSERVER")
    @js.native
    def ERROR_CLUSTER_ONLY_ON_DBSERVER: Code = js.native
    inline def ERROR_CLUSTER_ONLY_ON_DBSERVER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_ONLY_ON_DBSERVER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_READING_PLAN_AGENCY")
    @js.native
    def ERROR_CLUSTER_READING_PLAN_AGENCY: Code = js.native
    inline def ERROR_CLUSTER_READING_PLAN_AGENCY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_READING_PLAN_AGENCY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION")
    @js.native
    def ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION: Code = js.native
    inline def ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_SHARD_GONE")
    @js.native
    def ERROR_CLUSTER_SHARD_GONE: Code = js.native
    inline def ERROR_CLUSTER_SHARD_GONE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_SHARD_GONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION")
    @js.native
    def ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION: Code = js.native
    inline def ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_SHARD_LEADER_RESIGNED")
    @js.native
    def ERROR_CLUSTER_SHARD_LEADER_RESIGNED: Code = js.native
    inline def ERROR_CLUSTER_SHARD_LEADER_RESIGNED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_SHARD_LEADER_RESIGNED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_TIMEOUT")
    @js.native
    def ERROR_CLUSTER_TIMEOUT: Code = js.native
    inline def ERROR_CLUSTER_TIMEOUT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT")
    @js.native
    def ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT: Code = js.native
    inline def ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE")
    @js.native
    def ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE: Code = js.native
    inline def ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CLUSTER_UNSUPPORTED")
    @js.native
    def ERROR_CLUSTER_UNSUPPORTED: Code = js.native
    inline def ERROR_CLUSTER_UNSUPPORTED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CLUSTER_UNSUPPORTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CORRUPTED_CSV")
    @js.native
    def ERROR_CORRUPTED_CSV: Code = js.native
    inline def ERROR_CORRUPTED_CSV_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CORRUPTED_CSV")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CURSOR_BUSY")
    @js.native
    def ERROR_CURSOR_BUSY: Code = js.native
    inline def ERROR_CURSOR_BUSY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CURSOR_BUSY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_CURSOR_NOT_FOUND")
    @js.native
    def ERROR_CURSOR_NOT_FOUND: Code = js.native
    inline def ERROR_CURSOR_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CURSOR_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_DEADLOCK")
    @js.native
    def ERROR_DEADLOCK: Code = js.native
    inline def ERROR_DEADLOCK_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_DEADLOCK")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_DEAD_PID")
    @js.native
    def ERROR_DEAD_PID: Code = js.native
    inline def ERROR_DEAD_PID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_DEAD_PID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_DEBUG")
    @js.native
    def ERROR_DEBUG: Code = js.native
    inline def ERROR_DEBUG_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_DISPATCHER_IS_STOPPING")
    @js.native
    def ERROR_DISPATCHER_IS_STOPPING: Code = js.native
    inline def ERROR_DISPATCHER_IS_STOPPING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_DISPATCHER_IS_STOPPING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_FAILED")
    @js.native
    def ERROR_FAILED: Code = js.native
    inline def ERROR_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_FILE_EXISTS")
    @js.native
    def ERROR_FILE_EXISTS: Code = js.native
    inline def ERROR_FILE_EXISTS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_FILE_EXISTS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_FILE_NOT_FOUND")
    @js.native
    def ERROR_FILE_NOT_FOUND: Code = js.native
    inline def ERROR_FILE_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_FILE_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_FORBIDDEN")
    @js.native
    def ERROR_FORBIDDEN: Code = js.native
    inline def ERROR_FORBIDDEN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_FORBIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE")
    @js.native
    def ERROR_GRAPH_COULD_NOT_CHANGE_EDGE: Code = js.native
    inline def ERROR_GRAPH_COULD_NOT_CHANGE_EDGE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_COULD_NOT_CHANGE_EDGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX")
    @js.native
    def ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX: Code = js.native
    inline def ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_COULD_NOT_CREATE_EDGE")
    @js.native
    def ERROR_GRAPH_COULD_NOT_CREATE_EDGE: Code = js.native
    inline def ERROR_GRAPH_COULD_NOT_CREATE_EDGE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_COULD_NOT_CREATE_EDGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH")
    @js.native
    def ERROR_GRAPH_COULD_NOT_CREATE_GRAPH: Code = js.native
    inline def ERROR_GRAPH_COULD_NOT_CREATE_GRAPH_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_COULD_NOT_CREATE_GRAPH")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX")
    @js.native
    def ERROR_GRAPH_COULD_NOT_CREATE_VERTEX: Code = js.native
    inline def ERROR_GRAPH_COULD_NOT_CREATE_VERTEX_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_COULD_NOT_CREATE_VERTEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_EMPTY")
    @js.native
    def ERROR_GRAPH_EMPTY: Code = js.native
    inline def ERROR_GRAPH_EMPTY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_INVALID_EDGE")
    @js.native
    def ERROR_GRAPH_INVALID_EDGE: Code = js.native
    inline def ERROR_GRAPH_INVALID_EDGE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_INVALID_EDGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_INVALID_FILTER_RESULT")
    @js.native
    def ERROR_GRAPH_INVALID_FILTER_RESULT: Code = js.native
    inline def ERROR_GRAPH_INVALID_FILTER_RESULT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_INVALID_FILTER_RESULT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_INVALID_GRAPH")
    @js.native
    def ERROR_GRAPH_INVALID_GRAPH: Code = js.native
    inline def ERROR_GRAPH_INVALID_GRAPH_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_INVALID_GRAPH")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_INVALID_VERTEX")
    @js.native
    def ERROR_GRAPH_INVALID_VERTEX: Code = js.native
    inline def ERROR_GRAPH_INVALID_VERTEX_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_INVALID_VERTEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_GRAPH_TOO_MANY_ITERATIONS")
    @js.native
    def ERROR_GRAPH_TOO_MANY_ITERATIONS: Code = js.native
    inline def ERROR_GRAPH_TOO_MANY_ITERATIONS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_GRAPH_TOO_MANY_ITERATIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_BAD_PARAMETER")
    @js.native
    def ERROR_HTTP_BAD_PARAMETER: Code = js.native
    inline def ERROR_HTTP_BAD_PARAMETER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_BAD_PARAMETER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_CORRUPTED_JSON")
    @js.native
    def ERROR_HTTP_CORRUPTED_JSON: Code = js.native
    inline def ERROR_HTTP_CORRUPTED_JSON_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_CORRUPTED_JSON")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_FORBIDDEN")
    @js.native
    def ERROR_HTTP_FORBIDDEN: Code = js.native
    inline def ERROR_HTTP_FORBIDDEN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_FORBIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_GATEWAY_TIMEOUT")
    @js.native
    def ERROR_HTTP_GATEWAY_TIMEOUT: Code = js.native
    inline def ERROR_HTTP_GATEWAY_TIMEOUT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_GATEWAY_TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_METHOD_NOT_ALLOWED")
    @js.native
    def ERROR_HTTP_METHOD_NOT_ALLOWED: Code = js.native
    inline def ERROR_HTTP_METHOD_NOT_ALLOWED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_METHOD_NOT_ALLOWED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_NOT_ACCEPTABLE")
    @js.native
    def ERROR_HTTP_NOT_ACCEPTABLE: Code = js.native
    inline def ERROR_HTTP_NOT_ACCEPTABLE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_NOT_ACCEPTABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_NOT_FOUND")
    @js.native
    def ERROR_HTTP_NOT_FOUND: Code = js.native
    inline def ERROR_HTTP_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_PRECONDITION_FAILED")
    @js.native
    def ERROR_HTTP_PRECONDITION_FAILED: Code = js.native
    inline def ERROR_HTTP_PRECONDITION_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_PRECONDITION_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_SERVER_ERROR")
    @js.native
    def ERROR_HTTP_SERVER_ERROR: Code = js.native
    inline def ERROR_HTTP_SERVER_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_SERVER_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_SERVICE_UNAVAILABLE")
    @js.native
    def ERROR_HTTP_SERVICE_UNAVAILABLE: Code = js.native
    inline def ERROR_HTTP_SERVICE_UNAVAILABLE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_SERVICE_UNAVAILABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_SUPERFLUOUS_SUFFICES")
    @js.native
    def ERROR_HTTP_SUPERFLUOUS_SUFFICES: Code = js.native
    inline def ERROR_HTTP_SUPERFLUOUS_SUFFICES_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_SUPERFLUOUS_SUFFICES")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_HTTP_UNAUTHORIZED")
    @js.native
    def ERROR_HTTP_UNAUTHORIZED: Code = js.native
    inline def ERROR_HTTP_UNAUTHORIZED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_HTTP_UNAUTHORIZED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ILLEGAL_NUMBER")
    @js.native
    def ERROR_ILLEGAL_NUMBER: Code = js.native
    inline def ERROR_ILLEGAL_NUMBER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ILLEGAL_NUMBER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ILLEGAL_OPTION")
    @js.native
    def ERROR_ILLEGAL_OPTION: Code = js.native
    inline def ERROR_ILLEGAL_OPTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ILLEGAL_OPTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE")
    @js.native
    def ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE: Code = js.native
    inline def ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_INTERNAL")
    @js.native
    def ERROR_INTERNAL: Code = js.native
    inline def ERROR_INTERNAL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_INTERNAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_INVALID_FOXX_OPTIONS")
    @js.native
    def ERROR_INVALID_FOXX_OPTIONS: Code = js.native
    inline def ERROR_INVALID_FOXX_OPTIONS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_INVALID_FOXX_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_INVALID_MOUNTPOINT")
    @js.native
    def ERROR_INVALID_MOUNTPOINT: Code = js.native
    inline def ERROR_INVALID_MOUNTPOINT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_INVALID_MOUNTPOINT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_INVALID_SERVICE_MANIFEST")
    @js.native
    def ERROR_INVALID_SERVICE_MANIFEST: Code = js.native
    inline def ERROR_INVALID_SERVICE_MANIFEST_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_INVALID_SERVICE_MANIFEST")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_IP_ADDRESS_INVALID")
    @js.native
    def ERROR_IP_ADDRESS_INVALID: Code = js.native
    inline def ERROR_IP_ADDRESS_INVALID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_IP_ADDRESS_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE")
    @js.native
    def ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE: Code = js.native
    inline def ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_CANNOT_BIND")
    @js.native
    def ERROR_LDAP_CANNOT_BIND: Code = js.native
    inline def ERROR_LDAP_CANNOT_BIND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_CANNOT_BIND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_CANNOT_INIT")
    @js.native
    def ERROR_LDAP_CANNOT_INIT: Code = js.native
    inline def ERROR_LDAP_CANNOT_INIT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_CANNOT_INIT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_CANNOT_SEARCH")
    @js.native
    def ERROR_LDAP_CANNOT_SEARCH: Code = js.native
    inline def ERROR_LDAP_CANNOT_SEARCH_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_CANNOT_SEARCH")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_CANNOT_SET_OPTION")
    @js.native
    def ERROR_LDAP_CANNOT_SET_OPTION: Code = js.native
    inline def ERROR_LDAP_CANNOT_SET_OPTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_CANNOT_SET_OPTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_CANNOT_START_TLS")
    @js.native
    def ERROR_LDAP_CANNOT_START_TLS: Code = js.native
    inline def ERROR_LDAP_CANNOT_START_TLS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_CANNOT_START_TLS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_CANNOT_UNBIND")
    @js.native
    def ERROR_LDAP_CANNOT_UNBIND: Code = js.native
    inline def ERROR_LDAP_CANNOT_UNBIND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_CANNOT_UNBIND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_FOUND_NO_OBJECTS")
    @js.native
    def ERROR_LDAP_FOUND_NO_OBJECTS: Code = js.native
    inline def ERROR_LDAP_FOUND_NO_OBJECTS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_FOUND_NO_OBJECTS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_INVALID_MODE")
    @js.native
    def ERROR_LDAP_INVALID_MODE: Code = js.native
    inline def ERROR_LDAP_INVALID_MODE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_INVALID_MODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_NOT_ONE_USER_FOUND")
    @js.native
    def ERROR_LDAP_NOT_ONE_USER_FOUND: Code = js.native
    inline def ERROR_LDAP_NOT_ONE_USER_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_NOT_ONE_USER_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LDAP_USER_NOT_IDENTIFIED")
    @js.native
    def ERROR_LDAP_USER_NOT_IDENTIFIED: Code = js.native
    inline def ERROR_LDAP_USER_NOT_IDENTIFIED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LDAP_USER_NOT_IDENTIFIED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LOCKED")
    @js.native
    def ERROR_LOCKED: Code = js.native
    inline def ERROR_LOCKED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LOCKED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_LOCK_TIMEOUT")
    @js.native
    def ERROR_LOCK_TIMEOUT: Code = js.native
    inline def ERROR_LOCK_TIMEOUT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LOCK_TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_MALFORMED_MANIFEST_FILE")
    @js.native
    def ERROR_MALFORMED_MANIFEST_FILE: Code = js.native
    inline def ERROR_MALFORMED_MANIFEST_FILE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MALFORMED_MANIFEST_FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_MODULE_FAILURE")
    @js.native
    def ERROR_MODULE_FAILURE: Code = js.native
    inline def ERROR_MODULE_FAILURE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MODULE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_MODULE_NOT_FOUND")
    @js.native
    def ERROR_MODULE_NOT_FOUND: Code = js.native
    inline def ERROR_MODULE_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MODULE_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_MODULE_SYNTAX_ERROR")
    @js.native
    def ERROR_MODULE_SYNTAX_ERROR: Code = js.native
    inline def ERROR_MODULE_SYNTAX_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MODULE_SYNTAX_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_NOT_IMPLEMENTED")
    @js.native
    def ERROR_NOT_IMPLEMENTED: Code = js.native
    inline def ERROR_NOT_IMPLEMENTED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NOT_IMPLEMENTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_NO_ERROR")
    @js.native
    def ERROR_NO_ERROR: Code = js.native
    inline def ERROR_NO_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NO_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_NO_SMART_COLLECTION")
    @js.native
    def ERROR_NO_SMART_COLLECTION: Code = js.native
    inline def ERROR_NO_SMART_COLLECTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NO_SMART_COLLECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_NO_SMART_GRAPH_ATTRIBUTE")
    @js.native
    def ERROR_NO_SMART_GRAPH_ATTRIBUTE: Code = js.native
    inline def ERROR_NO_SMART_GRAPH_ATTRIBUTE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NO_SMART_GRAPH_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_NUMERIC_OVERFLOW")
    @js.native
    def ERROR_NUMERIC_OVERFLOW: Code = js.native
    inline def ERROR_NUMERIC_OVERFLOW_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NUMERIC_OVERFLOW")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_ONLY_ENTERPRISE")
    @js.native
    def ERROR_ONLY_ENTERPRISE: Code = js.native
    inline def ERROR_ONLY_ENTERPRISE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_ONLY_ENTERPRISE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_OUT_OF_MEMORY")
    @js.native
    def ERROR_OUT_OF_MEMORY: Code = js.native
    inline def ERROR_OUT_OF_MEMORY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_OUT_OF_MEMORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_OUT_OF_MEMORY_MMAP")
    @js.native
    def ERROR_OUT_OF_MEMORY_MMAP: Code = js.native
    inline def ERROR_OUT_OF_MEMORY_MMAP_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_OUT_OF_MEMORY_MMAP")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_ACCESS_AFTER_MODIFICATION")
    @js.native
    def ERROR_QUERY_ACCESS_AFTER_MODIFICATION: Code = js.native
    inline def ERROR_QUERY_ACCESS_AFTER_MODIFICATION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_ACCESS_AFTER_MODIFICATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_ARRAY_EXPECTED")
    @js.native
    def ERROR_QUERY_ARRAY_EXPECTED: Code = js.native
    inline def ERROR_QUERY_ARRAY_EXPECTED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_ARRAY_EXPECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_BAD_JSON_PLAN")
    @js.native
    def ERROR_QUERY_BAD_JSON_PLAN: Code = js.native
    inline def ERROR_QUERY_BAD_JSON_PLAN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_BAD_JSON_PLAN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_BIND_PARAMETERS_INVALID")
    @js.native
    def ERROR_QUERY_BIND_PARAMETERS_INVALID: Code = js.native
    inline def ERROR_QUERY_BIND_PARAMETERS_INVALID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_BIND_PARAMETERS_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_BIND_PARAMETER_MISSING")
    @js.native
    def ERROR_QUERY_BIND_PARAMETER_MISSING: Code = js.native
    inline def ERROR_QUERY_BIND_PARAMETER_MISSING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_BIND_PARAMETER_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_BIND_PARAMETER_TYPE")
    @js.native
    def ERROR_QUERY_BIND_PARAMETER_TYPE: Code = js.native
    inline def ERROR_QUERY_BIND_PARAMETER_TYPE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_BIND_PARAMETER_TYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_BIND_PARAMETER_UNDECLARED")
    @js.native
    def ERROR_QUERY_BIND_PARAMETER_UNDECLARED: Code = js.native
    inline def ERROR_QUERY_BIND_PARAMETER_UNDECLARED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_BIND_PARAMETER_UNDECLARED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_COLLECTION_LOCK_FAILED")
    @js.native
    def ERROR_QUERY_COLLECTION_LOCK_FAILED: Code = js.native
    inline def ERROR_QUERY_COLLECTION_LOCK_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_COLLECTION_LOCK_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION")
    @js.native
    def ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION: Code = js.native
    inline def ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_COMPILE_TIME_OPTIONS")
    @js.native
    def ERROR_QUERY_COMPILE_TIME_OPTIONS: Code = js.native
    inline def ERROR_QUERY_COMPILE_TIME_OPTIONS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_COMPILE_TIME_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL")
    @js.native
    def ERROR_QUERY_DISALLOWED_DYNAMIC_CALL: Code = js.native
    inline def ERROR_QUERY_DISALLOWED_DYNAMIC_CALL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_DISALLOWED_DYNAMIC_CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_DIVISION_BY_ZERO")
    @js.native
    def ERROR_QUERY_DIVISION_BY_ZERO: Code = js.native
    inline def ERROR_QUERY_DIVISION_BY_ZERO_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_DIVISION_BY_ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED")
    @js.native
    def ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED: Code = js.native
    inline def ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_EMPTY")
    @js.native
    def ERROR_QUERY_EMPTY: Code = js.native
    inline def ERROR_QUERY_EMPTY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_EXCEPTION_OPTIONS")
    @js.native
    def ERROR_QUERY_EXCEPTION_OPTIONS: Code = js.native
    inline def ERROR_QUERY_EXCEPTION_OPTIONS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_EXCEPTION_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FAIL_CALLED")
    @js.native
    def ERROR_QUERY_FAIL_CALLED: Code = js.native
    inline def ERROR_QUERY_FAIL_CALLED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FAIL_CALLED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FULLTEXT_INDEX_MISSING")
    @js.native
    def ERROR_QUERY_FULLTEXT_INDEX_MISSING: Code = js.native
    inline def ERROR_QUERY_FULLTEXT_INDEX_MISSING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FULLTEXT_INDEX_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH")
    @js.native
    def ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH: Code = js.native
    inline def ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH")
    @js.native
    def ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH: Code = js.native
    inline def ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FUNCTION_INVALID_CODE")
    @js.native
    def ERROR_QUERY_FUNCTION_INVALID_CODE: Code = js.native
    inline def ERROR_QUERY_FUNCTION_INVALID_CODE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FUNCTION_INVALID_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FUNCTION_INVALID_NAME")
    @js.native
    def ERROR_QUERY_FUNCTION_INVALID_NAME: Code = js.native
    inline def ERROR_QUERY_FUNCTION_INVALID_NAME_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FUNCTION_INVALID_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FUNCTION_NAME_UNKNOWN")
    @js.native
    def ERROR_QUERY_FUNCTION_NAME_UNKNOWN: Code = js.native
    inline def ERROR_QUERY_FUNCTION_NAME_UNKNOWN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FUNCTION_NAME_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FUNCTION_NOT_FOUND")
    @js.native
    def ERROR_QUERY_FUNCTION_NOT_FOUND: Code = js.native
    inline def ERROR_QUERY_FUNCTION_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FUNCTION_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_FUNCTION_RUNTIME_ERROR")
    @js.native
    def ERROR_QUERY_FUNCTION_RUNTIME_ERROR: Code = js.native
    inline def ERROR_QUERY_FUNCTION_RUNTIME_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_FUNCTION_RUNTIME_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_GEO_INDEX_MISSING")
    @js.native
    def ERROR_QUERY_GEO_INDEX_MISSING: Code = js.native
    inline def ERROR_QUERY_GEO_INDEX_MISSING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_GEO_INDEX_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION")
    @js.native
    def ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION: Code = js.native
    inline def ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_INVALID_ARITHMETIC_VALUE")
    @js.native
    def ERROR_QUERY_INVALID_ARITHMETIC_VALUE: Code = js.native
    inline def ERROR_QUERY_INVALID_ARITHMETIC_VALUE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_INVALID_ARITHMETIC_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_INVALID_DATE_VALUE")
    @js.native
    def ERROR_QUERY_INVALID_DATE_VALUE: Code = js.native
    inline def ERROR_QUERY_INVALID_DATE_VALUE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_INVALID_DATE_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_INVALID_LOGICAL_VALUE")
    @js.native
    def ERROR_QUERY_INVALID_LOGICAL_VALUE: Code = js.native
    inline def ERROR_QUERY_INVALID_LOGICAL_VALUE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_INVALID_LOGICAL_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_INVALID_REGEX")
    @js.native
    def ERROR_QUERY_INVALID_REGEX: Code = js.native
    inline def ERROR_QUERY_INVALID_REGEX_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_INVALID_REGEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_IN_USE")
    @js.native
    def ERROR_QUERY_IN_USE: Code = js.native
    inline def ERROR_QUERY_IN_USE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_IN_USE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_KILLED")
    @js.native
    def ERROR_QUERY_KILLED: Code = js.native
    inline def ERROR_QUERY_KILLED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_KILLED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_MULTI_MODIFY")
    @js.native
    def ERROR_QUERY_MULTI_MODIFY: Code = js.native
    inline def ERROR_QUERY_MULTI_MODIFY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_MULTI_MODIFY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_NOT_FOUND")
    @js.native
    def ERROR_QUERY_NOT_FOUND: Code = js.native
    inline def ERROR_QUERY_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_NUMBER_OUT_OF_RANGE")
    @js.native
    def ERROR_QUERY_NUMBER_OUT_OF_RANGE: Code = js.native
    inline def ERROR_QUERY_NUMBER_OUT_OF_RANGE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_NUMBER_OUT_OF_RANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_PARSE")
    @js.native
    def ERROR_QUERY_PARSE: Code = js.native
    inline def ERROR_QUERY_PARSE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_PARSE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_SCRIPT")
    @js.native
    def ERROR_QUERY_SCRIPT: Code = js.native
    inline def ERROR_QUERY_SCRIPT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_SCRIPT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_TOO_MANY_COLLECTIONS")
    @js.native
    def ERROR_QUERY_TOO_MANY_COLLECTIONS: Code = js.native
    inline def ERROR_QUERY_TOO_MANY_COLLECTIONS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_TOO_MANY_COLLECTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_USER_ASSERT")
    @js.native
    def ERROR_QUERY_USER_ASSERT: Code = js.native
    inline def ERROR_QUERY_USER_ASSERT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_USER_ASSERT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_USER_WARN")
    @js.native
    def ERROR_QUERY_USER_WARN: Code = js.native
    inline def ERROR_QUERY_USER_WARN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_USER_WARN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_VARIABLE_NAME_INVALID")
    @js.native
    def ERROR_QUERY_VARIABLE_NAME_INVALID: Code = js.native
    inline def ERROR_QUERY_VARIABLE_NAME_INVALID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_VARIABLE_NAME_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_VARIABLE_NAME_UNKNOWN")
    @js.native
    def ERROR_QUERY_VARIABLE_NAME_UNKNOWN: Code = js.native
    inline def ERROR_QUERY_VARIABLE_NAME_UNKNOWN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_VARIABLE_NAME_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUERY_VARIABLE_REDECLARED")
    @js.native
    def ERROR_QUERY_VARIABLE_REDECLARED: Code = js.native
    inline def ERROR_QUERY_VARIABLE_REDECLARED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUERY_VARIABLE_REDECLARED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUEUE_FULL")
    @js.native
    def ERROR_QUEUE_FULL: Code = js.native
    inline def ERROR_QUEUE_FULL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUEUE_FULL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_QUEUE_UNKNOWN")
    @js.native
    def ERROR_QUEUE_UNKNOWN: Code = js.native
    inline def ERROR_QUEUE_UNKNOWN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_QUEUE_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_APPLIER_STOPPED")
    @js.native
    def ERROR_REPLICATION_APPLIER_STOPPED: Code = js.native
    inline def ERROR_REPLICATION_APPLIER_STOPPED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_APPLIER_STOPPED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION")
    @js.native
    def ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION: Code = js.native
    inline def ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_INVALID_APPLIER_STATE")
    @js.native
    def ERROR_REPLICATION_INVALID_APPLIER_STATE: Code = js.native
    inline def ERROR_REPLICATION_INVALID_APPLIER_STATE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_INVALID_APPLIER_STATE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_INVALID_RESPONSE")
    @js.native
    def ERROR_REPLICATION_INVALID_RESPONSE: Code = js.native
    inline def ERROR_REPLICATION_INVALID_RESPONSE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_INVALID_RESPONSE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_LOOP")
    @js.native
    def ERROR_REPLICATION_LOOP: Code = js.native
    inline def ERROR_REPLICATION_LOOP_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_LOOP")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_MASTER_CHANGE")
    @js.native
    def ERROR_REPLICATION_MASTER_CHANGE: Code = js.native
    inline def ERROR_REPLICATION_MASTER_CHANGE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_MASTER_CHANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_MASTER_ERROR")
    @js.native
    def ERROR_REPLICATION_MASTER_ERROR: Code = js.native
    inline def ERROR_REPLICATION_MASTER_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_MASTER_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_MASTER_INCOMPATIBLE")
    @js.native
    def ERROR_REPLICATION_MASTER_INCOMPATIBLE: Code = js.native
    inline def ERROR_REPLICATION_MASTER_INCOMPATIBLE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_MASTER_INCOMPATIBLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_NO_RESPONSE")
    @js.native
    def ERROR_REPLICATION_NO_RESPONSE: Code = js.native
    inline def ERROR_REPLICATION_NO_RESPONSE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_NO_RESPONSE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_NO_START_TICK")
    @js.native
    def ERROR_REPLICATION_NO_START_TICK: Code = js.native
    inline def ERROR_REPLICATION_NO_START_TICK_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_NO_START_TICK")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_RUNNING")
    @js.native
    def ERROR_REPLICATION_RUNNING: Code = js.native
    inline def ERROR_REPLICATION_RUNNING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_RUNNING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_SHARD_NONEMPTY")
    @js.native
    def ERROR_REPLICATION_SHARD_NONEMPTY: Code = js.native
    inline def ERROR_REPLICATION_SHARD_NONEMPTY_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_SHARD_NONEMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_START_TICK_NOT_PRESENT")
    @js.native
    def ERROR_REPLICATION_START_TICK_NOT_PRESENT: Code = js.native
    inline def ERROR_REPLICATION_START_TICK_NOT_PRESENT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_START_TICK_NOT_PRESENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_UNEXPECTED_MARKER")
    @js.native
    def ERROR_REPLICATION_UNEXPECTED_MARKER: Code = js.native
    inline def ERROR_REPLICATION_UNEXPECTED_MARKER_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_UNEXPECTED_MARKER")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_UNEXPECTED_TRANSACTION")
    @js.native
    def ERROR_REPLICATION_UNEXPECTED_TRANSACTION: Code = js.native
    inline def ERROR_REPLICATION_UNEXPECTED_TRANSACTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_UNEXPECTED_TRANSACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REPLICATION_WRONG_CHECKSUM")
    @js.native
    def ERROR_REPLICATION_WRONG_CHECKSUM: Code = js.native
    inline def ERROR_REPLICATION_WRONG_CHECKSUM_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REPLICATION_WRONG_CHECKSUM")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_REQUEST_CANCELED")
    @js.native
    def ERROR_REQUEST_CANCELED: Code = js.native
    inline def ERROR_REQUEST_CANCELED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_REQUEST_CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_RESOURCE_LIMIT")
    @js.native
    def ERROR_RESOURCE_LIMIT: Code = js.native
    inline def ERROR_RESOURCE_LIMIT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_RESOURCE_LIMIT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_DOWNLOAD_FAILED")
    @js.native
    def ERROR_SERVICE_DOWNLOAD_FAILED: Code = js.native
    inline def ERROR_SERVICE_DOWNLOAD_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_DOWNLOAD_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_FILES_MISSING")
    @js.native
    def ERROR_SERVICE_FILES_MISSING: Code = js.native
    inline def ERROR_SERVICE_FILES_MISSING_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_FILES_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_FILES_OUTDATED")
    @js.native
    def ERROR_SERVICE_FILES_OUTDATED: Code = js.native
    inline def ERROR_SERVICE_FILES_OUTDATED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_FILES_OUTDATED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_INVALID_MOUNT")
    @js.native
    def ERROR_SERVICE_INVALID_MOUNT: Code = js.native
    inline def ERROR_SERVICE_INVALID_MOUNT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_INVALID_MOUNT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_INVALID_NAME")
    @js.native
    def ERROR_SERVICE_INVALID_NAME: Code = js.native
    inline def ERROR_SERVICE_INVALID_NAME_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_INVALID_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_MANIFEST_NOT_FOUND")
    @js.native
    def ERROR_SERVICE_MANIFEST_NOT_FOUND: Code = js.native
    inline def ERROR_SERVICE_MANIFEST_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_MANIFEST_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_MOUNTPOINT_CONFLICT")
    @js.native
    def ERROR_SERVICE_MOUNTPOINT_CONFLICT: Code = js.native
    inline def ERROR_SERVICE_MOUNTPOINT_CONFLICT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_MOUNTPOINT_CONFLICT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_NEEDS_CONFIGURATION")
    @js.native
    def ERROR_SERVICE_NEEDS_CONFIGURATION: Code = js.native
    inline def ERROR_SERVICE_NEEDS_CONFIGURATION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_NEEDS_CONFIGURATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_NOT_FOUND")
    @js.native
    def ERROR_SERVICE_NOT_FOUND: Code = js.native
    inline def ERROR_SERVICE_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_OPTIONS_MALFORMED")
    @js.native
    def ERROR_SERVICE_OPTIONS_MALFORMED: Code = js.native
    inline def ERROR_SERVICE_OPTIONS_MALFORMED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_OPTIONS_MALFORMED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_SOURCE_ERROR")
    @js.native
    def ERROR_SERVICE_SOURCE_ERROR: Code = js.native
    inline def ERROR_SERVICE_SOURCE_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_SOURCE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_SOURCE_NOT_FOUND")
    @js.native
    def ERROR_SERVICE_SOURCE_NOT_FOUND: Code = js.native
    inline def ERROR_SERVICE_SOURCE_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_SOURCE_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_UNKNOWN_SCRIPT")
    @js.native
    def ERROR_SERVICE_UNKNOWN_SCRIPT: Code = js.native
    inline def ERROR_SERVICE_UNKNOWN_SCRIPT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_UNKNOWN_SCRIPT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SERVICE_UPLOAD_FAILED")
    @js.native
    def ERROR_SERVICE_UPLOAD_FAILED: Code = js.native
    inline def ERROR_SERVICE_UPLOAD_FAILED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SERVICE_UPLOAD_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SESSION_EXPIRED")
    @js.native
    def ERROR_SESSION_EXPIRED: Code = js.native
    inline def ERROR_SESSION_EXPIRED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SESSION_EXPIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SESSION_UNKNOWN")
    @js.native
    def ERROR_SESSION_UNKNOWN: Code = js.native
    inline def ERROR_SESSION_UNKNOWN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SESSION_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SHUTTING_DOWN")
    @js.native
    def ERROR_SHUTTING_DOWN: Code = js.native
    inline def ERROR_SHUTTING_DOWN_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SHUTTING_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SUPERVISION_GENERAL_FAILURE")
    @js.native
    def ERROR_SUPERVISION_GENERAL_FAILURE: Code = js.native
    inline def ERROR_SUPERVISION_GENERAL_FAILURE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SUPERVISION_GENERAL_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_SYS_ERROR")
    @js.native
    def ERROR_SYS_ERROR: Code = js.native
    inline def ERROR_SYS_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SYS_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TASK_DUPLICATE_ID")
    @js.native
    def ERROR_TASK_DUPLICATE_ID: Code = js.native
    inline def ERROR_TASK_DUPLICATE_ID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TASK_DUPLICATE_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TASK_INVALID_ID")
    @js.native
    def ERROR_TASK_INVALID_ID: Code = js.native
    inline def ERROR_TASK_INVALID_ID_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TASK_INVALID_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TASK_NOT_FOUND")
    @js.native
    def ERROR_TASK_NOT_FOUND: Code = js.native
    inline def ERROR_TASK_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TASK_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TRANSACTION_ABORTED")
    @js.native
    def ERROR_TRANSACTION_ABORTED: Code = js.native
    inline def ERROR_TRANSACTION_ABORTED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TRANSACTION_ABORTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TRANSACTION_DISALLOWED_OPERATION")
    @js.native
    def ERROR_TRANSACTION_DISALLOWED_OPERATION: Code = js.native
    inline def ERROR_TRANSACTION_DISALLOWED_OPERATION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TRANSACTION_DISALLOWED_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TRANSACTION_INTERNAL")
    @js.native
    def ERROR_TRANSACTION_INTERNAL: Code = js.native
    inline def ERROR_TRANSACTION_INTERNAL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TRANSACTION_INTERNAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TRANSACTION_NESTED")
    @js.native
    def ERROR_TRANSACTION_NESTED: Code = js.native
    inline def ERROR_TRANSACTION_NESTED_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TRANSACTION_NESTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TRANSACTION_UNREGISTERED_COLLECTION")
    @js.native
    def ERROR_TRANSACTION_UNREGISTERED_COLLECTION: Code = js.native
    inline def ERROR_TRANSACTION_UNREGISTERED_COLLECTION_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TRANSACTION_UNREGISTERED_COLLECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_TYPE_ERROR")
    @js.native
    def ERROR_TYPE_ERROR: Code = js.native
    inline def ERROR_TYPE_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_TYPE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_USER_CHANGE_PASSWORD")
    @js.native
    def ERROR_USER_CHANGE_PASSWORD: Code = js.native
    inline def ERROR_USER_CHANGE_PASSWORD_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_USER_CHANGE_PASSWORD")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_USER_DUPLICATE")
    @js.native
    def ERROR_USER_DUPLICATE: Code = js.native
    inline def ERROR_USER_DUPLICATE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_USER_DUPLICATE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_USER_EXTERNAL")
    @js.native
    def ERROR_USER_EXTERNAL: Code = js.native
    inline def ERROR_USER_EXTERNAL_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_USER_EXTERNAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_USER_INVALID_NAME")
    @js.native
    def ERROR_USER_INVALID_NAME: Code = js.native
    inline def ERROR_USER_INVALID_NAME_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_USER_INVALID_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_USER_INVALID_PASSWORD")
    @js.native
    def ERROR_USER_INVALID_PASSWORD: Code = js.native
    inline def ERROR_USER_INVALID_PASSWORD_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_USER_INVALID_PASSWORD")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.ERROR_USER_NOT_FOUND")
    @js.native
    def ERROR_USER_NOT_FOUND: Code = js.native
    inline def ERROR_USER_NOT_FOUND_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_USER_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.SIMPLE_CLIENT_COULD_NOT_CONNECT")
    @js.native
    def SIMPLE_CLIENT_COULD_NOT_CONNECT: Code = js.native
    inline def SIMPLE_CLIENT_COULD_NOT_CONNECT_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIMPLE_CLIENT_COULD_NOT_CONNECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.SIMPLE_CLIENT_COULD_NOT_READ")
    @js.native
    def SIMPLE_CLIENT_COULD_NOT_READ: Code = js.native
    inline def SIMPLE_CLIENT_COULD_NOT_READ_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIMPLE_CLIENT_COULD_NOT_READ")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.SIMPLE_CLIENT_COULD_NOT_WRITE")
    @js.native
    def SIMPLE_CLIENT_COULD_NOT_WRITE: Code = js.native
    inline def SIMPLE_CLIENT_COULD_NOT_WRITE_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIMPLE_CLIENT_COULD_NOT_WRITE")(x.asInstanceOf[js.Any])
    
    @JSImport("@arangodb", "errors.SIMPLE_CLIENT_UNKNOWN_ERROR")
    @js.native
    def SIMPLE_CLIENT_UNKNOWN_ERROR: Code = js.native
    inline def SIMPLE_CLIENT_UNKNOWN_ERROR_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIMPLE_CLIENT_UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
  }
  
  inline def query(strings: TemplateStringsArray, args: Any*): Cursor[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(List(strings.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Cursor[Any]]
  
  inline def time(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[Double]
}
