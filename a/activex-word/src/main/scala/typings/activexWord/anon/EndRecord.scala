package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndRecord extends StObject {
  
  var Cancel: Boolean
  
  val Doc: Document
  
  val EndRecord: Double
  
  val StartRecord: Double
}
object EndRecord {
  
  inline def apply(Cancel: Boolean, Doc: Document, EndRecord: Double, StartRecord: Double): EndRecord = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], EndRecord = EndRecord.asInstanceOf[js.Any], StartRecord = StartRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndRecord]
  }
  
  extension [Self <: EndRecord](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    inline def setEndRecord(value: Double): Self = StObject.set(x, "EndRecord", value.asInstanceOf[js.Any])
    
    inline def setStartRecord(value: Double): Self = StObject.set(x, "StartRecord", value.asInstanceOf[js.Any])
  }
}
