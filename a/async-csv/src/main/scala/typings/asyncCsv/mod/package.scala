package typings.asyncCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cast[T] = js.Function2[/* value */ T, /* context */ typings.asyncCsv.mod.CastingContext, java.lang.String]
  
  type CastingDateFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typings.asyncCsv.mod.CastingContext, 
    typings.std.Date
  ]
  
  type CastingFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typings.asyncCsv.mod.CastingContext, 
    js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.asyncCsv.asyncCsvBooleans.`false`
    - typings.asyncCsv.anon.Name
  */
  type ColumnOption = js.UndefOr[typings.asyncCsv.mod._ColumnOption | java.lang.String | scala.Null]
  
  type ParseColumnOption = js.UndefOr[java.lang.String | scala.Null]
  
  type PlainObject[T] = typings.std.Record[java.lang.String, T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.asyncCsv.asyncCsvStrings.auto
    - typings.asyncCsv.asyncCsvStrings.unix
    - typings.asyncCsv.asyncCsvStrings.mac
    - typings.asyncCsv.asyncCsvStrings.windows
    - typings.asyncCsv.asyncCsvStrings.ascii
    - typings.asyncCsv.asyncCsvStrings.unicode
  */
  type RecordDelimiter = typings.asyncCsv.mod._RecordDelimiter | java.lang.String | typings.node.Buffer
}
