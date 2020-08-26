package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An identifier for contents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
@js.native
trait XContentIdentifier extends XInterface {
  /**
    * returns the content identifier string.
    * @returns the content identifier string. This must be a valid URI (Uniform Resource Identifier, see RFC 2396). This string is required. If a content provid
    */
  val ContentIdentifier: String = js.native
  /**
    * returns the content provider scheme string.
    *
    * This string will be calculated from the content identifier string and must be lower-cased(!). It is the "scheme" the content provider is registered
    * for. In example, a provider for FTP contents will use ftp-URLs as content identifiers. The content provider scheme for all contents provided by that
    * provider will be "ftp".
    * @returns the content provider scheme string.
    */
  val ContentProviderScheme: String = js.native
  /**
    * returns the content identifier string.
    * @returns the content identifier string. This must be a valid URI (Uniform Resource Identifier, see RFC 2396). This string is required. If a content provid
    */
  def getContentIdentifier(): String = js.native
  /**
    * returns the content provider scheme string.
    *
    * This string will be calculated from the content identifier string and must be lower-cased(!). It is the "scheme" the content provider is registered
    * for. In example, a provider for FTP contents will use ftp-URLs as content identifiers. The content provider scheme for all contents provided by that
    * provider will be "ftp".
    * @returns the content provider scheme string.
    */
  def getContentProviderScheme(): String = js.native
}

object XContentIdentifier {
  @scala.inline
  def apply(
    ContentIdentifier: String,
    ContentProviderScheme: String,
    acquire: () => Unit,
    getContentIdentifier: () => String,
    getContentProviderScheme: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentIdentifier = {
    val __obj = js.Dynamic.literal(ContentIdentifier = ContentIdentifier.asInstanceOf[js.Any], ContentProviderScheme = ContentProviderScheme.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContentIdentifier = js.Any.fromFunction0(getContentIdentifier), getContentProviderScheme = js.Any.fromFunction0(getContentProviderScheme), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentIdentifier]
  }
  @scala.inline
  implicit class XContentIdentifierOps[Self <: XContentIdentifier] (val x: Self) extends AnyVal {
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
    def setContentIdentifier(value: String): Self = this.set("ContentIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentProviderScheme(value: String): Self = this.set("ContentProviderScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContentIdentifier(value: () => String): Self = this.set("getContentIdentifier", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContentProviderScheme(value: () => String): Self = this.set("getContentProviderScheme", js.Any.fromFunction0(value))
  }
  
}

