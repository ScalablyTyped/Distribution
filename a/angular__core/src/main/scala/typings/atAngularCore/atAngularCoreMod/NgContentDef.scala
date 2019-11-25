package typings.atAngularCore.atAngularCoreMod

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
  var index: Double
}

object NgContentDef {
  @scala.inline
  def apply(index: Double): NgContentDef = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NgContentDef]
  }
}

