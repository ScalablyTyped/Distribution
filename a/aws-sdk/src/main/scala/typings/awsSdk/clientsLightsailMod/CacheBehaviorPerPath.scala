package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheBehaviorPerPath extends StObject {
  
  /**
    * The cache behavior for the specified path. You can specify one of the following per-path cache behaviors:     cache  - This behavior caches the specified path.      dont-cache  - This behavior doesn't cache the specified path.   
    */
  var behavior: js.UndefOr[BehaviorEnum] = js.undefined
  
  /**
    * The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard directories (path/to/assets/ *), and file types (*.html, *jpg, *js). Directories and file paths are case-sensitive. Examples:   Specify the following to cache all files in the document root of an Apache web server running on a Lightsail instance.  var/www/html/    Specify the following file to cache only the index page in the document root of an Apache web server.  var/www/html/index.html    Specify the following to cache only the .html files in the document root of an Apache web server.  var/www/html/ *.html    Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the document root of an Apache web server.  var/www/html/images/ *.jpg   var/www/html/images/ *.png   var/www/html/images/ *.gif  Specify the following to cache all files in the images sub-directory of the document root of an Apache web server.  var/www/html/images/   
    */
  var path: js.UndefOr[String] = js.undefined
}
object CacheBehaviorPerPath {
  
  inline def apply(): CacheBehaviorPerPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheBehaviorPerPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheBehaviorPerPath] (val x: Self) extends AnyVal {
    
    inline def setBehavior(value: BehaviorEnum): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
