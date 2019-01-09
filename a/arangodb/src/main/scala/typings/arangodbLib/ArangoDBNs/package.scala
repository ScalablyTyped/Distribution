package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArangoDBNs {
  type ArangoSearchViewConsolidationType = arangodbLib.arangodbLibStrings.bytes | arangodbLib.arangodbLibStrings.bytes_accum | arangodbLib.arangodbLibStrings.count | arangodbLib.arangodbLibStrings.fill
  type CollectionType = DocumentCollectionType | EdgeCollectionType
  type Document[T /* <: js.Object */] = arangodbLib.Anon_From with arangodbLib.arangodbLibStrings.Document with T with DocumentMetadata
  // Collection
  type DocumentCollectionType = arangodbLib.arangodbLibNumbers.`2`
  type DocumentData[T /* <: js.Object */] = arangodbLib.arangodbLibStrings.DocumentData with T with stdLib.Partial[DocumentMetadata]
  type DocumentIterator[T /* <: js.Object */] = js.Function2[/* document */ Document[T], /* number */ scala.Double, scala.Unit]
  type DocumentLike = ObjectWithId | ObjectWithKey
  type Edge[T /* <: js.Object */] = Document[T] with arangodbLib.Anon_FromTo
  type EdgeCollectionType = arangodbLib.arangodbLibNumbers.`3`
  type EdgeDirection = arangodbLib.arangodbLibStrings.any | arangodbLib.arangodbLibStrings.inbound | arangodbLib.arangodbLibStrings.outbound
  type EngineType = arangodbLib.arangodbLibStrings.mmfiles | arangodbLib.arangodbLibStrings.rocksdb
  type ErrorName = /* import warning: LimitUnionLength.enterTypeRef Was union type with length 300 */ java.lang.String
  type HashAlgorithm = arangodbLib.arangodbLibStrings.sha512 | arangodbLib.arangodbLibStrings.sha384 | arangodbLib.arangodbLibStrings.sha256 | arangodbLib.arangodbLibStrings.sha224 | arangodbLib.arangodbLibStrings.sha1 | arangodbLib.arangodbLibStrings.md5
  type HttpMethod = arangodbLib.arangodbLibStrings.HEAD | arangodbLib.arangodbLibStrings.GET | arangodbLib.arangodbLibStrings.POST | arangodbLib.arangodbLibStrings.PUT | arangodbLib.arangodbLibStrings.PATCH | arangodbLib.arangodbLibStrings.DELETE | arangodbLib.arangodbLibStrings.OPTIONS
  type HttpStatus = /* import warning: LimitUnionLength.enterTypeRef Was union type with length 63 */ java.lang.String
  type IndexType = arangodbLib.arangodbLibStrings.hash | arangodbLib.arangodbLibStrings.skiplist | arangodbLib.arangodbLibStrings.fulltext | arangodbLib.arangodbLibStrings.geo
  type JwtAlgorithm = arangodbLib.arangodbLibStrings.HS512 | arangodbLib.arangodbLibStrings.HS384 | arangodbLib.arangodbLibStrings.HS256
  type KeyGeneratorType = arangodbLib.arangodbLibStrings.traditional | arangodbLib.arangodbLibStrings.autoincrement
  type Patch[T] = arangodbLib.arangodbLibStrings.Patch with T
  type ViewType = arangodbLib.arangodbLibStrings.arangosearch
}
