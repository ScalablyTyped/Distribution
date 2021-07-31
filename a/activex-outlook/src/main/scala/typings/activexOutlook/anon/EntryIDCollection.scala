package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryIDCollection extends StObject {
  
  val EntryIDCollection: String
}
object EntryIDCollection {
  
  @scala.inline
  def apply(EntryIDCollection: String): EntryIDCollection = {
    val __obj = js.Dynamic.literal(EntryIDCollection = EntryIDCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryIDCollection]
  }
  
  @scala.inline
  implicit class EntryIDCollectionMutableBuilder[Self <: EntryIDCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryIDCollection(value: String): Self = StObject.set(x, "EntryIDCollection", value.asInstanceOf[js.Any])
  }
}
