package typings.aframe.mod.THREE

import typings.aframe.aframeInts.`1`
import typings.aframe.aframeInts.`2`
import typings.aframe.aframeInts.`4`
import typings.std.GLenum
import typings.std.WebGLBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.GLBufferAttribute")
@js.native
open class GLBufferAttribute protected ()
  extends typings.three.mod.GLBufferAttribute {
  /**
    * This creates a new GLBufferAttribute object.
    * @param buffer Must be a {@link https://developer.mozilla.org/en-US/docs/Web/API/WebGLBuffer | WebGLBuffer}. See {@link GLBufferAttribute.buffer | .buffer}
    * @param type One of {@link https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#Data_types | WebGL Data Types}. See {@link GLBufferAttribute.type | .type}
    * @param itemSize How many values make up each item (vertex). See {@link GLBufferAttribute.itemSize | .itemSize}
    * @param elementSize `1`, `2` or `4`. The corresponding size (in bytes) for the given {@link type} param. See {@link GLBufferAttribute.elementSize | .elementSize}
    * @param count The expected number of vertices in VBO. See {@link GLBufferAttribute.count | .count}
    */
  def this(buffer: WebGLBuffer, `type`: GLenum, itemSize: Double, elementSize: `1` | `2` | `4`, count: Double) = this()
}
