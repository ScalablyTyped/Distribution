package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryIDCollection extends StObject {
  
  val EntryIDCollection: String
}
object EntryIDCollection {
  
  inline def apply(EntryIDCollection: String): EntryIDCollection = {
    val __obj = js.Dynamic.literal(EntryIDCollection = EntryIDCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryIDCollection]
  }
  
  extension [Self <: EntryIDCollection](x: Self) {
    
    inline def setEntryIDCollection(value: String): Self = StObject.set(x, "EntryIDCollection", value.asInstanceOf[js.Any])
  }
}
