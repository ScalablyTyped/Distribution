package typings.antvGLite.mod

import typings.rbush.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "RBush")
@js.native
/**
  * Constructs an `RBush`, a high-performance 2D spatial index for points and
  * rectangles. Based on an optimized __R-tree__ data structure with
  * __bulk-insertion__ support.
  *
  * @param maxEntries An optional argument to RBush defines the maximum
  *                   number of entries in a tree node. `9` (used by default)
  *                   is a reasonable choice for most applications. Higher
  *                   value means faster insertion and slower search, and
  *                   vice versa.
  */
open class RBush[T] () extends default[T] {
  def this(maxEntries: Double) = this()
}
