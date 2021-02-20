package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument for the command "post".
  * @see XCommandProcessor
  * @see WebDAVDocumentContent
  */
@js.native
trait PostCommandArgument2 extends PostCommandArgument {
  
  /** The media type (mime type) for the data to post. */
  var MediaType: String = js.native
  
  /** The URL of the referrer. */
  var Referer: String = js.native
}
object PostCommandArgument2 {
  
  @scala.inline
  def apply(MediaType: String, Referer: String, Sink: XInterface, Source: XInputStream): PostCommandArgument2 = {
    val __obj = js.Dynamic.literal(MediaType = MediaType.asInstanceOf[js.Any], Referer = Referer.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommandArgument2]
  }
  
  @scala.inline
  implicit class PostCommandArgument2MutableBuilder[Self <: PostCommandArgument2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: String): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferer(value: String): Self = StObject.set(x, "Referer", value.asInstanceOf[js.Any])
  }
}
