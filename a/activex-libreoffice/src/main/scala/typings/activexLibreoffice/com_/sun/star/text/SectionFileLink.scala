package typings.activexLibreoffice.com_.sun.star.text

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
@js.native
trait SectionFileLink extends js.Object {
  /** contains the URL of the linked file. */
  var FileURL: String = js.native
  /** contains the name of the file filter that is used to load the linked file. */
  var FilterName: String = js.native
}

object SectionFileLink {
  @scala.inline
  def apply(FileURL: String, FilterName: String): SectionFileLink = {
    val __obj = js.Dynamic.literal(FileURL = FileURL.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionFileLink]
  }
  @scala.inline
  implicit class SectionFileLinkOps[Self <: SectionFileLink] (val x: Self) extends AnyVal {
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
    def setFileURL(value: String): Self = this.set("FileURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterName(value: String): Self = this.set("FilterName", value.asInstanceOf[js.Any])
  }
  
}

