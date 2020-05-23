package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the command "post".
  * @see XCommandProcessor
  * @see WebDAVDocumentContent
  */
trait PostCommandArgument2 extends PostCommandArgument {
  /** The media type (mime type) for the data to post. */
  var MediaType: String
  /** The URL of the referrer. */
  var Referer: String
}

object PostCommandArgument2 {
  @scala.inline
  def apply(MediaType: String, Referer: String, Sink: XInterface, Source: XInputStream): PostCommandArgument2 = {
    val __obj = js.Dynamic.literal(MediaType = MediaType.asInstanceOf[js.Any], Referer = Referer.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommandArgument2]
  }
}

