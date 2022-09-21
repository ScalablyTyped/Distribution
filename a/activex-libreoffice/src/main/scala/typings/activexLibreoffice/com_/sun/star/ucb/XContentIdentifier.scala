package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An identifier for contents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
trait XContentIdentifier
  extends StObject
     with XInterface {
  
  /**
    * returns the content identifier string.
    * @returns the content identifier string. This must be a valid URI (Uniform Resource Identifier, see RFC 2396). This string is required. If a content provid
    */
  val ContentIdentifier: String
  
  /**
    * returns the content provider scheme string.
    *
    * This string will be calculated from the content identifier string and must be lower-cased(!). It is the "scheme" the content provider is registered
    * for. In example, a provider for FTP contents will use ftp-URLs as content identifiers. The content provider scheme for all contents provided by that
    * provider will be "ftp".
    * @returns the content provider scheme string.
    */
  val ContentProviderScheme: String
  
  /**
    * returns the content identifier string.
    * @returns the content identifier string. This must be a valid URI (Uniform Resource Identifier, see RFC 2396). This string is required. If a content provid
    */
  def getContentIdentifier(): String
  
  /**
    * returns the content provider scheme string.
    *
    * This string will be calculated from the content identifier string and must be lower-cased(!). It is the "scheme" the content provider is registered
    * for. In example, a provider for FTP contents will use ftp-URLs as content identifiers. The content provider scheme for all contents provided by that
    * provider will be "ftp".
    * @returns the content provider scheme string.
    */
  def getContentProviderScheme(): String
}
object XContentIdentifier {
  
  inline def apply(
    ContentIdentifier: String,
    ContentProviderScheme: String,
    acquire: () => Unit,
    getContentIdentifier: () => String,
    getContentProviderScheme: () => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XContentIdentifier = {
    val __obj = js.Dynamic.literal(ContentIdentifier = ContentIdentifier.asInstanceOf[js.Any], ContentProviderScheme = ContentProviderScheme.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContentIdentifier = js.Any.fromFunction0(getContentIdentifier), getContentProviderScheme = js.Any.fromFunction0(getContentProviderScheme), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentIdentifier]
  }
  
  extension [Self <: XContentIdentifier](x: Self) {
    
    inline def setContentIdentifier(value: String): Self = StObject.set(x, "ContentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setContentProviderScheme(value: String): Self = StObject.set(x, "ContentProviderScheme", value.asInstanceOf[js.Any])
    
    inline def setGetContentIdentifier(value: () => String): Self = StObject.set(x, "getContentIdentifier", js.Any.fromFunction0(value))
    
    inline def setGetContentProviderScheme(value: () => String): Self = StObject.set(x, "getContentProviderScheme", js.Any.fromFunction0(value))
  }
}
