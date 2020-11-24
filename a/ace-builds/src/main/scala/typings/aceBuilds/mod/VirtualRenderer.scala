package typings.aceBuilds.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ace-builds", "VirtualRenderer")
@js.native
class VirtualRenderer protected ()
  extends typings.aceBuilds.mod.Ace.VirtualRenderer {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, theme: String) = this()
}
@JSImport("ace-builds", "VirtualRenderer")
@js.native
object VirtualRenderer
  extends Instantiable1[/* container */ HTMLElement, typings.aceBuilds.mod.Ace.VirtualRenderer]
     with Instantiable2[
      /* container */ HTMLElement, 
      /* theme */ String, 
      typings.aceBuilds.mod.Ace.VirtualRenderer
    ]
