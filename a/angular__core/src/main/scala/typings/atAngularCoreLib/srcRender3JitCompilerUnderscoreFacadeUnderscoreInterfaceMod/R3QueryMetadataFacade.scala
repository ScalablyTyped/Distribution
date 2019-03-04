package typings
package atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3QueryMetadataFacade extends js.Object {
  var descendants: scala.Boolean
  var first: scala.Boolean
  var predicate: js.Any | js.Array[java.lang.String]
  var propertyName: java.lang.String
  var read: js.Any | scala.Null
}

object R3QueryMetadataFacade {
  @scala.inline
  def apply(
    descendants: scala.Boolean,
    first: scala.Boolean,
    predicate: js.Any | js.Array[java.lang.String],
    propertyName: java.lang.String,
    read: js.Any = null
  ): R3QueryMetadataFacade = {
    val __obj = js.Dynamic.literal(descendants = descendants, first = first, predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[R3QueryMetadataFacade]
  }
}

