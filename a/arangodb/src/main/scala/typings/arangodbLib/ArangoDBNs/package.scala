package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArangoDBNs {
  type CollectionType = DocumentCollectionType | EdgeCollectionType
  type Document[T /* <: js.Object */] = arangodbLib.Anon_From with arangodbLib.arangodbLibStrings.Document with T with DocumentMetadata
  // Collection
  type DocumentCollectionType = arangodbLib.arangodbLibNumbers.`2`
  type DocumentData[T /* <: js.Object */] = arangodbLib.arangodbLibStrings.DocumentData with T with stdLib.Partial[DocumentMetadata]
  type DocumentIterator[T /* <: js.Object */] = js.Function2[/* document */ Document[T], /* number */ scala.Double, scala.Unit]
  type Edge[T /* <: js.Object */] = Document[T] with arangodbLib.Anon_FromTo
  type EdgeCollectionType = arangodbLib.arangodbLibNumbers.`3`
  type ViewType = arangodbLib.arangodbLibStrings.arangosearch
}
