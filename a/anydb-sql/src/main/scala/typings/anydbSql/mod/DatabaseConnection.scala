package typings.anydbSql.mod

import typings.anydbSql.anon.RowCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseConnection extends js.Object {
  
  def queryAsync[T](query: String, params: js.Any*): typings.bluebird.mod.^[RowCount[T]] = js.native
  def queryAsync[T](query: QueryLike): typings.bluebird.mod.^[RowCount[T]] = js.native
}
