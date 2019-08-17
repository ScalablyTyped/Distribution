package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArangoDBNs {
  import typings.arangodb.Anon_From
  import typings.arangodb.Anon_FromTo
  import typings.arangodb.arangodbNumbers.`2`
  import typings.arangodb.arangodbNumbers.`3`
  import typings.arangodb.arangodbStrings.arangosearch
  import typings.std.Partial

  type CollectionType = DocumentCollectionType | EdgeCollectionType
  type Document[T /* <: js.Object */] = Anon_From with typings.arangodb.arangodbStrings.Document with T with DocumentMetadata
  // Collection
  type DocumentCollectionType = `2`
  type DocumentData[T /* <: js.Object */] = typings.arangodb.arangodbStrings.DocumentData with T with Partial[DocumentMetadata]
  type DocumentIterator[T /* <: js.Object */] = js.Function2[/* document */ Document[T], /* number */ Double, Unit]
  type Edge[T /* <: js.Object */] = Document[T] with Anon_FromTo
  type EdgeCollectionType = `3`
  type Patch[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias arangodb.ArangoDB.Patch<T[K]> * / object}
    */ typings.arangodb.arangodbStrings.Patch with T
  type ViewType = arangosearch
}
