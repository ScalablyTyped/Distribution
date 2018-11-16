package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Views
@js.native
trait ArangoSearchView extends js.Object {
  var _dbName: java.lang.String = js.native
  var _id: java.lang.String = js.native
  def name(): java.lang.String = js.native
  def properties(): ArangoSearchViewProperties = js.native
  def properties(newProperties: ArangoSearchViewPropertiesOptions): ArangoSearchViewProperties = js.native
  def rename(newName: java.lang.String): scala.Unit = js.native
  def `type`(): ViewType = js.native
}

