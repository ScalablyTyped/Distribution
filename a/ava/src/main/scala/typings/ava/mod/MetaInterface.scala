package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaInterface extends js.Object {
  /** Path to the test file being executed. */
  var file: String
  /** Directory where snapshots are stored. */
  var snapshotDirectory: String
}

object MetaInterface {
  @scala.inline
  def apply(file: String, snapshotDirectory: String): MetaInterface = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], snapshotDirectory = snapshotDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaInterface]
  }
}

