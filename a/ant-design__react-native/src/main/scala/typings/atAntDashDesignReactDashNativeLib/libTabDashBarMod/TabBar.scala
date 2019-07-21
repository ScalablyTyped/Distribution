package typings
package atAntDashDesignReactDashNativeLib.libTabDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBar
  extends reactLib.reactMod.Component[TabBarNativeProps, js.Any, js.Any] {
  def getPanes(
    styles: stdLib.ReturnType[
      js.Function1[
        /* theme */ atAntDashDesignReactDashNativeLib.libStyleMod.Theme, 
        atAntDashDesignReactDashNativeLib.Anon_Badge
      ]
    ],
    content: scala.Boolean
  ): js.Array[_] = js.native
}

