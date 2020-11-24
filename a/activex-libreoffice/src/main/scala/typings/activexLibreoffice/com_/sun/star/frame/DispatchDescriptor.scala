package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.util.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a feature to be retrieved by a URL that has to be loaded into a specified frame
  *
  * For a normal dispatch calls all needed parameters are separated. For optimized remote functionality XDispatch::queryDispatches() it's necessary to
  * pack these parameters in a flat structure which can be used in a simple manner.
  * @see XDispatchProvider.queryDispatches()
  */
@js.native
trait DispatchDescriptor extends js.Object {
  
  /**
    * specifies the URL of the resource/function
    *
    * Must be a full parsed URL. Use service {@link com.sun.star.util.URLTransformer} for that.
    * @see com.sun.star.util.URLTransformer
    */
  var FeatureURL: URL = js.native
  
  /**
    * name of the target frame
    *
    * Special targets (e.g. "_blank", "_self") or really existing target names can be used.
    * @see XDispatchProvider.queryDispatch()
    */
  var FrameName: String = js.native
  
  /**
    * describes how the target frame is to be searched
    *
    * This optional parameter is used if **FrameName** isn't a special target only.
    * @see FrameSearchFlag
    */
  var SearchFlags: Double = js.native
}
object DispatchDescriptor {
  
  @scala.inline
  def apply(FeatureURL: URL, FrameName: String, SearchFlags: Double): DispatchDescriptor = {
    val __obj = js.Dynamic.literal(FeatureURL = FeatureURL.asInstanceOf[js.Any], FrameName = FrameName.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchDescriptor]
  }
  
  @scala.inline
  implicit class DispatchDescriptorOps[Self <: DispatchDescriptor] (val x: Self) extends AnyVal {
    
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
    def setFeatureURL(value: URL): Self = this.set("FeatureURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameName(value: String): Self = this.set("FrameName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFlags(value: Double): Self = this.set("SearchFlags", value.asInstanceOf[js.Any])
  }
}
