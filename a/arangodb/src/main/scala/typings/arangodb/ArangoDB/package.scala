package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.TopLevel
import typings.arangodb.anon.From
import typings.arangodb.anon.To
import typings.arangodb.arangodbNumbers.`2`
import typings.arangodb.arangodbNumbers.`3`
import typings.arangodb.arangodbStrings.Patch_
import typings.arangodb.arangodbStrings.arangosearch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CollectionType = DocumentCollectionType | EdgeCollectionType

type Document[T /* <: js.Object */] = From & typings.arangodb.arangodbStrings.Document & TopLevel[T] & DocumentMetadata

// Collection
type DocumentCollectionType = `2`

type DocumentIterator[T /* <: js.Object */] = js.Function2[/* document */ Document[T], /* number */ Double, Unit]

type Edge[T /* <: js.Object */] = Document[T] & To

type EdgeCollectionType = `3`

type Patch[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? T[K] | arangodb.ArangoDB.Patch<T[K]>}
  */ Patch_ & TopLevel[Any]

type ViewType = arangosearch
