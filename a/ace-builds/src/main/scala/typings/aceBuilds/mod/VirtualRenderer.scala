package typings.aceBuilds.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("ace-builds", "VirtualRenderer")
@js.native
open class VirtualRenderer protected ()
  extends StObject
     with typings.aceBuilds.mod.Ace.VirtualRenderer {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, theme: String) = this()
}
