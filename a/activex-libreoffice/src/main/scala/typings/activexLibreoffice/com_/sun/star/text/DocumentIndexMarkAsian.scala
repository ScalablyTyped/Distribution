package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a {@link TextRange} which is explicitly marked as an index entry for a {@link DocumentIndex} . For Asian languages the user can provide an
  * additional string which is used for sorting. If the user does not provide these strings, they are not considered for sorting.
  * @since OOo 1.1.2
  */
@js.native
trait DocumentIndexMarkAsian extends js.Object {
  
  /** contains the reading of the primary key of the index entry. It is used to build a hierarchical document index. */
  var PrimaryKeyReading: String = js.native
  
  /** contains the reading the secondary key of the index entry. It is used to build a hierarchical document index. */
  var SecondaryKeyReading: String = js.native
  
  /** contains the reading of the string which has been chosen for the index entry. */
  var TextReading: String = js.native
}
object DocumentIndexMarkAsian {
  
  @scala.inline
  def apply(PrimaryKeyReading: String, SecondaryKeyReading: String, TextReading: String): DocumentIndexMarkAsian = {
    val __obj = js.Dynamic.literal(PrimaryKeyReading = PrimaryKeyReading.asInstanceOf[js.Any], SecondaryKeyReading = SecondaryKeyReading.asInstanceOf[js.Any], TextReading = TextReading.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentIndexMarkAsian]
  }
  
  @scala.inline
  implicit class DocumentIndexMarkAsianOps[Self <: DocumentIndexMarkAsian] (val x: Self) extends AnyVal {
    
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
    def setPrimaryKeyReading(value: String): Self = this.set("PrimaryKeyReading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryKeyReading(value: String): Self = this.set("SecondaryKeyReading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextReading(value: String): Self = this.set("TextReading", value.asInstanceOf[js.Any])
  }
}
