package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoAuthoring extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Authors: CoAuthors
  
  val CanMerge: Boolean
  
  val CanShare: Boolean
  
  val Conflicts: typings.activexWord.Word.Conflicts
  
  val Creator: Double
  
  val Locks: CoAuthLocks
  
  val Me: CoAuthor
  
  val Parent: Any
  
  val PendingUpdates: Boolean
  
  val Updates: CoAuthUpdates
  
  /* private */ @JSName("Word.CoAuthoring_typekey")
  var WordDotCoAuthoring_typekey: CoAuthoring
}
object CoAuthoring {
  
  inline def apply(
    Application: Application,
    Authors: CoAuthors,
    CanMerge: Boolean,
    CanShare: Boolean,
    Conflicts: Conflicts,
    Creator: Double,
    Locks: CoAuthLocks,
    Me: CoAuthor,
    Parent: Any,
    PendingUpdates: Boolean,
    Updates: CoAuthUpdates,
    WordDotCoAuthoring_typekey: CoAuthoring
  ): CoAuthoring = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Authors = Authors.asInstanceOf[js.Any], CanMerge = CanMerge.asInstanceOf[js.Any], CanShare = CanShare.asInstanceOf[js.Any], Conflicts = Conflicts.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Locks = Locks.asInstanceOf[js.Any], Me = Me.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PendingUpdates = PendingUpdates.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthoring_typekey")(WordDotCoAuthoring_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthoring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoAuthoring] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAuthors(value: CoAuthors): Self = StObject.set(x, "Authors", value.asInstanceOf[js.Any])
    
    inline def setCanMerge(value: Boolean): Self = StObject.set(x, "CanMerge", value.asInstanceOf[js.Any])
    
    inline def setCanShare(value: Boolean): Self = StObject.set(x, "CanShare", value.asInstanceOf[js.Any])
    
    inline def setConflicts(value: Conflicts): Self = StObject.set(x, "Conflicts", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLocks(value: CoAuthLocks): Self = StObject.set(x, "Locks", value.asInstanceOf[js.Any])
    
    inline def setMe(value: CoAuthor): Self = StObject.set(x, "Me", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPendingUpdates(value: Boolean): Self = StObject.set(x, "PendingUpdates", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: CoAuthUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setWordDotCoAuthoring_typekey(value: CoAuthoring): Self = StObject.set(x, "Word.CoAuthoring_typekey", value.asInstanceOf[js.Any])
  }
}
