package typings.atAngularCore.atAngularCoreMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state associated with a container.
  *
  * This is an array so that its structure is closer to LView. This helps
  * when traversing the view tree (which is a mix of containers and component
  * views), so we can jump to viewOrContainer[NEXT] in the same way regardless
  * of type.
  */
@js.native
trait LContainer
  extends Array[js.Any]

