package typings.anydbSqlMigrations.mod

import typings.anydbSql.mod.Transaction
import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationTask extends js.Object {
  
  def down(tx: Transaction): ^[_] = js.native
  @JSName("down")
  var down_Original: MigFn = js.native
  
  var name: String = js.native
  
  def up(tx: Transaction): ^[_] = js.native
  @JSName("up")
  var up_Original: MigFn = js.native
}
