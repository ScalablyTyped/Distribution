package typings
package atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnChanges extends js.Object {
  /**
       * A callback method that is invoked immediately after the
       * default change detector has checked data-bound properties
       * if at least one has changed, and before the view and content
       * children are checked.
       * @param changes The changed properties.
       */
  def ngOnChanges(changes: SimpleChanges): scala.Unit
}

