package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoAuthoring extends StObject {
  
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
  implicit class CoAuthoringMutableBuilder[Self <: CoAuthoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthors(value: CoAuthors): Self = StObject.set(x, "Authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMerge(value: Boolean): Self = StObject.set(x, "CanMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanShare(value: Boolean): Self = StObject.set(x, "CanShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflicts(value: Conflicts): Self = StObject.set(x, "Conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocks(value: CoAuthLocks): Self = StObject.set(x, "Locks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMe(value: CoAuthor): Self = StObject.set(x, "Me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUpdates(value: Boolean): Self = StObject.set(x, "PendingUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdates(value: CoAuthUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCoAuthoring_typekey(value: CoAuthoring): Self = StObject.set(x, "Word.CoAuthoring_typekey", value.asInstanceOf[js.Any])
  }
}
