package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  // Collection
  def _collection(name: java.lang.String): Collection[_] = js.native
  def _collections(): js.Array[Collection[_]] = js.native
  def _create(name: java.lang.String): Collection[_] = js.native
  def _create(name: java.lang.String, properties: CreateCollectionOptions): Collection[_] = js.native
  // Database
  def _createDatabase(name: java.lang.String): arangodbLib.arangodbLibNumbers.`true` = js.native
  def _createDatabase(name: java.lang.String, options: scala.Nothing): arangodbLib.arangodbLibNumbers.`true` = js.native
  def _createDatabase(name: java.lang.String, options: scala.Nothing, users: js.Array[DatabaseUser]): arangodbLib.arangodbLibNumbers.`true` = js.native
  def _createDocumentCollection(name: java.lang.String): Collection[_] = js.native
  def _createDocumentCollection(name: java.lang.String, properties: CreateCollectionOptions): Collection[_] = js.native
  def _createEdgeCollection(name: java.lang.String): Collection[_] = js.native
  def _createEdgeCollection(name: java.lang.String, properties: CreateCollectionOptions): Collection[_] = js.native
  // AQL
  def _createStatement(query: Query): Statement[_] = js.native
  def _createStatement(query: java.lang.String): Statement[_] = js.native
  def _createView(name: java.lang.String, `type`: ViewType, properties: ArangoSearchViewPropertiesOptions): ArangoSearchView = js.native
  def _databases(): js.Array[java.lang.String] = js.native
  // Document
  def _document(name: java.lang.String): Document[_] = js.native
  def _drop(name: java.lang.String): scala.Unit = js.native
  def _dropDatabase(name: java.lang.String): arangodbLib.arangodbLibNumbers.`true` = js.native
  def _dropIndex(index: IndexLike): scala.Boolean = js.native
  def _dropIndex(index: java.lang.String): scala.Boolean = js.native
  def _dropView(name: java.lang.String): scala.Unit = js.native
  // Global
  def _engine(): EngineType = js.native
  def _engineStats(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def _executeTransaction(transaction: Transaction): scala.Unit = js.native
  def _exists(selector: ObjectWithId): DocumentMetadata = js.native
  def _exists(selector: java.lang.String): DocumentMetadata = js.native
  def _explain(query: Query): scala.Unit = js.native
  def _explain(query: java.lang.String): scala.Unit = js.native
  // Properties
  def _id(): java.lang.String = js.native
  def _index(index: IndexLike): Index[_] | scala.Null = js.native
  // Indexes
  def _index(index: java.lang.String): Index[_] | scala.Null = js.native
  def _isSystem(): scala.Boolean = js.native
  def _name(): java.lang.String = js.native
  def _parse(query: java.lang.String): ParsedQuery = js.native
  def _path(): java.lang.String = js.native
  def _query(query: Query): Cursor[_] = js.native
  def _query(query: Query, options: QueryOptions): Cursor[_] = js.native
  def _query(query: java.lang.String): Cursor[_] = js.native
  def _query(query: java.lang.String, bindVars: js.Object): Cursor[_] = js.native
  def _query(query: java.lang.String, bindVars: js.Object, options: QueryOptions): Cursor[_] = js.native
  def _remove(selector: ObjectWithId): DocumentMetadata = js.native
  def _remove(selector: java.lang.String): DocumentMetadata = js.native
  def _replace(selector: ObjectWithId, data: js.Object): DocumentMetadata = js.native
  def _replace(selector: java.lang.String, data: js.Object): DocumentMetadata = js.native
  def _truncate(name: java.lang.String): scala.Unit = js.native
  def _update(selector: ObjectWithId, data: js.Object): DocumentMetadata = js.native
  def _update(selector: java.lang.String, data: js.Object): DocumentMetadata = js.native
  def _useDatabase(name: java.lang.String): Database = js.native
  def _version(): java.lang.String = js.native
  // Views
  def _view(name: java.lang.String): ArangoSearchView | scala.Null = js.native
  def _views(): js.Array[ArangoSearchView] = js.native
}

