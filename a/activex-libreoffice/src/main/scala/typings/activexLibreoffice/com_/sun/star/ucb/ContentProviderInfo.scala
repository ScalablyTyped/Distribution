package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure for content provider information.
  * @see XContentProviderManager
  */
trait ContentProviderInfo extends js.Object {
  /** The content provider. */
  var ContentProvider: XContentProvider
  /** The scheme the Provider is registered for. */
  var Scheme: String
}

object ContentProviderInfo {
  @scala.inline
  def apply(ContentProvider: XContentProvider, Scheme: String): ContentProviderInfo = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentProviderInfo]
  }
}

