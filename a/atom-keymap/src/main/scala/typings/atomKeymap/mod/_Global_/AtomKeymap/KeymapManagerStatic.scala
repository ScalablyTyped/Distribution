package typings.atomKeymap.mod._Global_.AtomKeymap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.atomKeymap.AnonDefaultTarget
import typings.atomKeymap.mod._Global_.AtomKeymap.Options.BuildKeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The static side to the KeymapManager class. */
@js.native
trait KeymapManagerStatic
  extends /** Create a new KeymapManager. */
Instantiable0[KeymapManager]
     with Instantiable1[/* options */ AnonDefaultTarget, KeymapManager] {
  /** Create a keydown DOM event. */
  def buildKeydownEvent(key: String): Unit = js.native
  def buildKeydownEvent(key: String, options: BuildKeyEvent): Unit = js.native
  /** Create a keyup DOM event. */
  def buildKeyupEvent(key: String): Unit = js.native
  def buildKeyupEvent(key: String, options: BuildKeyEvent): Unit = js.native
}

