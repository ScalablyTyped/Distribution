package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimedMetadataInsertion extends StObject {
  
  /**
    * Id3Insertions contains the array of Id3Insertion instances.
    */
  var Id3Insertions: js.UndefOr[listOfId3Insertion] = js.undefined
}
object TimedMetadataInsertion {
  
  inline def apply(): TimedMetadataInsertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimedMetadataInsertion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimedMetadataInsertion] (val x: Self) extends AnyVal {
    
    inline def setId3Insertions(value: listOfId3Insertion): Self = StObject.set(x, "Id3Insertions", value.asInstanceOf[js.Any])
    
    inline def setId3InsertionsUndefined: Self = StObject.set(x, "Id3Insertions", js.undefined)
    
    inline def setId3InsertionsVarargs(value: Id3Insertion*): Self = StObject.set(x, "Id3Insertions", js.Array(value*))
  }
}
