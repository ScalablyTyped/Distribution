package typings.activexWord.anon

import typings.activexOffice.Office.MsoSyncEventType
import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncEventType extends StObject {
  
  val Doc: Document
  
  val SyncEventType: MsoSyncEventType
}
object SyncEventType {
  
  @scala.inline
  def apply(Doc: Document, SyncEventType: MsoSyncEventType): SyncEventType = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], SyncEventType = SyncEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventType]
  }
  
  @scala.inline
  implicit class SyncEventTypeMutableBuilder[Self <: SyncEventType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncEventType(value: MsoSyncEventType): Self = StObject.set(x, "SyncEventType", value.asInstanceOf[js.Any])
  }
}
