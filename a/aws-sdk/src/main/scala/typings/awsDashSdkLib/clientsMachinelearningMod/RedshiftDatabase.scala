package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftDatabase extends js.Object {
  var ClusterIdentifier: RedshiftClusterIdentifier
  var DatabaseName: RedshiftDatabaseName
}

object RedshiftDatabase {
  @scala.inline
  def apply(ClusterIdentifier: RedshiftClusterIdentifier, DatabaseName: RedshiftDatabaseName): RedshiftDatabase = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier, DatabaseName = DatabaseName)
  
    __obj.asInstanceOf[RedshiftDatabase]
  }
}

