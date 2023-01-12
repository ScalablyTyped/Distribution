package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the link for a text section.
  *
  * If the URL is an empty string, then the section is not linked.
  *
  * The bookmark of the URL (after the "#") is the name of a bookmark or a section name in the linked document. If a bookmark or section with this name
  * exists in the document, then only this part is linked into the given text section.
  *
  * {@link SectionFileLink.FilterName} is the internal name of the document filter. To use this struct, it is not necessary to set {@link
  * SectionFileLink.FilterName} . It will be automatically assigned.
  */
trait SectionFileLink extends StObject {
  
  /** contains the URL of the linked file. */
  var FileURL: String
  
  /** contains the name of the file filter that is used to load the linked file. */
  var FilterName: String
}
object SectionFileLink {
  
  inline def apply(FileURL: String, FilterName: String): SectionFileLink = {
    val __obj = js.Dynamic.literal(FileURL = FileURL.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionFileLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionFileLink] (val x: Self) extends AnyVal {
    
    inline def setFileURL(value: String): Self = StObject.set(x, "FileURL", value.asInstanceOf[js.Any])
    
    inline def setFilterName(value: String): Self = StObject.set(x, "FilterName", value.asInstanceOf[js.Any])
  }
}
