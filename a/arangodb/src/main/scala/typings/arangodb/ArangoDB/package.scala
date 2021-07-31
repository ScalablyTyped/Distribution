package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CollectionType = typings.arangodb.ArangoDB.DocumentCollectionType | typings.arangodb.ArangoDB.EdgeCollectionType

type Document[T /* <: js.Object */] = typings.arangodb.anon.From & typings.arangodb.arangodbStrings.Document & org.scalablytyped.runtime.TopLevel[T] & typings.arangodb.ArangoDB.DocumentMetadata

// Collection
type DocumentCollectionType = typings.arangodb.arangodbNumbers.`2`

type DocumentIterator[T /* <: js.Object */] = js.Function2[
/* document */ typings.arangodb.ArangoDB.Document[T], 
/* number */ scala.Double, 
scala.Unit]

type Edge[T /* <: js.Object */] = typings.arangodb.ArangoDB.Document[T] & typings.arangodb.anon.To

type EdgeCollectionType = typings.arangodb.arangodbNumbers.`3`

type Patch[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? T[K] | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias arangodb.ArangoDB.Patch<T[K]> * / object}
  */ typings.arangodb.arangodbStrings.Patch_ & org.scalablytyped.runtime.TopLevel[T]

type ViewType = typings.arangodb.arangodbStrings.arangosearch
