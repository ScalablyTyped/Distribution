package typings.apolloDatasource.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-datasource", "DataSource")
@js.native
abstract class DataSource[TContext] () extends js.Object {
  
  var initialize: js.UndefOr[js.Function1[/* config */ DataSourceConfig[TContext], Unit | js.Promise[Unit]]] = js.native
}
