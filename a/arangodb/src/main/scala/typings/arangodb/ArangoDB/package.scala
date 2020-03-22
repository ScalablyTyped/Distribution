package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArangoDB {
  type CollectionType = typings.arangodb.ArangoDB.DocumentCollectionType | typings.arangodb.ArangoDB.EdgeCollectionType
  type Document[T /* <: js.Object */] = typings.arangodb.AnonDictkey with typings.arangodb.arangodbStrings.Document with T with typings.arangodb.ArangoDB.DocumentMetadata
  // Collection
  type DocumentCollectionType = typings.arangodb.arangodbNumbers.`2`
  type DocumentIterator[T /* <: js.Object */] = js.Function2[
    /* document */ typings.arangodb.ArangoDB.Document[T], 
    /* number */ scala.Double, 
    scala.Unit
  ]
  type Edge[T /* <: js.Object */] = typings.arangodb.ArangoDB.Document[T] with typings.arangodb.AnonFrom
  type EdgeCollectionType = typings.arangodb.arangodbNumbers.`3`
  type Patch[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias arangodb.ArangoDB.Patch<T[K]> * / object}
    */ typings.arangodb.arangodbStrings.Patch_ with T
  type ViewType = typings.arangodb.arangodbStrings.arangosearch
}
