package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoAuthoring extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Authors: CoAuthors
  val CanMerge: Boolean
  val CanShare: Boolean
  val Conflicts: typings.activexWord.Word.Conflicts
  val Creator: Double
  val Locks: CoAuthLocks
  val Me: CoAuthor
  val Parent: js.Any
  val PendingUpdates: Boolean
  val Updates: CoAuthUpdates
  @JSName("Word.CoAuthoring_typekey")
  var WordDotCoAuthoring_typekey: CoAuthoring
}

object CoAuthoring {
  @scala.inline
  def apply(
    Application: Application,
    Authors: CoAuthors,
    CanMerge: Boolean,
    CanShare: Boolean,
    Conflicts: Conflicts,
    Creator: Double,
    Locks: CoAuthLocks,
    Me: CoAuthor,
    Parent: js.Any,
    PendingUpdates: Boolean,
    Updates: CoAuthUpdates,
    WordDotCoAuthoring_typekey: CoAuthoring
  ): CoAuthoring = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Authors = Authors.asInstanceOf[js.Any], CanMerge = CanMerge.asInstanceOf[js.Any], CanShare = CanShare.asInstanceOf[js.Any], Conflicts = Conflicts.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Locks = Locks.asInstanceOf[js.Any], Me = Me.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PendingUpdates = PendingUpdates.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthoring_typekey")(WordDotCoAuthoring_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthoring]
  }
}

