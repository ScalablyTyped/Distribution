package typings.apolloDashDatasource.apolloDashDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-datasource", "DataSource")
@js.native
abstract class DataSource[TContext] () extends js.Object {
  var initialize: js.UndefOr[js.Function1[/* config */ DataSourceConfig[TContext], Unit]] = js.native
}

