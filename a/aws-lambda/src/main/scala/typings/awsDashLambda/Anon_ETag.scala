package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ETag extends js.Object {
  var eTag: String
  var key: String
  var sequencer: String
  var size: Double
  var versionId: String
}

object Anon_ETag {
  @scala.inline
  def apply(eTag: String, key: String, sequencer: String, size: Double, versionId: String): Anon_ETag = {
    val __obj = js.Dynamic.literal(eTag = eTag, key = key, sequencer = sequencer, size = size, versionId = versionId)
  
    __obj.asInstanceOf[Anon_ETag]
  }
}

