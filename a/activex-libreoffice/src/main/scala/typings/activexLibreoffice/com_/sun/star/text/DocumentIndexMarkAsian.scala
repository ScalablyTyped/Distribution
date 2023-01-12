package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a {@link TextRange} which is explicitly marked as an index entry for a {@link DocumentIndex} . For Asian languages the user can provide an
  * additional string which is used for sorting. If the user does not provide these strings, they are not considered for sorting.
  * @since OOo 1.1.2
  */
trait DocumentIndexMarkAsian extends StObject {
  
  /** contains the reading of the primary key of the index entry. It is used to build a hierarchical document index. */
  var PrimaryKeyReading: String
  
  /** contains the reading the secondary key of the index entry. It is used to build a hierarchical document index. */
  var SecondaryKeyReading: String
  
  /** contains the reading of the string which has been chosen for the index entry. */
  var TextReading: String
}
object DocumentIndexMarkAsian {
  
  inline def apply(PrimaryKeyReading: String, SecondaryKeyReading: String, TextReading: String): DocumentIndexMarkAsian = {
    val __obj = js.Dynamic.literal(PrimaryKeyReading = PrimaryKeyReading.asInstanceOf[js.Any], SecondaryKeyReading = SecondaryKeyReading.asInstanceOf[js.Any], TextReading = TextReading.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentIndexMarkAsian]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentIndexMarkAsian] (val x: Self) extends AnyVal {
    
    inline def setPrimaryKeyReading(value: String): Self = StObject.set(x, "PrimaryKeyReading", value.asInstanceOf[js.Any])
    
    inline def setSecondaryKeyReading(value: String): Self = StObject.set(x, "SecondaryKeyReading", value.asInstanceOf[js.Any])
    
    inline def setTextReading(value: String): Self = StObject.set(x, "TextReading", value.asInstanceOf[js.Any])
  }
}
