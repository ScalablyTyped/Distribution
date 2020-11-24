package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoAuthoring extends js.Object {
  
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
  
  @scala.inline
  implicit class CoAuthoringOps[Self <: CoAuthoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthors(value: CoAuthors): Self = this.set("Authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMerge(value: Boolean): Self = this.set("CanMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanShare(value: Boolean): Self = this.set("CanShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflicts(value: Conflicts): Self = this.set("Conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocks(value: CoAuthLocks): Self = this.set("Locks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMe(value: CoAuthor): Self = this.set("Me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUpdates(value: Boolean): Self = this.set("PendingUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdates(value: CoAuthUpdates): Self = this.set("Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCoAuthoring_typekey(value: CoAuthoring): Self = this.set("Word.CoAuthoring_typekey", value.asInstanceOf[js.Any])
  }
}
