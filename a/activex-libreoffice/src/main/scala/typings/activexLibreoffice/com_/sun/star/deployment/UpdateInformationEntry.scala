package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.xml.dom.XElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects of this type are used as elements of the enumeration returned by {@link XUpdateInformationProvider} .
  * @since OOo 2.3
  */
@js.native
trait UpdateInformationEntry extends StObject {
  
  /** the (optional) description for an update information entry extracted from the update feed container */
  var Description: String = js.native
  
  /** the DOM representation of an update information entry */
  var UpdateDocument: XElement = js.native
}
object UpdateInformationEntry {
  
  @scala.inline
  def apply(Description: String, UpdateDocument: XElement): UpdateInformationEntry = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], UpdateDocument = UpdateDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInformationEntry]
  }
  
  @scala.inline
  implicit class UpdateInformationEntryMutableBuilder[Self <: UpdateInformationEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDocument(value: XElement): Self = StObject.set(x, "UpdateDocument", value.asInstanceOf[js.Any])
  }
}
