package typings.apolloServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestPipelineMod {
  type DataSources[TContext] = org.scalablytyped.runtime.StringDictionary[typings.apolloDatasource.mod.DataSource[TContext]]
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.apolloServerCore.apolloServerCoreStrings.Mutable with org.scalablytyped.runtime.TopLevel[T]
}
