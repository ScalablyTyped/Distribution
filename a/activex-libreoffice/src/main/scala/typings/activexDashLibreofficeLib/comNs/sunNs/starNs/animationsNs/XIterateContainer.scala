package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An iterate container iterates over subitems of a given target object and animates them by subsequently executes the contained effects on them. ;  This
  * could be used to animate a target text word by word or letter by letter.
  */
trait XIterateContainer extends XTimeContainer {
  /** the time interval in percentage of the containers running time before the next iterated content is animated. */
  var IterateInterval: scala.Double
  /** the type of iteration, this depends on the target. ;  See documentation of used animation engine for supported iteration types. */
  var IterateType: scala.Double
  /**
    * This attribute specifies an optional subitem from the target element that should be animated. ;  A value of zero should always be the default and
    * animate the complete target. ;  See documentation of used animation engine for supported subitems.
    */
  var SubItem: scala.Double
  /** a target that contains iterable contents, f.e. a paragraph. ;  See documentation of used animation engine for supported targets. */
  var Target: js.Any
}

