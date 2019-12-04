package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.unmount
import typings.atAntDashDesignReactDashNative.libPortalPortalDashHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyType extends Operation {
  var key: Double
  var `type`: unmount
}

object Anon_KeyType {
  @scala.inline
  def apply(key: Double, `type`: unmount): Anon_KeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyType]
  }
}

