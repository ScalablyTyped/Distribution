package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The static side to the KeymapManager class. */
@js.native
trait KeymapManagerStatic
  extends /** Create a new KeymapManager. */
org.scalablytyped.runtime.Instantiable0[KeymapManager]
     with org.scalablytyped.runtime.Instantiable1[/* options */ atomDashKeymapLib.Anon_DefaultTarget, KeymapManager] {
  /** Create a keydown DOM event. */
  def buildKeydownEvent(key: java.lang.String): scala.Unit = js.native
  def buildKeydownEvent(
    key: java.lang.String,
    options: atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.OptionsNs.BuildKeyEvent
  ): scala.Unit = js.native
  /** Create a keyup DOM event. */
  def buildKeyupEvent(key: java.lang.String): scala.Unit = js.native
  def buildKeyupEvent(
    key: java.lang.String,
    options: atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.OptionsNs.BuildKeyEvent
  ): scala.Unit = js.native
}

