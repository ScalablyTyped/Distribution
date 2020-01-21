package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CoAuthoring")
@js.native
class CoAuthoring protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Authors: CoAuthors = js.native
  val CanMerge: Boolean = js.native
  val CanShare: Boolean = js.native
  val Conflicts: typings.activexWord.Word.Conflicts = js.native
  val Creator: Double = js.native
  val Locks: CoAuthLocks = js.native
  val Me: CoAuthor = js.native
  val Parent: js.Any = js.native
  val PendingUpdates: Boolean = js.native
  val Updates: CoAuthUpdates = js.native
  @JSName("Word.CoAuthoring_typekey")
  var WordDotCoAuthoring_typekey: CoAuthoring = js.native
}

