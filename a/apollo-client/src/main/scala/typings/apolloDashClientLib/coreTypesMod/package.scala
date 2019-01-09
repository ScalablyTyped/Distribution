package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreTypesMod {
  type MutationQueryReducer[T] = js.Function2[
    /* previousResult */ stdLib.Record[java.lang.String, js.Any], 
    /* options */ apolloDashClientLib.Anon_MutationResult[T], 
    stdLib.Record[java.lang.String, js.Any]
  ]
  type QueryListener = js.Function2[
    /* queryStoreValue */ apolloDashClientLib.dataQueriesMod.QueryStoreValue, 
    /* newData */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
