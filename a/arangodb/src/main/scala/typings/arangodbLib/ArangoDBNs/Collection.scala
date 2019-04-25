package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T /* <: js.Object */] extends js.Object {
  // Document
  def all(): Cursor[Document[T]] = js.native
  def any(): Document[T] = js.native
  def byExample(example: stdLib.Partial[Document[T]]): Cursor[Document[T]] = js.native
  def checksum(): CollectionChecksum = js.native
  def checksum(withRevisions: scala.Boolean): CollectionChecksum = js.native
  def checksum(withRevisions: scala.Boolean, withData: scala.Boolean): CollectionChecksum = js.native
  def count(): scala.Double = js.native
  def document(selector: DocumentLike): Document[T] = js.native
  def document(selector: java.lang.String): Document[T] = js.native
  def document(selectors: js.Array[java.lang.String | DocumentLike]): js.Array[Document[T]] = js.native
  def documentId(documentKey: java.lang.String): java.lang.String = js.native
  def drop(): scala.Unit = js.native
  def drop(options: arangodbLib.Anon_IsSystem): scala.Unit = js.native
  def dropIndex(index: IndexLike): scala.Boolean = js.native
  // Indexes
  def dropIndex(index: java.lang.String): scala.Boolean = js.native
  def edges(vertex: ObjectWithId): js.Array[Edge[T]] = js.native
  def edges(vertex: java.lang.String): js.Array[Edge[T]] = js.native
  def edges(vertex: js.Array[java.lang.String | ObjectWithId]): js.Array[Edge[T]] = js.native
  def ensureIndex(description: IndexDescription[T]): Index[T] = js.native
  def exists(name: java.lang.String): scala.Boolean = js.native
  def figures(): CollectionFigures = js.native
  def firstExample(example: stdLib.Partial[Document[T]]): Document[T] | scala.Null = js.native
  def getIndexes(): js.Array[Index[T]] = js.native
  def getResponsibleShard(document: DocumentLike): java.lang.String = js.native
  def inEdges(vertex: ObjectWithId): js.Array[Edge[T]] = js.native
  def inEdges(vertex: java.lang.String): js.Array[Edge[T]] = js.native
  def inEdges(vertex: js.Array[java.lang.String | ObjectWithId]): js.Array[Edge[T]] = js.native
  def index(index: IndexLike): Index[T] | scala.Null = js.native
  def index(index: java.lang.String): Index[T] | scala.Null = js.native
  def insert(array: js.Array[DocumentData[T]]): js.Array[InsertResult[T]] = js.native
  def insert(array: js.Array[DocumentData[T]], options: InsertOptions): js.Array[InsertResult[T]] = js.native
  def insert(data: DocumentData[T]): InsertResult[T] = js.native
  def insert(data: DocumentData[T], options: InsertOptions): InsertResult[T] = js.native
  def insert(from: java.lang.String, to: java.lang.String, data: DocumentData[T]): InsertResult[T] = js.native
  def insert(from: java.lang.String, to: java.lang.String, data: DocumentData[T], options: InsertOptions): InsertResult[T] = js.native
  def iterate(iterator: DocumentIterator[T]): scala.Unit = js.native
  def iterate(iterator: DocumentIterator[T], options: IterateOptions): scala.Unit = js.native
  def load(): scala.Unit = js.native
  // Collection
  def name(): java.lang.String = js.native
  def outEdges(vertex: ObjectWithId): js.Array[Edge[T]] = js.native
  def outEdges(vertex: java.lang.String): js.Array[Edge[T]] = js.native
  def outEdges(vertex: js.Array[java.lang.String | ObjectWithId]): js.Array[Edge[T]] = js.native
  def path(): java.lang.String = js.native
  def properties(): CollectionProperties = js.native
  def properties(properties: CollectionPropertiesOptions): CollectionProperties = js.native
  def remove(selector: DocumentLike): RemoveResult[_] = js.native
  def remove(selector: DocumentLike, options: RemoveOptions): RemoveResult[_] = js.native
  def remove(selector: java.lang.String): RemoveResult[_] = js.native
  def remove(selector: java.lang.String, options: RemoveOptions): RemoveResult[_] = js.native
  def remove(selectors: js.Array[java.lang.String | DocumentLike]): js.Array[RemoveResult[_]] = js.native
  def remove(selectors: js.Array[java.lang.String | DocumentLike], options: RemoveOptions): js.Array[RemoveResult[_]] = js.native
  def removeByExample(example: stdLib.Partial[Document[T]]): scala.Double = js.native
  def removeByExample(example: stdLib.Partial[Document[T]], options: RemoveByExampleOptions): scala.Double = js.native
  def removeByExample(example: stdLib.Partial[Document[T]], waitForSync: scala.Boolean): scala.Double = js.native
  def removeByExample(example: stdLib.Partial[Document[T]], waitForSync: scala.Boolean, limit: scala.Double): scala.Double = js.native
  def rename(newName: java.lang.String): scala.Unit = js.native
  def replace(selector: DocumentLike, data: DocumentData[T]): UpdateResult[T] = js.native
  def replace(selector: DocumentLike, data: DocumentData[T], options: ReplaceOptions): UpdateResult[T] = js.native
  def replace(selector: java.lang.String, data: DocumentData[T]): UpdateResult[T] = js.native
  def replace(selector: java.lang.String, data: DocumentData[T], options: ReplaceOptions): UpdateResult[T] = js.native
  def replace(selectors: js.Array[java.lang.String | DocumentLike], data: js.Array[DocumentData[T]]): js.Array[UpdateResult[T]] = js.native
  def replace(
    selectors: js.Array[java.lang.String | DocumentLike],
    data: js.Array[DocumentData[T]],
    options: ReplaceOptions
  ): js.Array[UpdateResult[T]] = js.native
  def replaceByExample(example: stdLib.Partial[Document[T]], newValue: DocumentData[T]): scala.Double = js.native
  def replaceByExample(example: stdLib.Partial[Document[T]], newValue: DocumentData[T], options: arangodbLib.Anon_Limit): scala.Double = js.native
  def replaceByExample(example: stdLib.Partial[Document[T]], newValue: DocumentData[T], waitForSync: scala.Boolean): scala.Double = js.native
  def replaceByExample(
    example: stdLib.Partial[Document[T]],
    newValue: DocumentData[T],
    waitForSync: scala.Boolean,
    limit: scala.Double
  ): scala.Double = js.native
  def revision(): java.lang.String = js.native
  def rotate(): scala.Unit = js.native
  def save(array: js.Array[DocumentData[T]]): js.Array[InsertResult[T]] = js.native
  def save(array: js.Array[DocumentData[T]], options: InsertOptions): js.Array[InsertResult[T]] = js.native
  def save(data: DocumentData[T]): InsertResult[T] = js.native
  def save(data: DocumentData[T], options: InsertOptions): InsertResult[T] = js.native
  def save(from: java.lang.String, to: java.lang.String, data: DocumentData[T]): InsertResult[T] = js.native
  def save(from: java.lang.String, to: java.lang.String, data: DocumentData[T], options: InsertOptions): InsertResult[T] = js.native
  def toArray(): js.Array[Document[T]] = js.native
  def truncate(): scala.Unit = js.native
  def `type`(): CollectionType = js.native
  def unload(): scala.Unit = js.native
  def update(selector: DocumentLike, data: Patch[Document[T]]): UpdateResult[T] = js.native
  def update(selector: DocumentLike, data: Patch[Document[T]], options: UpdateOptions): UpdateResult[T] = js.native
  def update(selector: java.lang.String, data: Patch[Document[T]]): UpdateResult[T] = js.native
  def update(selector: java.lang.String, data: Patch[Document[T]], options: UpdateOptions): UpdateResult[T] = js.native
  def update(selectors: js.Array[java.lang.String | DocumentLike], data: js.Array[Patch[Document[T]]]): js.Array[UpdateResult[T]] = js.native
  def update(
    selectors: js.Array[java.lang.String | DocumentLike],
    data: js.Array[Patch[Document[T]]],
    options: UpdateOptions
  ): js.Array[UpdateResult[T]] = js.native
  def updateByExample(example: stdLib.Partial[Document[T]], newValue: Patch[Document[T]]): scala.Double = js.native
  def updateByExample(example: stdLib.Partial[Document[T]], newValue: Patch[Document[T]], keepNull: scala.Boolean): scala.Double = js.native
  def updateByExample(
    example: stdLib.Partial[Document[T]],
    newValue: Patch[Document[T]],
    keepNull: scala.Boolean,
    waitForSync: scala.Boolean
  ): scala.Double = js.native
  def updateByExample(
    example: stdLib.Partial[Document[T]],
    newValue: Patch[Document[T]],
    keepNull: scala.Boolean,
    waitForSync: scala.Boolean,
    limit: scala.Double
  ): scala.Double = js.native
  def updateByExample(
    example: stdLib.Partial[Document[T]],
    newValue: Patch[Document[T]],
    options: UpdateByExampleOptions
  ): scala.Double = js.native
}

