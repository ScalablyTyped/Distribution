package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait SectionFileLink extends js.Object {
  /** contains the URL of the linked file. */
  var FileURL: String
  /** contains the name of the file filter that is used to load the linked file. */
  var FilterName: String
}

object SectionFileLink {
  @scala.inline
  def apply(FileURL: String, FilterName: String): SectionFileLink = {
    val __obj = js.Dynamic.literal(FileURL = FileURL, FilterName = FilterName)
  
    __obj.asInstanceOf[SectionFileLink]
  }
}

