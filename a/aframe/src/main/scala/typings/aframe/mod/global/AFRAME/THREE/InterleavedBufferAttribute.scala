package typings.aframe.mod.global.AFRAME.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.InterleavedBufferAttribute")
@js.native
open class InterleavedBufferAttribute protected ()
  extends typings.three.mod.InterleavedBufferAttribute {
  /**
    * Create a new instance of {@link THREE.InterleavedBufferAttribute | InterleavedBufferAttribute}.
    * @param interleavedBuffer
    * @param itemSize
    * @param offset
    * @param normalized Default `false`.
    */
  def this(
    interleavedBuffer: typings.three.srcCoreInterleavedBufferMod.InterleavedBuffer,
    itemSize: Double,
    offset: Double
  ) = this()
}
