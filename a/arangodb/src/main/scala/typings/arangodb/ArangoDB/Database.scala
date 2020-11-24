package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.arangodbBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
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
