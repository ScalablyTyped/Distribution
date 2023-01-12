package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a feature to be retrieved by a URL that has to be loaded into a specified frame
  *
  * For a normal dispatch calls all needed parameters are separated. For optimized remote functionality XDispatch::queryDispatches() it's necessary to
  * pack these parameters in a flat structure which can be used in a simple manner.
  * @see XDispatchProvider.queryDispatches()
  */
trait DispatchDescriptor extends StObject {
  
  /**
    * specifies the URL of the resource/function
    *
    * Must be a full parsed URL. Use service {@link com.sun.star.util.URLTransformer} for that.
    * @see com.sun.star.util.URLTransformer
    */
  var FeatureURL: URL
  
  /**
    * name of the target frame
    *
    * Special targets (e.g. "_blank", "_self") or really existing target names can be used.
    * @see XDispatchProvider.queryDispatch()
    */
  var FrameName: String
  
  /**
    * describes how the target frame is to be searched
    *
    * This optional parameter is used if **FrameName** isn't a special target only.
    * @see FrameSearchFlag
    */
  var SearchFlags: Double
}
object DispatchDescriptor {
  
  inline def apply(FeatureURL: URL, FrameName: String, SearchFlags: Double): DispatchDescriptor = {
    val __obj = js.Dynamic.literal(FeatureURL = FeatureURL.asInstanceOf[js.Any], FrameName = FrameName.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DispatchDescriptor] (val x: Self) extends AnyVal {
    
    inline def setFeatureURL(value: URL): Self = StObject.set(x, "FeatureURL", value.asInstanceOf[js.Any])
    
    inline def setFrameName(value: String): Self = StObject.set(x, "FrameName", value.asInstanceOf[js.Any])
    
    inline def setSearchFlags(value: Double): Self = StObject.set(x, "SearchFlags", value.asInstanceOf[js.Any])
  }
}
