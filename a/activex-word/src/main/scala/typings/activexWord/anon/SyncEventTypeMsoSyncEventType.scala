package typings.activexWord.anon

import typings.activexOffice.Office.MsoSyncEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncEventTypeMsoSyncEventType extends StObject {
  
  val SyncEventType: MsoSyncEventType
}
object SyncEventTypeMsoSyncEventType {
  
  inline def apply(SyncEventType: MsoSyncEventType): SyncEventTypeMsoSyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventTypeMsoSyncEventType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncEventTypeMsoSyncEventType] (val x: Self) extends AnyVal {
    
    inline def setSyncEventType(value: MsoSyncEventType): Self = StObject.set(x, "SyncEventType", value.asInstanceOf[js.Any])
  }
}
