package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgContentDef extends js.Object {
  /**
    * this index is checked against NodeDef.ngContentIndex to find the nodes
    * that are matched by this ng-content.
    * Note that a NodeDef with an ng-content can be reprojected, i.e.
    * have a ngContentIndex on its own.
    */
  var index: scala.Double
}

object NgContentDef {
  @scala.inline
  def apply(index: scala.Double): NgContentDef = {
    val __obj = js.Dynamic.literal(index = index)
  
    __obj.asInstanceOf[NgContentDef]
  }
}

