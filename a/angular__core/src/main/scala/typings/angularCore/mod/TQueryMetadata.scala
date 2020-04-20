package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing query metadata extracted from query annotations.
  */
trait TQueryMetadata extends js.Object {
  var descendants: Boolean
  var isStatic: Boolean
  var predicate: Type[_] | js.Array[String]
  var read: js.Any
}

object TQueryMetadata {
  @scala.inline
  def apply(descendants: Boolean, isStatic: Boolean, predicate: Type[_] | js.Array[String], read: js.Any): TQueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[TQueryMetadata]
  }
}

