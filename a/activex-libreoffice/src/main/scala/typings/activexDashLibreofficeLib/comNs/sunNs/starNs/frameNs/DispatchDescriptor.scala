package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a feature to be retrieved by a URL that has to be loaded into a specified frame
  *
  * For a normal dispatch calls all needed parameters are separated. For optimized remote functionality XDispatch::queryDispatches() it's necessary to
  * pack these parameters in a flat structure which can be used in a simple manner.
  * @see XDispatchProvider.queryDispatches()
  */
trait DispatchDescriptor extends js.Object {
  /**
    * specifies the URL of the resource/function
    *
    * Must be a full parsed URL. Use service {@link com.sun.star.util.URLTransformer} for that.
    * @see com.sun.star.util.URLTransformer
    */
  var FeatureURL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL
  /**
    * name of the target frame
    *
    * Special targets (e.g. "_blank", "_self") or really existing target names can be used.
    * @see XDispatchProvider.queryDispatch()
    */
  var FrameName: java.lang.String
  /**
    * describes how the target frame is to be searched
    *
    * This optional parameter is used if **FrameName** isn't a special target only.
    * @see FrameSearchFlag
    */
  var SearchFlags: scala.Double
}

