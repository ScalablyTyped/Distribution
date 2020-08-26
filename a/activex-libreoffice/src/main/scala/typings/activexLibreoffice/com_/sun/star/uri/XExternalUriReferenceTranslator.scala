package typings.activexLibreoffice.com_.sun.star.uri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * translates between external and internal URI references.
  *
  * Some URI schemes leave unspecified important aspects of how to interpret URIs of those schemes. For example, it is unspecified for " file " URLs how
  * to map the byte sequences that constitute the path segments of a " file " URL to filenames on a given platform: The UNO environment always assumes
  * that path segments of " file " URLs represent UTF-8  -  encoded strings (which have to be mapped to filenames in a platform-specific way), while other
  * applications typically assume that path segments of " file " URLs directly represent a platform's byte-sequence filenames. This interface offers
  * methods to translate between such `internal` URIs (e.g., UTF-8  -  encoded " file " URLs used within the UNO environment) and `external` URIs (e.g.,
  * byte-sequence  -  oriented " file " URLs used by other applications). Typically, only " file " URLs are affected by this translation.
  *
  * Since the translation process is based on URI schemes, relative URI references (that do not include a scheme) are left unmodified by the translation
  * process.
  * @since OOo 2.0
  */
@js.native
trait XExternalUriReferenceTranslator extends js.Object {
  /**
    * returns the external counterpart of an internal URI reference.
    * @param internalUriReference an internal URI reference.
    * @returns the external counterpart of the given internal URI reference. An empty string is returned if the given internal URI reference either is an empty
    */
  def translateToExternal(internalUriReference: String): String = js.native
  /**
    * returns the internal counterpart of an external URI reference.
    * @param externalUriReference an external URI reference.
    * @returns the internal counterpart of the given external URI reference. An empty string is returned if the given external URI reference either is an empty
    */
  def translateToInternal(externalUriReference: String): String = js.native
}

object XExternalUriReferenceTranslator {
  @scala.inline
  def apply(translateToExternal: String => String, translateToInternal: String => String): XExternalUriReferenceTranslator = {
    val __obj = js.Dynamic.literal(translateToExternal = js.Any.fromFunction1(translateToExternal), translateToInternal = js.Any.fromFunction1(translateToInternal))
    __obj.asInstanceOf[XExternalUriReferenceTranslator]
  }
  @scala.inline
  implicit class XExternalUriReferenceTranslatorOps[Self <: XExternalUriReferenceTranslator] (val x: Self) extends AnyVal {
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
    def setTranslateToExternal(value: String => String): Self = this.set("translateToExternal", js.Any.fromFunction1(value))
    @scala.inline
    def setTranslateToInternal(value: String => String): Self = this.set("translateToInternal", js.Any.fromFunction1(value))
  }
  
}

