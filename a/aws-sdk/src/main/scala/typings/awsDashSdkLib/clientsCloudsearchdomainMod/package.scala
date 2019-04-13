package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudsearchdomainMod {
  type Adds = scala.Double
  type BucketList = js.Array[Bucket]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`application/json`
    - awsDashSdkLib.awsDashSdkLibStrings.`application/xml`
    - java.lang.String
  */
  type ContentType = _ContentType | java.lang.String
  type Cursor = java.lang.String
  type Deletes = scala.Double
  type DocumentServiceWarnings = js.Array[DocumentServiceWarning]
  type Double = scala.Double
  type Expr = java.lang.String
  type Exprs = org.scalablytyped.runtime.StringDictionary[String]
  type Facet = java.lang.String
  type Facets = org.scalablytyped.runtime.StringDictionary[BucketInfo]
  type FieldValue = js.Array[String]
  type Fields = org.scalablytyped.runtime.StringDictionary[FieldValue]
  type FilterQuery = java.lang.String
  type Highlight = java.lang.String
  type Highlights = org.scalablytyped.runtime.StringDictionary[String]
  type HitList = js.Array[Hit]
  type Long = scala.Double
  type Partial = scala.Boolean
  type Query = java.lang.String
  type QueryOptions = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.simple
    - awsDashSdkLib.awsDashSdkLibStrings.structured
    - awsDashSdkLib.awsDashSdkLibStrings.lucene
    - awsDashSdkLib.awsDashSdkLibStrings.dismax
    - java.lang.String
  */
  type QueryParser = _QueryParser | java.lang.String
  type Return = java.lang.String
  type Size = scala.Double
  type Sort = java.lang.String
  type Start = scala.Double
  type Stat = java.lang.String
  type Stats = org.scalablytyped.runtime.StringDictionary[FieldStats]
  type String = java.lang.String
  type Suggester = java.lang.String
  type Suggestions = js.Array[SuggestionMatch]
  type SuggestionsSize = scala.Double
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-01-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
