package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3QueryMetadataFacade extends js.Object {
  var descendants: Boolean
  var first: Boolean
  var predicate: js.Any | js.Array[String]
  var propertyName: String
  var read: js.Any | Null
  var static: Boolean
}

object R3QueryMetadataFacade {
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    predicate: js.Any | js.Array[String],
    propertyName: String,
    static: Boolean,
    read: js.Any = null
  ): R3QueryMetadataFacade = {
    val __obj = js.Dynamic.literal(descendants = descendants, first = first, predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName, static = static)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[R3QueryMetadataFacade]
  }
}

