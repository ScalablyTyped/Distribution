package typings.atomKeymap.mod

import org.scalablytyped.runtime.TopLevel
import typings.atomKeymap.anon.DefaultTarget
import typings.atomKeymap.mod.global.AtomKeymap.KeymapManager
import typings.atomKeymap.mod.global.AtomKeymap.KeymapManagerStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom-keymap", JSImport.Namespace)
@js.native
/** Create a new KeymapManager. */
class ^ () extends KeymapManager {
  def this(options: DefaultTarget) = this()
}

@JSImport("atom-keymap", JSImport.Namespace)
@js.native
object ^ extends TopLevel[KeymapManagerStatic]

